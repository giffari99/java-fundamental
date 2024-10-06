package com.juaracoding.ujian1jf.ujian1;

import java.util.Scanner;

public class SoalNo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Harga tiket
        final int HARGA_WEEKDAY = 35000;
        final int HARGA_WEEKEND = 45000;

        // Meminta input jumlah tiket
        System.out.print("Masukkan jumlah tiket: ");
        int jumlahTiket = scanner.nextInt();

        // Meminta input jenis hari (weekday/weekend)
        System.out.print("Apakah tiket untuk weekday atau weekend? (masukkan 'weekday' atau 'weekend'): ");
        String jenisHari = scanner.next();

        // Menentukan harga tiket per tiket
        int hargaPerTiket;
        if (jenisHari.equalsIgnoreCase("weekday")) {
            hargaPerTiket = HARGA_WEEKDAY;
        } else if (jenisHari.equalsIgnoreCase("weekend")) {
            hargaPerTiket = HARGA_WEEKEND;
        } else {
            System.out.println("Jenis hari tidak valid.");
            scanner.close();
            return;
        }

        // Menghitung total harga sebelum diskon
        int totalHargaTanpaDiskon = hargaPerTiket * jumlahTiket;

        // Menghitung total harga setelah diskon jika jumlah tiket lebih dari 5
        int totalHarga;
        if (jumlahTiket > 5) {
            totalHarga = (int) (totalHargaTanpaDiskon * 0.9); // Jika total harga adalah 100, maka 100 * 0.9 = 90. Ini mencerminkan diskon 10%.
            System.out.println("Total harga (dengan diskon): " + totalHarga);
        } else {
            totalHarga = totalHargaTanpaDiskon; // Tanpa diskon
            System.out.println("Total harga (tidak dengan diskon): " + totalHargaTanpaDiskon);
        }



    }
}
