/**
 * ESTE PROGRAMA CREA UNA PIRAMIDE CON EL RELLENO DE UN CARACTER INTRODUCIDO POR TECLADO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio4_15 {
	public static void main (String[] args) {

		System.out.print ("Introduce el relleno de la piramide: ");
			String a = System.console().readLine();

    System.out.println("TIPO DE PIRAMIDE");

    System.out.println("1. Vertice arriba");

    System.out.println("2. Vertice abajo");

    System.out.println("3. Vertive izquierda");

    System.out.println("4. Vertice derecha");
			int opcion = Integer.parseInt(System.console().readLine());

    switch(opcion) {

      case 1:
        System.out.println ("  " + a);
        System.out.println (" " + a + a + a);
        System.out.println (a + a + a + a + a);
        break;

      case 2:
        System.out.println (a + a + a + a + a);
        System.out.println (" " + a + a + a);
        System.out.println ("  " + a);
        break;

      case 3:
        System.out.println ("    " + a);
        System.out.println ("  " + a + " " + a);
        System.out.println (a + " " + a + " " + a);
        System.out.println ("  " + a + " " + a);
        System.out.println ("    " + a);
        break; 

      case 4:
        System.out.println (a);
        System.out.println (a + " " + a);
        System.out.println (a + " " + a + " " + a);
        System.out.println (a + " " + a);
        System.out.println (a);
				break;

      default:
    }
  }
}
