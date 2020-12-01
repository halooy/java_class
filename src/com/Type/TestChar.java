package com.Type;

public class TestChar {
    public static void main(String[] args){
//        char a1 = 'a';
//        char a2 = '冲';
//        System.out.println(a1);
//        System.out.println(a2);
        char a1 = 'I';
        char a2 = 'L';
        char a3 = 'O';
        char a4 = 'V';
        char a5 = 'E';
        char a6 = 'U';
        System.out.print(a1);
        System.out.print(a2);
        System.out.print(a3);
        System.out.print(a4);
        System.out.print(a5);
        System.out.print(a6);
        a1 =(char)(a1+1);
        a2 =(char)(a2+1);
        a3 =(char)(a3+1);
        a4 =(char)(a4+1);
        a5 =(char)(a5+1);
        a6 =(char)(a6+1);
        System.out.println();
        System.out.print(a1);
        System.out.print(a2);
        System.out.print(a3);
        System.out.print(a4);
        System.out.print(a5);
        System.out.print(a6);           //移位加密
        System.out.println("\"输出带有双引号\"");
        char b = '\u0061';
        System.out.println(b);
    }
}
