package com.whyelab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindText {
    public static void main(String[] args) {
        File file = new File("./ba/lines.txt");

        try {
            Scanner scanner = new Scanner(file);

            //now read the file line by line...
            int lineNum = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineNum++;
                if(line.indexOf("second line") != -1) {
                    System.out.println("ho hum, i found it on line " +lineNum);
                }
            }
        } catch(FileNotFoundException e) {
            //handle this
        }
    }
}
