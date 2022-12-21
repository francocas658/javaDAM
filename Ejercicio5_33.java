/**
 * ESTE PROGRAMA MUESTRA UNA U CON LA ALTURA DESEADA INTRODUCIDA POR TECLADO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_33 {
	public static void main (String[] args) {

		System.out.print ("Elige la altura de la U: ");
			int n = Integer.parseInt(System.console().readLine());

		for (int i = 1; i < n; i++) {
			System.out.println ("*     *");
		}
		
		System.out.println ("  * *  ");
	}
}
