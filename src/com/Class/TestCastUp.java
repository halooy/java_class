package com.Class;

/**
 * 接口允许之间继承
 * 允许多个继承
 * 用，间隔开来
 *
 * 继承和接口可以并存
 * 先继承extends，后实现implements
 *
 * 作业：
 * 接口可以继承
 * 实现多个接口
 * 接口和继承混合使用
 */
public class TestCastUp {
    public static void main(String[] args){
        USB mouse = new Mouse();
        USB mic = new Mic();
        Computer computer = new Computer();
        computer.addUSB(mouse);
        computer.addUSB(mic);
        computer.TurnOn();
        computer.TurnOff();
    }
}


interface USB{
    void turnon();
    void turnoff();
}
class Mouse implements USB{
    public void turnon(){
        System.out.println("mouse is on");
    }
    public void turnoff(){
        System.out.println("mouse is off");
    }
}
class Mic implements USB{
    public void turnon(){
        System.out.println("mic is on");
    }
    public void turnoff(){
        System.out.println("mic is off");
    }
}
class Computer{
    USB[] USBDEV = new USB[4];
    void addUSB(USB u){
        for(int i = 0; i < USBDEV.length; i++){
            if(USBDEV[i] == null){
                USBDEV[i] = u;
                break;
            }
        }
    }
    void TurnOn(){
        System.out.println("computer is oning");
        for(int i = 0; i < USBDEV.length; i++){
            if(USBDEV[i] != null){
                USBDEV[i].turnon();
            }
        }
        System.out.println("all dev in computer is on");
    }
    void TurnOff(){
        System.out.println("computer is offing");
        for(int i = 0; i < USBDEV.length; i++){
            if(USBDEV[i] != null){
                USBDEV[i].turnoff();
            }
        }
        System.out.println("all dev in computer is off");
    }
}
