package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {

    private String brand;
    private String carClass;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(String brand, String carClass, int weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start(){
        System.out.println("car Поїхали");
    }
    public void stop(){
        System.out.println("car Зупиняємося");
    }
    public void turnRight(){
        System.out.println("car Поворот направо");
    }
    public void turnLeft(){
        System.out.println("car Поворот наліво");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                '}';
    }
}
