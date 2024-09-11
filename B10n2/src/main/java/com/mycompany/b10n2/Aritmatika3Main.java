/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b10n2;

/**
 *
 * @author Windhover
 */
public class Aritmatika3Main {

    public static void main(String[] args) {
        // Membuat objek dari kelas Aritmatika
        Aritmatika aritmatika = new Aritmatika(8, 2);

        // Mengakses method dan mencetak hasilnya
        System.out.println("Pengurangan: " + aritmatika.pengurangan());
        System.out.println("Perkalian: " + aritmatika.perkalian());
        System.out.println("Pembagian: " + aritmatika.pembagian());
        System.out.println("Pangkat: " + aritmatika.pangkat());
    }
}
