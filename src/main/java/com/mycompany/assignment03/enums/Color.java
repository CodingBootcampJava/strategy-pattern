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
public enum Color {
    RED(1), ORANGE(2), YELLOW(3), GREEN(4), BLUE(5), INDIGO(6), VIOLET(6);

    public int value;

    private Color(int i) {
        this.value = i;
    }
}
