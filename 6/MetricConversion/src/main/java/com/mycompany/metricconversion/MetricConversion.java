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
public class MetricConversion{
    
    void inches(int num){
        System.out.println("Las "+num+" pulgadas son: "+(num*2.54)+" centímetros");
    }
    
    void gallons(int num){
        System.out.println("Los "+num+" galones son: "+(num*3.7854)+" litros");
    }
    
}
