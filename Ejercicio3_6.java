/**
 *  ESTE PROGRAMA LEE LA BASE Y LA ALTURA DE UN TRIANGULO Y CALCULA SU AREA
 *  
 * @author Franco Tomas Casco
 */
public class Ejercicio3_6{
	public static void main (String[] args){
		
		String linea; 
		
		System.out.print ("Insertar base del triangulo: ");
			linea = System.console().readLine();
				int b;
					b = Integer.parseInt (linea);

		System.out.print ("Insertar altura del triangulo: ");
			linea = System.console().readLine();
				int h; 
					h= Integer.parseInt (linea);

		int area;
		area = (b*h)/2;
tz
		System.out.println ("El area del triangulo es: " +area);
	}
}
