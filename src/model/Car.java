package model;

import model.Enum.Colour;

import java.time.LocalDate;

public class Car {
    public static int idd=0 ;
    public int id;
    private String brand;
    private String model;
    private LocalDate year;
    private Colour colour;
    private int price;

    public Car(String brand, String model, LocalDate year, Colour colour, int price) {
        this.id=++idd;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.colour = colour;
        this.price = price;
    }

    public static int getIdd() {
        return idd;
    }

    public static void setIdd(int idd) {
        Car.idd = idd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", colour=" + colour +
                ", price=" + price +
                '}';
    }
}
