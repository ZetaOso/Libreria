package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	ArrayList<Libro> listaLibros;
	ArrayList<Libro> listaLibrosPrestados;

	


	public Biblioteca() {
		this.listaLibrosPrestados = new ArrayList<Libro>();
		this.listaLibros = new ArrayList<Libro>();
	}

	Scanner sc = new Scanner(System.in);
	Libro l = new Libro();

	// creo los libros
	/*
	 * private String titulo; private String Autor; private String anioPublicacion;
	 * private String genero; private int numPaginas; private boolean prestado;
	 */

	public void agregarLibro(Libro libro) {
		if (!listaLibros.contains(libro)) {
			listaLibros.add(libro);
		}

	}

	public void prestarLibro(Libro libro) {
		if (!listaLibrosPrestados.contains(libro)) {
			libro.prestarLibro();
			listaLibrosPrestados.add(libro);
		}

	}

	public void DevolverLibro(Libro libro) {
		try {
			if (listaLibrosPrestados.contains(libro)) {
				listaLibrosPrestados.remove(libro);
				// cambio estado prestado -> false a true
				int indice = listaLibros.indexOf(libro);
				if (indice != -1) { // Si el libro se encuentra en la lista,cambia el estado a false
					libro.devolverLibro();
				} else {
					System.out.println("Error al devolver el libro");
				}

			}
		} catch (Exception e) {
			e.getMessage();
		}

	}

	// muestra libros prestado=false
	public void mostrarLibrosDisponibles() {
		for (Libro libro : listaLibros) {
			if (!libro.isPrestado()) {
				System.out.print(libro); // ojo tostring aqui
			}
		}
	}

	// muestra libros prestado=true
	public void mostrarLibrosPrestados() {
		for (Libro libro : listaLibros) {
			if (libro.isPrestado()) {
				System.out.print(libro); // doble ojo
			}
		}
	}

}
