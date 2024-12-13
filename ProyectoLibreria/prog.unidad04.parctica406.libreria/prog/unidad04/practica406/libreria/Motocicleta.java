package prog.unidad04.practica406.libreria;

public class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String matricula, Fecha fechaMatriculacion, int cilindrada) {
        super(matricula, fechaMatriculacion);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String obtenerDistintivoAmbiental() {
        return cilindrada >= 125 ? "B" : "A";
    }

    @Override
    public String toString() {
        return super.toString() + ", Cilindrada: " + cilindrada;
    }
}

