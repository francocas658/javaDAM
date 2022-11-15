/**
 * ESTE PROGRAMA CALCULA EL SUELDO DEPENDIENDO DE LAS HORAS TRABAJADAS
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio4_4 {
	public static void main (String[] args) {

		System.out.print ("Por favor, introduzca el numero de horas trabajadas: ");
		int horas = Integer.parseInt(System.console().readLine());
		
		if (horas <= 40) {
		int sueldo = (horas*12);
		System.out.println ("El sueldo que le corresponde es de: " +sueldo+ " euros");
		}
		
		if (horas >= 41) {
		int sueldo = (horas*16);
		System.out.println ("El sueldo que le corresponde es de: " +sueldo+ " euros");
		}
	}
}
