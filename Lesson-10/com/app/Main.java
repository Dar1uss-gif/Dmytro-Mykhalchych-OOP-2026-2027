package com.app;

public class Main {
    public static void main(String[] args) {
        info("Hello");
        info("world");
        info("!");

    }

public static void sum(int a, int b) {
    info(String.valueOf(a+b));
}

 public static void info(String word) {
    System.out.println(word);
    System.out.println('!');
 }
}