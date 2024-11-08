package clase1;

import java.util.Scanner;
import java.util.Locale;

public class r01e20 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    // Cabecera 

    System.out.println("Calcula el area");
    
    // Pedimos que ingrese las longitudes de los lados A, B y C
    
    System.out.print("Introduce la longitud del lado A: ");
    
    double ladoA = Double.parseDouble(scan.nextLine());
    
    System.out.print("Introduce la longitud del lado B: ");
    
    double ladoB = Double.parseDouble(scan.nextLine());
    
    System.out.print("Introduce la longitud del lado C: ");
    
    double ladoC = Double.parseDouble(scan.nextLine());
    
    // El área tiene dos partes. En la inferior es un rectángulo de lados B y C  y en la parte superior un triángulo de base B y altura A - C
    //Por ende deducimos las siguientes formulas. 
     
    double areaInferior = ladoB * ladoC;
    
    double areaSuperior = ladoB * (ladoA - ladoC) / 2;
    
    double areaTotal = areaInferior + areaSuperior;

    // Imprimimos el resultado
    
    System.out.printf(Locale.US, "El área total de la parcela es de %f%n", areaTotal);
  }
}