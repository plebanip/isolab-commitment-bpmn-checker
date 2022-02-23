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
				try {
					Participant debtor = getParticipant(((Commitment) r).getScopeBegin());
					checkAccessibility(((Commitment) r).getAntecedentExpr(), debtor, def);
					if (((Commitment) r).getActiveExpr() != null)
						checkAccessibility(((Commitment) r).getActiveExpr(), debtor, def);

					// TODO add here checks involving the debtor
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				try {
					Participant creditor = getParticipant(((Commitment) r).getScopeEnd());

					checkAccessibility(((Commitment) r).getConsequentExpr(), creditor, def);
					// TODO add here checks involving the creditor
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println(r.toString());
			}
		}

		if (checkForErrors(messages)) {
			return messages;
		}

		return messages;
	}

	private void checkAccessibility(CommitmentExpression expression, Participant participant, Definitions def)
			throws ExpressionMissingException {

		// TODO Auto-generated method stub
		if (expression == null)
			throw new ExpressionMissingException();

		for (ItemDefinition i : expression.getItemRefs()) {

			try {
				MonitoringResource res = getMonitoringResource(i, def);
				Participant owner = getOwner(res, def);
				if (owner.equals(participant))
					System.out.println("Participant " + participant.getId() + " can access " + res.getId());
				else
					System.out.println("Participant " + owner.getId() + " must grant access to " + participant.getId()
							+ " on " + res.getId());					

			} catch (MonitoringResourceMissingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (OwnerMissingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	private MonitoringResource getMonitoringResource(ItemDefinition i, Definitions def)
			throws MonitoringResourceMissingException {
		for (RootElement r : def.getRootElements()) {
			if (r instanceof MonitoringResource) {
				if (((MonitoringResource) r).getItemRef().equals(i))
					return (MonitoringResource) r;
			}
		}
		throw new MonitoringResourceMissingException();
	}

	private Participant getOwner(MonitoringResource r, Definitions def)
			throws OwnerMissingException, MonitoringResourceMissingException {
		if (r.getOwnerRef() != null)
			return r.getOwnerRef();
		else
			throw new OwnerMissingException();
	}

	private Participant getParticipant(ConnectionPoint scope) throws Exception {
		if (scope == null)
			throw new ScopeMissingException();

		MessageFlow mf = scope.getMessageFlowRef();
		if (mf == null)
			throw new MessageFlowMissingException();

		InteractionNode n = null;
		if (scope.getSide() == MessageType.RECEIVE)
			n = mf.getTargetRef();
		else
			n = mf.getSourceRef();

		if (n == null)
			throw new ParticipantMissingException();
		if (n instanceof Participant)
			return (Participant) n;
		throw new ParticipantMissingException();
	}
}
