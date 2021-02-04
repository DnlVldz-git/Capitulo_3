/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cards;

/**
 *
 * @author dani
 */
public class main {
    
    public static void main(String[] args) {
        Card carta1 = new Card();
        Card carta2 = new Card();
        
        System.out.println("Introduzca el palo de la carta 1: ");
        carta1.setSuit();
        System.out.println("Introduzca el palo de la carta 2: ");
        carta2.setSuit();
        
        carta2.setN();
        carta1.setN();
        System.out.println("La carta 1 tiene el palo: "+carta1.getSuit()+" y el nùmero: "+carta1.getN());
        System.out.println("La carta 2 tiene el palo: "+carta2.getSuit()+" y el nùmero: "+carta2.getN());
        
        
    }
    
}
