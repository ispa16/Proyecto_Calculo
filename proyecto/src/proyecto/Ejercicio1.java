package proyecto;
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean spidey = true ;
     int respuesta [][] ; // matriz de la respuesta
     int  valores_x [][] ; // matriz para guardar los valores de x
     respuesta = new int [100][100]; // dimension de la primera matriz 
     valores_x = new int [100][100]; // dimension de la segunda matriz
     int contador = 0 ;
     int contador_aux = 0 ;
     while (spidey == true) {
         System.out.println("ingrese la variable x");
         int x = sc.nextInt();
         sc.nextLine();
            valores_x [0][contador] = x; //almacenar valores de x
            respuesta [0][contador] = (2*x+8)/(6-3*x); //respuestas
            contador = contador + 1;
                    // fin del while
                    System.out.println("desea seguir ingresando mas valores");
                    String decision = sc.nextLine();
                    if (decision.equals("no")){ 
                        spidey = false ;
                    }
     }//fin while
                    //resultados
                    while (contador_aux < contador){
                        System.out.printf(" x = %s -- f(x) = %s\n", valores_x[0]
                                [contador_aux], respuesta [0] [contador_aux]);
                        contador_aux =   contador_aux + 1 ;
                    }     
     
    }
    
}
