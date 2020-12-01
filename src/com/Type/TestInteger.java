package com.Type;

public class TestInteger {
    public static void main(String[] args){
        byte a = 25;
        System.out.println("Byte类型类型最大值:"+Byte.MAX_VALUE);
        System.out.println("Byte类型类型最小值:"+Byte.MIN_VALUE);
        System.out.println("Byte类型的数据位数:"+Byte.SIZE);
        int b = 12334;
        short c = 12345;
        long d = 1234567890987654321L;
        System.out.println("int类型类型最大值:"+Integer.MAX_VALUE);
        System.out.println("int类型类型最小值:"+Integer.MIN_VALUE);
        System.out.println("short类型类型最大值:"+Short.MAX_VALUE);
        System.out.println("short类型类型最小值:"+Short.MIN_VALUE);
        System.out.println("long类型类型最大值:"+Long.MAX_VALUE);
        System.out.println("long类型类型最小值:"+Long.MIN_VALUE);
        int a1 = 12;
        int a2 = 012;           //前面加上前缀0表示八进制
        int a3 = 0x12;          //前面加前缀0x表示十六进制
        System.out.println("a1="+a1);
        System.out.println("a2="+a2);
        System.out.println("a3="+a3);
    }
}
