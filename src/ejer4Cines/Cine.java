package ejer4Cines;

import java.util.ArrayList;

public class Cine {
	private String codigo;
	private String nombre;
	private int numSalas;
	private String localidad;
	private ArrayList<Peliculas> peliculas;

	public Cine(String codigo, String nombre, int numSalas, String localidad) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.numSalas = numSalas;
		this.localidad = localidad;
		this.peliculas = new ArrayList<>();
	}
	public ArrayList<Peliculas> getPeliculas() {
		return peliculas;
	}
	public void setPeliculas(ArrayList<Peliculas> peliculas) {
		this.peliculas = peliculas;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumSalas() {
		return numSalas;
	}
	public void setNumSalas(int numSalas) {
		this.numSalas = numSalas;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public void agregarPelicula(Peliculas pelicula) {
	    peliculas.add(pelicula);
	}
	@Override
	public String toString() {
		return "Cine [codigo=" + codigo + ", nombre=" + nombre + ", numSalas=" + numSalas + ", localidad=" + localidad
				+ ", peliculas=" + peliculas + "]";
	}


}
