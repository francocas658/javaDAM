/**
 * @author Franco Tomas Casco
 */
public class NombreApellido {
	public static void main (String[] args) {
		String nombre, apellido;
			System.out.print ("Introduzca su nombre: ");
				nombre= System.console().readLine();
			System.out.print ("Introduzca su apellido: ");
				apellido= System.console().readLine();
			System.out.println ("Hola "  +nombre+ " " +apellido);
	}
}
