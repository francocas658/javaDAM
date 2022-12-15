/**
 * ESTE PROGRAMA CALCULA LA MEDIA DE NUMEROS ENTEROS 
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_10 {	
	public static void main (String[] args) {
		
    double n = 0;
    double n2 = 0;
    double suma = 0;

    System.out.println ("Introduce numeros, para parar introduce un numero negativo: ");

    while (n2 >= 0) {
      n2 = Double.parseDouble(System.console().readLine());
				n++;
				suma += n2;
    }
    
    System.out.print ("La media es: ");

    System.out.println ((suma-n2) / (n-1));

	}
}

