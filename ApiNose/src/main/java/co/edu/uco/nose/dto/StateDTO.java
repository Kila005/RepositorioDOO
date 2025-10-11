package co.edu.uco.nose.dto;

import java.util.UUID;

import co.edu.uco.nose.crosscuting.helper.TextHelper;
import co.edu.uco.nose.crosscuting.helper.UUIDHelper;

public class StateDTO extends DTO {
	
	private String name;
	private CountryDTO country;
	
   
	
	public 	StateDTO() {//por defecto
		super(UUIDHelper.getUUIDHelper().getDefault());
		setName(TextHelper.getDefault());
		setCountry(CountryDTO.getDefault());
	}
	
	public StateDTO (final UUID id) {
		super(id);
		setName(TextHelper.getDefault());
		setCountry(CountryDTO.getDefault());
	}

	public StateDTO(final UUID id, final String name, final CountryDTO countryDTO) {
		super(id);
		setName(name);
		setCountry(countryDTO);
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = TextHelper.getDefaultWhithTrim(name);
	}

	public CountryDTO getCountry() {
		return country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}
	
	public static StateDTO getDefault() {
        return new StateDTO();
    }

	
}
//state tiene por dentro a country, ese country no puede quedar nulo si no le llega(object helper?)