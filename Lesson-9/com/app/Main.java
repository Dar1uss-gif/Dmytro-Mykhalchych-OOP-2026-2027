package com.app;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Short> nums = new ArrayList<>();
        nums.add((short)56);
        short num1 = 45;
        nums.add(num1);
        nums.add(1, (short)13);
        nums.remove(1);
        nums.set(0, (short)90);
        Short[] numbers = (Short[])nums.toArray();

        for (short num : nums) System.out.println(num);

        LinkedList<Float> numbers2 = new LinkedList<>();
        numbers2.add(5.5f);
        numbers2.add(15.123f);

        for (float num : nums) System.out.println(num);
    }
}