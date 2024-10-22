/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b11n1;

/**
 *
 * @author Windhover
 */
// Kelas Karyawan
// Kelas Karyawan
public class Karyawan {
    private String idKaryawan;
    private String namaKaryawan;
    private String gol;
    private String jabatan;
    private double gajiPokok;

    // Constructor dengan parameter
    public Karyawan(String idKaryawan, String namaKaryawan, String gol, String jabatan, double gajiPokok) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.gol = gol;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
    }

    // Method untuk menampilkan data karyawan
    public void tampilkanData() {
        // Format gaji dalam juta
        double gajiDalamJuta = gajiPokok / 1_000_000;
        
        System.out.println("ID Karyawan: " + idKaryawan);
        System.out.println("Nama Karyawan: " + namaKaryawan);
        System.out.println("Golongan: " + gol);
        System.out.println("Jabatan: " + jabatan);
        System.out.printf("Gaji Pokok: %.2f juta%n", gajiDalamJuta);
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Input data karyawan
        Karyawan karyawan1 = new Karyawan("0001", "Agus Suharto", "1", "Assisten Staff", 5000000);
        Karyawan karyawan2 = new Karyawan("0002", "?", "2", "Staff", 3000000);

        // Tampilkan data karyawan
        karyawan1.tampilkanData();
        System.out.println(); // Baris kosong
        karyawan2.tampilkanData();
    }
}
