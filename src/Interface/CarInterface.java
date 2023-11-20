package Interface;

import model.Car;

import java.math.BigDecimal;

public interface CarInterface {
    public void creatEnumColor();
    public void insertCar(Car newCar);
    public Car[] getCarById(Long id);
    public void updateCar(Long id, Car newCar);
    public void deleteCar(Long id);
    public Car[] getCarsBySearch(String brand, String model);
    public Car[] getCarsByPriceRange(BigDecimal minPrice, BigDecimal maxPrice);
}
