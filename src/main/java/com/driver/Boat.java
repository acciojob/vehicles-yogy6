package com.driver;

public class Boat implements WaterVehicle{
    public String name;
    public int capacity;


    public Boat(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
