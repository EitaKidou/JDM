package Interface.Imple;

import Interface.CarInterface;
import model.Car;
import model.Enum.Colour;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

public class CarInterfaceImple  implements CarInterface {
    private DataBase dataBase;

    public CarInterfaceImple(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void creatEnumColor() {
       Colour colour = Colour.RED;
        System.out.println(colour);
    }


    @Override
    public Car[] getCarById(Long id){
        Car[] cars= new Car[dataBase.getCars().length];
        int counter=0;
        for (Car car:dataBase.getCars()) {
            if (car.getId()==id){
                cars[counter]=car;
                counter++;
            }
        }
        Car [] cars1 = Arrays.copyOf(cars,counter);
        return cars1;
    }
    public void insertCar(Car newCar){
        Car[] cars = Arrays.copyOf(dataBase.getCars(), dataBase.getCars().length+1);
        cars[cars.length-1]=newCar;
        dataBase.setCars(cars);
        System.out.println(Arrays.toString(cars));
    }
    @Override
    public void updateCar(Long id, Car newCar) {

        for (Car car: dataBase.getCars()) {
            if (car.getId()==id){
               car.setBrand("q42");
               car.setModel("h42");
               car.setYear(LocalDate.ofYearDay(2023,23));
               car.setColour(Colour.WHITE);
               car.setPrice(230000);
                System.out.println(Arrays.toString(getAllCar()));
            }
        }
    }
    public Car[] getAllCar(){
        return dataBase.getCars();
    }


    @Override
    public void deleteCar(Long id) {
        Car[] cars = Arrays.copyOf(dataBase.getCars(),dataBase.getCars().length-1);
        int counter=0;
        for (Car car: dataBase.getCars()) {
            if (car.getId()!=id){
                cars[counter]=car;
                counter++;
            }
        }
        Car [] cars1 = Arrays.copyOf(cars,counter);
        System.out.println(Arrays.toString(cars1));
    }

    @Override
    public Car[] getCarsBySearch(String brand, String model) {
        Car[] cars = new Car[dataBase.getCars().length];
        int counter=0;
        for (Car car:dataBase.getCars()) {
            if (car.getBrand()==brand && car.getModel()==model){
                cars[counter]=car;
                counter++;
            }
        }
        Car[] cars1 = Arrays.copyOf(cars,counter);
        return cars1;
    }

    @Override
    public Car[] getCarsByPriceRange(BigDecimal minPrice, BigDecimal maxPrice) {
        int a= minPrice.intValue();
        int b= maxPrice.intValue();
        Car[] cars = new Car[dataBase.getCars().length];
        int counter=0;
        for (Car car: dataBase.getCars()) {
            if (car.getPrice()>=a&&car.getPrice()<=b){
                cars[counter]=car;
                counter++;
            }
        }
        Car[] cars1 = Arrays.copyOf(cars,counter);
        return cars1;
    }


    @Override
    public String toString() {
        return "CarInterfaceImple{" +
                "dataBase=" + dataBase +
                '}';
    }
}
