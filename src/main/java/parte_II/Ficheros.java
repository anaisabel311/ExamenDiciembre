package parte_II;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;


public class Ficheros {
	
//	private static final java.util.logging.Logger logger = java.util.logging.LogManager.getLogger(Ficheros.class);

		public static void main(String[] args) throws IOException {

			String nombreArchivo = "C:\\Users\\Tardes\\git\\cursogetafe2\\examen\\FicheroEjercicio2.txt";
	        Ficheros servicio = new Ficheros();

	        
	        try {
				System.out.println(servicio.leerArchivo3(nombreArchivo));
//				logger.info ("lee el fichero");				
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
		
		
		
		public String leerArchivo3(String nombre) throws IOException{
			Path path = Paths.get(nombre);
			StringBuilder sb = new StringBuilder();

			List<String> lines = Files.readAllLines(path);
			for (String linea : lines) {
				sb.append(linea+"\n");
			}

			return sb.toString();
		}
		
		
	}


