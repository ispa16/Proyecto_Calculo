package proyecto;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		boolean bandera = true;
		double respuesta [] [] ;//matriz de respuestas
		double valores_x [] [] ;//matriz para guardar los valores de x 
		respuesta = new double [100][100];//dimencion de la primera matriz
		valores_x = new double [100][100];//dimencion de la segunda matriz
		int contador = 0;
		int contador_aux = 0;
		while (bandera == true) {
			System.out.println("ingrese la variable x");
			double x = sc.nextInt();
			sc.nextLine();
			valores_x [0][contador] = x; //almacenar los valores ingresados para x 
		    respuesta [0][contador] = ((3*x) + 3)/x ;//almacenar las respuestas  
		    contador = contador + 1;
		  //salida del bucle while
		    System.out.println("desea seguir ingresando valores");
		    String decision = sc.nextLine();
		    if (decision.equals("no")) {
		    	bandera = false ;
		    }
		}//fin while--
		//impresion de resultados 
		while (contador_aux < contador) {
			System.out.printf("x = %s  f(x) = %s\n",valores_x [0] [contador_aux], 
			respuesta [0][contador_aux]);
			contador_aux = contador_aux + 1;
		}
		
			
				
				
				
	}
	}

