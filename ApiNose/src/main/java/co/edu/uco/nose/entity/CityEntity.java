package co.edu.uco.nose.entity;

import java.util.UUID;

import co.edu.uco.nose.crosscuting.helper.TextHelper;
import co.edu.uco.nose.crosscuting.helper.UUIDHelper;

public class CityEntity extends Entity{
	
	private String name;
	private StateEntity state;
   
	
	public CityEntity() {//por defecto
		super(UUIDHelper.getUUIDHelper().getDefault());
		setName(TextHelper.getDefault());
		setState(StateEntity.getDefault());
	}
	
	public CityEntity (final UUID id) {
		super(id);
		setName(TextHelper.getDefault());
		setState(StateEntity.getDefault());
	}

	public CityEntity(final UUID id, final String name, final StateEntity stateEntity) {
		super(id);
		setName(name);
		setState(stateEntity);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StateEntity getState() {
		return state;
	}

	public void setState(StateEntity state) {
		this.state = state;
	}
	
	public static CityEntity getDefault() {
		return new CityEntity();
	}


}
