package actividad206;

import java.util.Scanner;
import java.util.random.RandomGenerator;
import es.iespablopicasso.programacion.bloque02.figuras.*;
public class ParalelogramosApp {


	public static void main(String[] args) {
		System.out.println("EXAMEN DE LAURA DE LA MATA. PROPIEDADES DE LOS PARALELOGRAMOS");
		
		//Meto el Scanner
		Scanner entradaTeclado = new Scanner(System.in);
		
		// Solicito por teclado los datos necesarios
		System.out.println("Introduzca la longitud de los lados horizontales: ");
		double longitudHorizontal = entradaTeclado.nextDouble();
		
		System.out.println("Introduzca el límite mínimo de los posibles valores de la longitud del lado vertical");
		double longMinimaVertical = entradaTeclado.nextDouble();
		
		System.out.println("Introduzca ahora el límite máximo de los posibles valores de la longitud del lado vertical");
		double longMaximaVertical = entradaTeclado.nextDouble();
		
		//Con el constructor establezco los límites y pido un número random
		Paralelogramo limites= new Paralelogramo(longMinimaVertical, longMaximaVertical);
		
		RandomGenerator ladoVertical = RandomGenerator.of("limites");
		
		//Saco por pantalla el lado vertical obtenido
		System.out.println("La longitud del lado vertical obtenida al azar es de: " + ladoVertical);
		
		//Transformo de string a double
		String chain = String.valueOf(ladoVertical);
		double ladoVerticalDoub = Double.parseDouble(chain);
		
		// Creo el paralelogramo
		Paralelogramo paralelogramo = new Paralelogramo(longitudHorizontal, ladoVerticalDoub);
		
		// Saco el perímetro y el área
		String areaPerimetro = paralelogramo.getAreaPerimetro();
		
		//Los saco por pantalla
		System.out.printf("El área del paralelogramo vale %s y el perímetro %s", areaPerimetro);
		
		// Pido el valor real de escala
		System.out.println("Introduzca el factor real positivo po rel que quiere ampliar (mayor que 1) o reducir (menor que 1) el paralelogramo: ");
		double factor= entradaTeclado.nextDouble();
		
		System.out.printf("Después del escalado, el área del paralelogramo vale ahora %s y el perímetro %s");
		System.out.printf("La suma del área y el perímetro es %s");
	}


}
