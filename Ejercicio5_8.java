/**
 * ESTE PROGRAMA LEE UN NUMERO INTRODUCIDO POR TECLADO Y REALIZA LA TABLA DE MULTIPLICAR DE ESTE
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_8 {
	public static void main (String[] args) {

		System.out.print ("Quiero saber la tabla del: ");
		int num = Integer.parseInt(System.console().readLine());

		for (int b = 0; b <= 10; b++) {
			System.out.printf ("%d x %2d = %3d \n", num, b, num*b);
		}
	}
}
