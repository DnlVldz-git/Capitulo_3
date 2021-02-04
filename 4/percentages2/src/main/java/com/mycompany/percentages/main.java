/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.percentages;

/**
 *
 * @author dani
 */

import java.util.*;

public class main {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Percentages instancia = new Percentages(); 
        
        System.out.println("Inserte el primer número :");
        double n1 = leer.nextDouble();
        System.out.println("Inserte el segundo número");
        double n2 = leer.nextDouble();
        
        instancia.percentage(n1, n2);
    }
}
