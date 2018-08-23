/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstractas;

import Abstractas.Animal;

/**
 *
 * @author angel
 */
public class Ave extends Animal {
    
    public Ave(){
        super();
        setNombre("Ave");
    }
    
    public void moverse(){
        System.out.println("El ave esta volando");
    }
}
