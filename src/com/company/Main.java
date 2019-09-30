package com.company;

public class Main {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 15;
        System.out.println(TestTypes.testByte(a, b));
        int c = 5;
        int d = 6;
        System.out.println(TestTypes.testInt(c, d));
        System.out.println(TestTypes.testDouble(c,d));
        System.out.println(TestTypes.testChar());
    }
}