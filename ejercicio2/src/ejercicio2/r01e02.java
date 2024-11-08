package ejercicio2;

import java.util.Locale;

public class r01e02 {
	//Establezco la constante, el factor de conversión de eur a pesetas
	public static double PESETAS_POR_EURO=166.386;
	
	public static void main(String[] args) {
	//	Convertidor de euros a pesetas
		//Establezco los euros que voy a cambiar
	double euros = 35;
	//Calculo la equivalencia en pesetas
	double pesetas = PESETAS_POR_EURO*euros;
	
	//Imprimo el resultado
	System.out.printf(Locale.US,"La cantidad %f en euros equivale a %f en pesetas", euros, pesetas);
	}
}
