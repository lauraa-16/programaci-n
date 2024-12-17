package prog.unidad04.practica406.libreria;

//Excepcion que hereda de exception para cuando la fecha no sea válida
public class FechaException extends Exception {
	
	public FechaException(String mensaje) {
		super(mensaje);
	}
}

