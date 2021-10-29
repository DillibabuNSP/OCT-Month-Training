package com.java.ProgramLineGenerator;


public class RandomLineGenerator {
    private static final long MEGABYTE = 1024L * 1024L;

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }

    public static void main(String [] args){

        sentenceCreator.sentenceGenerator();


        Runtime runtime = Runtime.getRuntime();

        runtime.gc();
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory is bytes: " + memory +"B");
        System.out.println("Used memory is megabytes: "
                + bytesToMegabytes(memory) +"MB");


    }

}