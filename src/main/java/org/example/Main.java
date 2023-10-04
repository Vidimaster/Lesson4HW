package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

   Calculator calculator = new Calculator();
        System.out.println(calculator.sum(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6))));
        System.out.println(calculator.mul(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6))));
        System.out.println(calculator.div(new ArrayList<>(Arrays.asList(1, 2, 2))));
        System.out.println(calculator.bin(new ArrayList<>(Arrays.asList(1.0, "2", "2", 5, 6.95, "430.0854f", "123", "f", "dssd.dsd", 1.65f, 6.75))));
    }
}