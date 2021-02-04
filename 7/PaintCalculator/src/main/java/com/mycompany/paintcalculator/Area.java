/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.paintcalculator;

/**
 *
 * @author dani
 */
public class Area {
    
    double calcularArea(double ancho, double largo, double alto){
        return (ancho*alto+largo*alto)*2;
    }
    
    void calcularPintura(double ancho, double largo, double alto){
        double botes = calcularArea(ancho, largo, alto)/350;
        double precio = botes*32;
        
        System.out.println("Los botes de pintura a utilizar son: "+botes+ " y el precio es de: "+precio+"$");
        
    }
    
}
