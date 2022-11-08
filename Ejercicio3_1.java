/**
 * @author Franco Tomas Casco
 */
public class Ejercicio3_1 {
	public static void main (String[] args) {
		
		String linea;
			
			System.out.print ("Introduce un numero: ");
				linea = System.console().readLine();
					int n1;
						n1 = Integer.parseInt( linea );

			System.out.print ("Introduce otro numero: ");
				linea = System.console().readLine();
					int n2;
						n2 = Integer.parseInt( linea );
			
			int total;
				total = n1*n2;
	
			System.out.println ("El producto de los numeros es: " +total);
	
	}
}
