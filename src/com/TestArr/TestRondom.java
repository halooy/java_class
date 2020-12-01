package com.TestArr;

public class TestRondom {
    public static void main(String[] args){

        double[] a = new double[100];
        for(int i = 0; i < 100; i++){
            a[i] = Math.random();
//            System.out.println("第"+(i+1)+"个随机数是："+a[i]);
        }
//        System.out.println(Arr2str(a));
        TestRondom st = new TestRondom();
        System.out.println(Arr2str(Arr()));
        st.Arr();
        System.out.println(st.Arr()[0]);
        System.out.println(st.Arr()[st.Arr().length-1]);
    }



    public static int[] Arr(){
        int[] b = new int[100];
        for(int i = 0; i < b.length; i++){
            b[i] = (int)(Math.random()*100);
        }
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b.length-1-i; j++){
                if(b[j+1] < b[j]){
                    int temp = b[j+1];
                    b[j+1] = b[j];
                    b[j] = temp;
                }
            }
        }
        return b;
    }

    public static String Arr2str(int[] a){       //数组转换为字符串输出
        String str = "";
        int flag = 0;
        for(int i = 0; i < a.length; i++){
            str += a[i] + "\t";
            flag++;
            if(flag % 5 == 0){
                str += "\n";
            }
        }
        return str;
    }

}
