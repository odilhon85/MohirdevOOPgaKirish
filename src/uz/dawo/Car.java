package uz.dawo;

import java.util.Objects;

public class Car {

    private String color;
    private String model;
    private int price;
    private String transmission;

    public Car() {
    }

    public Car(String color, String model, int price, String transmission) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.transmission = transmission;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(color, car.color) && Objects.equals(model, car.model) && Objects.equals(transmission, car.transmission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, model, price, transmission);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}
