/**
 * ESTE PROGRAMA LEE PESETAS INTRODUCIDAS POR TECLADO Y LO CONVIERTE EN EUROS
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio3_3 {
  public static void main(String[] args) {
		
		String linea;

			System.out.print ("Pesetas: ");
				linea = System.console().readLine();
					int pesetas;
						pesetas = Integer.parseInt( linea );

		double euros = (double) (pesetas / 166.386);
		
		System.out.printf("%d pesetas son %.2f euros.", pesetas, euros);
			
  }
}
