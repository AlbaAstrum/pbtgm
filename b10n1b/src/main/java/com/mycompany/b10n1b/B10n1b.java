package com.mycompany.b10n1b;

/**
 *
 * @author PC RPL - R1
 */
public class B10n1b {
    int angka;

    // This method (mutator) with 2 parameters bil1 and bil2
    void setKali(int bil1, int bil2) {
        angka = bil1 * bil2;  // Perform subtraction
    }

    // This method (accessor)
    int getKali() {
        return angka;
    }

    public static void main(String[] args) {
        // Create an instance of the B10n1 class
        B10n1b aritmatikaku = new B10n1b();
        int a = 10, b = 20;

        // Use the instance to call the methods
        aritmatikaku.setKali (a, b);

        // Print the results
        System.out.println("Bilangan 1 = " + a);
        System.out.println("Bilangan 2 = " + b);
        System.out.println("Hasil Pengurangan = " + aritmatikaku.getKali());
    }
}
