package com.Class;

public class TestExtends {

    public static void main(String[] args){
        father f1 = new father();
        child c1 = new child();
        c1.printInfo();
    }

}
class father{
    String name;
    int money;
    father(){
        money = 1000;
    }
    father(String name, int money){
        this.name = name;
        this.money = money;
    }
    void printInfo(){
        System.out.println("I am"+name+"I have "+money+"$");
    }
}
class child extends father{
    String School;
    child(){

    }
}
