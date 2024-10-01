package com.juaracoding;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {


        // looping
        //for  (dibatasi)
        for (int i = 0; i <5; i++) {
            System.out.print(i);
        }
        System.out.println("next statment");

        // increment dari terkecil ke terbesar
        for (int i = 0; i <10; i++) {
            if(i % 2 == 1) { // 2 % 2 = 0 == 1 (false)
                System.out.print(i+ " ");
            }

        }
        for (int i = 1; i <10; i+=2) {  // i = 1 + 2 = 3  nextnya // i = 3 + 2 = 5 dan seterusnya
                System.out.print(i+ " ");
            }

        for (int i = 1; i <10; i++) {
            System.out.print(i+ " ");
            i++;
        }

        //decrement = terbesar ke terkecil
        for (int i = 9; i > 0; i--) { // 0 > 0 false
            System.out.print(i+ " ");
            i--;
        }

        System.out.println();
        // nested for
        // *****
        // *****
        // *****
        // *****
        // *****
        int sisi = 5;
        for (int i = 0; i < sisi; i++) { // i = 0
            for (int j = 0; j < sisi; j++) { // menunggu sampai false 5 < 5
                System.out.print("*");
            }
            System.out.println();

        }


        for (int i = 1; i <= sisi; i++) { // i = 0
            for (int j = 0; j < i; j++) {
                    // menunggu sampai false 5 < 5
                System.out.print("*");
                }
            System.out.println();

            }

        for (int i = sisi; i > 0; i--) { // 5 sampai 1
            for (int j = i; j > 0 ; j--) {
                
            }
            
        }



        // while (tidak dibatasi)
        System.out.println("x");
        int x = 0;
        while (x > 5);{

        }
        System.out.println();
        System.out.println("next statement");


        //do while
        int y = 0;
        System.out.println("y");
        do {
            System.out.println(y);
            y++;
        } while (y < 0);
        System.out.println();


        //break / continue

        while (x < 6){
            System.out.println("Looping ke-"+x);
            x++;
            if(x == 3) break;
        }


//        while (x < 6){
//            if(x == 3){
//                x++;
//                continue;
//            }
//            System.out.println("Looping ke-"+x);
//            x++;
//        }


        // input angka berapapun, tapi ketika input angka 0 akan keluar looping

        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.println("Masukkan angka = ");
        int angka = scanner.nextInt();
        System.out.println(angka);
        if (angka == 0) break;



        }


    }
}
