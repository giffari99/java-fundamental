package com.juaracoding.ujian1jf.ujian1;

import java.util.Scanner;

public class SoalNo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mendefinisikan array untuk menyimpan harga tiket
        int[] hargaTiket = new int[5];

        // Meminta pengguna memasukkan harga tiket untuk 5 film
        for (int i = 0; i < hargaTiket.length; i++) {
            System.out.print("Harga tiket film " + (i + 1) + ": ");
            hargaTiket[i] = scanner.nextInt();
        }

        // Menghitung total harga tiket
        int totalHarga = 0;
        for (int harga : hargaTiket) {
            totalHarga += harga;
        }

        // Mencetak total harga tiket
        System.out.println("Total harga tiket: " + totalHarga);

        // Menutup scanner
        scanner.close();
    }
}
