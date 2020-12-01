package com.Thread;

class SumThread extends Thread
{
    int from, to;
    long sum;
    SumThread(int from, int to)
    {
        this.from=from;
        this.to=to;
    }
    long getSum()
    {
        return sum;
    }
    public void run()
    {
        for(int i=from;i<=to;i++)
            sum+=i;
    }
}

public class Thread01
{
    public static void main(String[] args)
    {
        SumThread st1=new SumThread(1, 100);
        SumThread st2=new SumThread(101, 200);
        SumThread st3=new SumThread(201, 300);
        SumThread st4=new SumThread(301, 400);
        SumThread st5=new SumThread(401, 500);
        SumThread st6=new SumThread(501, 600);
        SumThread st7=new SumThread(601, 700);
        SumThread st8=new SumThread(701, 800);
        SumThread st9=new SumThread(801, 900);
        SumThread st10=new SumThread(901, 1000);
        st1.start();
        st2.start();
        st3.start();
        st4.start();
        st5.start();
        st6.start();
        st7.start();
        st8.start();
        st9.start();
        st10.start();
        long t1 = System.currentTimeMillis();
        while (st1.isAlive() | st2.isAlive() | st3.isAlive() | st4.isAlive() | st5.isAlive()
                | st6.isAlive() | st7.isAlive() | st8.isAlive() | st9.isAlive() | st10.isAlive())
        {
            try{
                Thread.sleep(1);
            }catch (InterruptedException e){
                System.out.println();
            }
        }
        long result=st1.getSum()+st2.getSum()+st3.getSum()+st4.getSum()+st5.getSum()
                +st6.getSum() +st7.getSum()+st8.getSum()+st9.getSum()+st10.getSum();
        long t2 = System.currentTimeMillis();
        System.out.println("put"+result);
        System.out.println("多线程程序执行总共花费了："+(t2-t1));

        int result1 = 0;
        t1 = System.currentTimeMillis();
        for(int i=1; i<=1000; i++){
            result += i;
            try{
                Thread.sleep(1);
            }catch(InterruptedException e){

            }
        }
        t2 = System.currentTimeMillis();
        System.out.println("循环程序执行总共花费了："+(t2-t1));
    }
}
