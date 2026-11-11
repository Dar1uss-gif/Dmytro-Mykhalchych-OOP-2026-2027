package com.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = scan.nextInt();

        System.out.print("Enter number 2: ");
        int b = scan.nextInt();

        System.out.print("Enter math sym: ");
        char math = scan.nextLine().charAt(0);
        
    }
}