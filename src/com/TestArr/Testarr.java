package com.TestArr;

public class Testarr {
    public static void main(String[] args){
        int [][] a = {{1,2,3},{4,5},{1},{1,2,3,4,5,6}};
        int n = a.length;
        System.out.println(n);
        System.out.println(a[1].length);
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
