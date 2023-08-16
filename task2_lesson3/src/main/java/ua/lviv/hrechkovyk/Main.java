package ua.lviv.hrechkovyk;

import com.company.Lorry;
import com.company.SportCar;
import com.company.details.Engine;
import com.company.entities.Person;
import com.company.professions.Driver;
import com.company.vehicles.Car;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(228, "bohdan");
        Driver driver = new Driver(2);
        Car car = new Car("audi", "rodster", 2500, driver, engine);
        Lorry lorry = new Lorry("ford", "gayCar", 2800, driver, engine);

        car.turnRight();
        car.stop();
        car.turnLeft();
        car.start();

        lorry.strong();
        lorry.stop();
        lorry.start();
        lorry.turnLeft();
        lorry.turnRight();



        System.out.println(car);
        System.out.println(driver);
        System.out.println(engine);


    }
}