package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int a = 100;
        int choice;
        char answer;
        String s;

        Scanner scan =new Scanner(System.in);
        CarParkManager manager =new WestminsterCarParkManager();
        do {
            System.out.println("Enter your choice using number:");
            System.out.println("1.Park vehicle");
            System.out.println("2.Remove vehicle");
            System.out.println("3.Print list of vehicle");
            System.out.println("4.print list of vehicle in selected day");
            choice =scan.nextInt();

            switch (choice)
            {
                case 1:
                    manager.Addvehicle();
                    break;
                case 2:
                    manager.Deletevehicle();
                    break;
                case 3:
                    manager.Printlist();
                    break;
                case 4:
                    manager.Printlistdate();
                    break;
            }





            System.out.println("If you continue this?   (Yes-y,No-eny key)");
            answer = scan.next().charAt(0);
        }while (answer =='y');


    }
}