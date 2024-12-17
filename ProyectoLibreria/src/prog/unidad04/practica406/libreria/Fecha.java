package prog.unidad04.practica406.libreria;

import prog.unidad04.practica406.libreria.FechaException;

public class Fecha {

  public int dia;
  public int mes;
  public int anio;

  private static final int DIAS_ANIO= 365;
  private static final int LIMITE_MES_ARRIBA= 12;
  private static final int ANIO_INICIO = 1900;
  private static final int LIMITE_MES_ABAJO= 1;
  
  
  private static final int ENERO = 1;
  private static final int FEBRERO = 2;
  private static final int MARZO = 3;
  private static final int ABRIL = 4;
  private static final int MAYO = 5;
  private static final int JUNIO = 6;
  private static final int JULIO = 7;
  private static final int AGOSTO = 8;
  private static final int SEPTIEMBRE = 9;
  private static final int OCTUBRE = 10;
  private static final int NOVIEMBRE = 11;
  private static final int DICIEMBRE = 12;


  /** Constructor */
  public Fecha(int dia, int mes, int anio) throws FechaException {
if (!(anio >= ANIO_INICIO && mes >= LIMITE_MES_ABAJO && mes <= LIMITE_MES_ARRIBA && diaValido(dia, mes, anio))) {

  throw new IllegalArgumentException("La fecha introducida no es válida.");
    }
    
this.anio = anio;
this.mes = mes;
this.dia = dia;
  }


  public int getDia() {
    return dia;
  }

  // Valido si el día es válido
  private boolean diaValido() throws FechaException {
    switch (mes) {
    case ENERO, MARZO, MAYO, JULIO, AGOSTO, OCTUBRE, DICIEMBRE -> {
      return (dia < 0 && dia > 31);
    }
    case ABRIL, JUNIO, SEPTIEMBRE, NOVIEMBRE -> {
      return (dia < 0 && dia > 30);
    }
    case FEBRERO -> {
      if ((anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0))) {
        return (dia < 0 && dia > 29);
      } else {
        return (dia < 0 && dia > 28);
      }
    }
    }
    throw new FechaException("No es válido.");
  }

  // Calculo los días transcuridos con un switch
  
  private int numeroDeDiasMes(int mes) {
    int diasPorMes = 0;
    //Debo quitar -1 por enero
    switch (mes - 1) {
    
    case NOVIEMBRE:
      diasPorMes += 30;
    case OCTUBRE:
      diasPorMes += 31;
    case SEPTIEMBRE:
      diasPorMes += 30;
    case AGOSTO:
      diasPorMes += 31;
    case JULIO:
      diasPorMes += 31;
    case JUNIO:
      diasPorMes += 30;
    case MAYO:
      diasPorMes += 31;
    case ABRIL:
      diasPorMes += 30;
    case MARZO:
      diasPorMes += 31;
    case FEBRERO:
      diasPorMes += 28;
    case ENERO:
      diasPorMes += 31;
  }
    return diasPorMes;
  
  }

  /** Obtener mes */
  public int getMes() {
    return this.mesValido(mes);
  }

  // Ver si el mes es válido
  private int mesValido(int mes) {
    if (mes < 0 && mes > 12) {
      return 0;
    } else {
      return mes;
    }
  }

  /** Obtener anio */
  public int getAnio() {
    return anio;
  }

  /** Calculo los días transcurridos */

 public long diasTranscurridos() {
    
    int cantidadBisiestos = 0;
    
    // años bisiestos que hay entre la fecha inicial hasta la fecha introducida
    for (int anioTemporal = ANIO_INICIO; anioTemporal <= anio; anioTemporal++) {

      if (esAnioBisiesto(anioTemporal) && (mes > 2 || anioTemporal != anio)) {
        cantidadBisiestos++;
      }
    }
    //Sumo los días calculados
    int diasPorMes = numeroDeDiasMes(mes);
    
    return (cantidadBisiestos + (anio - ANIO_INICIO) * DIAS_ANIO) + diasPorMes + (dia - 1);
  }


  /** Ver si es bisiesto o no */
  public boolean esBisiesto(boolean valor) {
    if ((anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0))) {
      return true;
    } else {
      return false;
    }
  }

  private boolean esAnioBisiesto(int anio) {
    if ((anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0))) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Calcular los días entre fechas
   * 
   * @throws FechaException
   */
  public long diasEntre(Fecha fecha) throws FechaException {
    // Ver si la fecha es mayor a la anterior
    if (fecha.comparaFechas(this)) {
      throw new FechaException("La fecha es anterior a esta fecha.");
    }
    // Diferencia entre fechas
    long diasEntre = fecha.diasTranscurridos() - this.diasTranscurridos();
    return diasEntre;
  }

// Comparo fecha actual con fecha proporcionada
  
  private boolean comparaFechas(Fecha fecha) {
    if (this.anio < fecha.anio) {
      return true; // tcuando this es anterior a fecha
    } else if (this.anio == fecha.anio) {
      // Si los años son iguales comparo mes
      if (this.mes < fecha.mes) {
        return true; // this es anterior a fecha
      } else if (this.mes == fecha.mes) {
        // Si los meses son iguales comparo el día
        return this.dia < fecha.dia; // Devuelve true si es anterior
      }
    }
    return false;
  }

  /** Comparar fechas */
  //Este es para que de un int en vez de un boolean
  public int compara(Fecha fecha) {
    int resultado = 0;

    // Comparar el año de ambas fechas
    if (this.anio < fecha.anio) {
      return -1; // this es menor que fecha
    } else if (this.anio > fecha.anio) {
      return 1; // this es mayor que fecha
    } else {
        // Si los años son iguales, comparar el mes
        if (this.mes < fecha.mes) {
          return -1; // this es menor que fecha
        } else if (this.mes > fecha.mes) {
          return 1; // this es mayor que fecha
        } else {
            // Si los meses son iguales, comparar el día
            if (this.dia < fecha.dia) {
                 return -1; // this es menor que fecha
            } else if (this.dia > fecha.dia) {
              return 1; // this es mayor que fecha
            } else {
                // Si los días son iguales, las fechas son iguales
                return 0; // this es igual a fecha
            }
        }
    }
}
 
  //Mes en letras para poder imprimirlo
  private String mesToString() {
    switch (mes) {
    case ENERO -> {
      return "enero";
    }
    case FEBRERO -> {
      return "febrero";
    }
    case MARZO -> {
      return "marzo";
    }
    case ABRIL -> {
      return "abril";
    }
    case MAYO -> {
      return "mayo";
    }
    case JUNIO -> {
      return "junio";
    }
    case JULIO -> {
      return "julio";
    }
    case AGOSTO -> {
      return "agosto";
    }
    case SEPTIEMBRE -> {
      return "septiembre";
    }
    case OCTUBRE -> {
      return "octubre";
    }
    case NOVIEMBRE -> {
      return "noviembre";
    }
    case DICIEMBRE -> {
      return "diciembre";
    }
    }
    return null;
  }

  public String toString() {
    return getDia() + " de " + mesToString() + " de " + getAnio();
  }
  
  private boolean diaValido(int dia, int mes, int anyo) {

    if (mes == ENERO || mes == MARZO || mes == MAYO || mes == JULIO || mes == AGOSTO || mes == OCTUBRE || mes == DICIEMBRE) {

      return dia >= LIMITE_MES_ABAJO && dia <= 31;

    } else if (mes == ABRIL || mes == JUNIO || mes == SEPTIEMBRE || mes == NOVIEMBRE) {

      return dia >= LIMITE_MES_ABAJO && dia <= 30;

    } else if ((mes == FEBRERO && dia >= LIMITE_MES_ABAJO) && (dia <= 28 || esAnioBisiesto(anyo)) && (dia <= 29)) {

      return true;
    }

    return false;
  }


}