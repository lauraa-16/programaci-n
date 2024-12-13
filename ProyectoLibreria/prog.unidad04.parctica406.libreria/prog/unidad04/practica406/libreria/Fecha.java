package prog.unidad04.practica406.libreria;
import java.time.LocalDate;
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
		
	//mira si el año es bisiesto o no 
    public boolean esAnioBisiesto() {
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public long diasDesde() {
        // Creo fecha
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        
        // Obtengo la fecha actual
        LocalDate hoy = LocalDate.now();
        long totalDias = 0;

        // Tengo en cuenta si el mes tiene 28, 30 o 31 días
        int obtenerDiasDelMes(int año, int mes) {
            switch (mes) {
                case 1: // Enero
                case 3: // Marzo
                case 5: // Mayo
                case 7: // Julio
                case 8: // Agosto
                case 10: // Octubre
                case 12: // Diciembre
                    return 31;
                case 4: // Abril
                case 6: // Junio
                case 9: // Septiembre
                case 11: // Noviembre
                    return 30;
                case 2: // Febrero
                    // Miro si es un año bisiesto por los días de febrero
                    if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                        return 29; 
                    } else {
                        return 28; 
                    }
                default:
                    return 0;
            }
        }

        // Calculo la diferencia en años, meses y días
        int años = hoy.getYear() - fecha.getYear();
        int meses = hoy.getMonthValue() - fecha.getMonthValue();
        int dias = hoy.getDayOfMonth() - fecha.getDayOfMonth();

        // Miro a ver si el mes de hoy es anterior al mes de la fecha,
        // o si el día de hoy es anterior al día de la fecha
        if (meses < 0) {
            años--;
            meses += 12;
        }
        if (dias < 0) {
            meses--;
            if (meses < 0) {
                meses += 12;
                años--;
            } else {
            
          // Miro los días del mes anterior para sumarlos a la cuenta si es necesario
            int diasDelMesAnterior = obtenerDiasDelMes(fecha.getYear(), fecha.getMonthValue() - 1);
            dias += diasDelMesAnterior;
        }

        // Calculo los días totales
        totalDias += años * 365;

        //días de los meses completos
        for (int i = 1; i <= meses; i++) {
            totalDias += obtenerDiasDelMes(hoy.getYear(), i);
        }
        
        //Meto los días del mes actual
        totalDias += dias;

        return totalDias;
    }
        
	}
