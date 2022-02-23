package bpmnchor.infer;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;

import bpmnchor.*;

public class InferDeploymentRequirements {

	public boolean checkForErrors(List<ConsoleMessage> messages) {
		for (ConsoleMessage m : messages){
			if (m.severity == Severity.ERROR){
				return true;
			}
		}
		return false;
	}

	public boolean checkForWarnings(List<ConsoleMessage> messages) {
		for (ConsoleMessage m : messages){
			if (m.severity == Severity.WARNING){
				return true;
			}
		}
		return false;
	}
	
public List<ConsoleMessage> infer(Resource resource){
		
		Definitions def = (Definitions) resource.getContents().get(0);
				
		List<ConsoleMessage> messages = new ArrayList<ConsoleMessage>();
	    
		if(checkForErrors(messages)){
			return messages;
		}
				    
	    return messages;
	}
	
	
}
