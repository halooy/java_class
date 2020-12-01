package com.Class;

/**
 * 这是使用内部类实现的多媒体教室上下课管理模拟程序
 * 多媒体教室暂定只有灯光和风扇
 * 抽象出了一个设备接口，教室里面最多可以管理20个设备
 * 教室-->设备-->灯光风扇
 *  整体结构与前面抽象类、接口的案例类似
 *
 *  room r=new room();
 * 		room.DEVICE light=r.new Light();
 * 		room.DEVICE fan =r.new Fan();
 * 	先创建外部类对象，外部类对象再创建其内部类成员，再将创建的内部类成员对象作为外部类统一管理的设备
 *
 * 	这个案例将接口、重写、内部类等多个重要的面向对象概念融会贯通，
 * 	非常重要，并模仿这个案例写出更多的类似的技术系统模拟程序
 */
public class TestInnerClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        room r=new room();
        room.DEVICE light=r.new Light();
        room.DEVICE fan =r.new Fan();
        r.add(fan);
        r.add(light);
        r.上课();
        r.下课();
    }
}
class room
{
    DEVICE[] dev=new DEVICE[20];
    void add(DEVICE d)
    {
        for(int i=0;i<dev.length;i++)
        {
            if(dev[i]==null)
            {
                dev[i]=d;
                break;
            }
        }
    }
    void 上课()
    {
        System.out.println("准备上课");
        for(int i=0;i<dev.length;i++)
        {
            if(dev[i]!=null)
            {
                dev[i].turnon();;
            }
        }
    }
    void 下课()
    {
        System.out.println("准备下课");
        for(int i=0;i<dev.length;i++)
        {
            if(dev[i]!=null)
            {
                dev[i].turnoff();
            }
        }
    }

    interface DEVICE
    {
        void turnon();
        void turnoff();
    }
    class Light implements DEVICE
    {
        public void turnon()
        {
            System.out.println("Light is on");
        }
        public void turnoff()
        {
            System.out.println("Light is off");
        }
    }
    class Fan implements DEVICE
    {
        public void turnon()
        {
            System.out.println("Fan is on");
        }
        public void turnoff()
        {
            System.out.println("Fan is off");
        }
    }
}

//考试
//打印多行字符串