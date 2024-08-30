/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab8no2;

/**
 *
 * @author USER
 */

import java.util.Scanner;
public class Bab8no2 {

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Insert year ");
        int num = userinput.nextInt();
        for(int i=1950; i<=2015; i++){
              System.out.println( i);
        }
    }
}
