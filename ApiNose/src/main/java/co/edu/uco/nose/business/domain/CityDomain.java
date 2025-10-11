package co.edu.uco.nose.business.domain;

import java.util.UUID;

import co.edu.uco.nose.crosscuting.helper.TextHelper;
import co.edu.uco.nose.crosscuting.helper.UUIDHelper;

public class CityDomain extends Domain{
	
	private String name;
	private StateDomain state;
   
	
	public CityDomain() {//por defecto
		super(UUIDHelper.getUUIDHelper().getDefault());
		setName(TextHelper.getDefault());
		setState(StateDomain.getDefault());
	}
	
	public CityDomain (final UUID id) {
		super(id);
		setName(TextHelper.getDefault());
		setState(StateDomain.getDefault());
	}

	public CityDomain(final UUID id, final String name, final StateDomain stateDomain) {
		super(id);
		setName(name);
		setState(stateDomain);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StateDomain getState() {
		return state;
	}

	public void setState(StateDomain state) {
		this.state = state;
	}
	
	public static CityDomain getDefault() {
		return new CityDomain();
	}


}
