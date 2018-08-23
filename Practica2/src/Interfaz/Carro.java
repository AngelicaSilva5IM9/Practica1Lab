/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author angel
 */
public class Carro implements Rueda{
    
    public Carro(){}
    
    public void avanzar(){
        System.out.println("El carro avanza");
    }
    public void detenerse(){
        System.out.println("El carro se detiene");
    }
    
}
