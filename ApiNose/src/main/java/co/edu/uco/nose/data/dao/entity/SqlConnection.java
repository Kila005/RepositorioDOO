package co.edu.uco.nose.data.dao.entity;
import java.sql.Connection;
import co.edu.uco.nose.crosscuting.helper.SqlConnectionHelper;


public abstract class SqlConnection {
	
	private Connection connection;
	
	protected SqlConnection(final Connection connection) {
		setConnection(connection);
	}

    protected Connection getConnection() {
		return connection;
	}
    
	private void setConnection(final Connection connection) {
        
        SqlConnectionHelper.ensureConnectionIsNotNull(connection);
		
        SqlConnectionHelper.ensureConnectionIsOpen(connection);
        
        //
        SqlConnectionHelper.ensureTransactionIsStarted(connection);
        
        SqlConnectionHelper.ensureTransactionIsNotStarted(connection);
	    
		this.connection = connection;
    }

}