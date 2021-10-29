package com.java.Training;

import java.io.*;

public class Equals1{
    public static void main(String[] args) throws IOException {

        File firstFile = new File("C:\\Users\\NSP\\Desktop\\Creational.txt");
        File secondFile = new File("C:\\Users\\NSP\\Desktop\\pattern.txt");

        boolean equal = Equals2.isEqual(firstFile.toPath(), secondFile.toPath());
        if (equal) {
            System.out.println("Files are equal.");
        }
        else {
            System.out.println("Files are not equal.");
        }

        File F1=new File("C:\\Users\\NSP\\Desktop\\Creational.txt");
        String[] words=null;
        int wc=0;
        FileReader fr = new FileReader(F1);
        BufferedReader br = new BufferedReader(fr);
        String s;
        while((s=br.readLine())!=null)
        {
            words=s.split(" ");
            wc=wc+words.length;
        }

        File f2=new File("C:\\Users\\NSP\\Desktop\\pattern.txt");
        String[] word=null;
        int wc1=0;
        FileReader fr1 = new FileReader(f2);
        BufferedReader br1 = new BufferedReader(fr1);
        String s1;
        while((s1=br1.readLine())!=null)
        {
            word=s1.split(" ");
            wc1=wc1+word.length;
        }

        PrintStream console = System.out;
        PrintStream fileOut = new PrintStream("F:\\Fox\\Training\\Equals1 Output.txt");
        File f = new File("C:\\Users\\NSP\\Desktop\\Creational.txt");
        File f1 = new File("C:\\Users\\NSP\\Desktop\\pattern.txt");
        String Name =f.getName();
        String Name1 =f1.getName();
        System.setOut(fileOut);
        System.out.println("Number of words in the " +Name+" : " +wc);
        System.out.println("Number of words in the" +Name1+" : " +wc1);
        System.out.println("Program terminated");

        System.setOut(console);
        System.out.println("Number of words in the file:" +wc);
        System.out.println("Number of words in the " +Name+" : " +wc1);
        System.out.println("Program terminated");
        fr.close();
    }
}