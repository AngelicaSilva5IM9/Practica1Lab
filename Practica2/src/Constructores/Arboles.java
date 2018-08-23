/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructores;

/**
 *
 * @author angel
 */

public class Arboles  { 
    
        public static void main(String args[]) { 
        Arboles arbol1 = new Arboles(4);
        Arboles arbol2 = new Arboles("Roble");
        Arboles arbol3 = new Arboles();
        Arboles arbol4 = new Arboles(5,"Pino");
        Arboles arbol5 = new Arboles("fresno",6);
     }

    public Arboles() { 
      System.out.println("Un árbol normal");
    }
   
    public Arboles(String tipo) { 
     System.out.println("Un árbol tipo " + tipo);
    }

    public Arboles(int altura) { 
     System.out.println("Un árbol de " + altura + " metros");
   } 

    public Arboles(int altura,String tipo) { 
     System.out.println("Un " + tipo + " de " + altura + " metros");
   } 
    public Arboles(String tipo,int peso){
        System.out.println("Un " +tipo+ " de " + peso+ " kg");
    }
  

}