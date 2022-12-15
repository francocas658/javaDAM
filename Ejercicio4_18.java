/**
 * ESTE PROGRAMA MUESTRA LA PRIMERA CIFRA DE UN NUMERO ENTERO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio4_18 {
	public static void main (String[] args) {	
	
		System.out.print ("Introduce un numero entero: ");
			int ent = Integer.parseInt(System.console().readLine());

		int ent1 = 0;

		if (ent < 10) {
			ent1 = ent;
		}

		if ((ent >= 10) && (ent < 100)) {
			ent1 = ent/10;
		}

		if ((ent >= 100) && (ent < 1000)) {
			ent1 = ent/100;
		}

		if ((ent >= 1000) && (ent < 10000)) {
			ent1 = ent/1000;
		}

		if ((ent >= 10000) && (ent < 100000)) {
			ent1 = ent/10000;
		}

		if (ent >= 100000) {
			System.out.println ("Este numero es demasiado grande");
		} else {
				System.out.println ("La primera cifra del numero entero es: " +ent1);
			}
	}
}

