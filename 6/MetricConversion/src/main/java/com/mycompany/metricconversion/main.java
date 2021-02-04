/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metricconversion;

/**
 *
 * @author dani
 */

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        MetricConversion instancia = new MetricConversion();
        
        System.out.println("Introduzca el nùmero a convertir");
        
        int num = leer.nextInt();
        
        instancia.inches(num);
        
        instancia.gallons(num);
        
    }
}
