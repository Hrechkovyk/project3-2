package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;

public class Lorry extends Car {
    private int carryingCapacity;

    public Lorry(String brand, String carClass, int weight, Driver driver, Engine engine) {
        super(brand, carClass, weight, driver, engine);
    }

    public void strong(){
        System.out.println("lorry я сильний!");
    }

}
