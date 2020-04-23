/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment03.strategy;

/**
 *
 * @author gkalf
 */
public class PayByCreditCard implements PayStrategy {

    @Override
    public void pay(int x, int y, int z) {
        int amount = x + y + z;
        System.out.println("Paid by Credit\\Debit Card, the amount of "
                + amount + " €");
    }

}
