package proyecto;

import java.util.Scanner;


public class VehiculosApp {
		
		   public static void main(String[] args) {
		       Scanner scanner = new Scanner(System.in);
		       try {
		           System.out.println("Introduce los datos del automóvil:");
		           System.out.print("Matrícula: ");
		           String matriculaAuto = scanner.nextLine();
		           System.out.print("Día de matriculación: ");
		           int diaAuto = scanner.nextInt();
		           System.out.print("Mes de matriculación: ");
		           int mesAuto = scanner.nextInt();
		           System.out.print("Año de matriculación: ");
		           int anioAuto = scanner.nextInt();
		           System.out.print("Color (blanco, negro o azul): ");
		           String color = scanner.nextLine();
		           System.out.print("Número de plazas: ");
		           int plazas = scanner.nextInt();
		           Fecha fechaAuto = new Fecha(diaAuto, mesAuto, anioAuto);
		           Automovil automovil = new Automovil(matriculaAuto, fechaAuto, color, plazas);
		           System.out.println("\nIntroduce los datos de la moto:");
		           System.out.print("Matrícula: ");
		           String matriculaMoto = scanner.nextLine();
		           System.out.print("Día de matriculación: ");
		           int diaMoto = scanner.nextInt();
		           System.out.print("Mes de matriculación: ");
		           int mesMoto = scanner.nextInt();
		           System.out.print("Año de matriculación: ");
		           int anioMoto = scanner.nextInt();
		           System.out.print("Cilindrada: ");
		           int cilindrada = scanner.nextInt();
		           Fecha fechaMoto = new Fecha(diaMoto, mesMoto, anioMoto);
		           Motocicleta motocicleta = new Motocicleta(matriculaMoto, fechaMoto, cilindrada);
		           System.out.println("\nDatos del automóvil:");
		           System.out.println(automovil);
		           System.out.println("Distintivo ambiental: " + automovil.getDistintivoAmbiental());
		           System.out.println("Días desde matriculación: " + automovil.getFechaMatriculacion().diasDesde());
		           System.out.println("\nDatos de la moto:");
		           System.out.println(motocicleta);
		           System.out.println("Distintivo ambiental: " + motocicleta.obtenerDistintivoAmbiental());
		           System.out.println("Días desde matriculación: " + motocicleta.getFechaMatriculacion().diasDesde());
		           // Determinar cuál vehículo es más nuevo
		           if (automovil.getFechaMatriculacion().diasDesde() < motocicleta.getFechaMatriculacion().diasDesde()) {
		               System.out.println("\nEl automóvil es más nuevo que la moto.");
		           } else if (automovil.getFechaMatriculacion().diasDesde() > motocicleta.getFechaMatriculacion().diasDesde()) {
		               System.out.println("\nLa motocicleta es más nueva que el automóvil.");
		           } else {
		               System.out.println("\nAmbos vehículos tienen la misma antigüedad.");
		           }
		           System.out.println("\nNúmero total de vehículos matriculados: " + Vehiculo.getVehiculosMatriculados());
		       } catch (FechaException e) {
		           System.out.println("Error: " + e.getMessage());
		       } catch (Exception e) {
		           System.out.println("Error inesperado: " + e.getMessage());
		       } 
		       }
		   }

