package poo.app;

public class MiApp {

	//EL método run gestiona la ejecución del 
	// programa, invocando el mínimo de sentencias.
	static void run() {
		int numero=1;
		while (numero <=10){
		System.out.println("Hola Mundo");
		numero++;
	}
	}
	// El método principal debe quedar reducido al
	// menor número de líneas
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         run();
	}
}