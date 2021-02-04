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
public class ShowStudent2 {
    public static void main(String[] args) {
        
        Student instancia1 = new Student();
        
        instancia1.inicializar();
        
        System.out.println("Id:"+instancia1.getId());
        System.out.println("Horas: "+instancia1.getHours());
        System.out.println("Puntos: "+ instancia1.getPoints());
        System.out.println("Promedio: "+instancia1.getAverage());
        
    }
    
}
