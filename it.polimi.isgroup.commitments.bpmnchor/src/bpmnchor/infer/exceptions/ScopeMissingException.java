package bpmnchor.infer.exceptions;

import bpmnchor.Commitment;

public class ScopeMissingException extends Exception {

	public ScopeMissingException() {
		super("no scope defined");
	}

	public ScopeMissingException(Commitment c) {
		//TODO distinguish between begin and end
		super("no scope defined for " + c.getId());
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2110158547550585531L;

}
