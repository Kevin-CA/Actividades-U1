package poo.app;

public class MiApp {

	//EL m�todo run gestiona la ejecuci�n del 
	// programa, invocando el m�nimo de sentencias.
	static void run() {
		int numero=1;
		while (numero <=10){
		System.out.println("Hola Mundo");
		numero++;
	}
	}
	// El m�todo principal debe quedar reducido al
	// menor n�mero de l�neas
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         run();
	}
}