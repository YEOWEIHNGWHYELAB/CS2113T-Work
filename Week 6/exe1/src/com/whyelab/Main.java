package com.whyelab;

import java.util.ArrayList;

public class Main {

    //TODO: add your methods here
    private static ArrayList<Integer> numbers = new ArrayList<>();

    private static void addNumber(int i) {
        numbers.add(Integer.valueOf(i));
        System.out.println(numbers);
    }

    private static int getTotal () {
        int sizeOfArray = numbers.size();
        int totalSum = 0;

        for (int i = 0; i < sizeOfArray; i += 1) {
            totalSum += numbers.get(i);
        }

        return totalSum;
    }

    private static boolean isFound(int numberToFind) {
        if (numbers.indexOf(numberToFind) == -1) {
            return false;
        } else {
            return true;
        }
    }

    private static void removeNumber(int numberToRemove) {
        int indexOfNumberToRemove = numbers.indexOf(numberToRemove);

        if (indexOfNumberToRemove != -1) {
            numbers.remove(indexOfNumberToRemove);
            System.out.println(numbers);
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        System.out.println("Adding numbers to the list");
        addNumber(3);
        addNumber(8);
        addNumber(24);
        System.out.println("The total is: " + getTotal());
        System.out.println("8 in the list : " + isFound(8) );
        System.out.println("5 in the list : " + isFound(5) );
        removeNumber(8);
        System.out.println("The total is: " + getTotal());
    }

}
