/**
 * ESTE PROGRAMA MUESTRA QUE NUMEROS SON NEGATIVOS Y POSITIVOS DE LOS INTRODUCIDOS ANTERIORMENTE CON TECLADO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio5_13 {	
	public static void main (String[] args) {
		
    System.out.println("Introduce 10 numeros enteros: ");

    int neg = 0;
    int pos = 0;
    
    for (int i = 0; i < 10; i++) {
      if (Integer.parseInt(System.console().readLine()) > 0) {
        pos++;
      } else {
        neg++;
				}
    }
    
    System.out.println("Hay " +pos+ " numeros positivos y " +neg+ " numeros negativos.");
  }
}


