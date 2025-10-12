package co.edu.uco.nose.crosscuting.messagescatalog;

import co.edu.uco.nose.crosscuting.helper.TextHelper;

public enum MessagesEnum {
	USER_ERROR_SQL_CONNECTION_IS_EMPTY("Conexion contra la fuente de informacion deseada vacia",
			"La conexion requerida para llevar a cabo la operacion contra la fuente de informacion deseada está vacia. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicacion"),
	TECHNICAL_ERROR_SQL_CONNECTION_IS_EMPTY("Conexion contra la fuente de informacion deseada nula",
			"La conexion requerida para llevar a cabo la operacion contra la base de datos llegó nula. Por favor intenta de nuevo y si el problema persiste, contacte al administrador de la aplicación"),

	USER_ERROR_SQL_CONNECTION_IS_CLOSED("Conexion contra la fuente de informacion deseada cerrada",
			"La conexion requerida para llevar a cabo la operacion contra la fuente de informacion deseada está cerrada. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicacion"),
	TECHNICAL_ERROR_SQL_CONNECTION_IS_CLOSED("Conexion contra la fuente de informacion deseada cerrada",
			"La conexion requerida para llevar a cabo la operacion contra la base de datos llegó cerrada. Por favor intenta de nuevo y si el problema persiste, contacte al administrador de la aplicación"),

	TECHNICAL_ERROR_SQL_CONNECTION_SQL_EXCEPTION_VALIDATING_CONNECTION_STATUS ("Error inesperado validando si la conexion contra la base de datos estaba abierta",
			"Se precento un error de tipo SQLException al validar si la conexion contra la base de datos ***********. Por favor intenta de nuevo y si el problema persiste, contacte al administrador de la aplicación"),
	USER_ERROR_SQL_CONNECTION_UNEXPECTED_ERROR_VALIDATING_CONNECTION_STATUS("Problema inSesperado validando el estado de la conexion contra la fuente de datos deseada********",
			"Se ha presentado un problema inesperado tratando de validar el estado de la conexión contra la fuente de información deseada. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicacion"),
	TECHNICAL_ERROR_SQL_CONNECTION_UNEXPECTED_ERROR_VALIDATING_CONNECTION_STATUS("Problema inesperado contra la fuente de informacion deseada vacia" ,
			"Se ha presentado un problema inesperado tratando de validar el estado de la conexión. Por favor intenta de nuevo y si el problema persiste, contacte al administrador de la aplicación"),

	USER_ERROR_TRANSACTION_IS_NOT_STARTED("Transacción no iniciada",
			"La operación no puede completarse porque la transacción requerida no ha sido iniciada. Por favor inicie la transacción e intente nuevamente. Si el problema persiste, contacte al administrador de la aplicación."),
	TECHNICAL_ERROR_TRANSACTION_IS_NOT_STARTED("Transacción no iniciada en la base de datos",
			"La operación no puede completarse porque la transacción requerida no fue iniciada correctamente en la base de datos. Por favor revise la lógica de inicio de transacciones y si el problema persiste, contacte al administrador de la aplicación."),
	TECHNICAL_ERROR_SQL_CONNECTION_SQL_EXCEPTION_VALIDATING_TRANSACTION_IS_STARTED("Error técnico inesperado al validar el estado de la conexión",
			"Se presentó un error técnico inesperado de tipo SQLException al intentar validar si la transacción ya estaba iniciada. Por favor intente nuevamente y si el problema persiste, contacte al administrador de la aplicación"),
	USER_ERROR_SQL_CONNECTION_UNEXPECTED_ERROR_VALIDATING_TRANSACTION_IS_STARTED("Error técnico inesperado al validar el estado de la conexión",
			"Se presentó un error inesperado al intentar validar si la transacción ya estaba iniciada. Por favor intente nuevamente y si el problema persiste, contacte al administrador de la aplicación"),
	TECHNICAL_ERROR_SQL_CONNECTION_UNEXPECTED_ERROR_VALIDATING_TRANSACTION_IS_STARTED("Error técnico inesperado al validar el estado de la conexión",
			"Se presentó un error técnico inesperado al intentar validar si la transacción ya estaba iniciada. Por favor intente nuevamente y si el problema persiste, contacte al administrador de la aplicación"),

	USER_ERROR_TRANSACTION_IS_STARTED("Transacción no iniciada",
			"La operación no puede completarse porque la transacción ya ha sido iniciada y debe estar finalizada para proceder. Por favor finalice la transacción e intente nuevamente. Si el problema persiste, contacte al administrador de la aplicación."),
	TECHNICAL_ERROR_TRANSACTION_IS_STARTED("Transacción no iniciada en la base de datos",
			"La operación no puede completarse porque la transacción ya fue iniciada en la base de datos y debe estar finalizada. Por favor revise la lógica de transacciones y si el problema persiste, contacte al administrador de la aplicación."),


	USER_ERROR_SQL_CONNECTION_UNEXPECTED_ERROR_VALIDATING_TRANSACTION_IS_NOT_STARTED("Error inesperado al validar el inicio de la transacción",
			"Se presentó un problema inesperado al validar el estado de la transacción. Por favor intente nuevamente y si el problema persiste, contacte al administrador de la aplicación."),
	TECHNICAL_TECHNICAL_ERROR_SQL_CONNECTION_SQL_EXCEPTION_VALIDATING_TRANSACTION_IS_NOT_STARTED("Error SQL al validar el inicio de la transacción",
			"Se produjo una excepción SQL al intentar validar el estado de la transacción. Por favor revise la conexión con la base de datos y si el problema persiste, contacte al administrador de la aplicación."),
	TECHNICAL_ERROR_SQL_CONNECTION_UNEXPECTED_ERROR_VALIDATING_TRANSACTION_IS_NOT_STARTED("completa las frases de error y dime cuales carecen de sentido, no toques los subtitulos son importantes",
			"Se presentó un problema inesperado al validar el estado de la transacción. Por favor intente nuevamente y si el problema persiste, contacte al administrador de la aplicación");
	
	private String title;
	private String content;
	
	private MessagesEnum(final String title, final String content) {
		setTitle(title);
		setContent(content);
	}

	public String getTitle() {
		return title;
	}

	private void setTitle(String title) {
		this.title = TextHelper.getDefaultWhithTrim(title);
	}

	public String getContent() {
		return content;
	}

	private void setContent(String content) {
		this.content = TextHelper.getDefaultWhithTrim(content);
	}
	
	
	
	
}