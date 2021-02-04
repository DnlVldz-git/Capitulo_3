/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandwich;

/**
 *
 * @author dani
 */
import java.util.Scanner;

public class Sandwich {
    
    private String ingrediente;
    private String pan;
    private double precio;
    
    Scanner leer = new Scanner(System.in);
    
    void setIngrediente(){
        System.out.println("Introduzca el ingrediente del Sandwich");
        this.ingrediente = leer.nextLine();
    }
    
    void setPan(){
        System.out.println("Introduzca el pan del Sandwich");
        this.pan = leer.nextLine();
    }
    
    void setPrecio(){
        System.out.println("Introduzca el precio del Sandwich");
        this.precio = leer.nextDouble();
    }
    
    String getIngrediente(){
        return this.ingrediente;
    }
    
    String getPan(){
        return this.pan;
    }
    
    double getPrecio(){
        return this.precio;
    }
    
    
}
