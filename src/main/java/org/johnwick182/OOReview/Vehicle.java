package org.johnwick182.OOReview;

public class Vehicle {
    private String brand;
    private String type;

    public Vehicle() {

    }

    public Vehicle(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public static class Car extends Vehicle {
        public Car() {
            super();
        }
    }

}
