/**
 * ESTE PROGRAMA MUESTRA CUANTOS DIGITOS TIENE UN NUMERO INTRODUCIDO POR TECLADO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio4_19 {
	public static void main (String[] args) {
	
		System.out.print ("Introduce un numero entero: ");
			int ent = Integer.parseInt(System.console().readLine());
	
		int dig = 0;

		if (ent < 10) {
			dig = 1;
		}

		if ((ent >= 10) && (ent < 100)) {
			dig = 2;
		}

		if ((ent >= 100) && (ent < 1000)) {
			dig = 3;
		}

		if ((ent >= 1000) && (ent < 10000)) {
			dig = 4;
		}

		if ((ent >= 10000) && (ent < 100000)) {
			dig = 5;
		}

		if (ent > 100000) {
			System.out.println ("Este numero es demasiado grande.");
		} else {
				System.out.println ("Este numero tiene " +dig+ " digitos");
			}
	}
}
