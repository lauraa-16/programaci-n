package clase1;

import java.util.Scanner;

public class r01e30 {

  // Insertamos el numero menor posible de 2 digitos, y el mayor posible
	
  public static final int MINIMO = 10;
  public static final int MAXIMO = 99;
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Cabecera
    System.out.println("Tiene dos digitos?");
    
    // Solicitamos el numero (Es mas formal que pedir, usalo)
    
    System.out.print("Introduce un numero entero:");
    int numero  = Integer.parseInt(scan.nextLine());
    
    // Calculamos? (El profe pone eso en sus comentarios) si tiene doble digito o no
    
    boolean doubledigitos = numero >= MINIMO && numero <= MAXIMO;
    
    // Imprimimos el resultado
    
    System.out.printf("El numero %d  tiene dos digitos?: %b%n", numero, !doubledigitos);
    System.out.println("Si da true, no tiene dos digitos");
    System.out.println("Si da false tiene dos digitos");
    
    //Nota personal, no olvides el !, si no, no compara 
    
  }
}
