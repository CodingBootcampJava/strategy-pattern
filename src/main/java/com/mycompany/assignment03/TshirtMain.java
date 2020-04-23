/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment03;

import com.mycompany.assignment03.strategy.PayByCreditCard;
import com.mycompany.assignment03.strategy.PayByCash;
import com.mycompany.assignment03.strategy.PayByMoneyTransfer;
import com.mycompany.assignment03.enums.Fabric;
import com.mycompany.assignment03.enums.Color;
import com.mycompany.assignment03.enums.Size;

/**
 *
 * @author gkalf
 */
public class TshirtMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Tshirt t1 = new Tshirt(new PayByCash(), Color.RED, Size.S, Fabric.WOOL);
        Tshirt t2 = new Tshirt(new PayByCreditCard(), Color.ORANGE, Size.XL, Fabric.POLYESTER);
        Tshirt t3 = new Tshirt(new PayByMoneyTransfer(), Color.INDIGO, Size.XXXL, Fabric.LINEN);
        System.out.println(t1);
        t1.doPay();
        System.out.println(t2);
        t2.doPay();
        System.out.println(t3);
        t3.doPay();

    }

}
