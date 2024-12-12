package prog.unidad04.practica406.libreria;

public class Vehiculo implements MaquinaConDistintivoAmbiental {
	
	private String matricula;
    private Fecha fechaMatriculacion;
    private static int vehiculosMatriculados = 0;

    protected Vehiculo(String matricula, Fecha fechaMatriculacion) {
        this.matricula = matricula;
        this.fechaMatriculacion = fechaMatriculacion;
        vehiculosMatriculados++;
    }

    public String getMatricula() {
        return matricula;
    }

    public Fecha getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public static int getVehiculosMatriculados() {
        return vehiculosMatriculados;
    }
    
    //override significa que estoy sobreescribiendo un comportamiento de la clase padre
    @Override
    public String toString() {
        return "Matricula: " + matricula + ", Fecha Matriculación: " + fechaMatriculacion.toString();
    }

	@Override
	public String obtenerDistintivoAmbiental() {
		return null;
	}
	
}
