import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import CarRentalSystem.CarRentalSystem;
import Car.Car;


public class Main{
    public static void main(String[] args) {
        CarRentalSystem rentalSystem = new CarRentalSystem();

        Car car1 = new Car("A001", "Tata", "Safari", 60.0);
        Car car2 = new Car("A002", "BMW", "XM", 70.0);
        Car car3 = new Car("A003", "AUDI", "R8", 150.0);
        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);

        rentalSystem.menu();
    }
}