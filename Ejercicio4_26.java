/**
 * ESTE PROGRAMA REALIZA CALCULOS SOBRE LAS ENTRADAS DE UN CINE
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio4_26 {
	public static void main (String[] args) {

    System.out.print("Numero de entradas: ");
			int entradas = Integer.parseInt(System.console().readLine());

    System.out.print("Dia de la semana: ");
    String dia = System.console().readLine();

    System.out.print("Tarjeta Cine (s/n): ");
			boolean tarjsi = System.console().readLine().equals("s");

    int entind = entradas;
    double precio = 8;
    int entpar = 0;
    double total = 0;
    double descuento = 0;
    double totdes = 0;

    switch (dia) {
      case "miercoles":
        entind = 5;
				break;
      case "jueves":
        entpar = entradas / 2;
        entind = entradas % 2;
				break;
    }

    total = precio * entind;
    total += 11 * entpar;
    
    if (tarjsi) {
      descuento = total * 0.1;
    }

    totdes = total - descuento;

    if (entpar > 0) {
      System.out.println ("Entradas de pareja: " +entpar);

      System.out.println ("Precio por entrada de pareja: 11.0");
    }

    if (entind > 0) {
      System.out.println ("Entradas individuales: " +entind);

      System.out.println ("Precio por entrada individual: " +precio);
    }

    System.out.printf ("Total:  %.2f\n", total);

    System.out.printf("Descuento:  %.2f\n", descuento);

    System.out.printf("A pagar:  %.2f\n", totdes);
  }
}

