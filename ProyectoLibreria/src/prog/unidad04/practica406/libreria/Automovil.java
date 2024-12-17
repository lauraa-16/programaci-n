package prog.unidad04.practica406.libreria;

public class Automovil extends Vehiculo {

	//Creo las constantes de los colores
	
  /**
   * constante del color blanco.
   */
  public static final String COLOR_BLANCO = "blanco";
  /**
   * constante del color azul.
   */
  public static final String COLOR_AZUL = "azul";
  /**
   * constante del color negro.
   */
  public static final String COLOR_NEGRO = "negro";

  private String matricula;
  private int plazas;
  private String color;
  private Fecha fechaMatriculacion;


  public Automovil(String matricula, Fecha fechaMatriculacion) throws Exception {
    super(matricula, fechaMatriculacion);
  }

  /** Constructor 
   * @throws Exception */
  public Automovil(String matricula, Fecha fechaMatriculacion, String color, int plazas) throws Exception {
    super(matricula, fechaMatriculacion);
    if (color == null) {
      throw new NullPointerException("El color introducido es incorrecto.");
    } else if ( plazas == 0){
      throw new IllegalArgumentException("La plaza introducida es incorrecta.");
    } else {
      this.color = color;
      this.plazas = plazas;
    }
  }

  /**
   * Obtiene el color del automovil
   */
  public String getColor() {
    String color = this.color;
    switch (color) {
    case COLOR_AZUL -> {
        this.color = "azul";
        return color;
        }
    case COLOR_BLANCO ->{
      this.color = "blanco";
      return color;
    }
    case COLOR_NEGRO -> {
      this.color = "negro";
      return color;
    }
    }
    return null;
  }

  /**
   * Obtiene el número de plazas del automovil
   */
  public int getPlazas() {
    return plazas;
  }

  /**
   * Obtiene el distintivo ambiental del automovil. Si tiene 1 plaza es 0, si
   * tiene de 2 a 3, ECO, si tienen de 4 a 5 son A y si tienen más de 5, B
   */
  public String getDistintivo() {
    int plazas = this.plazas;
    if (plazas == 1) {
      return "0";
    } else if (plazas == 2 || plazas == 3) {
      return "ECO";
    } else if (plazas == 4 || plazas == 5) {
      return "A";
    } else if (plazas > 5) {
      return "B";
    } else {
      return "Plazas incorrectas";
    }
  }

  /**
   * Obtiene la representación en texto del automóvil en el formato: Matricula:
   * matricula, Fecha Matriculación: dd de mmmmm de aaaa, Color: color, Num.
   */
  public String toString() {
    return "Matricula: " + getMatricula() + " Fecha de matriculacion: " + getFechaMatriculacion() + " Color: " + getColor() + " Plazas: " +getPlazas();
  }

}