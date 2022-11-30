/**
 * ESTE PROGRAMA LEE LA HORA Y LOS MINUTOS INTRODUCIDOS POR TECLADO Y TE DICE CUANTOS SEGUNDOS FALTAN PARA LA MEDIANOCHE
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio4_11 {

  public static void main (String[] args) {
    
    System.out.print ("Que hora es?: ");
    int hora = Integer.parseInt(System.console().readLine());  
    
    System.out.print ("Que minuto?: ");
    int minuto = Integer.parseInt(System.console().readLine());

    int segundostranscurridos = (hora * 3600) + (minuto * 60);
    int segundoshastamedianoche = (24 * 3600) - segundostranscurridos;
            
    System.out.printf("Son las %02d:%02d y para la medianoche faltan %d segundos.", hora, minuto, segundoshastamedianoche);
  }
}
