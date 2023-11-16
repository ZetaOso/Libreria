package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	private ArrayList<Libro> listaLibros;
	private ArrayList<Libro> listaLibrosPrestados;
	Scanner sc = new Scanner(System.in);

	// inicializar listas
	public Biblioteca() {
		this.listaLibrosPrestados = new ArrayList<Libro>();
		this.listaLibros = new ArrayList<Libro>();
	}


	// instanciar libro
	Libro l = new Libro();

	// si no esta cargado, lo cargo a lista de libros
	public void agregarLibro(Libro libro) {
		if (!listaLibros.contains(libro)) {
			listaLibros.add(libro);
		}

	}
    //si no esta prestado, lo agrego a la lista de prestados
	public void prestarLibro(Libro libro) {
		if (!listaLibrosPrestados.contains(libro)) {
			listaLibrosPrestados.add(libro);
		}

	}

	//recibe libro, si esta prestado lo saca de esta lista y pasa a disponibles
	public void DevolverLibro(Libro libro) {
		try {
			if (listaLibrosPrestados.contains(libro)) {
				listaLibrosPrestados.remove(libro);
			} else {
				System.out.println("Error al devolver el libro");
			}
		} catch (Exception e) {
			e.getMessage();
		}

	}

	// muestra libros disponibles
	public ArrayList<Libro> mostrarLibrosDisponibles() {
		return listaLibros;

	}

	// muestra libros prestado
	public ArrayList<Libro> mostrarLibrosPrestados() {
		return listaLibrosPrestados;

	}

}
