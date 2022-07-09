package Chapter03.Item14.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {
    ArrayList<Car> cars = new ArrayList<>();
    Car car1 = new Car(1);
    Car car2 = new Car(3);
    cars.add(car2);
    cars.add(car1);
    System.out.println(cars);
    Collections.sort(cars);
    System.out.println(cars);

    Car car3 = new SuperCar(2, 10);
    Car car4 = new SuperCar(2, 5);
    cars.add(car3);
    cars.add(car4);
    Collections.sort(cars);
    System.out.println(cars);

    System.out.println(car1.compareTo(car3));
    System.out.println(car3.compareTo(car1));

    ArrayList<NewSuperCar> newSuperCars = new ArrayList<>();
    NewSuperCar newSuperCar1 = new NewSuperCar(new Car(1), 0);
    NewSuperCar newSuperCar2 = new NewSuperCar(new Car(3), 0);
    NewSuperCar newSuperCar3 = new NewSuperCar(new Car(2), 10);
    NewSuperCar newSuperCar4 = new NewSuperCar(new Car(2), 5);
    newSuperCars.add(newSuperCar1);
    newSuperCars.add(newSuperCar2);
    newSuperCars.add(newSuperCar3);
    newSuperCars.add(newSuperCar4);
    Collections.sort(newSuperCars);
    System.out.println(newSuperCars);

    System.out.println("====================");

    ArrayList<Building> buildings = new ArrayList<>(
        Arrays.asList(
            new Building(2, 2, 1, 4),
            new Building(2, 1, 2, 3),
            new Building(1, 2, 3, 2),
            new Building(3, 4, 4, 1),
            new Building(2, 3, 1, 4),
            new Building(4, 1, 2, 3),
            new Building(3, 4, 3, 2)
        )
    );

    Collections.sort(buildings);

    System.out.println(buildings);

  }

}
