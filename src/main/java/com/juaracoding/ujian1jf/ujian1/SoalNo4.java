package com.juaracoding.ujian1jf.ujian1;

import java.util.Scanner;

public class SoalNo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] daftarFilm = new String[5];

        // Meminta pengguna memasukkan nama film
        System.out.println("Daftar Film Bioskop");
        for (int i = 0; i < daftarFilm.length; i++) {
            System.out.print("Masukkan nama film " + (i + 1) + ": ");
            daftarFilm[i] = scanner.nextLine();
        }

        // Menampilkan film yang ingin ditonton
        System.out.println("\nFilm yang ingin ditonton:");
        for (String film : daftarFilm) {
            System.out.println(film);
        }
    }
}
