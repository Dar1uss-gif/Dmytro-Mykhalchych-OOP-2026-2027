package com.app;

class Main {

    public Main() {}

    public static void main(String[] args) {
        Car bmw = new Car(200.5f, 2000, "Black");

        Truck truck = new Truck(130f, 5000, "White", true);
        truck.getLoaded();
        truck.setLoaded(false);
        truck.getLoaded();
    }

}