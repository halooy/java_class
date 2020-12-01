package com.For;

import java.util.Scanner;

public class TestA02 {
    public static void main(String[] args){
//        int a = 1, b = 1, c = 0;
//        for(int i = 2;i < 12;i++) {
//            c = a + b;
//            System.out.println("a=" + a + "b=" + b + "c=" + c);
//            a = b;
//            b = c;
//        }
            Scanner scanner = new Scanner(System.in);
        System.out.println("请输入:");
            int n = scanner.nextInt();
            TestA02 st = new TestA02();
            st.Fribonacci(n);
    }

    public static int Fribonacci(int n){
        if(n <= 2)
            return 1;
            else
                return Fribonacci(n - 1)+Fribonacci(n-2);
    }
}
