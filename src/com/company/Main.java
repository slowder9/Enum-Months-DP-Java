package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Ask user to choose a month (show month in englishName format)
        System.out.println("Choose a month");

        // Set up a scanner object to read the input from the terminal
        Scanner in = new Scanner(System.in);

        ArrayList<Month> monthCollection = new ArrayList<>();
        String userPick = in.nextLine();

        Month userPickPartDeux = Month.search(userPick);

//        monthCollection.add(userPickPartDeux);

        for (Month m : Month.values()) {
            if (userPickPartDeux.getMonthNumber() <= m.getMonthNumber()) {
                monthCollection.add(m);
            }
        }

        System.out.println(monthCollection);

        // decide which month the user put in
        // add that month and all months after to monthCollection
        // then print out monthCollection
    }
}
