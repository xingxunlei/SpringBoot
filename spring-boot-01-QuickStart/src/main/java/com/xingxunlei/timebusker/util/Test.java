package com.xingxunlei.timebusker.util;

public class Test {
    public static void main(String[] args) {
        System.out.println(2.00 - 1.10);

        for (int i = -10; i < 10; i++) {
            System.out.println("i:" + i + ", " + isOdd(i));
        }

    }

//    private static boolean isOdd(int i) {
////        return i%2 == 1;
////        return i%2 == 0;
//        return (i & 1) != 0 ;
//    }

    private static boolean isOdd(int i) {
        return !isEven(i);
    }

    private static boolean isEven(int i) {
        if(i == 0) {
            return true;
        }
        if(i < 0) {
            return isOdd(i + 1);
        }
        return isOdd(i - 1);
    }
}
