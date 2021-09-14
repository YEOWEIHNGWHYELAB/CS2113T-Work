package com.whyelab;

public class Main {

    public static void printPrice(String item) {
        // TODO: add your code here

        int dividerPosition = item.indexOf("--");
        String itemName = item.substring(0, dividerPosition);
        String cost = item.substring(dividerPosition + 3);
        cost = cost.replace("/", ".");
        System.out.println(itemName.trim().toUpperCase() + ": " + cost);

    }

    public static void main(String[] args) {
        printPrice("sandwich  --$4/50");
        printPrice("  soda --$10/00");
        printPrice("  fries --$0/50");
    }
}
