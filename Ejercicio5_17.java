/**
 * ESTE PROGRAMA CALCULA LOS LA SUMA DE LOS 100 SIGUIENTES NUMEROS AL INTRODUCIDO POR TECLADO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_17 {
	public static void main (String[] args) {
		
		System.out.print ("Introduce un numero positivo: ");
			int n = Integer.parseInt(System.console().readLine());

		int suma = 0;
		
		if (n >= 0) {
			for (int i = n; i < n +100; i++) {
				suma += i;
			}
		} else {
				System.out.println ("El numero introducido no es valido");
			}
		System.out.println ("La suma de los 100 siguientes numeros es: " +suma);
	}
}

