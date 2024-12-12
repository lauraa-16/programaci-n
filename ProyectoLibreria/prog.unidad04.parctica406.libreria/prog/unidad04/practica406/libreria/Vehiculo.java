package prog.unidad04.practica406.libreria;
/*abstract:
 * puede contener métodos que no son implementados y van a tener que serlo por las
 * subclases que hereden de esta clase (como las interfaces)
 * -no se puede crear una instancia de este tipo de clase
 * -es útil para definir un tipo base de clase que en realidad
 * no tiene sentido crear por sí misma, sólo va a ser utilizxada por motocicleta y 
 * por automovil, no sola
 * - es básicamente lo mismo que una interfaz pero es una clase*/

public abstract class Vehiculo implements MaquinaConDistintivoAmbiental {
	
	private String matricula;
    private Fecha fechaMatriculacion;
    private static int vehiculosMatriculados = 0;

    public Vehiculo(String matricula, Fecha fechaMatriculacion) {
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
	
}
