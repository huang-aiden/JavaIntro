package com.ax2d;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyBoardScanner = new Scanner(System.in);
        System.out.print("How high can you do math? ");
        int max = keyBoardScanner.nextInt();
        long startTime = getSeconds();
        long numCorrect = 0;
        int ans;
        while(true) {
            int x = getRandomNumber(max);
            int y = getRandomNumber(max);
            System.out.printf("What does %d * %d =?", x, y);
            ans = keyBoardScanner.nextInt();
            if(ans == (x*y)) numCorrect++;
            if(getSeconds() >= 10000)break;


        }
        System.out.printf("You answered %d correct!\n", numCorrect);

//        System.out.print("WTF is your age, bruh? ");
//        int age = keyBoardScanner.nextInt();
//
//        printRhombus(age);
//        System.out.println("Your age in the next decade will be: " + (age + 10));

//        while(true) {
//            try {
//                Thread.sleep(1000);
//                System.out.println((int) getSeconds()/1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        String input;
//        while(true) {
//            input = keyBoardScanner.nextLine();
//            if(input.equals("x")) break;
//            System.out.printf("One year has passed, your age is now %d\n", ++age);
//        }
    }

    public static void printRhombus(int age){
        System.out.println("      *      ");
        System.out.println("    *    *    ");
        System.out.println("  *        * ");
        System.out.println("*     " + age + "      *");
        System.out.println("  *         * ");
        System.out.println("    *    *    ");
        System.out.println("       *     ");
    }

    static long startTime = new Date().getTime();
    public static long getSeconds(){
        return new Date().getTime() - startTime;
    }

    public static int getRandomNumber(int max){
        Random rand = new Random();
        return rand.nextInt(max);
    }
}
