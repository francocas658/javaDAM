/**
 *  ESTE PROGRAMA LEE LA BASE Y LA ALTURA DE UN RECTANGULO Y CALCULA SU AREA
 *  
 * @author Franco Tomas Casco
 */
public class Ejercicio3_5{
	public static void main (String[] args) {
		
		String linea; 
			
			System.out.print ("Insertar base del rectangulo: ");
				linea = System.console().readLine();
					int b;
						b = Integer.parseInt (linea);

			System.out.print ("Insertar altura del rectangulo; ");
				linea = System.console().readLine();
					int h;
						h = Integer.parseInt (linea);
	
			int area;
			area = b*h;
			
			System.out.println ("El area del rectangulo es: " +area);

	}
}
