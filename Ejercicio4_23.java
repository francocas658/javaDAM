/**
 * ESTE PROGRAMA REALIZA CALCULOS SOBRE UNA BASE IMPONIBLE INTRODUCIDA POR TECLADO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio4_23 {	
	public static void main (String[] args) {
		
		System.out.print ("Introduce la base imponible: ");
			double base = Double.parseDouble(System.console().readLine());

		System.out.print ("Introduce el tipo de IVA (general/reducido/superrreducido): ");
			String tipoiva = System.console().readLine();

		System.out.print ("Introduce el codigo descuento (nopro/mitad/meno5/5porc)");
			String descuento = System.console().readLine();

		int tipoiva2 = 0;

		switch (tipoiva) {
			case "general":
				tipoiva2 = 21;
				break;
			case "reducido":
				tipoiva2 = 10;
				break; 
			case "superreducido": 
				tipoiva2 = 4;
				break;
		}

		double iva = base * tipoiva2 /100;
		double preciosin = base + iva;

		double tipodes = 0;

		switch (descuento) {
			case "nopro":
				break;
			case "mitad": 
				tipodes = preciosin * 0.5;
				break;
			case "meno5":
				tipodes = preciosin - 5;
				break;
			case "5porc":
				tipodes = preciosin * 0.05;
				break;
		}
		
		double total = preciosin-tipodes;

		System.out.printf ("Base Imponible: 	%.2f\n", base);
		System.out.printf ("IVA (%2d%%): 	%.2f\n", tipoiva2, iva);
		System.out.printf ("Precio con IVA: 	%.2f\n", preciosin);
		System.out.printf ("Codigo promocional (%5s): 	-%.2f\n", descuento, tipodes);
		System.out.printf ("TOTAL: 	%.2f", total);
	}
}

