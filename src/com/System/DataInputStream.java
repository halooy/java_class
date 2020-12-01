package com.System;

import java.io.InputStream;
import java.io.*;

public class DataInputStream {
    public DataInputStream(InputStream in) {
    }

    public static void main(String[] args){
        double x = 0,y = 0;
        DataInputStream din = new DataInputStream(System.in);
        System.out.println("输入x和y的数值：");
        try{
//            x = Double.parseDouble(din.readLine());
//
//            y = Double.parseDouble(din.readLine());
            System.out.println("x的数值："+x+";y的数值："+y);
        }catch(Exception e){
            System.out.println("Wrong!!!");
        }
    }
}
