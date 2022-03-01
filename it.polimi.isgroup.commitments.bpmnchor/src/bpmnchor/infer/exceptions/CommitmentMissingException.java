package bpmnchor.infer.exceptions;

public class CommitmentMissingException extends Exception {
	
	public CommitmentMissingException(){
		super("No commitment defined");
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 6589010729486851897L;

}
