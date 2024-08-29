package com.mycompany.b10n1c;

/**
 *
 * @author PC RPL - R1
 */
public class B10n1c {
    int angka;

    // This method (mutator) with 2 parameters bil1 and bil2
    void setBagi(int bil1, int bil2) {
        angka = bil1 / bil2;  // Perform subtraction
    }

    // This method (accessor)
    int getBagi() {
        return angka;
    }

    public static void main(String[] args) {
        // Create an instance of the B10n1 class
        B10n1c aritmatikaku = new B10n1c();
        int a = 10, b = 20;

        // Use the instance to call the methods
        aritmatikaku.setBagi(a, b);

        // Print the results
        System.out.println("Bilangan 1 = " + a);
        System.out.println("Bilangan 2 = " + b);
        System.out.println("Hasil Pengurangan = " + aritmatikaku.getBagi());
    }
}
