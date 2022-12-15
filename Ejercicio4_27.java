/**
 * ESTE PROGRAMA REALIZA CALCULOS SOBRE LOS PRECIOS DE UNA TIENDA DE TARTAS
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio4_27 {	
	public static void main (String[] args) {
		
    System.out.print("Elige sabor (manzana, fresa o chocolate): ");
			String sabor = System.console().readLine().toLowerCase();

    double psabor = 0;
    double pnata = 0;
    double pnombre = 0;
    String chocolate = "";

    switch (sabor) {
      case "manzana":
        psabor = 18;
        break;
      case "fresa":
        psabor = 16;
        break;
      case "chocolate":
        System.out.print("Tipo de chocolate (negro o blanco): ");
					chocolate = System.console().readLine();
        if (chocolate.equals("negro")) {
          psabor = 14;
        } else if (chocolate.equals("blanco")) {
          psabor = 15;
        }
        break;
    }

    System.out.print("Nata (s/n): ");
			boolean natasi = System.console().readLine().toLowerCase().equals("s");
    
    System.out.print("Nombre (s/n): ");
			boolean nombresi = System.console().readLine().toLowerCase().equals("s");

    System.out.print("La tarta de " + sabor);

    if (sabor.equals("chocolate")) {
      System.out.print(" " +chocolate);
    }

    System.out.printf ("cuesta %.2f euros\n", psabor);
    
    if (natasi) {
      pnata = 2.5;
      System.out.printf("Con nata: %.2f euros\n", pnata);
    }
    
    if (nombresi) {
      pnombre = 2.75;
      System.out.printf("Con nombre: %.2f euros\n", pnombre);
    }
    
    System.out.printf("Total: %.2f euros\n", psabor + pnata + pnombre);
	}
}

