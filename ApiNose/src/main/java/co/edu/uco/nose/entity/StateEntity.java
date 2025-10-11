package co.edu.uco.nose.entity;

import java.util.UUID;

import co.edu.uco.nose.crosscuting.helper.TextHelper;
import co.edu.uco.nose.crosscuting.helper.UUIDHelper;

public class StateEntity extends Entity {
	
	private String name;
	private CountryEntity country;
	
   
	
	public 	StateEntity() {//por defecto
		super(UUIDHelper.getUUIDHelper().getDefault());
		setName(TextHelper.getDefault());
		setCountry(CountryEntity.getDefault());
	}
	
	public StateEntity (final UUID id) {
		super(id);
		setName(TextHelper.getDefault());
		setCountry(CountryEntity.getDefault());
	}

	public StateEntity(final UUID id, final String name, final CountryEntity countryEntity) {
		super(id);
		setName(name);
		setCountry(countryEntity);
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = TextHelper.getDefaultWhithTrim(name);
	}

	public CountryEntity getCountry() {
		return country;
	}

	public void setCountry(CountryEntity country) {
		this.country = country;
	}
	
	public static StateEntity getDefault() {
        return new StateEntity();
    }

	
}
//state tiene por dentro a country, ese country no puede quedar nulo si no le llega(object helper?)