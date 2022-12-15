/**
 * ESTE PROGRAMA CALCULA EL SUELDO SEMANAL SEGUN LAS HORAS INTRODUCIDAS POR TECLADO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio3_8 {
	public static void main (String[] args) {

		int sueldo = 12;
		
		System.out.print ("Introduzca las horas trabajadas al dia: ");
			int horas = Integer.parseInt(System.console().readLine());
	
		System.out.println ("Tu salario semanal es de: " +(sueldo*horas*7));		
	}
}

