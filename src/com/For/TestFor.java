package com.For;

public class TestFor {
    public static void main(String[] args){
//        long sum = 0;
//        long num = 0;
//        for(int i = 0; i <= 100; i += 2){
//            sum += i;
//        }
//        System.out.println(sum);
//        for(int i = 1; i < 100; i += 2){
//            num += i;
//        }
//        System.out.println(num);

//        double pai = 0;
//        for(int i = 1; i <= 1000; i++){
//            if(i % 2 != 0){
//                pai += 1/(double)(2*i - 1);
//            }else {
//                pai -= 1/(double)(2*i - 1);
//            }
//        }
//        System.out.println(pai);

        /*
        九九乘法表
         */
        for(int i = 1; i < 10; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+"*"+i+"="+(j*i)+"\t");
            }
            System.out.println();
        }
    }
}
