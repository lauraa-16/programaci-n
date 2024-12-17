package prog.unidad04.practica406.libreria;

import prog.unidad04.practica406.libreria.Fecha;

public class Vehiculo {

	private String matricula;
	private Fecha fechaMatriculacion;
	private static int contadorVehiculos = 0;

	// Constructor privado tiene el constructor fecha
	protected Vehiculo(String matricula, Fecha fechaMatriculacion) throws Exception {
	  if (validadorMatricula(matricula)) {
      this.matricula = matricula;
    } else {
      throw new IllegalArgumentException("La matricula introducida es incorrecta.");
    }
      if (fechaMatriculacion  == null) {
        this.fechaMatriculacion = fechaMatriculacion;
      } else {
        throw new NullPointerException("La fecha introducida es incorrecta.");
      }
    contadorVehiculos++; // Contador para sumar número de vehículos

	}

	// Obtener la matrícula del vehículo
	public String getMatricula() {
		if (validadorMatricula(matricula)) {
			return matricula;
		} else {
			return null;
		}
	}

	// Validador de matricula
  private boolean validadorMatricula(String matricula) {
    // Eliminar espacios en blanco
    matricula = matricula.trim();

    // Ver que la longitud sea 7 después de qitar los espacios
    if (matricula.length() != 7) {
        return false; // La matrícula no es válida
    }

    String numeros = matricula.substring(0, 4); // Primeros 4 char
    String letras = matricula.substring(4, 7); // Últimos 3 char

    // Ver que los primeros 4 char sean dígitos
    for (int i = 0; i < 4; i++) {
        if (!Character.isDigit(numeros.charAt(i))) {
            return false; // No es un dígito
        }
    }

    // Ver que los últimos 3 char sean letras y estén en mayúscula
    for (int i = 0; i < 3; i++) {
        if (!Character.isUpperCase(letras.charAt(i))) {
            return false; // No está en mayúscula
        }
    }

    return true; 
}

	// Obtener fecha desde que un vehículo fue matriculado
	public Fecha getFechaMatriculacion() {
	  return fechaMatriculacion;
	}
	// Cuenta cuantos vehículos hay creados
	 public static int getVehiculosMatriculados() {
     return contadorVehiculos; 
 }

	public String toString() {
		return getMatricula() + getFechaMatriculacion().toString();
	}

}