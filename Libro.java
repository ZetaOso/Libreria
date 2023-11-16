package Entidades;

import java.util.Objects;

public class Libro {
	
	private String titulo;
	private String Autor;
	private String anioPublicacion;
	private String genero;
	private int numPaginas;

	public Libro() {
		super();
	}

	public Libro(String titulo, String autor, String anioPublicacion, String genero, int numPaginas) {
		
		this.titulo = titulo;
		this.Autor = autor;
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

	
@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", Autor=" + Autor + ", anioPublicacion=" + anioPublicacion + ", genero="
				+ genero + ", numPaginas=" + numPaginas + "]";
	}

public String ObtenerInformacionDelLibro() {
	return "Libro [titulo=" + titulo + "\n Autor=" + Autor + "\n Año de Publicacion=" + anioPublicacion + "\n Genero="
			+ genero + "\n Número de Páginas=" + numPaginas +"]\n";
}
	

}
