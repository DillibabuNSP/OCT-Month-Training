package com.java.Training;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import static com.java.Training.randomCharacter.getAlphaNumericString;
import static com.java.Training.randomCharacter.splitString;

public class sentenceCreator extends RandomLineGenerator {

    public static int n=500;

    public static void sentenceGenerator(){
    Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
    int number = reader.nextInt();

        if(number >1 && number <230) {

        PrintStream console = System.out;
        PrintStream fileOut = null;
        try {
            fileOut = new PrintStream("F:\\Fox\\Training\\Random String Line.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

            System.setOut(fileOut);
        System.out.println(splitString(getAlphaNumericString(n),100));
        System.setOut(console);
        System.out.println(splitString(getAlphaNumericString(n),100));

        }

        else{
            System.out.println("enter a number between 1 and 230");
        }

    }
}