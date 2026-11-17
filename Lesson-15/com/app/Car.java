package com.app;

public class Car extends Transport {
	public Car(float _speed, int _weight, String _color, byte[] coordinates) {
        setValues(_speed, _weight, _color, coordinates);
        System.out.println(getValues());
    }

    @Override 
    public void moveObject() {
        System.out.println("Car is moving.");
    }

    @Override 
    public void stopObject() {
        System.out.println("Car has stopped.");
    }
}
