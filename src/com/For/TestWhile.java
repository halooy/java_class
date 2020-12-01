package com.For;

public class TestWhile {
    public static void main(String[] args){
//        int i = 0;
//        do
//        {
//            System.out.print(i+"\t");
//            i++;
//        }while(i <= 9);

//        for(int i = 10; i > 0; i--){
//            System.out.print(i+"\t");
//            if(i == 7){
//                continue;
//            }
//            System.out.println("game over");
//        }

        for(int i = 3; i > 0; i--){
            for(int j = 2; j > 0; j--){
                if(j == 1){
                    break;
                }else{
                    System.out.print("i="+i+"j="+j+"\t");
                }
            }
            System.out.println();
        }


    }
}
