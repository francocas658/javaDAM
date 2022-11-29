/**
 * ESTE PROGRAMA MEDIANTE DO-WHILE MUESTRA LOS MULTIPLOS DE 5 DEL 0 AL 100
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_3 {
	public static void main (String[] args){

		int mult = 0;
		
		System.out.println ("Los multiplos de 5 son: ");
	
		do {
			System.out.println (mult);
			mult += 5;
		} while (mult <= 100);
	}
}
