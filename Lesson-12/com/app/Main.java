package com.app;

public class Main {
    public static void main(String[] args) {
        Transport bmw = new Transport();
        bmw.speed = 130f;
        bmw.weight = 1300;
        bmw.color = "Black";
        bmw.coordinates = new byte[] {0, 0, 0, 0};

        System.out.print(bmw.getValues());
    }
}