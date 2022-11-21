public class Ejercicio4_1 {
	public static void main (String[] args){
		
		String dia;

		System.out.print ("Dime un dia de la semana y te dire que asignatura tienes a primera: ");
		dia = System.console().readLine();
		dia = dia.toLowerCase();

		switch (dia) {
			case "lunes":
			System.out.println ("Sistemas Informaticos");
			break;
			
			case "martes": 
			System.out.println ("Programacion");
			break;
	
			case "miercoles":
			System.out.println ("Sistemas Informaticos");
			break;

			case "jueves": 
			System.out.println ("Programacion");
			break;
		
			case "viernes": 
			System.out.println ("Programacion");
			break;

			case "sabado":
			System.out.println ("Ese dia no tienes clases");
			break;
		
			case "domingo":
			System.out.println ("Ese dia no tienes clases");
			break;

			default: 
			System.out.println ("Introduce un dia correcto");
		}
	}
}
