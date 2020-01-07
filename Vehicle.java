package com.company;

public abstract class Vehicle {
    protected String ID_plate;
    protected  String Brand;
    protected  String en_time;
    protected  String en_date;


    public Vehicle() {
    }

    public Vehicle(String ID_plate, String brand, String en_time, String en_date) {
        this.ID_plate = ID_plate;
        Brand = brand;
        this.en_time = en_time;
        this.en_date = en_date;
    }

    public String getID_plate() {
        return ID_plate;
    }

    public void setID_plate(String ID_plate) {
        this.ID_plate = ID_plate;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getEn_time() {
        return en_time;
    }

    public void setEn_time(String en_time) {
        this.en_time = en_time;
    }

    public String getEn_date() {
        return en_date;
    }

    public void setEn_date(String en_date) {
        this.en_date = en_date;
    }
}
