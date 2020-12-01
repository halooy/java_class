package com.System;

import java.io.IOException;

public class Read {
    public static void main(String[] args)throws java.io.IOException{
//        char c;
//        System.out.println("Please input char:");
//        c = (char)System.in.read();
//        System.out.println("Receive char="+c);
        int i = 0;
        while(true){
            try {
                i = System.in.read();
            }catch (IOException e){

            }
            System.out.println(i);
        }
    }
}
