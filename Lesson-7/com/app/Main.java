package com.app;

public class Main {
    public static void main(String[] args) {

        int i = 0;

        while (i <= 10) {
            System.out.print("Element is: " + i);
        }

        for (byte j = 1; j <= 10; j++) {
            if(i == 8) break;

            if (i % 2 == 0) continue;

            System.out.print(j);
        }
    }
}