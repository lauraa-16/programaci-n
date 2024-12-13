package prog.unidad04.practica406.libreria;

public class Automovil extends Vehiculo {
    private String color;
    private int numPlazas;

    public Automovil(String matricula, Fecha fechaMatriculacion, String color, int numPlazas) {
        super(matricula, fechaMatriculacion);
        this.color = color;
        this.numPlazas = numPlazas;
    }

    public String getColor() {
        return color;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    @Override
    public String obtenerDistintivoAmbiental() {
        return "A";
    }

    @Override
    public String toString() {
        return super.toString() + ", Color: " + color + ", Num. Plazas: " + numPlazas;
    }
}

