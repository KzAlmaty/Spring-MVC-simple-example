package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private static int CAR_ID;

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CAR_ID, "Mers", "Black", 18000));
        cars.add(new Car(++CAR_ID, "Maserati", "Red", 12000));
        cars.add(new Car(++CAR_ID, "Peugeot", "Pink", 17000));
        cars.add(new Car(++CAR_ID, "Renault", "Blue", 19000));
        cars.add(new Car(++CAR_ID, "BMW", "Gray", 13000));
    }

    public List<Car> cars() {
        return cars;
    }

    public List<Car> getCars(int number) {

        if (number > 0 && number <= 5) {
            return cars.subList(0, number);
        } else if (number < 0){
            return null;
        } else {
            return cars;
        }

    }

}
