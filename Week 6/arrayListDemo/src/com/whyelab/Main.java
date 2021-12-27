package com.whyelab;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        ArrayList<String> items = new ArrayList<>(); // Type String.

        System.out.println("Before adding any items:" + items);

        items.add("Apple");
        items.add("Box");
        items.add("Cup");
        items.add("Dart");
        print("After adding four items: " + items);

        items.remove("Box"); // remove item "Box"
        print("After removing Box: " + items);

        items.add(1, "Banana"); // add "Banana" at index 1
        print("After adding Banana: " + items);

        items.add("Egg"); // add "Egg", will be added to the end
        items.add("Cup"); // add another "Cup"
        print("After adding Egg: " + items);

        print("Number of items: " + items.size());

        print("Index of Cup: " + items.indexOf("Cup"));
        print("Index of Zebra: " + items.indexOf("Zebra"));

        print("Item at index 3 is: " + items.get(2));

        print("Do we have a Box?: " + items.contains("Box"));
        print("Do we have an Apple?: " + items.contains("Apple"));

        items.clear(); // Erase all.
        print("After clearing: " + items);
    }

    private static void print(String text) {
        System.out.println(text);
    }
}
