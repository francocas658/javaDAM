/**
 * ESTE PROGRAMA REALIZA CALCULOS SOBRE LA CUENTA DE UN DESAYUNO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio4_29 {	
	public static void main (String[] args) {
	
    String pitufo = "";
    String res = "";
		String resbeb = "";
    double pcomida = 0;
    double pbebida = 0;
   
    System.out.print ("Elige comida (palmera/donut/pitufo): ");
			String comida = System.console().readLine().toLowerCase();

    if (comida.equals ("pitufo")) {
      System.out.print ("Tipo pitufo (aceite/tortilla): ");
				pitufo = (System.console().readLine()).toLowerCase();

      if (pitufo.equals ("aceite")) {
        res = "Pitufo con aceite: 1,20 euros";
        pcomida = 1.20;
      } else if (pitufo.equals ("tortilla")) {
					res = "Pitufo con tortilla: 1,60 euros";
					pcomida = 1.60;
				}
    } else if (comida.equals ("palmera")) {
				res = "Palmera: 1,40 euros";
				pcomida = 1.40;
			} else if (comida.equals ("donut")) {
					res = "Donut: 1 euro";
					pcomida = 1.00;
				}

    System.out.print ("Elija bebida (zumo o café): ");
			String bebida = System.console().readLine().toLowerCase();

    if (bebida.equals ("zumo")) {
      resbeb = "Zumo: 1,50 euros";
      pbebida = 1.50;
    } else if (bebida.equals ("café")) {
				resbeb = "Café: 1,20 euros";
				pbebida = 1.20;
			}

    System.out.print (res+ " y ");

		System.out.println (resbeb);

    System.out.printf ("Total: %.2f euros", (pcomida + pbebida));	

	}
}

