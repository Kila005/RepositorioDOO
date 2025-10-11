package co.edu.uco.nose.dto;

import java.util.UUID;

import co.edu.uco.nose.crosscuting.helper.TextHelper;
import co.edu.uco.nose.crosscuting.helper.UUIDHelper;

public class CityDTO extends DTO{
	
	private String name;
	private StateDTO state;
   
	
	public CityDTO() {//por defecto
		super(UUIDHelper.getUUIDHelper().getDefault());
		setName(TextHelper.getDefault());
		setState(StateDTO.getDefault());
	}
	
	public CityDTO (final UUID id) {
		super(id);
		setName(TextHelper.getDefault());
		setState(StateDTO.getDefault());
	}

	public CityDTO(final UUID id, final String name, final StateDTO stateDTO) {
		super(id);
		setName(name);
		setState(stateDTO);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StateDTO getState() {
		return state;
	}

	public void setState(StateDTO state) {
		this.state = state;
	}
	
	public static CityDTO getDefault() {
		return new CityDTO();
	}


}
