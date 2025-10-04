package co.edu.uco.nose.crosscuting.helper;

public final class ObjectHelper {//helper utilitario para objetos
	
	private ObjectHelper() {
	}
	
	public static <O> boolean isNull(O object) { //genericidades antes del boolean se especifica que puede ser cualquier tipo de dato <O>
		return object == null;
	}
	public static <O> O getDefault(O object, O defaultValue) { 
		return isNull(object) ? defaultValue : object;//operador ternario es nulo si(?) entonces tetorne el return value no (:) retorne el objeto
	}
	//componetizacion de metodos = es la capacidad de llamar lo que ya existe como la operacion de arriba  se lloama el isnull
}
