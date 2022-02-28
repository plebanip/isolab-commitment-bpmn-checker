package bpmnchor.infer.exceptions;

import bpmnchor.ConnectionPoint;

public class MessageFlowMissingException extends Exception {

	public MessageFlowMissingException(ConnectionPoint scope) {
		super("no message flow defined for " + scope.getId());
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 5652506401167537045L;

}
