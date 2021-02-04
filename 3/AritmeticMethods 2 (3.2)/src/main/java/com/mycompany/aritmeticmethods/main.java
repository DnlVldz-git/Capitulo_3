/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aritmeticmethods;

/**
 *
 * @author dani
 */

import java.util.*;

public class main {
    public static void main(String[] args) {
        
        Metodo met = new Metodo();
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca el primer número");
        int a = leer.nextInt();
        System.out.println("Introduzca el segundo número");
        int b = leer.nextInt();
        
        
        
        met.displayNumberPlus10(a, b);
        met.displayNumberPlus100(a, b);
        met.displayNumberPlus1000(a, b);
        
    }
    
}
