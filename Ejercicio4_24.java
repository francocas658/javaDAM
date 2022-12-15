/**
 * ESTE PROGRAMA ES UN MENU DONDE MUESTRA INFORMACION SOBRE TU PUESTO DE TRABAJO
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio4_24 {	
	public static void main (String[] args) {

    System.out.println("1- Programador junior");
    System.out.println("2- Prog. senior");
    System.out.println("3- Jefe de proyecto");
    System.out.print("Introduce cargo (1 - 3): ");

    int cargo = Integer.parseInt(System.console().readLine());
    
    System.out.print("¿Cuantos días ha estado de viaje visitando clientes? ");
			int diasvis = Integer.parseInt(System.console().readLine());

    System.out.print("Introduce estado civil (1- Soltero, 2- Casado): ");
			int estciv = Integer.parseInt(System.console().readLine());

    double suebas = 0;

    switch(cargo) {
      case 1:
        suebas = 950;
        break;
      case 2:
        suebas = 1200;
        break;
      case 3:
        suebas = 1600;
        break;
      default:
        System.out.println("Sueldo base incorrecto.");
    }

    double suedie = diasvis * 30;

    double suebru = suebas + suedie;

    double irpf = 0;

    if (estciv == 1) { 
      irpf = 25;
    } else if (estciv == 2) { 
      irpf = 20;
			} else {
					System.out.println("Estado civil incorrecto.");
				}
    
    double sumirpf = (suebru * irpf) / 100;

    System.out.printf("Sueldo base:    %.2f\n", suebas);
    System.out.printf("Dietas (%2d viajes):   %2f\n", diasvis, suedie);
    System.out.printf("Sueldo bruto:   %.2f\n", suebru);
    System.out.printf("Retención IRPF (%.0f%%):   %7.2f\n", irpf, sumirpf);
    System.out.printf("Sueldo neto:   %7.2f\n", suebru - sumirpf);
	}
}


