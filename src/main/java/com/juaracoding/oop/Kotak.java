package com.juaracoding.oop;

public class Kotak {

  //tidak bisa menggunakan return
    int sisi;


    Kotak(int sisi){
        this.sisi = sisi;
    }

    void draw(){
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
