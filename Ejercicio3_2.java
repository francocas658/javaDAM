/**
 * @author Franco Tomas Casco
 */
public class Ejercicio3_2 {
	public static void main (String[] args) {		
		String linea;
			
			System.out.print ("Euros: ");
				linea = System.console().readLine();
					double euros;
						euros = Double.parseDouble ( linea );

			int pesetas = (int) (euros * 166.386);

			System.out.println (+euros+ " euros son: " +pesetas+ " pesetas");
	}
}
