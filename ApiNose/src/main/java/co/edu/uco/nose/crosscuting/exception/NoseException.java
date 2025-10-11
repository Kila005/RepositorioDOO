package co.edu.uco.nose.crosscuting.exception;

import co.edu.uco.nose.crosscuting.helper.ObjectHelper;
import co.edu.uco.nose.crosscuting.helper.TextHelper;

public final class NoseException extends RuntimeException {

	private static final long serialVersionUID = -960591703130378708L;
	private Throwable rootException;
	private String userMessage;
	private String technicallMessage;
	
	
	
	private NoseException(final Throwable rootException, final String userMessage,final String technicalMessage) {
		setRootException(rootException);
		setUserMessage(userMessage);
		setTechnicallMessage(technicallMessage);
		
	}
	public static NoseException create(final String userMessage) {
		return new NoseException(new Exception(), userMessage, userMessage);
	}
	public static NoseException create(final String userMessage, final String technicalMessage) {
		return new NoseException(new Exception(), userMessage, technicalMessage);
	}
	public static NoseException create(final Throwable rootExeption, final String userMessage, final String technicalMessage) {
		return new NoseException(rootExeption, userMessage, technicalMessage);
	}
	
	

	public Throwable getRootException() {
		return rootException;
	}
	private void setRootException(final Throwable rootException) {
		this.rootException = ObjectHelper.getDefault(rootException, new Exception());
	}
	public String getUserMessage() {
		return userMessage;
	}
	private void setUserMessage(final String userMessage) {
		this.userMessage = TextHelper.getDefaultWhithTrim(userMessage);
	}
	public String getTechnicallMessage() {
		return technicallMessage;
	}
	private void setTechnicallMessage(final String technicalMessage) {
		this.technicallMessage = TextHelper.getDefaultWhithTrim(technicalMessage);
	}
	
	
	

}
