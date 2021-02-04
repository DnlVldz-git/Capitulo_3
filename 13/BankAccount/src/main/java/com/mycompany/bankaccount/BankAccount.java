/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankaccount;

/**
 *
 * @author dani
 */
import java.util.Scanner;

public class BankAccount {
    
    private int cuenta;
    private String nombre;
    private double balance;
    
    Scanner leer = new Scanner(System.in);
    
    public void inicializar(){
        this.cuenta = 0;
        this.nombre = "";
        this.balance = 0;
    }
    
    public void setCuenta(){
        this.cuenta = leer.nextInt();
    }
    
    public void setNombre(){
        this.nombre = leer.nextLine();
        leer.nextLine();
    }
    
    public void setBalance(){
        this.balance = leer.nextDouble();
    }
    
    public int getCuenta(){
        return this.cuenta;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public void deductMonthlyFee(){
        this.balance = this.balance - 4;
    }
    
    public void explainAccountPolicy(){
        System.out.println("A su balance se le descontarán $4 mensuales");
    }
}
