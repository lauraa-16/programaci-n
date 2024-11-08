
import java.util.Scanner;
import java.util.Locale;
public class CalculoVertical {
	
	public static double ACELERACION_GRAVEDAD = 9.8;
	public static double METROS_A_PIES = 3.28;
	
	public static void main(String[] args) {
		
		System.out.println("EXAMEN DE LAURA DE LA MATA. CALCULO DE LANZAMIENTO VERTICAL ");
		
		//Meto el scanner para poder solicitar los datos al usuario
		Scanner entradaTeclado = new Scanner(System.in);
		
		//Solicito por consola la velocidad inicial
		System.out.print("Introduzca la velocidad inicial del objeto(en m/s):");
		double velocidadInicial = entradaTeclado.nextDouble();
		
		//Calculo el tiempo que se tarda en alcanzar la altura maxima
		double tiempo = velocidadInicial/ACELERACION_GRAVEDAD;
		
		//Calculo la altura maxima 
		double alturaMaxima = (velocidadInicial*tiempo)-1/2*(ACELERACION_GRAVEDAD*(tiempo*tiempo));
		
		//Paso de metros a pies para dar los valores por consola
		int alturaMaximaPies = (int) (alturaMaxima*METROS_A_PIES);
		
		//Imprimo los valores por consola
		System.out.printf(Locale.US,"La altura máxima en metros es de %f", alturaMaxima);
		System.out.println("");
		System.out.printf(Locale.US,"Esta altura equivale a %d pies",alturaMaximaPies);
		System.out.println("");
		System.out.printf(Locale.US,"El tiempo necesario es %f segundos", tiempo);
		
	}

}
