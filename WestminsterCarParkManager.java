package com.company;
import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class WestminsterCarParkManager implements CarParkManager {
    Scanner scan = new Scanner(System.in);

    private Car[] cars =new Car[20];
    private Van[] vans = new Van[20];
    private Motorbike[] motorbikes = new Motorbike[20];
    private String[] ID_plate=new String[20];
    private int count=-1;
    private int lot=0;
    private int ccount=-1;
    private int vcount=-1;
    private int mcount=-1;


    public void Addvehicle(){
        int choice;
        System.out.println("add vehicle");
        System.out.println("Enter the vehicle class \n\t\t1.Car\n\t\t2.Van\n\t\t3.Motorbike ");
        choice =scan.nextInt();

        if(choice==1) {
            if(lot<20) {
                ccount++;
                count++;
                Car car = new Car();
                car.addcar();
                cars[ccount] = car;
                ID_plate[count]=car.getID_plate();
                lot++;
            }
            else
                System.out.println("lot is exist");
        }
        else if(choice==2) {
            if(lot<20) {
                vcount++;
                count++;
                Van van = new Van();
                van.addvan();
                vans[vcount] = van;
                ID_plate[count]=van.getID_plate();
                lot+=2;
            }
            else
                System.out.println("lot is exist");
        }
        else if(choice==3){
            if(lot<20) {
                mcount++;
                count++;
                Motorbike motorbike = new Motorbike();
                motorbike.addmotorbike();
                motorbikes[mcount] = motorbike;
                ID_plate[count]=motorbike.getID_plate();
                lot++;
            }
            else
                System.out.println("lot is exist");
        }
        else{
            System.out.println("Entered number is wrong");
        }


    }
    public void Deletevehicle(){
        System.out.println("Deletevehicle");
    }

    public void Printlist(){
        System.out.println("print");
            int i = 0;
            for (int j=0;j<=count;j++)
            for(i=0;i<=count;i++) {
                if(ID_plate[j]==cars[i].ID_plate){
                    System.out.println("---------------------------------------------");
                    System.out.println("("+count+") Vehicle is "+" car");
                System.out.println("\tID_plate"+cars[i].ID_plate);
                System.out.println("\tBrand"+cars[i].Brand);
                System.out.println("\tEntered date"+cars[i].en_date);
                System.out.println("\tEntered time"+cars[i].en_time);
                System.out.println("\tNumber of door"+cars[i].nu_door);
                System.out.println("\tcolour"+cars[i].colour);
                    System.out.println("---------------------------------------------");

                }
                else  if(ID_plate[j]==vans[i].ID_plate){
                    System.out.println("---------------------------------------------");
                    System.out.println("("+count+") Vehicle is "+" van");
                    System.out.println("\tID_plate"+vans[i].ID_plate);
                    System.out.println("\tBrand"+vans[i].Brand);
                    System.out.println("\tEntered date"+vans[i].en_date);
                    System.out.println("\tEntered time"+vans[i].en_time);
                    System.out.println("\tNumber of door"+vans[i].cargo_volume);
                    System.out.println("---------------------------------------------");

                }
                else if(ID_plate[j]==motorbikes[i].ID_plate){
                    System.out.println("---------------------------------------------");
                    System.out.println("("+count+") Vehicle is "+" motorbike");
                    System.out.println("\tID_plate"+motorbikes[i].ID_plate);
                    System.out.println("\tBrand"+motorbikes[i].Brand);
                    System.out.println("\tEntered date"+motorbikes[i].en_date);
                    System.out.println("\tEntered time"+motorbikes[i].en_time);
                    System.out.println("\tNumber of door"+motorbikes[i].engine_size);
                    System.out.println("---------------------------------------------");

                }
                else
                    System.out.println("Something Wrong");
            }
    }
    public void Printlistdate(){
        System.out.println("print");
    }


}
