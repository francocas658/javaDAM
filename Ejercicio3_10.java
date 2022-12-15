/**
 * ESTE PROGRAMA CALCULA CUANTOS Kb SEGUN LOS Mb INTRODUCIDOS POR TECLADO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio3_10 {
	public static void main (String[] args) {

		System.out.print ("Introduce los Mb: ");
			int mb = Integer.parseInt(System.console().readLine());

		System.out.println (mb+ "Mb son: " +mb*1024+ " Kb");
		
	}
}

