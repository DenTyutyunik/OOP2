package org.tyutyunik;

import org.tyutyunik.model.*;
import org.tyutyunik.service.*;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("car1", 4),
                new Car("car2", 4),
        };

        Bicycle[] bicycles = {
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2)
        };

        Truck[] trucks = {
                new Truck("truck1", 6),
                new Truck("truck2", 8)
        };

        ServiceStation station = new ServiceStation();
        station.check(cars[0]);
        station.check(cars[1]);
        station.check(bicycles[0]);
        station.check(bicycles[1]);
        station.check(trucks[0]);
        station.check(trucks[1]);
    }
}
