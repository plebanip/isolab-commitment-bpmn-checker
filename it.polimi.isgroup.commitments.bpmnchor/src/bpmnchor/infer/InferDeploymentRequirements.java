package bpmnchor.infer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.bpmn2.*;
import org.eclipse.emf.ecore.resource.Resource;

import bpmnchor.*;
import bpmnchor.Definitions;
import bpmnchor.infer.exceptions.CommitmentMissingException;
import bpmnchor.infer.exceptions.ExpressionMissingException;
import bpmnchor.infer.exceptions.MessageFlowMissingException;
import bpmnchor.infer.exceptions.MessageMissingException;
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

	public List<ConsoleMessage> inferTrustful(Resource resource) {

		Definitions def = (Definitions) resource.getContents().get(0);

		List<ConsoleMessage> messages = new ArrayList<ConsoleMessage>();

		messages.add(
				new ConsoleMessage(Severity.INFORMATION, "Inferring trustful monitoring deployment requirements", 0));

		for (RootElement r : def.getRootElements()) {
			if (r instanceof Commitment) {

				messages.add(new ConsoleMessage(Severity.INFORMATION, "checking commitment " + r.getId(), 0));

				try {
					ConnectionPoint begin = ModelNavigator.getScopeBegin((Commitment) r);
					ConnectionPoint end = ModelNavigator.getScopeEnd((Commitment) r);

					Participant debtor = ModelNavigator.getParticipant(begin);

					/* check antecedent */
					try {
						messages.add(new ConsoleMessage(Severity.INFORMATION, "checking antecedent expression", 1));

						List<MonitoringResource> smartDevices = ModelNavigator.getSmartDevices(((Commitment) r).getAntecedentExpr(),
								def, null);

						try {
							messages.add(determineValidity((Commitment) r, ExpressionType.ANTECEDENT));
						} catch (MessageMissingException e) {
							messages.add(new ConsoleMessage(Severity.ERROR,
									e.toString() + ", cannot determine antecedent expression validity", 2));
						}

						if (smartDevices.size() > 0)
							messages.add(new ConsoleMessage(Severity.INFORMATION,
									smartDevices.size() + " smart devices can evaluate antecedent expression", 2));

						messages.add(new ConsoleMessage(Severity.INFORMATION,
								"Scenario 1: participant " + debtor.getId() + " evaluates antecedent expression", 2));
						messages.addAll(checkAccessibility(((Commitment) r).getAntecedentExpr(), Arrays.asList(debtor),
								null, def));

						for (int i = 0; i < smartDevices.size(); i++) {
							MonitoringResource dev = smartDevices.get(i);
							messages.add(new ConsoleMessage(Severity.INFORMATION, "Scenario " + (i + 2)
									+ ": smart device " + dev.getId() + " evaluates antecedent expression", 2));
							messages.addAll(checkAccessibility(((Commitment) r).getAntecedentExpr(),
									Arrays.asList(debtor), dev, def));
						}

					} catch (ExpressionMissingException e) {
						messages.add(new ConsoleMessage(Severity.ERROR,
								"no antecedent expression defined for commitment " + r.getId(), 2));
					}

					/* check active */
					if (((Commitment) r).getActiveExpr() != null) {
						try {
							messages.add(new ConsoleMessage(Severity.INFORMATION, "checking active expression", 1));

							List<MonitoringResource> smartDevices = ModelNavigator.getSmartDevices(((Commitment) r).getActiveExpr(),
									def, null);

							try {
								messages.add(determineValidity((Commitment) r, ExpressionType.ACTIVE));
							} catch (MessageMissingException e) {
								messages.add(new ConsoleMessage(Severity.ERROR,
										e.toString() + ", cannot determine active expression validity", 2));
							}

							if (smartDevices.size() > 0)
								messages.add(new ConsoleMessage(Severity.INFORMATION,
										smartDevices.size() + " smart devices can evaluate active expression", 2));

							messages.add(new ConsoleMessage(Severity.INFORMATION,
									"Scenario 1: participant " + debtor.getId() + " evaluates active expression", 2));
							messages.addAll(checkAccessibility(((Commitment) r).getActiveExpr(), Arrays.asList(debtor),
									null, def));

							for (int i = 0; i < smartDevices.size(); i++) {
								MonitoringResource dev = smartDevices.get(i);
								messages.add(new ConsoleMessage(Severity.INFORMATION, "Scenario " + (i + 2)
										+ ": smart device " + dev.getId() + " evaluates active expression", 2));
								messages.addAll(checkAccessibility(((Commitment) r).getActiveExpr(),
										Arrays.asList(debtor), dev, def));
							}

						} catch (ExpressionMissingException e) {
							messages.add(new ConsoleMessage(Severity.ERROR,
									"no active expression defined for commitment " + r.getId(), 2));
						}
					}

					/* check consequent */
					Participant creditor = ModelNavigator.getParticipant(end);
					try {
						messages.add(new ConsoleMessage(Severity.INFORMATION, "checking consequent expression", 1));

						List<MonitoringResource> smartDevices = ModelNavigator.getSmartDevices(((Commitment) r).getConsequentExpr(),
								def, null);

						try {
							messages.add(determineValidity((Commitment) r, ExpressionType.CONSEQUENT));
						} catch (MessageMissingException e) {
							messages.add(new ConsoleMessage(Severity.ERROR,
									e.toString() + ", cannot determine consequent expression validity", 2));
						}

						if (smartDevices.size() > 0)
							messages.add(new ConsoleMessage(Severity.INFORMATION,
									smartDevices.size() + " smart devices can evaluate consequent expression", 2));

						messages.add(new ConsoleMessage(Severity.INFORMATION,
								"Scenario 1: participant " + creditor.getId() + " evaluates consequent expression", 2));
						messages.addAll(checkAccessibility(((Commitment) r).getConsequentExpr(),
								Arrays.asList(creditor), null, def));

						for (int i = 0; i < smartDevices.size(); i++) {
							MonitoringResource dev = smartDevices.get(i);
							messages.add(new ConsoleMessage(Severity.INFORMATION, "Scenario " + (i + 2)
									+ ": smart device " + dev.getId() + " evaluates consequent expression", 2));
							messages.addAll(checkAccessibility(((Commitment) r).getConsequentExpr(),
									Arrays.asList(creditor), dev, def));
						}

					} catch (ExpressionMissingException e) {
						messages.add(new ConsoleMessage(Severity.ERROR,
								"no consequent expression defined for commitment " + r.getId(), 2));
					}
				} catch (MessageFlowMissingException | ParticipantMissingException | ScopeMissingException e) {
					messages.add(new ConsoleMessage(Severity.ERROR, e.toString(), 1));
				} catch (CommitmentMissingException e1) {
					/* should never happen */
					e1.printStackTrace();
				}

			}
		}

		if (checkForErrors(messages)) {
			return messages;
		}

		return messages;
	}

	public List<ConsoleMessage> inferTrustless(Resource resource) {

		Definitions def = (Definitions) resource.getContents().get(0);

		List<ConsoleMessage> messages = new ArrayList<ConsoleMessage>();

		messages.add(
				new ConsoleMessage(Severity.INFORMATION, "Inferring trustless monitoring deployment requirements", 0));

		for (RootElement r : def.getRootElements()) {
			if (r instanceof Commitment) {

				messages.add(new ConsoleMessage(Severity.INFORMATION, "checking commitment " + r.getId(), 0));

				try {
					ConnectionPoint begin = ModelNavigator.getScopeBegin((Commitment) r);
					ConnectionPoint end = ModelNavigator.getScopeEnd((Commitment) r);

					Participant debtor = ModelNavigator.getParticipant(begin);
					Participant creditor = ModelNavigator.getParticipant(end);

					/* determine scope start */
					messages.add(new ConsoleMessage(Severity.WARNING,
							"A mechanism to make the participant aware of when the scope starts is required", 1));

					messages.addAll(determineScope(begin, creditor, debtor, def));

					/* determine scope end */
					messages.add(new ConsoleMessage(Severity.WARNING,
							"A mechanism to make the participant aware of when the scope ends is required", 1));

					messages.addAll(determineScope(end, creditor, debtor, def));

					/* check antecedent */
					try {
						messages.add(new ConsoleMessage(Severity.INFORMATION, "checking antecedent expression", 1));

						List<MonitoringResource> debtorSmartDevices = ModelNavigator.getSmartDevices(
								((Commitment) r).getAntecedentExpr(), def, debtor);
						List<MonitoringResource> creditorSmartDevices = ModelNavigator.getSmartDevices(
								((Commitment) r).getAntecedentExpr(), def, creditor);

						try {
							messages.add(determineValidity((Commitment) r, ExpressionType.ANTECEDENT));
						} catch (MessageMissingException e) {
							messages.add(new ConsoleMessage(Severity.ERROR,
									e.toString() + ", cannot determine antecedent expression validity", 2));
						}

						if (debtorSmartDevices.size() > 0 && creditorSmartDevices.size() > 0)
							messages.add(new ConsoleMessage(Severity.INFORMATION,
									debtorSmartDevices.size() + " smart devices of " + debtor.getId() + " and "
											+ creditorSmartDevices.size() + " smart devices of " + creditor.getId()
											+ " can evaluate antecedent expression",
									2));

						messages.add(new ConsoleMessage(Severity.INFORMATION, "Scenario 1: participants "
								+ debtor.getId() + " and " + creditor.getId() + " evaluate antecedent expression", 2));
						messages.addAll(checkAccessibility(((Commitment) r).getAntecedentExpr(),
								Arrays.asList(debtor, creditor), null, def));

						Integer i = 0;

						for (MonitoringResource debtorDev : debtorSmartDevices) {
							for (MonitoringResource creditorDev : creditorSmartDevices) {
								messages.add(new ConsoleMessage(Severity.INFORMATION,
										"Scenario " + (i + 2) + ": smart devices " + debtorDev.getId() + " and "
												+ creditorDev.getId() + " evaluate antecedent expression",
										2));
								messages.addAll(checkAccessibility(((Commitment) r).getAntecedentExpr(),
										Arrays.asList(debtor, creditor), debtorDev, def));
								messages.addAll(checkAccessibility(((Commitment) r).getAntecedentExpr(),
										Arrays.asList(debtor, creditor), creditorDev, def));
								i++;
							}
						}

					} catch (ExpressionMissingException e) {
						messages.add(new ConsoleMessage(Severity.ERROR,
								"no antecedent expression defined for commitment " + r.getId(), 2));
					}

					/* check active */
					if (((Commitment) r).getActiveExpr() != null) {
						try {
							messages.add(new ConsoleMessage(Severity.INFORMATION, "checking active expression", 1));

							List<MonitoringResource> debtorSmartDevices = ModelNavigator.getSmartDevices(
									((Commitment) r).getActiveExpr(), def, debtor);
							List<MonitoringResource> creditorSmartDevices = ModelNavigator.getSmartDevices(
									((Commitment) r).getActiveExpr(), def, creditor);

							try {
								messages.add(determineValidity((Commitment) r, ExpressionType.ACTIVE));
							} catch (MessageMissingException e) {
								messages.add(new ConsoleMessage(Severity.ERROR,
										e.toString() + ", cannot determine active expression validity", 2));
							}

							if (debtorSmartDevices.size() > 0 && creditorSmartDevices.size() > 0)
								messages.add(new ConsoleMessage(Severity.INFORMATION,
										debtorSmartDevices.size() + " smart devices of " + debtor.getId() + " and "
												+ creditorSmartDevices.size() + " smart devices of " + creditor.getId()
												+ " can evaluate active expression",
										2));

							messages.add(new ConsoleMessage(Severity.INFORMATION, "Scenario 1: participants "
									+ debtor.getId() + " and " + creditor.getId() + " evaluate active expression", 2));
							messages.addAll(checkAccessibility(((Commitment) r).getActiveExpr(),
									Arrays.asList(debtor, creditor), null, def));

							Integer i = 0;

							for (MonitoringResource debtorDev : debtorSmartDevices) {
								for (MonitoringResource creditorDev : creditorSmartDevices) {
									messages.add(
											new ConsoleMessage(Severity.INFORMATION,
													"Scenario " + (i + 2) + ": smart devices " + debtorDev.getId()
															+ " and " + creditorDev.getId()
															+ " evaluate active expression",
													2));
									messages.addAll(checkAccessibility(((Commitment) r).getActiveExpr(),
											Arrays.asList(debtor, creditor), debtorDev, def));
									messages.addAll(checkAccessibility(((Commitment) r).getActiveExpr(),
											Arrays.asList(debtor, creditor), creditorDev, def));
									i++;
								}
							}

						} catch (ExpressionMissingException e) {
							messages.add(new ConsoleMessage(Severity.ERROR,
									"no active expression defined for commitment " + r.getId(), 2));
						}
					}

					/* check consequent */
					try {
						messages.add(new ConsoleMessage(Severity.INFORMATION, "checking consequent expression", 1));

						List<MonitoringResource> debtorSmartDevices = ModelNavigator.getSmartDevices(
								((Commitment) r).getConsequentExpr(), def, debtor);
						List<MonitoringResource> creditorSmartDevices = ModelNavigator.getSmartDevices(
								((Commitment) r).getConsequentExpr(), def, creditor);

						try {
							messages.add(determineValidity((Commitment) r, ExpressionType.CONSEQUENT));
						} catch (MessageMissingException e) {
							messages.add(new ConsoleMessage(Severity.ERROR,
									e.toString() + ", cannot determine consequent expression validity", 2));
						}

						if (debtorSmartDevices.size() > 0 && creditorSmartDevices.size() > 0)
							messages.add(new ConsoleMessage(Severity.INFORMATION,
									debtorSmartDevices.size() + " smart devices of " + debtor.getId() + " and "
											+ creditorSmartDevices.size() + " smart devices of " + creditor.getId()
											+ " can evaluate consequent expression",
									2));

						messages.add(new ConsoleMessage(Severity.INFORMATION, "Scenario 1: participants "
								+ debtor.getId() + " and " + creditor.getId() + " evaluate consequent expression", 2));
						messages.addAll(checkAccessibility(((Commitment) r).getConsequentExpr(),
								Arrays.asList(debtor, creditor), null, def));

						Integer i = 0;

						for (MonitoringResource debtorDev : debtorSmartDevices) {
							for (MonitoringResource creditorDev : creditorSmartDevices) {
								messages.add(new ConsoleMessage(Severity.INFORMATION,
										"Scenario " + (i + 2) + ": smart devices " + debtorDev.getId() + " and "
												+ creditorDev.getId() + " evaluate consequent expression",
										2));
								messages.addAll(checkAccessibility(((Commitment) r).getConsequentExpr(),
										Arrays.asList(debtor, creditor), debtorDev, def));
								messages.addAll(checkAccessibility(((Commitment) r).getConsequentExpr(),
										Arrays.asList(debtor, creditor), creditorDev, def));
								i++;
							}
						}

					} catch (ExpressionMissingException e) {
						messages.add(new ConsoleMessage(Severity.ERROR,
								"no consequent expression defined for commitment " + r.getId(), 2));
					}
				} catch (MessageFlowMissingException | ParticipantMissingException | ScopeMissingException e) {
					messages.add(new ConsoleMessage(Severity.ERROR, e.toString(), 1));
				} catch (CommitmentMissingException e1) {
					/* should never happen */
					e1.printStackTrace();
				}

			}
		}

		if (checkForErrors(messages)) {
			return messages;
		}

		return messages;
	}

	private List<ConsoleMessage> determineScope(ConnectionPoint cp, Participant creditor, Participant debtor,
			Definitions def) throws ScopeMissingException, MessageFlowMissingException {

		List<ConsoleMessage> messages = new ArrayList<ConsoleMessage>();

		Integer indent = 2;

		Integer scenarioNumber = 1;

		String event;

		ItemDefinition item;

		try {
			Message msg = ModelNavigator.getMessage(cp);

			if (cp.getSide() == MessageType.RECEIVE)
				event = "received";
			else
				event = "sent";

			item = msg.getItemRef();

			if (item != null) {
				MonitoringResource res;
				try {
					res = ModelNavigator.getMonitoringResource(item, def);

					if (res.isCanCompute() && item.getItemKind() == ItemKind.PHYSICAL) {
						messages.add(new ConsoleMessage(Severity.INFORMATION,
								"Scenario " + scenarioNumber + ": smart device " + res.getId() + " must notify "
										+ debtor.getId() + " and " + creditor.getId() + " when " + msg.getId() + " is "
										+ event,
								indent));
						scenarioNumber++;
					}

					Participant owner;
					try {
						owner = ModelNavigator.getOwner(res, def);
						if (owner.equals(creditor))
							messages.add(new ConsoleMessage(Severity.INFORMATION,
									"Scenario " + scenarioNumber + ": Participant " + owner.getId()
											+ " must grant access to " + debtor.getId() + " on " + res.getId(),
									indent));
						else if (owner.equals(debtor))
							messages.add(new ConsoleMessage(Severity.INFORMATION,
									"Scenario " + scenarioNumber + ": Participant " + owner.getId()
											+ " must grant access to " + creditor.getId() + " on " + res.getId(),
									indent));
						else
							messages.add(new ConsoleMessage(Severity.INFORMATION,
									"Scenario " + scenarioNumber + ": Participant " + owner.getId()
											+ " must grant access to " + debtor.getId() + " and " + creditor.getId()
											+ " on " + res.getId(),
									indent));

					} catch (OwnerMissingException e) {
						messages.add(
								new ConsoleMessage(Severity.INFORMATION,
										"Scenario " + scenarioNumber + ": The owner of " + res.getId()
												+ " must grant access to " + debtor.getId() + " on " + res.getId(),
										indent));
					}

					scenarioNumber++;
				} catch (MonitoringResourceMissingException e) {
					messages.add(
							new ConsoleMessage(Severity.WARNING, "No smart device exists for " + msg.getId(), indent));
				}

			}
			messages.add(new ConsoleMessage(Severity.INFORMATION,
					"Scenario " + scenarioNumber + ": Participants " + debtor.getId() + " and " + creditor.getId()
							+ " must put in place mechanisms to determine when " + msg.getId() + " is " + event,
					indent));

		} catch (MessageMissingException e) {
			messages.add(new ConsoleMessage(Severity.ERROR, e.toString() + ", no message has been defined for scope",
					indent));

		}

		return messages;
	}

	private ConsoleMessage determineValidity(Commitment r, ExpressionType eType) throws CommitmentMissingException,
			ScopeMissingException, MessageFlowMissingException, MessageMissingException {

		ConnectionPoint begin = ModelNavigator.getScopeBegin(r);
		ConnectionPoint end = ModelNavigator.getScopeEnd(r);

		Message beginMsg = ModelNavigator.getMessage(begin);
		Message endMsg = ModelNavigator.getMessage(end);

		String beginEvent = "";
		String endEvent = "";

		if (begin.getSide() == MessageType.RECEIVE)
			beginEvent = "received";
		else
			beginEvent = "sent";

		if (end.getSide() == MessageType.RECEIVE)
			endEvent = "received";
		else
			endEvent = "sent";

		Integer indent = 2;

		if (r.getType() == CommitmentType.GOAL && eType == ExpressionType.CONSEQUENT) {
			return new ConsoleMessage(Severity.INFORMATION,
					"Consequent expression is evaluated when message " + endMsg.getId() + " is " + endEvent, indent);
		} else {
			return new ConsoleMessage(Severity.INFORMATION, "Antecedent expression is evaluated from when message "
					+ beginMsg.getId() + " is " + beginEvent + " until message " + endMsg.getId() + " is " + endEvent,
					indent);
		}

	}

	private List<ConsoleMessage> checkAccessibility(CommitmentExpression expression, List<Participant> participants,
			MonitoringResource monRes, Definitions def) throws ExpressionMissingException {

		List<ConsoleMessage> messages = new ArrayList<ConsoleMessage>();

		Integer indent = 3;

		if (expression == null)
			throw new ExpressionMissingException();

		if (monRes != null) {
			for (Participant participant : participants) {

				try {
					Participant monResOwner = ModelNavigator.getOwner(monRes, def);
					if (monResOwner.equals(participant))
						messages.add(new ConsoleMessage(Severity.INFORMATION,
								"Participant " + monResOwner.getId() + " is the owner of " + monRes.getId(), indent));
					else
						messages.add(
								new ConsoleMessage(Severity.WARNING,
										"Smart device " + monRes.getId() + " must notify participant "
												+ participant.getId() + " when the expression evaluates to true",
										indent));

				} catch (OwnerMissingException e) {
					messages.add(new ConsoleMessage(Severity.WARNING,
							"Smart device " + monRes.getId() + " must notify participant " + participant.getId()
									+ " when the expression evaluates to true",
							indent));
				} catch (MonitoringResourceMissingException e) {
					/* should never happen */
					e.printStackTrace();
				}
			}
		}

		for (ItemDefinition i : expression.getItemRefs()) {

			try {
				MonitoringResource res = ModelNavigator.getMonitoringResource(i, def);

				for (Participant participant : participants) {
					try {
						Participant owner = ModelNavigator.getOwner(res, def);

						if (monRes == null) {

							if (owner.equals(participant))
								messages.add(new ConsoleMessage(Severity.INFORMATION,
										"Participant " + participant.getId() + " can access " + res.getId(), indent));
							else
								messages.add(new ConsoleMessage(Severity.WARNING, "Participant " + owner.getId()
										+ " must grant access to " + participant.getId() + " on " + res.getId(),
										indent));
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
				}
			} catch (MonitoringResourceMissingException e) {
				messages.add(new ConsoleMessage(Severity.ERROR, e.toString(), indent));
			}

		}

		return messages;
	}

	
}
