package co.edu.uco.nose.business.domain;

import java.util.UUID;

import co.edu.uco.nose.crosscuting.helper.TextHelper;
import co.edu.uco.nose.crosscuting.helper.UUIDHelper;

public class StateDomain extends Domain {
	
	private String name;
	private CountryDomain country;
	
   
	
	public 	StateDomain() {//por defecto
		super(UUIDHelper.getUUIDHelper().getDefault());
		setName(TextHelper.getDefault());
		setCountry(CountryDomain.getDefault());
	}
	
	public StateDomain (final UUID id) {
		super(id);
		setName(TextHelper.getDefault());
		setCountry(CountryDomain.getDefault());
	}

	public StateDomain(final UUID id, final String name, final CountryDomain countryDomain) {
		super(id);
		setName(name);
		setCountry(countryDomain);
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = TextHelper.getDefaultWhithTrim(name);
	}

	public CountryDomain getCountry() {
		return country;
	}

	public void setCountry(CountryDomain country) {
		this.country = country;
	}
	
	public static StateDomain getDefault() {
        return new StateDomain();
    }

	
}
//state tiene por dentro a country, ese country no puede quedar nulo si no le llega(object helper?)