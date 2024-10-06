package com.juaracoding.ujian1jf.ujian1;

import java.util.Scanner;

public class SoalNo2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama film: ");
        String namaFilm = scanner.nextLine();

        // Mengubah nama film menjadi huruf besar
        String namaFilmUpperCase = namaFilm.toUpperCase();

        // Mencetak nama film dalam huruf besar
        System.out.println("Nama film dalam huruf besar: " + namaFilmUpperCase);





    }

}
