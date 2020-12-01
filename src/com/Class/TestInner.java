package com.Class;

import javax.print.attribute.standard.MediaSize;

public class TestInner {
    public static void main(String[] args){
        Outer ot = new Outer();
        ot.outerfun();
    }
}
class Outer{
    int i = 100;
    void outerfun(){
        Inner in = new Inner();
        System.out.println("outer function is running"+i);
        in.infun();
    }
    class Inner{
        int j = 50;
        void infun(){
            System.out.println(i+"\t"+j);
        }
    }
}
