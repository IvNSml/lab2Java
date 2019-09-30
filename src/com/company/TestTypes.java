package com.company;

class TestTypes {
    static int testByte(byte a, byte b){
        return 5+a+b;
    }
    static int testInt(int a, int b){
        return a*a+b*b;
    }
    static double testDouble(double a, double b){
        return (int)a-b;
    }
    static char testChar(){
        return'\u03A9';
    }
}
