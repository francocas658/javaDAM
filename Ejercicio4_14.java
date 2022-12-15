/**
 * ESTE PROGRAMA LEE UN NUMERO INTRODUCIDO POR TECLADO Y DICE SI ES PAR Y SI ES DIVISIBLE ENTRE 5
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio4_14 {
	public static void main (String[] args) {
	
		System.out.print ("Introduzca un numero: ");
			int a = Integer.parseInt(System.console().readLine());

		if ((a % 2) == 0) {
			System.out.println ("El numero es par");
		} else { System.out.println ("El numero es impar");
			}

		if ((a % 5) == 0) {
			System.out.println ("El numero es divisible entre 5");
		} else { System.out.println ("El numero no es divisible entre 5");
			}
	}
}
