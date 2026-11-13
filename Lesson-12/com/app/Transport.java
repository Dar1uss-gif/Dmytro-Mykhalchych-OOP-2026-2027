package com.app;

public class Transport {
    public float speed;
    public int weight;
    public String color;
    public byte[] coordinates;

    public void setValues(float _speed, int _weight, String _color, byte[] _coordinates) {
        speed = _speed;
        weight = _weight;
        color = _color;
        coordinates = _coordinates;
    }

    public void getValues() {
        String info = "Speed: " + speed + "\nWeight: " + weight + "\Color: " + color;
        String infoCoordinates = "Coordinates: \n";

        for (byte el : coordinates) {
            infoCoordinates += el + '\n';

        return info + infoCoordinates;
        }
    }
}