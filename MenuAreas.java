/**
 * ESTE PROGRAMA ES UN MENU DONDE ELIGES QUE AREA CALCULAR E INTRODUCIENDO LOS DATOS POR TECLADO LA CALCULA
 * 	
 * @author Franco Tomas Casco
 */
public class MenuAreas {
  public static void main(String[] args) {
  
    System.out.println (" CÁLCULO DE ÁREAS");
    System.out.println (" ----------------");
    System.out.println (" 1. Rombo");
    System.out.println (" 2. Romboide");
    System.out.println (" 3. Triángulo");
		System.out.println (" 4. Trapecio");
    System.out.print("\n Elija una opción (1-4): ");
  
    int opcion = Integer.parseInt(System.console().readLine());

    double lado;
    double base;
    double altura;
		double basemenor;
		
    
    switch (opcion) {
      case 1:
        System.out.print ("\nIntroduzca la diagonal mayor del rombo en cm: ");
					base = Double.parseDouble(System.console().readLine());
				System.out.print ("\nIntroduzca la diagonal menor del rombo en cm: ");
					basemenor = Double.parseDouble(System.console().readLine());
        System.out.printf ("\nEl área del rombo es: %.3f cm2", ((base * basemenor)/2));
        break;
    
      case 2:
        System.out.print ("\nIntroduzca la base del romboide en cm: ");
					base = Double.parseDouble(System.console().readLine());
        System.out.print ("Introduzca la altura del romboide en cm: ");
					altura = Double.parseDouble(System.console().readLine());
        System.out.printf ("El área del rectángulo es %.3f cm2", (base * altura));
        break;
    
      case 3:
        System.out.print ("\nIntroduzca la base del triángulo en cm: ");
					base = Double.parseDouble(System.console().readLine());
        System.out.print ("Introduzca la altura del triángulo en cm: ");
					altura = Double.parseDouble(System.console().readLine());
        System.out.printf ("El área del triángulo es: %.3f cm2", ((base * altura)/2));
        break;

      case 4:
        System.out.print ("\nIntroduzca la base mayor del trapecio en cm: ");
					base = Double.parseDouble(System.console().readLine());
				System.out.print ("\nIntroduzca la base menor del trapecio en cm: ");
					basemenor = Double.parseDouble(System.console().readLine());
				System.out.print ("\nIntroduzca la altura del trapecio en cm: ");
					altura = Double.parseDouble(System.console().readLine());
        System.out.printf ("\nEl área del trapecio es: %.3f cm2", (((base + basemenor)/2)*altura));
        break;
        
      default:
        System.out.print("\nLo siento, la opción elegida no es correcta.");
    }
  }
}
