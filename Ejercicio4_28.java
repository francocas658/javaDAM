/**
 * ESTE PROGRAMA ES UN JUEGO DE PIEDRA, PAPEL O TIJERA
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio4_28 {
	public static void main (String[] args) {
		
    System.out.print("Elige el jugador 1 (piedra, papel o tijera): ");
			String j1 = System.console().readLine();
    
    System.out.print("Elige jugador 2 (piedra, papel o tijera): ");
			String j2 = System.console().readLine();
    
    if (j1 == j2) {
      System.out.println ("Empate");
    } else {
				int gana = 2;

				switch (j1) {
					case "piedra":
						if (j2.equals("tijera")) {
							gana = 1;
						}
					break;
					case "papel":
						if (j2.equals("piedra")) {
							gana = 1;
						}
          break;
					case "tijera":
						if (j2.equals("papel")) {
							gana = 1;
						}
          break;
        default:
      }

      System.out.println("El ganador es el jugador " + gana);

			}
	}
}

