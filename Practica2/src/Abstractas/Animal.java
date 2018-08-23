/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstractas;

/**
 *
 * @author angel
 */
public abstract class Animal {
    
    private String nombre;
    
    public Animal(){}
    
    public void comer(){
        System.out.println("El "+nombre+" esta comiendo");
    }
    
    public abstract void moverse();
    
    public void setNombre(String s){
     nombre =s;
    }
    
    public String getNombre(){
    return nombre;
    }
    
}
