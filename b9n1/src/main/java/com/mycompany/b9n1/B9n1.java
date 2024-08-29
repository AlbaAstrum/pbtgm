/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b9n1;

/**
 *
 * @author PC RPL - R1
 */
public class B9n1 {

 public static void main(String[] args) {
        // Initialize the outer loop variable
        int i = 1;

        // Loop through rows
        while (i <= 5) {
            // Initialize the inner loop variable
            int j = 1;

            // Loop through columns
            while (j <= i) {
                System.out.print("* ");
                j++; // Increment the inner loop variable
            }
            System.out.println(); // Move to the next line
            i++; // Increment the outer loop variable
        }
    }
}
