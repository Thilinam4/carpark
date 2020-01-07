package com.company;

import java.util.Scanner;

public class Car extends Vehicle {
   protected int nu_door;
   protected String colour;
   private String answer;
   private int answer1;
   private int count=-1;

   Scanner scan =new Scanner(System.in);


   public void addcar(){
      count++;
      System.out.println("Enter ID plate");
      ID_plate=scan.next();
      System.out.println("Enter Brand");
      Brand=scan.next();
      System.out.println("Enter date");
      en_date=scan.next();
      System.out.println("Enter time");
      en_time=scan.next();
      System.out.println("Enter number of doors");
      nu_door=scan.nextInt();
      System.out.println("Enter colour");
      colour=scan.next();
   }



}
