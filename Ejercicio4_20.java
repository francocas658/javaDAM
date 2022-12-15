/**
 * ESTE PROGRAMA MUESTRA SI UN NUMERO INTRODUCIDO POR TECLADO ES CAPICUA
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio4_20 {
	public static void main (String[] args) {

		System.out.print ("Introduzca un numero entero: ");
			int ent = Integer.parseInt(System.console().readLine());

		boolean cap = false;

		if (ent < 10) {
			cap = true;
		}

		if ((ent >= 10) && (ent < 100)) {
			if ((ent/10)==(ent%10)){
				cap = true;
			}
		}

		if ((ent >= 100) && (ent < 1000)) {
			if ((ent/100)==(ent%100)){
	
				cap = true;
			}
		}

		if ((ent >= 1000) && (ent < 10000)) {
			if ((ent/1000)==(ent%1000)) {
				cap = true;
			}
		}

		if ((ent >= 10000) && (ent < 100000)) {
			if ((ent/10)==(ent%10)){
				cap = true;
			}
		}

		if (ent >= 100000) {
			System.out.println ("El numero es demasiado grande");
		} else {
				if (cap = true) {
					System.out.println ("El numero es capicua");
				} else {
						System.out.println ("El numero no es capicua");
					}
			}
	}
}
