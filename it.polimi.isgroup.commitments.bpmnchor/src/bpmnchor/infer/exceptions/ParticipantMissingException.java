package bpmnchor.infer.exceptions;

import org.eclipse.bpmn2.MessageFlow;

public class ParticipantMissingException extends Exception {

	public ParticipantMissingException(MessageFlow mf) {
		super("no participant defined for " + mf.getId());
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -9157596669718717856L;

}
