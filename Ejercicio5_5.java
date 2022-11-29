/**
 * ESTE PROGRAMA MEDIANTE WHILE MUESTRA LOS NUMEROS DEL 320 AL 160 DE 20 EN 20
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_5 {
	public static void main (String[] args) {

		int i = 320;

		System.out.println ("Los numeros del 320 al 160 de 20 en 20: ");

		while (i >= 160) {
			System.out.println (i);
			i -= 20;
		}
	}
}
