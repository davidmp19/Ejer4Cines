package ejer4Cines;

public class Peliculas {
	private String titulo;
	private String director;
	private int anio;
	private String codigoCine;
	public Peliculas(String titulo, String director, int anio, String codigoCine) {

		this.titulo = titulo;
		this.director = director;
		this.anio = anio;
		this.codigoCine = codigoCine;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getCodigoCine() {
		return codigoCine;
	}
	public void setCodigoCine(String codigoCine) {
		this.codigoCine = codigoCine;
	}
	@Override
	public String toString() {
		return "Peliculas [titulo=" + titulo + ", director=" + director + ", anio=" + anio + ", codigoCine=" + codigoCine
				+ "]";
	}
}
