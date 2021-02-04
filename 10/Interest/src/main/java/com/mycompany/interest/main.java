/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interest;

/**
 *
 * @author dani
 */
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Interest instancia = new Interest();
        
        System.out.println("Introduzca la inversión inicial");
        double inversion = leer.nextDouble();
        
        System.out.println("El dinero que tendrá en un año será de: "+instancia.calcularInteres(inversion)); 
        
        
    }
    
}
