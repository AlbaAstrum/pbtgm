/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b9n2;

/**
 *
 * @author PC RPL - R1
 */

import java.util.Scanner;
public class B9n2 {
    public static void main(String[] args) {
        // Membuat Scanner untuk input
        Scanner scanner = new Scanner(System.in);
        
        // Mengambil input nilai awal
        System.out.print("Masukkan bilangan awal: ");
        int awal = scanner.nextInt();
        
        // Mengambil input nilai akhir
        System.out.print("Masukkan bilangan akhir: ");
        int akhir = scanner.nextInt();
        
        // Menutup Scanner
        scanner.close();
        
        // Mencetak hasil deret bilangan
        System.out.println("Hasil deret bilangan:");
        for (int i = awal; i <= akhir; i += 5) {
            // Menampilkan bilangan diikuti dengan koma, kecuali bilangan terakhir
            if (i != awal) {
                System.out.print(", ");
            }
            System.out.print(i);
        }
    }
}

