package clase1;

import java.util.Scanner;

public class Kk {

	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		//Pedir el nombre del usuario
		System.out.println("Introduzca su nombre ");
		//Leer el nombre desde el teclado
		String nombre = entradaTeclado.nextLine();
		//Lo imprimimos
		System.out.printf("Hola %s", nombre);

		System.out.println("");
		System.out.println("");
		
		Scanner entradaTeclado2 =  new Scanner(System.in);
		System.out.println("Introduzca su edad");
		int edad =entradaTeclado2.nextInt();
		System.out.printf("Hola %d",edad);
		
	}

}
