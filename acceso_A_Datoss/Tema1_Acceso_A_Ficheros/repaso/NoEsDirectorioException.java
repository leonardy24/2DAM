package repaso;

public class NoEsDirectorioException extends Exception {

	// contructor generico
	
		public NoEsDirectorioException() {
			super("la ruta no es un direcctorio");
		}
}
