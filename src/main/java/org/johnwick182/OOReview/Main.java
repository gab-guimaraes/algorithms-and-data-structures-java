package org.johnwick182.OOReview;

public class Main {
    public static void main(String[] args) {
        Vehicle.Car subaru = new Vehicle.Car();
        subaru.setBrand("subaru");
        subaru.setType("car");

        /*
        SubClass (child) - Car
        SuperClass (parent) - Vehicle.
        Cada objeto de uma subclasse também é um objeto da superclasse
        dessa classe. Entretanto, um objeto de superclasse não é um
        objeto de subclassesde sua classe.
         */
    }
}
