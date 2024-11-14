package ejerciciosRepeticion;
import java.util.Scanner;
public class CalculaDivisorApp {
	public static void main(String[] args) { 
	    
	    System.out.println("    Calcula Divisor      ");
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Introduce un número entero para que calcule sus divisores: ");
	    int numero = Integer.parseInt(sc.nextLine());
	    
	    for (int i = 1; i <= numero; i++) {
	      if (numero % i == 0) {
	        System.out.printf("Es divisible por %d.%n", i);
	      } 
	    }
	  }
	}
	  
