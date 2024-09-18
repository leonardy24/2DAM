package repaso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class repaso_ficheros {
	
	/**
	 * Metodo que dado un nombre de fichero muestre sus propiedades. si no existe lo
	 * indicara Clase file: objeto que esta asociado a un fichero
	 * 
	 * @param args
	 * @return
	 */
	 void listarPropiedades(File fichero) {

		System.out.println((fichero.exists()) ? "si existe" : "no existe");

		boolean ejecutable = fichero.canExecute();
		System.out.println((ejecutable) ? "se puede ejecutar" : "no se puede ejecutar");

		System.out.println(fichero.length());

		System.out.println(fichero.isDirectory());

	}

	/**
	 * Este metodo recibe una ruta que se supone, que es un directorio
	 * 
	 * @param direcctorio Ruta del sistema de archivos
	 * @return Una cadena con el listado de todo el contenido, si el parametro no es un
	 * directorio devuelve NULL
	 */
	 String listarDirectorio(File direcctorio) {
		
		if(!direcctorio.isDirectory()) {
			return null;
		}
		
		//listar contenido
		
		return "";
	}
	
	
	
	/**
	 * Este metodo recibe una ruta que se supone, que es un directorio
	 * 
	 * @param direcctorio Ruta del sistema de archivos
	 * @return Una cadena con el listado de todo el contenido, si el parametro no es un
	 * directorio devuelve NULL
	 *  @throws NoEsDirectorioException
	 * la ruta no es un direcctorio
	 */
	 
	 
	 static String listarDirectorio_v2(File direcctorio,String tab) throws NoEsDirectorioException {
		
		 String resultado = "";
		 
		
		 if(!direcctorio.isDirectory()) {
			throw new NoEsDirectorioException();
		}
		
		//listar contenido
		 
		File[] files = direcctorio.listFiles();
		
		
		for(File f: files) {
			
			if(!f.isDirectory()) {
				resultado += f.getName()+"\n";
			}else {
				resultado += f.getName()+"\n"
				+listarDirectorio_v2(f,tab +"\t")+"\n";
			}
			 
		}
		
		
		return resultado;
	}
	 
	 /**
	  * 
	  * @param direcctorio la ruta de un directorio
	  * @param nombreArchivo. nombre de archivo
	  * @return true si nombre, esta en directorio,(incluyendo subcarpetas), false si no
	  */
	 static boolean existeArchivo(File direcctorio, String nombreArchivo){
		
		 File[] file = direcctorio.listFiles();
		 
		 for (File fiche : file) {
			
		}
		 
		 return false;
	 }
	 
	 
	 static void ejemploJavaNio() {
		 
		 //path,paths, files
		 
		 Path ruta = Paths.get("leer.txt");
		 List<String> lineas = null;
		 try {
			lineas = Files.readAllLines(ruta);
		} catch (IOException e) {
			System.out.println("problema al abrir el archivo");
			e.printStackTrace();
		}
		 
		 
		 if(lineas != null) {
			 for (String lin : lineas) {
				System.out.println(lin);
			}
		 }
		 
	 }
	 
	 /**
	  * Metodo que elimina un caracter de un archivo de texto
	  * @param nombArchivo Nombre archio
	  * @param caracter Caracter a eliminar
	  */
	 
	 //tenemos que eliminar cierto caracter de todo el fichero
	 static File eliminarCaracter(File nombArchivo, char caracter) {
		 
		// FileReader leer = new FileReader(nombArchivo);
		 
		 //BufferedReader otro = new BufferedReader(leer);
		 
		 return null;
	 }
	 
	public static void main(String[] args) throws NoEsDirectorioException {
		/*
		System.out.println("Nombre de fichero");

		Scanner scanner = new Scanner(System.in);

		String nombreFichero = scanner.nextLine();

		// tiene que especificar la ruta
		// si no se crea en la carpeta raiz
		File file = new File(nombreFichero);

		
		//listarPropiedades(file);

		
		
		try {
			System.out.println(listarDirectorio_v2(file," "));
		} catch (NoEsDirectorioException e) {
			System.out.println("No puedo hacer tal");
			e.printStackTrace(); //ESTO ES IMPORTAN CUANDO SE ESTA DESARROLLANDO, PORQUE ME INDICA DONDE ESTAN LO ERRORES
			//DE FORMA ESPECIFICA
		}
		*/
		
		ejemploJavaNio();
		
		

	}

}
