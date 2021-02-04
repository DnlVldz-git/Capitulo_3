/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.characters;

/**
 *
 * @author dani
 */

import java.util.Scanner;

public class Character {
    
    private String color;
    private int n_eyes;
    private int n_lives;
    
    Scanner leer = new Scanner(System.in);
    
    public void setColor(){
        this.color = leer.nextLine();
        
    }
    
    public void setLives(){
        this.n_lives = leer.nextInt();
    }
    
    public void setEyes(){
        this.n_eyes = leer.nextInt();
    }    
    
    public String getColor(){
        return this.color;
    }
    
    public int getEyes(){
        return this.n_eyes;
    }
    
    public int getLives(){
        return this.n_lives;
    }
    
    
}
