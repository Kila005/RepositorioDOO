package co.edu.uco.nose.business.domain;
import java.util.UUID;

import co.edu.uco.nose.crosscuting.helper.UUIDHelper;

class Domain {
	private UUID id;
	
	protected Domain(final UUID id) {
		setId(id);
	}
	
	public UUID getId() {
		return id;
	}
	
	public void setId(UUID id) {
		this.id = UUIDHelper.getUUIDHelper().getDefault(id); //pregunta si el valor es nulo y dependiendo de su respuesta manda valor por defecto o el mismo objeto, esto se hace en el uuidhelper
	}
}