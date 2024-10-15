package com.juaracoding.oop;

public class Segitiga {

        int sisi;

        Segitiga (int sisi){
            this.sisi = sisi;
        }

        void draw (){
            for (int i = 1; i <= sisi; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();

            }
        }



}
