/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gasprices;

/**
 *
 * @author dani
 */
import java.util.Scanner;
        
public class GasPrices {
    
    
    Scanner leer = new Scanner(System.in);
    
    void calcular(){
        System.out.println("Introduzca el precio por barril: ");
        int pricePerBarrel = leer.nextInt();
        
        double porcentaje1 = (pricePerBarrel*3.50)/100;
        double porcentaje2 = (pricePerBarrel*4.0)/100;
        
        System.out.println(porcentaje2);
        
        System.out.println("Para el precio por barril de: "+pricePerBarrel+".\nLos precios en bomba pueden ser: "+porcentaje1+" y "+porcentaje2);
        
        
    }
    
}
