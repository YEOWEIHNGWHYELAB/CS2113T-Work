package com.whyelab;

public class Main {

    public static void main(String[] args) {

        String str = "GeeksforGeeks:A Computer Science Portal";
        String[] arrOfStr = str.split(":");

        for (String a : arrOfStr)
            System.out.println(a);
        String userInputString = "deadline /by ";
        String taskName = userInputString.substring(9).split("/")[0];
        String by = userInputString.substring(9).split("/")[1];
        System.out.println(taskName);
        System.out.println(by);
        if (taskName == "") {
            System.out.println(by);
        }
    }
}
