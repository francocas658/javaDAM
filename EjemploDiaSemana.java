/**
 * ESTE PROGRAMA LEE UN NUMERO INTRODUCIDO POR TECLADO Y TE DICE EL DIA AL QUE CORRESPONDE
 * 	
 * @author Franco Tomas Casco
 */
public class EjemploDiaSemana {
  public static void main(String[] args) {   
       
    System.out.print("Por favor, introduzca un numero de dia: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    String diasemana;
    
    switch (dia) {
      case 1:
        diasemana = "Lunes";
        break;

      case 2:
        diasemana = "Martes";
        break;

      case 3:
        diasemana = "Miercoles";
        break;

      case 4:
        diasemana = "Jueves";
        break;

      case 5:
        diasemana = "Viernes";
        break;

      case 6:
        diasemana = "Sabado";
        break;

      case 7:
        diasemana = "Domingo";
        break;

      default:
        diasemana = "No existe ese dia";
    }

    System.out.println("El dia " + dia + " es: " + diasemana);
  }
}
