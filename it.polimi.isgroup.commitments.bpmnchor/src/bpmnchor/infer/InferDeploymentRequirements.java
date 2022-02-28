package bpmnchor.infer;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.bpmn2.*;
import org.eclipse.emf.ecore.resource.Resource;

import bpmnchor.*;
import bpmnchor.Definitions;
import bpmnchor.infer.exceptions.ExpressionMissingException;
import bpmnchor.infer.exceptions.MessageFlowMissingException;
import bpmnchor.infer.exceptions.MonitoringResourceMissingException;
import bpmnchor.infer.exceptions.OwnerMissingException;
import bpmnchor.infer.exceptions.ParticipantMissingException;
import bpmnchor.infer.exceptions.ScopeMissingException;

public class InferDeploymentRequirements {

	public boolean checkForErrors(List<ConsoleMessage> messages) {
		for (ConsoleMessage m : messages) {
			if (m.severity == Severity.ERROR) {
				return true;
			}
		}
		return false;
	}

	public boolean checkForWarnings(List<ConsoleMessage> messages) {
		for (ConsoleMessage m : messages) {
			if (m.severity == Severity.WARNING) {
				return true;
			}
		}
		return false;
	}

	public List<ConsoleMessage> infer(Resource resource) {

		// TODO: implement trustless monitoring
		// TODO: implement time windows and provide description
		Definitions def = (Definitions) resource.getContents().get(0);

		List<ConsoleMessage> messages = new ArrayList<ConsoleMessage>();

		for (RootElement r : def.getRootElements()) {
			if (r instanceof Commitment) {

				messages.add(new ConsoleMessage(Severity.INFORMATION, "checking commitment " + r.getId(), 0));

				try {
					Participant debtor = getParticipant(((Commitment) r).getScopeBegin());

					/* check antecedent */
					try {
						messages.add(new ConsoleMessage(Severity.INFORMATION, "checking antecedent expression", 1));

						List<MonitoringResource> smartDevices = getSmartDevices(((Commitment) r).getAntecedentExpr(),
								def);

						if (smartDevices.size() > 0)
							messages.add(new ConsoleMessage(Severity.INFORMATION,
									smartDevices.size() + " smart devices can evaluate antecedent expression", 2));

						messages.add(new ConsoleMessage(Severity.INFORMATION,
								"Scenario 1: participant " + debtor.getId() + " evaluates antecedent expression", 2));
						messages.addAll(checkAccessibility(((Commitment) r).getAntecedentExpr(), debtor, null, def));

						for (int i = 0; i < smartDevices.size(); i++) {
							MonitoringResource dev = smartDevices.get(i);
							messages.add(new ConsoleMessage(Severity.INFORMATION, "Scenario " + (i + 2)
									+ ": smart device " + dev.getId() + " evaluates antecedent expression", 2));
							messages.addAll(checkAccessibility(((Commitment) r).getAntecedentExpr(), debtor, dev, def));
						}

					} catch (ExpressionMissingException e) {
						messages.add(new ConsoleMessage(Severity.ERROR,
								"no antecedent expression defined for commitment " + r.getId(), 2));
					}

					/* check active */
					if (((Commitment) r).getActiveExpr() != null) {
						try {
							messages.add(new ConsoleMessage(Severity.INFORMATION, "checking active expression", 1));

							List<MonitoringResource> smartDevices = getSmartDevices(((Commitment) r).getActiveExpr(),
									def);

							if (smartDevices.size() > 0)
								messages.add(new ConsoleMessage(Severity.INFORMATION,
										smartDevices.size() + " smart devices can evaluate active expression", 2));

							messages.add(new ConsoleMessage(Severity.INFORMATION,
									"Scenario 1: participant " + debtor.getId() + " evaluates active expression", 2));
							messages.addAll(checkAccessibility(((Commitment) r).getActiveExpr(), debtor, null, def));

							for (int i = 0; i < smartDevices.size(); i++) {
								MonitoringResource dev = smartDevices.get(i);
								messages.add(new ConsoleMessage(Severity.INFORMATION, "Scenario " + (i + 2)
										+ ": smart device " + dev.getId() + " evaluates active expression", 2));
								messages.addAll(checkAccessibility(((Commitment) r).getActiveExpr(), debtor, dev, def));
							}

						} catch (ExpressionMissingException e) {
							messages.add(new ConsoleMessage(Severity.ERROR,
									"no active expression defined for commitment " + r.getId(), 2));
						}
					}

				} catch (ParticipantMissingException e) {
					messages.add(new ConsoleMessage(Severity.ERROR, e.toString(), 1));
				} catch (ScopeMissingException e) {
					messages.add(new ConsoleMessage(Severity.ERROR,
							"no scope begin defined for commitment " + r.getId(), 1));
				} catch (MessageFlowMissingException e) {
					messages.add(new ConsoleMessage(Severity.ERROR, e.toString(), 1));
				}

				/* check consequent */
				try {
					Participant creditor = getParticipant(((Commitment) r).getScopeEnd());
					try {
						messages.add(new ConsoleMessage(Severity.INFORMATION, "checking consequent expression", 1));
						List<MonitoringResource> smartDevices = getSmartDevices(((Commitment) r).getConsequentExpr(),
								def);

						if (smartDevices.size() > 0)
							messages.add(new ConsoleMessage(Severity.INFORMATION,
									smartDevices.size() + " smart devices can evaluate consequent expression", 2));

						messages.add(new ConsoleMessage(Severity.INFORMATION,
								"Scenario 1: participant " + creditor.getId() + " evaluates consequent expression", 2));
						messages.addAll(checkAccessibility(((Commitment) r).getConsequentExpr(), creditor, null, def));

						for (int i = 0; i < smartDevices.size(); i++) {
							MonitoringResource dev = smartDevices.get(i);
							messages.add(new ConsoleMessage(Severity.INFORMATION, "Scenario " + (i + 2)
									+ ": smart device " + dev.getId() + " evaluates consequent expression", 2));
							messages.addAll(
									checkAccessibility(((Commitment) r).getConsequentExpr(), creditor, dev, def));
						}

					} catch (ExpressionMissingException e) {
						messages.add(new ConsoleMessage(Severity.ERROR,
								"no consequent expression defined for commitment " + r.getId(), 2));
					}
				} catch (ScopeMissingException e) {
					messages.add(
							new ConsoleMessage(Severity.ERROR, "no scope end defined for commitment " + r.getId(), 1));
				} catch (MessageFlowMissingException | ParticipantMissingException e) {
					messages.add(new ConsoleMessage(Severity.ERROR, e.toString(), 1));
				}

			}
		}

		if (checkForErrors(messages)) {
			return messages;
		}

		return messages;
	}

	private List<ConsoleMessage> checkAccessibility(CommitmentExpression expression, Participant participant,
			MonitoringResource monRes, Definitions def) throws ExpressionMissingException {

		List<ConsoleMessage> messages = new ArrayList<ConsoleMessage>();

		Integer indent = 3;

		if (expression == null)
			throw new ExpressionMissingException();

		
		if (monRes != null) {
			try {
				Participant monResOwner = getOwner(monRes, def);
				if (monResOwner.equals(participant))
					messages.add(new ConsoleMessage(Severity.INFORMATION,
							"Participant " + monResOwner.getId() + " is the owner of " + monRes.getId(), indent));
				else
					messages.add(new ConsoleMessage(Severity.WARNING,
							"Smart device " + monRes.getId() + " must notify participant " + participant.getId()
									+ " when the expression evaluates to true",
							indent));

			} catch (OwnerMissingException e) {
				messages.add(new ConsoleMessage(Severity.WARNING, "Smart device " + monRes.getId()
						+ " must notify participant " + participant.getId() + " when the expression evaluates to true",
						indent));
			} catch (MonitoringResourceMissingException e) {
				/* should never happen */
				e.printStackTrace();
			}
		}

		for (ItemDefinition i : expression.getItemRefs()) {

			try {
				MonitoringResource res = getMonitoringResource(i, def);

				try {
					Participant owner = getOwner(res, def);

					if (monRes == null) {

						if (owner.equals(participant))
							messages.add(new ConsoleMessage(Severity.INFORMATION,
									"Participant " + participant.getId() + " can access " + res.getId(), indent));
						else
							messages.add(new ConsoleMessage(Severity.WARNING, "Participant " + owner.getId()
									+ " must grant access to " + participant.getId() + " on " + res.getId(), indent));
					} else {
						if (!monRes.equals(res)) {
							messages.add(new ConsoleMessage(Severity.WARNING, "Participant " + owner.getId()
									+ " must grant access to " + monRes.getId() + " on " + res.getId(), indent));
						}
					}
				} catch (OwnerMissingException e) {
					messages.add(new ConsoleMessage(Severity.WARNING, e.toString(), indent));
					messages.add(new ConsoleMessage(Severity.WARNING,
							participant.getId() + " must be granted access on " + res.getId(), indent + 1));

				}
			} catch (MonitoringResourceMissingException e) {
				messages.add(new ConsoleMessage(Severity.ERROR, e.toString(), indent));
			}

		}

		return messages;
	}

	private MonitoringResource getMonitoringResource(ItemDefinition i, Definitions def)
			throws MonitoringResourceMissingException {
		for (RootElement r : def.getRootElements()) {
			if (r instanceof MonitoringResource) {
				if (((MonitoringResource) r).getItemRef().equals(i))
					return (MonitoringResource) r;
			}
		}
		throw new MonitoringResourceMissingException(i);
	}

	private Participant getOwner(MonitoringResource r, Definitions def)
			throws OwnerMissingException, MonitoringResourceMissingException {
		if (r.getOwnerRef() != null)
			return r.getOwnerRef();
		else
			throw new OwnerMissingException(r);
	}

	private Participant getParticipant(ConnectionPoint scope)
			throws ScopeMissingException, MessageFlowMissingException, ParticipantMissingException {
		if (scope == null)
			throw new ScopeMissingException();

		MessageFlow mf = scope.getMessageFlowRef();
		if (mf == null)
			throw new MessageFlowMissingException(scope);

		InteractionNode n = null;
		if (scope.getSide() == MessageType.RECEIVE)
			n = mf.getTargetRef();
		else
			n = mf.getSourceRef();

		if (n == null)
			throw new ParticipantMissingException(mf);
		if (n instanceof Participant)
			return (Participant) n;
		throw new ParticipantMissingException(mf);
	}

	private List<MonitoringResource> getSmartDevices(CommitmentExpression expression, Definitions def)
			throws ExpressionMissingException {

		List<MonitoringResource> list = new ArrayList<MonitoringResource>();

		if (expression == null)
			throw new ExpressionMissingException();

		for (ItemDefinition i : expression.getItemRefs()) {
			try {
				MonitoringResource res = getMonitoringResource(i, def);
				if (res.isCanCompute())
					list.add(res);
			} catch (MonitoringResourceMissingException e) {
				/* do nothing */
			}
		}

		return list;
	}

}
