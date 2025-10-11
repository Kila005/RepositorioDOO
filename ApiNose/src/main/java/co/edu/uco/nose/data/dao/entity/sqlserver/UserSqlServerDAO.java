package co.edu.uco.nose.data.dao.entity.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.UUID;

import co.edu.uco.nose.data.dao.entity.UserDAO;
import co.edu.uco.nose.data.dao.entity.SqlConnection;
import co.edu.uco.nose.entity.UserEntity;

public class UserSqlServerDAO extends SqlConnection implements UserDAO {

	public UserSqlServerDAO (final Connection connection) {
		super(connection);
	}
	
	@Override
	public void create(UserEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserEntity> findByFilter(UserEntity filterEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity findById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(UserEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UserEntity id) {
		// TODO Auto-generated method stub
		
	}
	

	
}
