package Entidades;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private int edad;
	private ArrayList<Libro> listaLibrosPrestados;

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		ArrayList<Libro> listaLibrosPrestados = new ArrayList<Libro>();
	}

	public Persona(String nombre, int edad, ArrayList<Libro> listaLibrosPrestados) {
		this.nombre = nombre;
		this.edad = edad;
		this.listaLibrosPrestados = listaLibrosPrestados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ArrayList<Libro> getListaLibrosPrestados() {
		return listaLibrosPrestados;
	}

	public void setListaLibrosPrestados(ArrayList<Libro> listaLibrosPrestados) {
		this.listaLibrosPrestados = listaLibrosPrestados;
	}

	public void tomarLibroPrestado(Libro libro) {
		
			if (!listaLibrosPrestados.contains(libro)) {
				listaLibrosPrestados.add(libro);
			}
	}
	public void devolverLibro(Libro libro) {
		
		if (listaLibrosPrestados.contains(libro)) {
			listaLibrosPrestados.remove(libro);
		}
	}

}
