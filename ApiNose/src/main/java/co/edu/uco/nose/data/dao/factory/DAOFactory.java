package co.edu.uco.nose.data.dao.factory;

import java.sql.Connection;
import java.sql.SQLException;
import co.edu.uco.nose.crosscuting.exception.NoseException;
import co.edu.uco.nose.crosscuting.helper.SqlConnectionHelper;
import co.edu.uco.nose.data.dao.entity.CityDAO;
import co.edu.uco.nose.data.dao.entity.CountryDAO;
import co.edu.uco.nose.data.dao.entity.IdTypeDAO;
import co.edu.uco.nose.data.dao.entity.StateDAO;
import co.edu.uco.nose.data.dao.entity.UserDAO;

public abstract class DAOFactory {
	
	protected Connection connection;
	protected FactoryEnum factory = FactoryEnum.SQLSERVER;
	
	public static DAOFactory getFactory() {
		switch (factory) {
		
		case SQLSERVER: {
			return new SqlServerDAOFactory();
		}
		default:
			var userMessage = "Factoria no iniciada";
			var technicalMessage= "Factoria no valida";
			throw NoseException.create(userMessage, technicalMessage);
		}
			
			
	}
	
	public abstract CityDAO getCityDAO();
	public abstract CountryDAO getCountryDAO();
	public abstract IdTypeDAO getIdTypeDAO();
	public abstract StateDAO getStateDAO();
	public abstract UserDAO getUserDAO();
	
	protected abstract void openConnection();
	
	protected final void initTransaction() {
		SqlConnectionHelper.ensureTransactionIsNotStarted(connection);
		try {
			connection.setAutoCommit(false);
			
		}catch (final SQLException exception) {
			var userMessage ="";
			var technicalMessage="";
			throw NoseException.create(userMessage, technicalMessage);
		}catch (final Exception exception) {
			var userMessage = "";
			var technicalMessage = "";
			throw NoseException.create(userMessage, technicalMessage);
		}
	}
	
	protected final void commitTransaction() {
		SqlConnectionHelper.ensureTransactionIsStarted(connection);	
		try {
			connection.setAutoCommit(false);
			
		}catch (final SQLException exception) {
			var userMessage ="";
			var technicalMessage="";
			throw NoseException.create(userMessage, technicalMessage);
		}catch (final Exception exception) {
			var userMesage = "";
			var technicalMessage = "";
			throw NoseException.create(userMesage, technicalMessage);
		}
		
	}
	
	protected final void rollbackTransaction() {
		SqlConnectionHelper.ensureTransactionIsStarted(connection);
		try {
			connection.setAutoCommit(false);
			
		}catch (final SQLException exception) {
			var userMessage ="";
			var technicalMessage="";
			throw NoseException.create(userMessage, technicalMessage);
		}catch (final Exception exception) {
			var userMesage = "";
			var technicalMessage = "";
			throw NoseException.create(userMesage, technicalMessage);
		}
	}
	
	protected final void closeConnection() {
		SqlConnectionHelper.ensureConnectionIsOpen(connection);
		try {
			connection.setAutoCommit(false);
			
		}catch (final SQLException exception) {
			var userMessage ="";
			var technicalMessage="";
			throw NoseException.create(userMessage, technicalMessage);
		}catch (final Exception exception) {
			var userMesage = "";
			var technicalMessage = "";
			throw NoseException.create(userMesage, technicalMessage);
		}
	}
}
