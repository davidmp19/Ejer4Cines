package ejer4Cines;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FicheroComun {
	private static String Salida = "C:\\Users\\Mañana\\Desktop\\EjerciciosMayo\\Salida.txt";
	Lector lector = new Lector();

	public void escribirTodo() throws IOException {
		FileWriter fw = new FileWriter(Salida);
		BufferedWriter bw = new BufferedWriter(fw);
		ArrayList<Cine> cines = lector.getDatosCine();
		ArrayList<Peliculas> peli = lector.getDatosPeliculas();

		try {
			for (Cine ci : cines) {
				bw.write(ci.getNombre());
				bw.newLine();
				bw.write(ci.getLocalidad());
				bw.newLine();
				for (Peliculas pelicula : ci.getPeliculas()) {
					bw.write(pelicula.getTitulo());
					bw.newLine();
				}

			}

			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
