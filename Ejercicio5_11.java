/**
 * ESTE PROGRAMA CALCULA LOS 5 SIGUIENTES NUMEROS EL CUADRADO Y EL CUBO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_11 {
	public static void main (String[] args) {

		System.out.print ("Introduce un numero: ");
			int n = Integer.parseInt(System.console().readLine());

		System.out.println ("	numeros	|	cuadrado	|	cubo	|");
		
		System.out.println ("__________________________________________________________");
	
		for (int i = n; i < n+5; i++) {
			System.out.println ("	" +i+ "	|	" +(i*i)+ "		|	" +(i*i*i)+ "	|");
		}

		System.out.println ("__________________________________________________________");
		
	}
}

