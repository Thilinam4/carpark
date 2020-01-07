
package com.company;
import java.util.*;

public class Van extends Vehicle {
    protected int cargo_volume;
    Scanner scan = new Scanner(System.in);


    public void addvan(){
        System.out.println("Enter ID plate");
        ID_plate=scan.next();
        System.out.println("Enter Brand");
        Brand=scan.next();
        System.out.println("Enter date");
        en_date=scan.next();
        System.out.println("Enter time");
        en_time=scan.next();
        System.out.println("Enter cargo volume");
        cargo_volume=scan.nextInt();
    }


}