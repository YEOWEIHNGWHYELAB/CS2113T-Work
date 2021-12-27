package com.whyelab;

import java.io.File;

public class CheckEmptyFile {
    public static void main(String[] args) {

        File file = new File("./ba/nothing.txt");
        if (file.length() == 0)
            System.out.println("File is empty!!!");
        else
            System.out.println("File is not empty!!!");

    }
}
