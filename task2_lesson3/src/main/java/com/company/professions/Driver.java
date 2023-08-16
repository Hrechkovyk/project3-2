package com.company.professions;

import com.company.entities.Person;

public class Driver extends Person {
    private int drivingExperience;

    @Override
    public String toString() {
        return "Driver{" +
                "drivingExperience=" + drivingExperience +
                '}';
    }

    public Driver(int drivingExperience) {
        this.drivingExperience = drivingExperience;

    }
}
