package com.For;

public class TestA01 {
    public static void main(String[] args){
        /**
        一百元买一百只鸡
        公鸡5元一只
        母鸡3元一只
        小鸡一元三只
         */
        //穷举算法
        int i, j, k;
        for(i = 0; i<= 100; i++){
            for(j = 0; j<= 100; j++){
                for(k = 0; k<= 100; k++){
                    int num = i + j + k;
                    int money = 5 * i + 3 * j + k / 3;
                    if(num == 100 && money == 100 && k%3==0){
                        System.out.println("公鸡："+i+"母鸡："+j+"小鸡："+k);
                    }
                }
            }
        }

//        int i, j;
//        for(i = 0; i <= 12; i++){
//            for(j = 0; j<= 12; j++){
//                int head = i + j;
//                int leg = i * 2 + j * 4;
//                if(head == 12 && leg == 26){
//                    System.out.println("鸡："+i+"兔:"+j);
//                }
//            }
//        }

//        int i, j;
//        for(i = 0 ,j = 12 - i; i <= 12; i++){
//                int head = i + j;
//                int leg = i * 2 + j * 4;
//                if(head == 12 && leg == 26){
//                    System.out.println("鸡："+i+"兔:"+j);
//                }
//        }

    }
}
