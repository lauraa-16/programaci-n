package prog.unidad04.practica406.libreria;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.DateTimeException;

public class Fecha {
	
	private int dia;
	private int mes;
	private int anio;
	
	//Mira  si la fecha no es válida
	public Fecha(int dia, int mes, int anio) throws FechaException {
		if (!esFechaValida(dia, mes, anio)) {
			throw new FechaException("Fecha no válida");
		}
		this.dia = dia;
		this.mes = mes; 
		this.anio = anio;
	}

	//Verifica que la fecha sea valida
	public static boolean esFechaValida(int dia, int mes, int anio) {
		try {
			LocalDate.of(anio, mes, dia);
			return true;
			} catch (DateTimeException e) {
				return false;
			}
		}
		
	//mira si el años es bisiesto o no con una comprobación de una clase default de java
		public boolean esAnioBisiesto()  {
			return java.time.Year.isLeap(anio);
		}
		
		//uso una clase de java para contar los días entre una fecha y la fecha del sistema
		public long diasDesde() {
	        LocalDate fecha = LocalDate.of(anio, mes, dia);
	        return ChronoUnit.DAYS.between(fecha, LocalDate.now());
	    }

		//Formateo la fecha para que siga el patrón de día, mes y año con la clase DateTimeFormatter de java
	    /*public String toString() {
	        LocalDate fecha = LocalDate.of(anio, mes, dia);
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy");
	        return fecha.format(formatter);
	    }*/
	    
	}
