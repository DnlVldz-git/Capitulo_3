/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.insurance;

/**
 *
 * @author dani
 */

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Insurance instancia = new Insurance();
        
        System.out.println("Introduzca el año de nacimiento: ");
        int nacimiento = leer.nextInt();
        System.out.println("Introduza el año actual: ");
        int actual = leer.nextInt();
        
        instancia.calcular(nacimiento, actual);
        
    }
}
