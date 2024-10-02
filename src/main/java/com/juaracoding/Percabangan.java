package com.juaracoding;

import java.util.Random;
import java.util.Scanner;

public class Percabangan {

    public static void main(String[] args) {


        // if Single
        if(false){
            System.out.println("Statment");
        }
            System.out.println("Next Statmen");


        //if else
        int suhu = 36;
        if(suhu > 36){ // 36 > 36 = False;
            System.out.println("Suhu Normal");
        } else {
            System.out.println("Suhu Tidak Normal");
        }

        //bilangan ganjil genap
        int angka = 5;
        if(angka % 2 == 0){ // 5 % 2 = 1 == 0 (false)
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }


        //if majemuk
        // size S = 10000 M = 20000 L = 30000
        String size = "m";
        int qty = 2;
        int price = 0;
        if(size.equalsIgnoreCase("S")){
            price = 10000;
        } else if (size.equalsIgnoreCase("M")){
            price = 20000;
        } else if (size.equalsIgnoreCase("L")){
            price = 30000;
        } else {
            System.out.println("Tidak Ada Ukuran Tersebut");

        }
        System.out.println("Size = " + size.toUpperCase()+ " Price = " + price);

        String Username = "User";
        String Password = "Pass";

        if(Username.equalsIgnoreCase("User") && Password.equalsIgnoreCase("Pass")){

            System.out.println("Login Gagal"); // fungsi && (salah satu atau kedua kondisi salah)
        } else {
            System.out.println("Login Berhasil"); // fungsi && (kedua kondisi benar)
        }

        //plat nomor ganjil, tanggal ganjil
        //plat nomor genap, tanggal genap
        int platnomor = 1235;
        int tanggal = 20;

        if((platnomor % 2 == 0 && tanggal % 2 == 0) || (platnomor % 2 == 1 && tanggal % 2 == 1)){
            System.out.println("bisa melewati jalan soekarno hatta");
        } else if (platnomor % 2 == 0 && tanggal % 2 == 1){
            System.out.println("tidak bisa melewati jalan seokarno hatta, karena plat nomor ganjil tanggal genap");
        } else {
            System.out.println("tidak bisa melewati jalan seokarno hatta, karena plat nomor genap tanggal ganjil");
        }

        boolean isMember = true;
        boolean isFirstTimeBuyer = false;
        boolean hasCoupon = false;
        double discount = 0.0;
        Scanner scanner = new Scanner(System.in); //awal mula memakai scanner
        System.out.println("Masukan total bayar = ");
        double totalAmount = scanner.nextDouble();
        if(totalAmount > 500000){
            if(isMember){
                discount = 0.1; // 10%
            } else if (isFirstTimeBuyer){
                discount = 0.05;
            } else if (hasCoupon){
                discount = 0.02;
            }
        }
        System.out.println("Discount = "+discount*100);
        System.out.println("Total bayar = Rp. "+(totalAmount-totalAmount*discount));

        //switch case
             System.out.println("Pilih Menu 1 - 5");
            int choseeMenu = 3;
            switch (choseeMenu){
                case 1:
                    System.out.println("Menu ke-1");
                    //block program
                    break;
                case 2:
                    System.out.println("Menu ke-2");
                    //block program
                    break;
                case 3:
                    System.out.println("Menu ke-3");
                    //block program
                    break;
                case 4:
                    System.out.println("Menu ke-4");
                    //block program
                    break;
                case 5:
                    System.out.println("Menu ke-5");
                    //block program
                    break;
            }

            //ternary
//            int nilai = 60;
//            String keterangan = nilai >= 75 ? "Lulus" : "Tidak Lulus";
//            System.out.println(keterangan);

            System.out.println("Masukkan Nilai: ");
            int nilai = scanner.nextInt();
            String keterangan = nilai >= 75 ? "Lulus" : "Tidak Lulus";
            System.out.println(keterangan);


    }
}
