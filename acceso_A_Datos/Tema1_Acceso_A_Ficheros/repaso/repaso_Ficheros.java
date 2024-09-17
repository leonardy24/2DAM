package repaso;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class repaso_Ficheros {

	/**
	 * Metodo que dado un nombre de fichero muestre sus propiedades. si no existe lo indicara
	 * Clase file: objeto que esta asociado a un fichero
	 * @param args
	 * @return 
	 */
	
	 static void listarPropiedades(File fichero){
		
		 
		 
		 System.out.println((fichero.exists())?"si existe":"no existe");
		 
		 
		 boolean ejecutable = fichero.canExecute();
		 System.out.println((ejecutable)?"se puede ejecutar":"no se puede ejecutar");
		 
		 System.out.println(fichero.length());
		 
		 System.out.println(fichero.isDirectory());
		 
		 
	}
	
	
	
	public static void main(String[] args) {
			
		System.out.println("Nombre de fichero");
		
		Scanner scanner = new Scanner(System.in);
		
		String nombreFichero = scanner.nextLine();
		
		
		//tiene que especificar la ruta
		//si no se crea en la carpeta raiz
		File file = new File(nombreFichero);
		
		
		
		//listarPropiedades(file);
	}

}
