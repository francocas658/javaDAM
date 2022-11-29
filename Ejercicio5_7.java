/**
 * ESTE PROGRAMA LEE UNA CONTRASEÑA INTRODUCIDA POR TECLADO EN LA QUE SOLO TIENES 4 INTENTOS DE ACIERTO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_7 {
	public static void main (String[] args) {

		int clave; 
		int intentos = 4;
		boolean correcta = false;
		
		do {
			System.out.print ("Introduzca la contraseña: ");
			clave = Integer.parseInt(System.console().readLine());
			
			if (clave == 4698) {
				correcta = true;
			} else { System.out.println ("Contraseña incorrecta");
				}

			--intentos;

		} while ((intentos > 0) && (!correcta));

		if (correcta) {
			System.out.println ("CAJA FUERTE ABIERTA!"); 
		} else { System.out.println ("Intentos agotados.");
			}
	}
}
