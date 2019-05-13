/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      boolean bandera = true;
      int respuesta [][] ;//matriz de respuestas 
      int valores_x [][] ;//matriz para almacenar valores de x 
      respuesta = new int [100] [100]; //dimension de la primera matriz 
      valores_x = new int [100] [100]; //dimension de la segunda matriz 
      int contador = 0;
      int contador_aux = 0;
      while (bandera==true) {
          System.out.println("ingrese variable x");
          int x = sc.nextInt();
          sc.nextLine();
          valores_x [0][contador] = x; //almacenar valores ingresados de x 
          respuesta [0][contador] = (5*x)/(x); //almacenar las respuestas
          contador = contador + 1;
          //salida del bucle while
          System.out.println("desea seguir ingresando valores");
          String decision = sc.nextLine();
          if (decision.equals("no")) {
              bandera = false ;
          }                              
      }//fin while
      //impresion de resultados
      while (contador_aux < contador) {
          System.out.printf("x = %s -- f(x) = %s\1",valores_x [0][contador_aux],
                  respuesta [0][contador_aux]);
          contador_aux = contador_aux + 1;
           }
        // TODO code application logic here
    }
    
}
    
    

