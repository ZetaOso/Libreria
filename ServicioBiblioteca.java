package Servicios;

import java.util.Scanner;

import Entidades.Biblioteca;
import Entidades.Libro;
import Entidades.Persona;

public class ServicioBiblioteca {
	// instancio persona, libro y biblioteca
	Persona p = new Persona("Zaira", 29);
	Biblioteca b = new Biblioteca();
	Libro libro1 = new Libro("Rayuela", "Cortazar", "1990", "Literario", 300);
	Libro libro2 = new Libro("Macaremna", "Pierr", "1990", "Literario", 300);
	Scanner sc = new Scanner(System.in);

	// cargo los 2 libros disponibles
	public void ActivarBiblioteca() {
		b.agregarLibro(libro1);
		b.agregarLibro(libro2);
	}
	
    //muestra libro disponible:
	public void mostrarLibroDisponible() {
		System.out.println("Libros disponibles:");
		for (Libro ld :b.mostrarLibrosDisponibles() ) {
			System.out.println(ld.toString());
		}
		;
	}
	
	//prestar libro
	public void EleccionLibro() {
		System.out.println("Por favor, ingresa el título del libro que deseas prestar:");
		String titulo = sc.nextLine();
		Libro libroElegido = buscarLibroPorTitulo(titulo);
		if (libroElegido != null) {
			b.prestarLibro(libroElegido);
			p.tomarLibroPrestado(libroElegido);
			System.out.println("Has prestado el libro: " + titulo);
		} else {
			System.out.println("Lo siento, el libro no está disponible o no existe.");
		}
	}

	// en base a libro prestado de persona y biblioteca
	// se carga a lista disponible y saca de lista prestado de ambos
	public void devolver() {
		System.out.println("Libros prestados:");
		p.getListaLibrosPrestados(); // lista de la persona
		System.out.println("Por favor, ingresa el título del libro que deseas devolver:");
		String titulo = sc.nextLine();
		Libro libroElegido = buscarLibroPorTitulo(titulo); // verifica título exista
		if (libroElegido != null) {
			p.devolverLibro(libroElegido);
			b.DevolverLibro(libroElegido);
			System.out.println("Has devuelto el libro: " + titulo);
		} else {
			System.out.println("Lo siento, no puedes devolver un libro que no has prestado o no existe.");
		}
	}

	// verifico si el titulo corresdponde a libros existentes
	private Libro buscarLibroPorTitulo(String titulo) {
		for (Libro libro : b.mostrarLibrosDisponibles()) {
			if (libro.getTitulo().equals(titulo)) {
				return libro;
			}
		}
		return null;
	}
}
