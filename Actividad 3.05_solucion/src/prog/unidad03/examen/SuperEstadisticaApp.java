package prog.unidad03.examen;

import java.util.Scanner;
import java.util.Locale;

public class SuperEstadisticaApp {
  
  // Valor a introducir para terminar
  private static final int VALOR_TERMINACION = 0;
  // Inicio del intervalo de exclusión
  private static final int MINIMO_INTERVALO = -11;
  // Fin del intervalo de exclusión
  private static final int MAXIMO_INTERVALO = 20;
  // Valores que entran en el cálculo a pesar de pertenecer al intervalo de exclusión
  private static final int EXCEPCION1 = -1;
  private static final int EXCEPCION2 = 3;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Cabecera
    System.out.println("EXAMEN DE tu_nombre_aqui. CALCULO DE MEDIA");
    // Suma para calcular la media
    double suma = 0;
    // Cantidad de números en la suma
    int cantidadNumeros = 0;
    
    // Numero leido (hay que declararlo aqui porque se usa en el while
    // Se inicia a -1 para que no termine el ciclo si el primer
    // o primeros valores que se introducen no provoquen la salida 
    // si son incorrectos (el valor da igual siempre que no sea 0)
    int numero = -1;
    
    // Mientras se sigan introduciendo números
    do {
      // Procesamo el error cuando lo que se introduce no es un número
      try {
        // Lee el número desde teclado
        System.out.printf("Introduce un número entero (%d para terminar): ", VALOR_TERMINACION);
        numero = Integer.parseInt(sc.nextLine());
        
        // Si llegamos aqui es que el número es correcto
        // Si no es cero
        if (numero != VALOR_TERMINACION) {
          // Imprimimos si es par o impar, positivo o negativo
          System.out.printf("El número %d es %s y %s%n", numero, ((numero % 2 == 0) ? "par" : "impar"), (numero > 0) ? "positivo" : "negativo");
          // Entra en el cálculo?
          // Si es impar, no está comprendido enter -11 y 20 o es -1 o 3
          if ((numero % 2 != 0) && ((numero <= MINIMO_INTERVALO) || (numero > MAXIMO_INTERVALO)) || (numero == EXCEPCION1) || (numero == EXCEPCION2)) {
            // Imprimimos que el número entra en el cálculo
            System.out.printf("El número %d entra en el cálculo%n", numero);
            // Lo sumamos
            suma += numero;
            // Y contamos uno mas
            cantidadNumeros++;
          }
        }
      } catch (NumberFormatException e) {
        // Lo introducido no es un número
        // Muestra mensaje
        System.out.println("El dato introducido no es un número entero válido");
      }
    } while (numero != VALOR_TERMINACION);
    
    // Si se han introducido números
    if (cantidadNumeros > 0) {
      System.out.printf(Locale.US, "La media de los números que cumplen la condición vale %f%n", (suma / cantidadNumeros));
    } else {
      // Imprime 0
      System.out.println("La media vale 0");
    }
    
    // Imprime la cantidad
    System.out.printf("La cantidad de números que cumplen la condición es de %d%n", cantidadNumeros);
  }

}
