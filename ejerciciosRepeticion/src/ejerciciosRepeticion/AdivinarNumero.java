
package ejerciciosRepeticion;
import java.util.Scanner;
import java.util.Random;
public class AdivinarNumero {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 //Titulo del ejercicio
		 System.out.println("ADIVINA EL NÚMERO");
		 //Variables
		 int numero = 0;
		 int seguir = 0;
		 int i;
		 do {
		 System.out.println("NUEVO JUEGO");
		 //Creamos el número random
		 Random random = new Random();
		 int numeroRandom = random.nextInt(100) + 1;
		 System.out.println("He pensado un numero entre 1 y 100. Intenta adivinarlo");
		 i = 1;
		 do {
		 //Pedimos el número a comparar
		 System.out.printf("Intento %d. Introduce un número entre 1 y 100: ", i);
		 numero = Integer.parseInt(sc.nextLine());
		 if(numero == numeroRandom) {
		 System.out.printf("Has acertado en %d intentoS. El número era %d%n", i,
		 numeroRandom);
		 } else {
		 if(numero < numeroRandom) {
		 System.out.printf("El número es mayor que %d%n", numero);
		 i++;
		 } else {
		 System.out.printf("El número es menor que %d%n", numero);
		 i++;
		 }
		 }
		 } while(i <= 10 && numero != numeroRandom);
		 if(i > 10) {
		 System.out.printf("Has fallado el número era %d%n", numeroRandom);
		 }
		 //Preguntamos si quiere otro juego
		 System.out.print("¿Quieres jugar otra partida (s/n)?: ");
		 String jugar = sc.nextLine();
		 switch(jugar) {
		case "s":
		 seguir = 1;
		 break;
		 case "n":
		 seguir = 0;
		 break;
		 default:
		 System.out.println("No se ha indicado correctamente");
		 break;
		 }
		 } while(seguir == 1);
		 }
}

