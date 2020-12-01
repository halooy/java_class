package com.Class;

public class TestOverride {
    public static void main(String[] args){
        c c1 = new c();
        c1.speak();
        c1.cry();
    }
}
class f{
    int m;
    f(){
        m = 100;
    }
    void speak(){
        System.out.println("I love NBA"+m);
    }
}
class c extends  f{
    int n;
    int m;
    c(){
        m = 200;
    }
    void speak(){
        System.out.println("I love CBA"+m);
    }
    void cry(){
        super.speak();
        System.out.println(super.m);
    }
}