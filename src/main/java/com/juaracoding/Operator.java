package com.juaracoding;

public class Operator {
    public static void main(String[] args) {

        //aritmatika

        double result = 5.0 / 2;
        System.out.println(result);
        int modulus = 11 % 2;
        System.out.println(modulus);


        int x = 2;
        int hasil = 10 * x++;  // di kali (Suflix)
        System.out.println(hasil);


        int a = 2;
        int hasil2 = 10 * ++a;  // di tambah (Prefix)
        System.out.println(hasil2);


        int total = 12 + 5;
        System.out.println(total);


        //assignmen
        int w = 10;
        int q = 20;
        w += q; // w = w + q
        System.out.println(w);

        //relational
        boolean isResult =  5 > 5;
        System.out.println(isResult);


        //bitwise
        int bitwise = 10 | 12;
        //1010 = 10
        //1100 = 12
        //1000 = 14
        System.out.println(bitwise);



    }


}
