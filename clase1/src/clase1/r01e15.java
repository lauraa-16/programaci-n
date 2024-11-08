package clase1;

import java.util.Locale;
import java.util.Scanner;

public class r01e15 {
  
  //Sabemos que siempre tendra una comision del 10% por ende ya metemos una constante de esto
  
  public static double  COMISION = 0.10 ;
    
  public static void main(String[] args) { 
    
    System.out.println("Calcula el salario de este mes ");
    
    //Insertamos un scan para que el pueda ingresar cuantas ventas hizo
   
    Scanner salario = new Scanner(System.in); 
    
   System.out.printf("¿Cuanto es tu salario?");
    
    double salario_base = Double.parseDouble(salario.nextLine());
    
    System.out.printf("¿Cuanto has ganado en ventas?");
    
    Scanner ventasDinero = new Scanner(System.in); 
    
    double ventasDineroIngresado = Double.parseDouble(ventasDinero.nextLine());
    
    //Luego ese por la cantidad de dinero que tenia
    
    double dinero_extra = ventasDineroIngresado * COMISION ;
    
    //Luego aquello se lo sumamos al sueldo
    
    double sueldo_final = dinero_extra + salario_base ;
    
   // Al final imprimimos la salida
    
    System.out.printf(Locale.US, "Tu sueldo de este mes sera de %f ", sueldo_final);
   
  }
}