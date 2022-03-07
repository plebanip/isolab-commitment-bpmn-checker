package bpmnchor.infer;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.bpmn2.InteractionNode;
import org.eclipse.bpmn2.ItemDefinition;
import org.eclipse.bpmn2.Message;
import org.eclipse.bpmn2.MessageFlow;
import org.eclipse.bpmn2.Participant;
import org.eclipse.bpmn2.RootElement;

import bpmnchor.Commitment;
import bpmnchor.CommitmentExpression;
import bpmnchor.ConnectionPoint;
import bpmnchor.Definitions;
import bpmnchor.MessageType;
import bpmnchor.MonitoringResource;
import bpmnchor.infer.exceptions.CommitmentMissingException;
import bpmnchor.infer.exceptions.ExpressionMissingException;
import bpmnchor.infer.exceptions.MessageFlowMissingException;
import bpmnchor.infer.exceptions.MessageMissingException;
import bpmnchor.infer.exceptions.MonitoringResourceMissingException;
import bpmnchor.infer.exceptions.OwnerMissingException;
import bpmnchor.infer.exceptions.ParticipantMissingException;
import bpmnchor.infer.exceptions.ScopeMissingException;

public class ModelNavigator {

	public static MonitoringResource getMonitoringResource(ItemDefinition i, Definitions def)
			throws MonitoringResourceMissingException {
		for (RootElement r : def.getRootElements()) {
			if (r instanceof MonitoringResource) {
				if (((MonitoringResource) r).getItemRef().equals(i))
					return (MonitoringResource) r;
			}
		}
		throw new MonitoringResourceMissingException(i);
	}

	public static Participant getOwner(MonitoringResource r, Definitions def)
			throws OwnerMissingException, MonitoringResourceMissingException {
		if (r.getOwnerRef() != null)
			return r.getOwnerRef();
		else
			throw new OwnerMissingException(r);
	}

	public static ConnectionPoint getScopeBegin(Commitment c) throws CommitmentMissingException, ScopeMissingException {
		if (c == null)
			throw new CommitmentMissingException();
		ConnectionPoint scope = c.getScopeBegin();
		if (scope == null)
			throw new ScopeMissingException(c);
		return scope;
	}

	public static ConnectionPoint getScopeEnd(Commitment c) throws CommitmentMissingException, ScopeMissingException {
		if (c == null)
			throw new CommitmentMissingException();
		ConnectionPoint scope = c.getScopeEnd();
		if (scope == null)
			throw new ScopeMissingException(c);
		return scope;
	}

	public static MessageFlow getMessageFlow(ConnectionPoint scope) throws ScopeMissingException {
		if (scope == null)
			throw new ScopeMissingException();

		MessageFlow mf = scope.getMessageFlowRef();

		return mf;
	}

	public static Participant getParticipant(ConnectionPoint scope)
			throws ScopeMissingException, MessageFlowMissingException, ParticipantMissingException {

		MessageFlow mf = getMessageFlow(scope);
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

	public static Message getMessage(ConnectionPoint scope)
			throws ScopeMissingException, MessageFlowMissingException, MessageMissingException {

		MessageFlow mf = getMessageFlow(scope);
		if (mf == null)
			throw new MessageFlowMissingException(scope);

		if (mf.getMessageRef() == null)
			throw new MessageMissingException(mf);

		return mf.getMessageRef();

	}

	public static List<MonitoringResource> getSmartDevices(CommitmentExpression expression, Definitions def,
			Participant owner) throws ExpressionMissingException {

		List<MonitoringResource> list = new ArrayList<MonitoringResource>();

		if (expression == null)
			throw new ExpressionMissingException();

		for (ItemDefinition i : expression.getItemRefs()) {
			try {
				MonitoringResource res = getMonitoringResource(i, def);
				if (res.isCanCompute())
					if (owner == null || owner.equals(res.getOwnerRef()))
						list.add(res);
			} catch (MonitoringResourceMissingException e) {
				/* do nothing */
			}
		}

		return list;
	}

}
