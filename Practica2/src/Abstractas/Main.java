/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstractas;

import Abstractas.Ave;
import Abstractas.Animal;

/**
 *
 * @author angel
 */
public class Main {
    
    public static void main(String[] args){
        
        Animal p = new perro();
        p.comer();
        p.moverse();
        
        Animal a= new Ave();
        a.comer();
        a.moverse();
    }
    
}
