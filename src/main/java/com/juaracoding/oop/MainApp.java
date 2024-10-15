package com.juaracoding.oop;

import java.util.Date;

public class MainApp {
    public static void main(String[] args) {

        //instant objek
        Fruit apple = new Fruit();
        apple.grams = 2;
        apple.calsPerGram = 57   ;
        System.out.println(apple.totalCalories());
        System.out.println(apple);

        Fruit mango = new Fruit();
        mango.grams = 3;
        mango.calsPerGram = 56;
        System.out.println(mango.totalCalories());
        System.out.println(mango);

        Date date = new Date(2000);
        System.out.println(date.getTime());

        Kotak kotakPertama = new Kotak(10);
        kotakPertama.draw();

        Kotak kotakKedua = new Kotak(5);
        kotakKedua.draw();


        Segitiga segitiga = new Segitiga(5 );
        segitiga.draw();


        //car
        Car car = new Car("Pertalite");
        car.warna();
        car.mesin();
        System.out.println(car.getTahunPembuatan());
        System.out.println(car.getBahanBakar());


        Employee employee = new Employee("giffari", "SQA", 7000, true);
        //employee.salary = 10000; tanpa modifire bisa di ubah
        employee.displayInfoEmp();


    }
}
