package com.company;

import java.util.Scanner;

public class Motorbike extends Vehicle {
    protected int engine_size;
    Scanner scan = new Scanner(System.in);


    public void addmotorbike(){
        System.out.println("Enter ID plate");
        ID_plate=scan.next();
        System.out.println("Enter Brand");
        Brand=scan.next();
        System.out.println("Enter date");
        en_date=scan.next();
        System.out.println("Enter time");
        en_time=scan.next();
        System.out.println("Enter size of engine");
        engine_size=scan.nextInt();

    }
}
