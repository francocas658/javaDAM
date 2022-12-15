/**
 * ESTE PROGRAMA CALCULA LA SERIE FIBONACCI
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_12 {
	public static void main (String[] args) {
		
		System.out.print ("Introduce la cantidad de numeros que quieres generar: ");
			int n = Integer.parseInt(System.console().readLine());

		int n2 = 0;
		int a1 = 1;
		int a2; 

		for (int i = 1; i <= n; i++) {
			a2 = n2;
			n2 = a1+n2;
			a1 = a2;
			System.out.println(a1);
		}
	}
}

