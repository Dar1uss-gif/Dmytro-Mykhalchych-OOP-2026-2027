package com.app;

public class Truck extends Transport {

    private boolean isLoaded;

    public void setValues(float speed, int weight, String color, byte[] coordinates, boolean isLoaded) {
        super.speed = speed;
        super.weight = weight;
        super.color = color;
        super.coordinates = coordinates;
        this.isLoaded = isLoaded;
    }

    @Override
    public String getValues() {
        String info = "Object speed: " + speed + ". Weight: " + weight + ". Color: " + color + "\n";

        if(coordinates.length > 0) {
            String infoCoordinates = "Coordinates:\n";
            for (byte el : coordinates)
                infoCoordinates += el + "\n";
            info += infoCoordinates;
        }
        return info;
    }

    public Truck(float speed, int weight, String color, boolean isLoaded) {
        super(speed, weight, color);
        this.isLoaded = isLoaded;
        System.out.println(super.getValues());
    }

    public void setLoaded(boolean isLoaded) { this.isLoaded = isLoaded; }

    public void getLoaded() {
        if(isLoaded)
            System.out.println("Truck is loaded");
        else
            System.out.println("Truck is NOT loaded");
    }

}