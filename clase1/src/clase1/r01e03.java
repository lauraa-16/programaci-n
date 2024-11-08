package clase1;

public class r01e03 {

	// Establezco la constante del IVA
	public static double IVA= 0.21;
	
	public static void main(String[] args) {
		
		//Establezco la variable de la base 
		double base=350;
		double total;
		
		//Calculo el total
		total= base+(base*IVA);
		
		//Imprimo por consola el resultado
		System.out.printf("El total de la falctura es %f",total);
	}

}
