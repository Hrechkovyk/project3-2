package com.company.details;

public class Engine {
    private int power;
    private String maker;

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", maker='" + maker + '\'' +
                '}';
    }

    public Engine(int power, String maker) {
        this.power = power;
        this.maker = maker;

    }
}
