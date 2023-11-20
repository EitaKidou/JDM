package Interface.Imple;

import model.Car;

import java.util.Arrays;

public class DataBase {
    private Car[] cars;

    public DataBase(Car[] cars) {
        this.cars = cars;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "cars=" + Arrays.toString(cars) +
                '}';
    }
}
