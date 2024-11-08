package prog.unidad03.combinado;

import java.util.Scanner;

public class ParImparFibonacciApp {

	public static void main(String[] args) {
	//Insertar el scanner
	Scanner sc = new Scanner(System.in);
	
	// Solicitar un número sin excepción si no es correcto
	// Solicitar número
	try {
		System.out.print("Introduce un número entero: ");
		int numero = Integer.parseInt(sc.nextLine());
	
	
	//Determinar si el número es par o impar
	if(numero % 2 == 0 ) {
		System.out.println("El número es par.");
	}else {
		System.out.println("El número es impar.");
	}
	
	//Determinar si el número es negativo o positivo
	if(numero >= 0) {
		System.out.println("El número es positivo.");
	}else {
		System.out.println("El número es negativo.");
	}
	if (numero <1 ) {
		System.out.println("No pertenece a Fibonacci");
	} else {
		//Calcula la secuencia de Fibonacci hasta el número
		//Si el numero es 1 o 2
		if (numero ==1) {
		System.out.println("El elemento 1 de la sucesión de Fibonacci es 0.");
		}else if (numero == 2){
		System.out.println("El elemento 2 de la sucesión de Fibonacci es 1.");
			}else {
				//Bucle para los elementos de tres en adelante
				int valor1 = 1;
				int valor2 = 0;
				for (int i = 3; i < numero; i++) {
						int temporal = valor2;
						valor2 = valor1;
						valor1 = valor2 + temporal;
				}
				int resultado = valor1 + valor2;
				System.out.printf("El elemento %d de la sucesión de Fibonacci es %d", numero, resultado);
				}	
			}
	} catch (NumberFormatException e) {
		System.out.println("Entrada no válida. Debe introducir un número entero");
	}
	
	}

}
