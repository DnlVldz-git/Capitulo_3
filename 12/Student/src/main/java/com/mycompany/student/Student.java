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
import java.util.Scanner;

public class Student {
     
    private int id;
    private int n_hours;
    private int n_points;
    private double average;
    
    Scanner leer = new Scanner(System.in);
    
    void inicializar(){
        this.id = 9999;
        this.n_hours = 3;
        this.n_points = 12;
        calcularPromedio();
    }
    
    void setId(){
        this.id = leer.nextInt();
    }
    
    void setHours(){
        this.n_hours = leer.nextInt();
    }
    
    void setPoints(){
        this.n_points = leer.nextInt();
    }
    
    int getId(){
        return this.id;
    }
    
    int getHours(){
        return this.n_hours;
    }
    
    int getPoints(){
        return this.n_points;
    }
    
    double getAverage(){
        return this.average;
    }
    
    void calcularPromedio(){
        this.average = this.n_points/this.n_hours;
    }
    
}
