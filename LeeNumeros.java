/**
 * @author Franco Tomas Casco
 */
public class LeeNumeros {
	public static void main(String[] args) {
	
		String linea; //dato recogido
		
			System.out.print("Por favor, introduce un número: ");
				linea = System.console().readLine(); //muestra por pantalla
					int primerNumero; //variable
						primerNumero = Integer.parseInt( linea ); //lectura
						
			System.out.print("introduce otro, por favor: "); 
				linea = System.console().readLine(); //muestra por pantalla
					int segundoNumero; //variable
						segundoNumero = Integer.parseInt( linea ); //lectura
						
		int total; //variable "total"
			total = (2 * primerNumero) + segundoNumero; //calculo
			
			System.out.print("El primer número introducido es " + primerNumero);
			System.out.println(" y el segundo es " + segundoNumero);
			System.out.print("El doble del primer número más el segundo es ");
			System.out.println(total);
	}
}
