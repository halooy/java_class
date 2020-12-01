package com.Class;

public class TestAbstract {
    public static void main(String[] args){
        b b1 = new b();
        b1.m1();
        b1.m2();
    }
}
abstract class a{
    void m1(){
        System.out.println("m1 method in class a is running");
    }
    abstract void m2();
}
class b extends a{
    void m2(){
        System.out.println("m2 method in class b is running");
    }
}
