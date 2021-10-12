package com.java.Practice;
import java.util.Scanner;

public class guessNumber {

public static void guessingNumber()
    {
         Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());
                int K = 5;
                int i, guess;
        for (i = 0; i < K; i++) {
            System.out.println("Guess the number:");
            guess = sc.nextInt();
            if (number == guess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
            }
            else if (number > guess && i != K - 1) {
                System.out.println("The number is " + "greater than " + guess);
            }
            else if (number < guess && i != K - 1) {
                System.out.println("The number is" + " less than " + guess);
            }
        }
        if (i == K) {
            System.out.println("You have exhausted" + " K trials.");
            System.out.println("The number was " + number);
        }
    }
    public static void main(String arg[])
    {
        guessingNumber();
    }
}

