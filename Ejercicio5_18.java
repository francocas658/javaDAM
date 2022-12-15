/**
 * ESTE PROGRAMA CALCULA DE 7 EN 7 LOS NUMEROS COMPRENDIDOS ENTRE DOS INTRODUCIDOS POR TECLADO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_18 {
	public static void main (String[] args) {

		System.out.print ("Introduce el primer numero: ");
			int n1 = Integer.parseInt(System.console().readLine());

		System.out.print ("Introduce el segundo numero (mayor que el primero): ");
			int n2 = Integer.parseInt(System.console().readLine());	

		if (n1 == n2) {
			System.out.println ("Los numeros deben ser distintos.");
		}	else {
				System.out.println ("Los numeros comprendidos entre " +n1+ " " +n2+ " son");
				for (int i = n1; i <= n2; i += 7) {
					System.out.println (i);
				}
			}
	}
}

