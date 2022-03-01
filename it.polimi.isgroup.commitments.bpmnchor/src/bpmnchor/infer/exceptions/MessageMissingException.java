package bpmnchor.infer.exceptions;

import org.eclipse.bpmn2.MessageFlow;

public class MessageMissingException extends Exception {

	public MessageMissingException(MessageFlow mf){
		super("no message defined for "+mf.getId());
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -46738667376997159L;

}
