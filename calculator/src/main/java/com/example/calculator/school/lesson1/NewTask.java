package com.example.calculator.school.lesson1;

import java.util.Arrays;

public class NewTask {

    public static void printPositive() {
        int c = 120;
        if (c >= 0) System.out.println("положительное");
        else System.out.println("отрицательное");
    }

    public static void printSum() {
        int a = 12;
        int b = 17;
        if (a + b >= 10 && a + b <= 20) System.out.println("true");
        else System.out.println("false");
    }

    public static void returnFalse() {
        int d = -19;
        if (d >= 0) System.out.println("false");
        else System.out.println("true");
    }
//
    public static void printString() {
        String str = "специальное условие для своего завершения";
        for (int s = 0; s < 3; s++) System.out.println(str);
    }
//високосный год
    public static void isLeapYear() {
        int year = 2026;
        if ((year % 4 == 0) || ((year % 100 != 0) && (year % 400 == 0))) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    public static void printArray() {
        int[] nums = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        }

        }

    public static void printHundred() {
        int[] hundred = new int[100];
        for (int i = 0; i < hundred.length; i++) {
            hundred[i] = i + 1;
            System.out.println(Arrays.toString(hundred));
        }
    }
    public static void printMultiply() {
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6){
                numbers[i] = numbers[i] * 2;
            }
            System.out.println(Arrays.toString(numbers));
        }
    }
    public static void printSquare(){
        int[][] square = new int[5][5];
        for (int i = 0; i < square.length; i++) {
            square[i][i] = 1;
        }
        System.out.println("Массив с единицами по диагонали:");
        for (int[] row : square) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        }

        public static void createArray() {
            int len = 2;
            int initialValue = 7;
            int[] myArr = new int[len];
            for (int i = 0; i < myArr.length; i++){
                myArr[i] = initialValue;
            }
            System.out.println(Arrays.toString(myArr));
        }


    }

