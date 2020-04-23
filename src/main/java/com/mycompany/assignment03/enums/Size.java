/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment03.enums;

/**
 *
 * @author gkalf
 */
public enum Size {
    XS(1), S(2), M(3), L(4), XL(5), XXL(6), XXXL(7);

    public int value;

    private Size(int i) {
        this.value = i;
    }
}
