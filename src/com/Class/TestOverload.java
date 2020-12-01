package com.Class;

public class TestOverload {
    public static void main(String[] args){
        Hello h = new Hello();
        h.hello();
        h.hello("jack");
        h.hello("Alan","Lisa");
    }
}
class Hello{
    void hello(){
        System.out.println("hello!");
    }
    void hello(String name){
        System.out.println(name+"hello!");
    }
    void hello(String name1,String name2){
        System.out.println(name1+"sir"+name2+"hello!");
    }
}
