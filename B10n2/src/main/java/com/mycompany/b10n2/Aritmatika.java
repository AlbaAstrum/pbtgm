/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.b10n2;

/**
 *
 * @author Windhover
 */
public class Aritmatika {
    private double bilangan1;
    private double bilangan2;

    // Constructor
    public Aritmatika(double bilangan1, double bilangan2) {
        this.bilangan1 = bilangan1;
        this.bilangan2 = bilangan2;
    }

    // Method untuk pengurangan
    public double pengurangan() {
        return bilangan1 - bilangan2;
    }

    // Method untuk perkalian
    public double perkalian() {
        return bilangan1 * bilangan2;
    }

    // Method untuk pembagian
    public double pembagian() {
        if (bilangan2 != 0) {
            return bilangan1 / bilangan2;
        } else {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
        }
    }

    // Method untuk pangkat
    public double pangkat() {
        return Math.pow(bilangan1, bilangan2);
}
}