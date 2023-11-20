import Interface.Imple.CarInterfaceImple;
import Interface.Imple.DataBase;
import model.Car;
import model.Enum.Colour;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car car = new Car("q1","h1", LocalDate.ofYearDay(1998,23), Colour.RED,3000);
        Car car1 = new Car("q2","h2", LocalDate.ofYearDay(1954,26), Colour.BLACK,5000);
        Car car2 = new Car("q2","h2", LocalDate.ofYearDay(2000,13), Colour.BLUE,6000);
        Car car3 = new Car("q4","h4", LocalDate.ofYearDay(1958,22), Colour.BROWN,4000);
        Car car4 = new Car("q5","h5", LocalDate.ofYearDay(2003,4), Colour.WHITE,8000);
        Car car5 = new Car("q6","h6", LocalDate.ofYearDay(1967,30), Colour.YELLOW,7000);
        Car[] cars = new Car[]{car,car1,car2,car3,car4,car5};
        System.out.println(Arrays.toString(cars));
        DataBase dataBase = new DataBase(new Car[]{car});
        CarInterfaceImple carInterfaceImple= new CarInterfaceImple(new DataBase(cars));
        carInterfaceImple.creatEnumColor();
        carInterfaceImple.deleteCar(2L);
        carInterfaceImple.insertCar(new Car("q7","h7",LocalDate.ofYearDay(1997,21),Colour.WHITE,3444));
        System.out.println(Arrays.toString(carInterfaceImple.getCarById(2L)));
        carInterfaceImple.updateCar(1L,new Car("q6","h6", LocalDate.ofYearDay(1967,30), Colour.YELLOW,7000));
        System.out.println(Arrays.toString(carInterfaceImple.getCarsBySearch("q2", "h2")));
        BigDecimal bigDecimal=new BigDecimal(2000);
        BigDecimal bigDecimal1=new BigDecimal(5000);
        System.out.println(Arrays.toString(carInterfaceImple.getCarsByPriceRange(bigDecimal, bigDecimal1)));

    }
}