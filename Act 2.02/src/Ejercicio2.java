
public class Ejercicio2 {

	public static void main(String[] args) {

		Persona persona1 = new Persona();
		persona1.edad = 25;
		persona1.peso = 75.4;
		persona1.numeroHijos = 0;

		Persona persona2 = new Persona();
		persona2.edad = 65;
		persona2.peso = 65;
		persona2.numeroHijos = 3;

		System.out.printf("Para la primera persona, su edad es %d, su peso es %f y tiene %d hijos.%n", persona1.edad,persona1.peso, persona1.numeroHijos);
		System.out.printf("Para la segunda persona, su edad es %d, su peso es %f y tiene %d hijos.%n", persona2.edad,persona2.peso, persona2.numeroHijos);
	
		boolean dondeApuntanVariables= persona1 == persona2;
		System.out.printf("¿Apuntan las variables al mismo objeto? %b", dondeApuntanVariables);
	
		Persona persona3 = new Persona();
		persona3.edad= 33;
		persona3.peso= 80.43;
		persona3.numeroHijos= 1;
		
	}
}
