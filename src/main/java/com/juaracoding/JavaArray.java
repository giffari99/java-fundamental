package com.juaracoding;

import java.util.Scanner;

public class JavaArray {
    public static void main(String[] args) {

        //cara 1

        int [] angka = {1,2,3,4,5}; //index 0 -4
        System.out.println(angka[2]); // panggil index ke-2

        //cara 2

        int [] grades = new int[5]; //[] element
        grades[0] = 80;
        grades[1] = 81;
        grades[2] = 82;
        grades[3] = 83;
        grades[4] = 84;
        grades[2] = 85;
        System.out.println(grades[2]);
        System.out.println(grades.length);//jumlah element []

        //for i
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }
        //for each
        System.out.println("For Each");
        for(int grade : grades){
            System.out.println(grade);
        }



        String [] cars = {"Volvo", "BMW", "Mazda", "Toyota", "Mitsubishi"};
        for(String car : cars){
            System.out.println(car.toUpperCase());
        }

        //array multidimensi
        int [][] angkaKu = {{1,2,3,4},{5,6,7}};
        System.out.println(angkaKu[1][2]); //baris , kolom

        System.out.println("Jumlah Baris = "+angkaKu.length);
        System.out.println("Jumlah Kolom Baris ke-1 = "+angkaKu[0].length);
        System.out.println("Jumlah Kolom Baris ke-2 = "+angkaKu[1].length);

        for (int i = 0; i < angkaKu.length; i++) {
            for (int j = 0; j < angkaKu.length; j++) {
                System.out.println(angkaKu[i][j]);

            }

        }


        //membuat scanner input data city : Jakarta, Bandung, Surabaya, Bali, Makassar


        Scanner scanner = new Scanner(System.in);

        String[] nameCity= new String[5];

        System.out.println("Daftar Nama Kota");
        for (int i = 0; i < nameCity.length; i++) {
            System.out.print("Masukkan Nama Kota "+ ( i + 1)+" : ");
            nameCity[i] = scanner.nextLine();
        }


        System.out.println("Daftar Nama Kota Yang di Input");
        for(String city : nameCity){
            System.out.println(city);

        }

            double [] prices = {10000,50000,70000,90000,100000};
            double sum = 0;
            for (int i = 0; i < prices.length; i++) {
                sum += prices[i]; //operator assigmen sum = sum + price[i]

        }
//            for(double price : prices){ // menggunakan "For Each"
//                sum += price;
//            }

            System.out.println("Total Bayar = "+ sum);

            String[] cities = {"Jakarta", "Bandung", "Surabaya", "Bali", "Makassar"};
            System.out.println("Masukkan Data Kota Yang di cari : ");
            String Search = scanner.next();
            boolean isFound = false;
            int index = 0;
            for (int i = 0; i < cities.length; i++) {
                if(Search.equalsIgnoreCase(cities[i])) {
                    isFound = true;
                    index = 1;
                }
        }
            //data di temukan dan data tidak ditemukan

        if(isFound){
            System.out.println("Data ditemukan");
        } else {
            System.out.println("Data Tidak di temukan");
        }


        //ternary
        String text = isFound ? "Data ditemukan pada index ke -"+ index : "Data tidak ditemukan";
        System.out.println(text);








    }
}
