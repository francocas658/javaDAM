/**
 * ESTE PROGRAMA ES UN EXAMEN TIPO TEST QUE LUEGO TE DICE LA NOTA
 * 	
 * @author Franco Tomas Casco
 */
public class Ejercicio4_12 {

  public static void main(String[] args) {
    
    int puntos = 0;
    String respuesta;
    
    System.out.println ("TEST JAVA 1º DAM");
    
    System.out.println ("1. ¿Cual de los siguientes datos indica un valor entero?");
    System.out.println ("a) int\n b) double\n c) float"); 
    System.out.print ("=> ");
			respuesta = System.console().readLine();

    if (respuesta.equals("a")) {
      puntos++;
      System.out.println ("Correcto");
    } else {
      System.out.println ("Incorrecto");
    } 

    System.out.println ("2. ¿Como coloreamos un texto?");
    System.out.println ("a) palabra 'caracter de color'\n b) 'caracter de color' palabra\n c) 'caracter de color' palabra "); 
    System.out.print ("=> ");
			respuesta = System.console().readLine();

    if (respuesta.equals("c")) {
      puntos++;
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }

        System.out.println ("3. ¿Para que sirve la instruccion 'System.out.printf'?");
    System.out.println ("a) Salida formateada\n b) Salida con salto de linea\n c) Salida con variables numericas"); 
    System.out.print ("=> ");
			respuesta = System.console().readLine();

    if (respuesta.equals("a")) {
      puntos++;
      System.out.println ("Correcto");
    } else {
      System.out.println ("Incorrecto");
    }

    System.out.println ("4. ¿Cual es la forma correcta de concatenar?");
    System.out.println ("a) Con la variable 'conc'\n b) Colocando '+' delante de la palabra y detras si es necesario\n c) Con ',' antes de la palabra"); 
    System.out.print ("=> ");
			respuesta = System.console().readLine();

    if (respuesta.equals("b")) {
      puntos++;
      System.out.println ("Correcto");
    } else {
      System.out.println ("Incorrecto");
    } 

		System.out.println ("5. ¿Para que se utiliza la variable 'char'?");
    System.out.println ("a) Para almacenar un caracter suelto o signo de puntuacion\n b) Para almacenar una palabra\n c) Para almacenar un numero decimal"); 
    System.out.print ("=> ");
			respuesta = System.console().readLine();

    if (respuesta.equals("a")) {
      puntos++;
      System.out.println ("Correcto");
    } else {
      System.out.println ("Incorrecto");
    }

		System.out.println ("6. ¿Como se puede leer un valor introducido por teclado?");
    System.out.println ("a) Con la variable 'Scanner' o 'System.console.readline'\n b) Unicamente con la variable 'Scanner'\n c) Ninguna de las anteriores son correctas"); 
    System.out.print ("=> ");
			respuesta = System.console().readLine();

    if (respuesta.equals("c")) {
      puntos++;
      System.out.println ("Correcto");
    } else {
      System.out.println ("Incorrecto");
    }

		System.out.println ("7. ¿Para que se utiliza la variable 'char'?");
    System.out.println ("a) Para almacenar un caracter suelto o signo de puntuacion\n b) Para almacenar una palabra\n c) Para almacenar un numero decimal"); 
    System.out.print ("=> ");
			respuesta = System.console().readLine();

    if (respuesta.equals("a")) {
      puntos++;
      System.out.println ("Correcto");
    } else {
      System.out.println ("Incorrecto");
    }
		
		System.out.println("8. ¿Para que sirve 'if'?");
    System.out.println ("a) Para comenzar una condicion\n b) Para mostrar una variable\n c) Para leer un valor por teclado"); 
    System.out.print ("=> ");
			respuesta = System.console().readLine();

    if (respuesta.equals("a")) {
      puntos++;
      System.out.println ("Correcto");
    } else {
      System.out.println ("Incorrecto");
    }

		System.out.println ("Nota: " +puntos+ "/8");
	}
}
