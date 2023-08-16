package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;

public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(String brand, String carClass, int weight, Driver driver, Engine engine) {
        super(brand, carClass, weight, driver, engine);
    }

    public void fast(){
        System.out.println("я блискавка максим!");
    }
}
