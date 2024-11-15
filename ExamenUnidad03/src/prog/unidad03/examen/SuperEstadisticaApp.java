package prog.unidad03.examen;
import java.util.Scanner;
public class SuperEstadisticaApp {
	
	public static void main(String[] args) {
		//pido los números
		int numero = 0;
		int contador = 0;
		double media =0;
		System.out.println("EXAMEN DE Laura de la Mata. CALCULO DE MEDIA");
		try {
			Scanner sc = new Scanner(System.in);
			
			  for (int i = 1; i > 0  ; i++) {
				System.out.println("Introduce un número entero (0 para terminar): ");
				numero = Integer.parseInt(sc.nextLine());
				//Si es 0
				if(numero==0) {
					System.out.printf("La media es %d", numero);
					System.out.printf(" ");
					System.out.printf("Han entrado %d números en el cálculo", contador);
				}
				//Par o impar
				if(numero % 2 == 0 && numero > 0) {
					System.out.println("El número es par.");
				}else if (numero == 0){
					break;
				}else{
					System.out.println("El número es impar.");
				}
				//Positivo o negativo
				if(numero > 0) {
					System.out.println("El número es positivo.");
				}else if (numero == 0){
					break;
				}else {
					System.out.println("El número es negativo.");
				}
				//	Miro las condiciones para ver si el número entra o no en el cálculo
				if (numero % 2 == 0 && numero <= -11 && numero > 20 ||(numero == -1 || numero ==3)) {
					System.out.println("El número entra en el cálculo");
					contador++;
					numero++;
				}else {
					System.out.println("El número no entra en el cálculo");
					
				}
				
			  }
		} catch (NumberFormatException e) {
			System.out.println("El dato introducido no es un número válido.");
		}
	}
}
