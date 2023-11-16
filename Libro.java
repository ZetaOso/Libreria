package Entidades;

import java.util.Objects;

public class Libro {
	
	private String titulo;
	private String Autor;
	private String anioPublicacion;
	private String genero;
	private int numPaginas;
	private boolean prestado;

	public Libro() {
		super();
	}

	public Libro(String titulo, String autor, String anioPublicacion, String genero, int numPaginas,
			boolean prestado) {
		super();
		this.titulo = titulo;
		Autor = autor;
		this.anioPublicacion = anioPublicacion;
		this.genero = genero;
		this.numPaginas = numPaginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public String getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(String anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	


@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(titulo, other.titulo);
	}

public String ObtenerInformacionDelLibro() {
	return "Libro [titulo=" + titulo + ", Autor=" + Autor + ", anioPublicacion=" + anioPublicacion + ", genero="
			+ genero + ", numPaginas=" + numPaginas +"]";
}

	public boolean prestarLibro() {
		return this.prestado = true;
	}

	public boolean devolverLibro() {
		return this.prestado = false;
	}

	

}
