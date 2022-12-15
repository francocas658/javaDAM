/**
 * ESTE PROGRAMA CALCULA LOS MINUTOS QUE FALTAN PARA EL FINDE
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio4_22 {
	public static void main (String[] args) {
		
		System.out.print ("Introduce el dia de la semana en que estamos: ");
			String dia = System.console().readLine();
			dia.toLowerCase();

		int dianum = 0;

		switch (dia) {
			case ("lunes"):
				dianum = 1;
				break;
			case ("martes"):
				dianum = 2;
				break;
			case ("miercoles"):
				dianum = 3;
				break;
			case ("jueves"):
				dianum = 4;
				break;
			case ("viernes"):
				dianum = 5;
				break;
			default: System.out.println ("Dia no valido.");
		}

		System.out.print ("Introduce la hora: ");
			int hora = Integer.parseInt(System.console().readLine());

		System.out.print ("Introduce los minutos: ");
			int min = Integer.parseInt(System.console().readLine());

		int mintotal = (4*24*60)+(15*60);
		int minaho = (dianum*24*60)+(hora+60)+min;

		System.out.println("Para el fin de semana faltan: "+(mintotal-minaho)+ " minutos");
	}
}

