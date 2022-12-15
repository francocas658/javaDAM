/**
 *  ESTE PROGRAMA LEE DOS NUMEROS Y MUESTRA SU SUMA, RESTA, DIVISION Y MULTIPLICACION
 *  
 * @author Franco Tomas Casco
 */
public class Ejercicio3_4 {
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
			
			int d, p, s, r;
				p = n1*n2;
				d = n1/n2;
				s = n1+n2;
				r = n1-n2;
				
	
			System.out.println ("La suma de los numeros es: " +s);
			System.out.println ("La resta de los numeros es: " +r);
			System.out.println ("El producto de los numeros es: " +p);
			System.out.println ("La division de los numeros es: " +d);
	
	}
}
