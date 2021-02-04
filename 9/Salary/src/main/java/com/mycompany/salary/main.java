/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.salary;

/**
 *
 * @author dani
 */
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Salary instancia = new Salary();
        
        System.out.println("Introduzca el pago por hora: ");
        double paga = leer.nextDouble();
        System.out.println("Introduzca las horas de trabajo: ");
        int horas = leer.nextInt();
        System.out.println("Introduzca las horas extras");
        int extras = leer.nextInt();
        
        
        instancia.calcularSalario(paga, horas, extras);
        
    }
   
}
