/**
 * ESTE PROGRAMA LEE UN NUMERO Y TE DICE SU FACTORIAL Y LOS ANTERIORES
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_39 {
	public static void main (String[] args) {
		
		System.out.print ("Introduce un numero: ");
			int n = Integer.parseInt(System.console().readLine());
		
		int fact = 1;
 
		for(int i = 1; i <= n; i++ ) {
				fact *= i;
				System.out.printf("%d! = %d%n", i, fact);
		}
	}
}

