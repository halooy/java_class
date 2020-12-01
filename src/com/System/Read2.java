package com.System;

import java.io.IOException;

public class Read2 {
    public static void main(String[] args)throws java.io.IOException {
        while (true) {
            byte[] b = new byte[5];
            int len = System.in.read(b);
            System.out.println("读取字节数：" + len);
            for (int i = 0; i < len; i++) {
                System.out.println(b[i] + "\t");
            }
        }
    }
}
