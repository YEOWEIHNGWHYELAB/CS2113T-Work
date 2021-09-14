package com.whyelab;

public class Main {

    public static void printTotalScore(String[] values){
        // TODO: add your code here
        int total = 0;

        if (values.length == 0) {
            System.out.println(total);
            return;
        }

        for (int i = 0; i < values.length; i = i + 1) {
            total += Integer.parseInt(values[i]);
        }

        System.out.println(total);
    }

    public static void main(String[] args) {
        printTotalScore(new String[]{});
        printTotalScore(new String[]{"0", "124", "-15"});
    }
}
