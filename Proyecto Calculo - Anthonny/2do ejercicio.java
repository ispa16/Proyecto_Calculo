
package proyecto_calculo_2;

import java.util.Scanner;

public class Proyecto_Calculo_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean tony = true ;
        int respuesta [][] ; // matriz de la respuesta
        int valores_x [][] ; // matriz para guardar los valores de x
        respuesta = new int [100][100]; // dimension de la primera matriz
        valores_x = new int [100][100]; // dimension de la segunda matriz
        int contador = 0 ;
        int contador_aux = 0;
        while (tony == true) {
      System.out.println("ingrese la variable x");
    int x = sc.nextInt();
    sc.nextLine();
    valores_x [0][contador] = x; //valores de x
    respuesta [0][contador] = ((x+4-x*9)/2);//respuestas
    contador = contador + 1 ;
    //fin del while
    System.out.println("desea seguir ingresando valores");
    String decision = sc.nextLine();
    if (decision.equals("no")){
        tony = false ;
    }
    }//fin while
        //resultados
        while (contador_aux<contador){
            System.out.printf("x = %s -- f(x) = %s\n", valores_x[0]
                    [contador_aux], respuesta [0] [contador_aux]);
            contador_aux = contador_aux + 1 ;
        }
    }
    
}
