package Servicios;

import java.util.Scanner;

import Entidades.Biblioteca;

public class ServicioMenu {
	Scanner sc = new Scanner(System.in);
	Biblioteca b = new Biblioteca();
	ServicioBiblioteca sb = new ServicioBiblioteca();
	    public void iniciarMenu() {
	        boolean continuar = true;
	        while (continuar) {
	        	System.out.println("**** LIBRERIA **** \n");
	            System.out.println("Por favor, elige una opción:");
	            System.out.println(" 1. Cargar un libro");
	            System.out.println(" 2. Ver libros disponibles");
	            System.out.println(" 3. Prestar un libro");
	            System.out.println(" 4. Devolver un libro");
	            System.out.println(" 5. Salir");
	            int opcion = sc.nextInt();
	            sc.nextLine(); // consume newline left-over
	            switch (opcion) {
	                case 1:
	                   sb.ActivarBiblioteca();
	                    break;
	                case 2:
	                   sb.mostrarLibroDisponible();
	                    break;
	                case 3:
	                    sb.EleccionLibro();
	                    break;
	                case 4:
	                    sb.devolver();
	                    break;
	                case 5:
	                    continuar = false;
	                    break;
	                default:
	                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 5.");
	                    break;
	            }
	        }
	        sc.close();
	    }
	
}
