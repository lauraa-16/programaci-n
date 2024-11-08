package clase1;

import java.util.Scanner;

public class r01e05{

	public static void main(String[] args) {

		//Primero de todo meto el scanner y pido los numeros
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Introduzca el primer número");
		
		//Leo el primer numero
		int num1= entradaTeclado.nextInt();
		
		//Meto otro scanner para el siguiente numero, lo pido y lo leo
		Scanner entradaTeclado2 = new Scanner(System.in);
		
		System.out.println("Introduzca el segundo número");
		
		int num2 = entradaTeclado2.nextInt();
		
		//Realizo las operaciones convenientes
	
		int suma= num1+num2;
		int resta= num1-num2;
		int multi= num1*num2;
		int div= num1/num2;
		double modulo= num1%num2;
	
		//Las muestro por consola
	
		 System.out.printf("La suma de %d y %d vale %d%n", num1, num2, suma);
		    System.out.printf("La diferencia de %d menos %d vale %d%n", num1, num2, resta);
		    System.out.printf("La muliplicación de %d por %d vale %d%n", num1, num2, multi);
		    System.out.printf("La división  de %d entre %d vale %d%n", num1, num2, div);
		    System.out.printf("El módulo da de resultado %f ",modulo);
	}

}
