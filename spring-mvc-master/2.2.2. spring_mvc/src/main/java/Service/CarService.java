package Service;

import model.Car;

import java.util.ArrayList;
import java.util.List;


public class CarService {

    public static List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "Blue", 74279));
        cars.add(new Car("Ferrari", "Red", 754902));
        cars.add(new Car("Reno", "White", 42299));
        cars.add(new Car("Lada", "Green", 574845));
        cars.add(new Car("Volvo", "White", 54758452));
        return cars;
    }

}
