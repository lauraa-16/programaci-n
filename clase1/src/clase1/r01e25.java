package clase1;

import java.util.Scanner;

public class r01e25 {
	
  public static void main(String[] args) {
	  
    Scanner scan = new Scanner(System.in);

    // Cabecera
    
    System.out.println("¿Sera par o impar?");
    
    // Pedimos el numero
    
    System.out.print("Dame el numero y te lo dire ");
    int numero  = Integer.parseInt(scan.nextLine());
    
    // Boolean sirve para comparar y luego insertamos el calculo para saber si es par (true) o no (false)
    
    boolean par = (numero % 2) == 0;
    
    // Mostramos resultado
    
    System.out.printf("¿Es el número %d par?: %b%n", numero, par);
    
  }
}