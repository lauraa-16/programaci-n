import java.util.Scanner;

public class NavajaSuizaCadenasApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Solicitamos las caadenas
    System.out.print("Introduce la primera cadena:");
    String cadena1 = sc.nextLine();
    System.out.print("Introduce la segunda cadena:");
    String cadena2 = sc.nextLine();
    
    //Concatenacion de ambas cadenas
    System.out.print("Concatenacion de ambas cadenas: ");
    System.out.println(cadena1 + cadena2);
    
    //El largo de la cadena Devuelve un numero entero
    System.out.print("El largo de la cadena Devuelve un numero entero: ");
    System.out.println(cadena1.length());
    
    //Si la cadena esta vacia Devuelve f/t
    System.out.print("Si la cadena esta vacia Devuelve f/t: ");
    System.out.println(cadena1.isEmpty());
    
    //Si la cadena tiene un espacio blanco Devuelve f/t
    System.out.print("Si la cadena tiene un espacio blanco Devuelve f/t: ");
    System.out.println(cadena1.isBlank());
    
    //Si la cadena es igual a la otra pero es sensible a mayusculas y a minusculas Devuelve f/t
    System.out.print("Si la cadena es igual a la otra pero es sensible a mayusculas y a minusculas Devuelve f/t: ");
    System.out.println(cadena1.equals(cadena2));
    
    //Si la cadena es igual a la otra pero no es sensible Devuelve f/t
    System.out.print("Si la cadena es igual a la otra pero no es sensible Devuelve f/t: ");
    System.out.println(cadena1.equalsIgnoreCase(cadena2));
    
    //Si la cadena es igual pero sensible y devuelve numero entero
    System.out.print("Si la cadena es igual pero sensible y devuelve numero entero: ");
    System.out.println(cadena1.compareTo(cadena2));
    
    //Si la cadena es igual pero no es sensible y devuelve numero entero
    System.out.print("Si la cadena es igual pero no es sensible y devuelve numero entero: ");
    System.out.println(cadena1.compareToIgnoreCase(cadena2));
    
    //Devuelve si las cadenas contiene una a la otra.  y es con t/f
    System.out.print("Devuelve si las cadenas contiene una a la otra.  y es con t/f: ");
    System.out.println(cadena1.contains(cadena2));
    
    //Devuelve si la cadena empieza con la otra y es con t/f
    System.out.print("Devuelve si la cadena empieza con la otra y es con t/f: ");
    System.out.println(cadena1.startsWith(cadena2));
    
    //Devuelve si termina con la otra y es con t/f
    System.out.print("Devuelve si termina con la otra y es con t/f: ");
    System.out.println(cadena1.endsWith(cadena2));
    
    //Mata el primer caracter
    System.out.print("Mata el primer caracter: ");
    System.out.println(cadena1.substring(1));
    
    //Invierte caracteres
    System.out.print("Invierte caracteres: ");
    System.out.println(cadena1.toUpperCase());
    System.out.print("Invierte caracteres: ");
    System.out.println(cadena1.toLowerCase());

  }

}
