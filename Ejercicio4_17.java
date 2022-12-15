/**
 * ESTE PROGRAMA MUESTRA CUAL ES LA ULTIMA CIFRA DE UN NUMERO ENTERO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio4_17 {
	public static void main (String[] args) {
		
		System.out.print ("Introduce un numero entero: ");
			int ent = Integer.parseInt(System.console().readLine());
	
		System.out.println ("La ultima cifa es: " +(ent % 10));
	}
}

