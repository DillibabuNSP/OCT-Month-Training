package com.java.Practice;
import java.util.Random;
import java.util.Scanner;

    public class findNumber {
        public static void main(String [] args){
            Scanner S = new Scanner(System.in);
            System.out.println("Guess the number between 1 to 100 = ");
            int value =S.nextInt();
            System.out.println(new StringBuilder().append("The entered value is ").append(value).append(" The Random Value is ").append(randomNumber(2)).toString());

        }

        private static char[] randomNumber(int length)
        {

            String Numbers = "1234567890";
            String RanNumber = Numbers;
            Random random = new Random();
            char[] number = new char[2];
            number[0] = Numbers.charAt(random.nextInt(Numbers.length()));

            for(int i = 1; i< length; i++) {
                number[i] = RanNumber.charAt(random.nextInt(RanNumber.length()));
            }return number;
        }
    }

