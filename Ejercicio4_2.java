/**
 * ESTE PROGRAMA DEPENDIENDO DE LA HORA TE SALUDA DE UNA FORMA U OTRA
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio4_2 {
	public static void main (String[] args) {
	
		System.out.print("¿Que hora es actualmente? ");
			int hora = Integer.parseInt(System.console().readLine());

		if ((hora >= 6) && (hora <= 12)){
			System.out.println ("Buenos dias");
		}
		
		if ((hora >= 13) && (hora <= 20)) {
			System.out.println ("Buenas tardes");
		}
	
		if (((hora >= 21) && (hora <=24)) || ((hora >= 0) && (hora <= 5))) {
			System.out.println ("Buenas noches");
		}		
	}
}
