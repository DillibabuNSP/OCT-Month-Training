package com.java.Training;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class randomCharacter extends sentenceCreator{

    static String getAlphaNumericString(int n)
    {


        int lowerLimit = 65;

        int upperLimit = 122;

        Random random = new Random();


        StringBuilder r = new StringBuilder(n);

        for (int i = 0; i < n; i++) {


            int nextRandomChar = lowerLimit + (int)(random.nextFloat() * (upperLimit - lowerLimit + 1));

            r.append((char)nextRandomChar);
        }

        return r.toString();
    }

    public static List splitString(String msg, int lineSize) {
        List res = new ArrayList<>();

        Pattern p = Pattern.compile("\\b.{1," + (lineSize-1) + "}\\b\\W?");
        Matcher m = p.matcher(msg);

        while(m.find()) {
            System.out.println(m.group().trim());
            res.add(m.group());
        }
        return res;
    }

}