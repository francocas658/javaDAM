/**
 * ESTE PROGRAMA REALIZA CALCULOS SOBRE UN PEDIDO DE BANDERAS
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio4_25 {	
	public static void main (String[] args) {
		
    System.out.print("Introduce la altura de la bandera: ");
			int altura = Integer.parseInt(System.console().readLine());

    System.out.print("Introduce la anchura: ");
			int anchura = Integer.parseInt(System.console().readLine());

    System.out.print("Escudo bordado (s/n): ");
			boolean siescudo = System.console().readLine().toLowerCase().equals("s");

    String cadescudo;
    float precio;
    
    if (siescudo) {
      cadescudo = "Con escudo";
      precio = 2.50f;
    } else {
      cadescudo = "Sin escudo";
      precio = 0;
			}

    System.out.println("Gracias aqui tiene su compra.");
    System.out.printf("Bandera de %d cm2: %5.2f\n", anchura * altura, (float)anchura * altura / 100);
    System.out.printf("%s:   %.2f\n", cadescudo, precio);
    System.out.printf("Gastos de envío:  %.2f\n", 3.25);
    System.out.printf("Total:  %.2f\n", (float)anchura * altura / 100 + precio + 3.25);
	}
}

