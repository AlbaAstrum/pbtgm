package com.mycompany.b10n1d;

/**
 *
 * @author PC RPL - R1
 */
public class B10n1d {
    double angka;

    // This method (mutator) with 2 parameters base and exponent
    void setPangkat(double base, double exponent) {
        angka = Math.pow(base, exponent);  // Perform exponentiation
    }

    // This method (accessor)
    double getPangkat() {
        return angka;
    }

    public static void main(String[] args) {
        // Create an instance of the B10n1 class
        B10n1d aritmatikaku = new B10n1d();
        double base = 10, exponent = 20;

        // Use the instance to call the methods
        aritmatikaku.setPangkat(base, exponent);

        // Print the results
        System.out.println("Bilangan 1 = " + base);
        System.out.println("bilangan 2 = " + exponent);
        System.out.println("Hasil = " + aritmatikaku.getPangkat());
    }
}
