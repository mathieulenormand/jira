package releasesNotes;

public class ExceptionProperties extends Exception {

	public ExceptionProperties() {
		super();
	}

	public ExceptionProperties(String message) {
		super(message);
	}

	public ExceptionProperties(String message, Throwable cause) {
		super(message, cause);
	}

	public ExceptionProperties(Throwable cause) {
		super(cause);
	}
}
