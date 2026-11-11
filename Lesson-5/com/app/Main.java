package com.app;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1 num: ");
        int num1 = scan.nextInt();
        
        System.out.print("Enter 2 num: ");
        int num2 = scan.nextInt();

        System.out.print("Res 1: " + (num1 + num2));
        System.out.print("Res 2: " + (num1 - num2));
        System.out.print("Res 3: " + (num1 * num2));
        System.out.print("Res 4: " + (num1 / num2));
        System.out.print("Res 5: " + (num1 % num2));
    }
    
}