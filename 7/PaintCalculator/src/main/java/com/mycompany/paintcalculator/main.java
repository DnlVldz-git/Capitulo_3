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

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Area instancia = new Area();
        System.out.println("Introduzca el ancho del cuarto:");
        double ancho = leer.nextDouble();
        System.out.println("Introduzca el largo del cuarto: ");
        double largo = leer.nextDouble();
        System.out.println("Introduzca el alto del cuarto: ");
        double alto = leer.nextDouble();
        
        instancia.calcularPintura(ancho, largo, alto);
    }
}
