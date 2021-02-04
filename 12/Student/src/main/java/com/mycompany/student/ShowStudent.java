/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.student;

/**
 *
 * @author dani
 */
public class ShowStudent {
    
    public static void main(String[] args) {
        
        Student instancia = new Student();
        
        System.out.println("Introduzca el id");
        instancia.setId();
        System.out.println("Introduzca las horas");
        instancia.setHours();
        System.out.println("Introduzca los puntos");
        instancia.setPoints();
        
        instancia.calcularPromedio();
    
        System.out.println("ID: "+instancia.getId());
        System.out.println("Horas: "+instancia.getHours());
        System.out.println("Puntos: "+instancia.getPoints());
        System.out.println("Promedio: "+instancia.getAverage());
        
    }
    
}
