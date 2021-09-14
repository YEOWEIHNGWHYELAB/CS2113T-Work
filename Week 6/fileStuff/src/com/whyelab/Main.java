package com.whyelab;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static void writeToFile(String filePath, String textToAdd) throws IOException {
        FileWriter fw = new FileWriter(filePath);
        fw.write(textToAdd);
        fw.close();
    }


    public static void main(String[] args) throws IOException {
        String main = "abvc";
        System.out.println(main.substring(0,1));

        File f = new File("data/fruits.txt");
        if (f.exists() == false) {
            f.createNewFile();
        }
        System.out.println("full path: " + f.getAbsolutePath());
        System.out.println("file exists?: " + f.exists());
        System.out.println("is Directory?: " + f.isDirectory());

        Scanner s = new Scanner(f); // create a Scanner using the File as the source
        while (s.hasNext()) {
            System.out.println(s.nextLine());
        }

        File directory = new File("./boobs");
        if (! directory.exists()){
            directory.mkdir();
            // If you require it to make the entire directory path including parents,
            // use directory.mkdirs(); here instead.
        }

        String file2 = "boobs/lines.txt";
        try {
            writeToFile(file2, "first line" + System.lineSeparator() + "second line");
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }

        try {
            String filename = "boobs/lines.txt";
            FileWriter fw = new FileWriter(filename, true); //the true will append the new data
            fw.write("\nadd a line");//appends the string to the file
            fw.close();
        }

        catch(IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }

    }

}
