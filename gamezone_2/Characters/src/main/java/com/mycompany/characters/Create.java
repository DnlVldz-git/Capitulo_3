/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.characters;

/**
 *
 * @author dani
 */
public class Create {
    
    public void create(){
        Character per1 = new Character();
        Character per2 = new Character();
        
        
        get(per1);
        get(per2);
        
        show(per1);
        show(per2);
    }
    
    public void get(Character p){
        System.out.println("Introduzca el color del personaje");
        p.setColor();
        System.out.println("Introduzca el numero de ojos del personaje");
        p.setEyes();
        System.out.println("Introduzca el numero de vidas del personaje");
        p.setLives();
        
    }
    
    public void show(Character p){
        System.out.println("El color del personaje es: "+ p.getColor());
        System.out.println("El numero de  ojos del personaje es: "+p.getEyes());
        System.out.println("El numero de vidas del personaje es: "+ p.getLives());
        System.out.println("");
    }
    
    
    
    
    
}
