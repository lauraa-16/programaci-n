package clase1;
import java.util.Locale;
import java.util.Scanner;
public class r01e07 {

	 public static double  EURO_POR_PESETA = 166.386;
	  
	  public static void main(String[] args) { 
	  //scanner para que el usuario pueda meter las pesetas
	    Scanner pesetas = new Scanner(System.in);
	    System.out.printf("ingrese cantidad de pesetas");
	    
	    //cantidad de euros que tenemos
	    double valor1 = Integer.parseInt(pesetas.nextLine());;
	    
	    //conversion
	    double euros = valor1 / EURO_POR_PESETA; 
	    
	    //resultado
	    System.out.printf(Locale.US, "La cantidad es %f en euros equivale a %f", valor1, euros);
	}
}
