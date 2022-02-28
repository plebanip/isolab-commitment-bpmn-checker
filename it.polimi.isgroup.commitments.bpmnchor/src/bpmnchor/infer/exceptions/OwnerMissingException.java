package bpmnchor.infer.exceptions;

import bpmnchor.MonitoringResource;

public class OwnerMissingException extends Exception {

	public OwnerMissingException(MonitoringResource r) {
		super("no owner defined for " + r.getId());
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 4851464424674287586L;

}
