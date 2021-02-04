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
public class TestBankAccount {
    
    
    void declarar(){
        BankAccount cliente1 = new BankAccount();
        BankAccount cliente2 = new BankAccount();
        BankAccount cliente3 = new BankAccount();
        BankAccount cliente4 = new BankAccount();
        
        getData(cliente1, cliente2, cliente3);
        
        cliente4.inicializar();
        
        showValues(cliente1);
        showValues(cliente2);
        showValues(cliente3);
        showValues(cliente4);
        
    }
    
    void getData(BankAccount c1, BankAccount c2, BankAccount c3){
        System.out.println("Introduzca la cuenta 1: ");
        c1.setCuenta();
        System.out.println("Intoduzca la cuenta 2: ");
        c2.setCuenta();
        System.out.println("Introduzca la cuenta 3: ");
        c3.setCuenta();
        
        System.out.println("Introduzca el nombre 1: ");
        
        c1.setNombre();
        System.out.println("Introduzca el nombre 2: ");
        c2.setNombre();
        System.out.println("Introduzca el nombre 3: ");
        c3.setNombre();
        
        System.out.println("Introduzca el balance 1: ");
        c1.setBalance();
        System.out.println("Introduzca el balance 2: ");
        c2.setBalance();
        System.out.println("Introduzca el balance 3: ");
        c3.setBalance();
    }
            
    void showValues(BankAccount c){
        System.out.println("");
        System.out.println("La cuenta "+c.getCuenta());
        System.out.println("Propietario: "+c.getNombre());
        System.out.println("Balance"+c.getBalance());
        
        c.deductMonthlyFee();
        
        System.out.println("La cuenta "+c.getCuenta());
        System.out.println("Propietario: "+c.getNombre());
        System.out.println("Balance"+c.getBalance());
        
        c.explainAccountPolicy();
        
        System.out.println("");
    }        
            
    
  
}
