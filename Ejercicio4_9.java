/**
 * ESTE PROGRAMA LEE VARIABLES INTRODUCIDAS POR TECLADO Y REALIZA UNA ECUACION DE SEGUNDO GRADO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio4_9 {
	public static void main (String[] args) {


		System.out.println ("Resuelve la ecuacion de segundo grado");

		System.out.print ("Introduce el valor de a: ");
		int a = Integer.parseInt(System.console().readLine());
	
		System.out.print ("Introduce el valor de b: ");
		int b = Integer.parseInt(System.console().readLine());

		System.out.print ("Introduce el valor de c: "); 
		int c = Integer.parseInt(System.console().readLine());

		if ((a == 0) && (b == 0) && (c == 0)) {
		System.out.println ("Esta ecuacion tiene soluciones infinitas");
		}

   		if ((a != 0) && (b != 0) && (c == 0)) {
    		System.out.println ("x1 = 0");
    		System.out.printf ("x2 = %.3f", (-b / a));
    		}

    		if ((a == 0) && (b != 0) && (c != 0)) {
    		System.out.printf ("x1 = x2 = %.3f", (-c / b));
    		}

		if ((a != 0) && (b != 0) && (c != 0)) {
        	double discriminante = b*b - (4 * a * c);
      
 		if (discriminante < 0) {
    		System.out.println ("La ecuación no tiene soluciones");
    		}  else {
		System.out.printf ("x1 = %.3f", (-b + Math.sqrt(discriminante))/(2 * a));
		System.out.println (" ");
		System.out.printf ("x2 = %.3f", (-b - Math.sqrt(discriminante))/(2 * a));
		}
    	}
		
	}
}
