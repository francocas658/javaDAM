/**
 * ESTE PROGRAMA RESUELVE ECUACIONES DEL TIPO 'AX+B=0'
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio4_5 {
	public static void main (String[] args) {
		
		System.out.println ("Este programa resuelve ecuaciones del tipo ax+b=0");

		System.out.print ("Por favor, introduzca el valor de a: ");
		Double a = Double.parseDouble(System.console().readLine());
		
		System.out.print ("Ahora introduzca el valor de b: ");
		Double b = Double.parseDouble(System.console().readLine());

		if (a == 0) {
		System.out.println ("Esta ecuacion no se puede realizar");
		} else {
		double x = ((-b)/a);
		System.out.printf ("x= %.2f ", x);
		}
	}
}
