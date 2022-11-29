/**
 * ESTE PROGRAMA MEDIANTE WHILE MUESTRA LOS MULTIPLOS DE 5 DEL 0 AL 100
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_2 {
	public static void main (String[] args) {
	
		int mult = 0; 
		
		System.out.println ("Los multiplos de 5 son: ");

		while (mult <= 100) {
			System.out.println (mult);
			mult += 5;			
		}
	}
}
