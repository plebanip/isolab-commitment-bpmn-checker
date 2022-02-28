package bpmnchor.infer;

public class ConsoleMessage {

	Severity severity;
	String message;
	Integer indent;

	public ConsoleMessage(Severity severity, String message, Integer indent) {
		this.severity = severity;
		this.message = message;
		this.indent = indent;
	}

	public String toString() {
		String result = "";
		for (int i=0; i<indent; i++){
			result = result + " ";
		}
		result = result + "[" + severity.toString() + "] " + message;
		
		return result;
	}
}
