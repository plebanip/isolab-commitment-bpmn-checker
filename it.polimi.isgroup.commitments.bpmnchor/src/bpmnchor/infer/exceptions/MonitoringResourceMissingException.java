package bpmnchor.infer.exceptions;

import org.eclipse.bpmn2.ItemDefinition;

public class MonitoringResourceMissingException extends Exception {

	public MonitoringResourceMissingException(ItemDefinition i) {
		super("no monitoring resource defined for " + i.getId());
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2862023730173841016L;

}
