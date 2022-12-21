/**
 * ESTE PROGRAMA MUESTRA UNA L CON LA ALTURA DESEADA INTRODUCIDA POR TECLADO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_31 {
	public static void main (String[] args) {

		System.out.print ("Elige la altura de la L: ");
			int n = Integer.parseInt(System.console().readLine());

		for (int i = 1; i < n; i++) {
			System.out.println ("*");
		}
		
		System.out.println ("* * * *");
	}
}

