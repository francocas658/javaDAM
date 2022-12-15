/**
 * ESTE PROGRAMA CALCULA LA POTENCIA PIDIENDO LA BASE Y EL EXPONENTE
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_14 {
	public static void main (String[] args) {
		
		System.out.print ("Introduce la base: ");
			int b = Integer.parseInt(System.console().readLine());

		System.out.print ("Introduce el exponente: ");
			int e = Integer.parseInt(System.console().readLine());

		int p = 1; 
			
		if (e == 0) {
			p = 1;
		}

		if (e > 0) {
			for (int i = 0; i < e; i++) {
				p *= b;
			}
		}
		
		System.out.println ("Potencia = " +p);
	}
}

