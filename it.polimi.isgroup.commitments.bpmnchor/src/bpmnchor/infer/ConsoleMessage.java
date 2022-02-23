package bpmnchor.infer;

public class ConsoleMessage {

	Severity severity;
	String element;
	String message;
	
	public ConsoleMessage(Severity severity, String element, String message){
		this.severity = severity;
		this.element = element;
		this.message = message;
	}
	
	public String toString(){
		if (element != null)
			return "[" + severity.toString() + "] " + message + " " + element;
		else
			return "[" + severity.toString() + "] " + message;
	}
}
