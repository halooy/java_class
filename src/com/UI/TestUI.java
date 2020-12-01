package com.UI;
import javax.swing.JOptionPane;
public class TestUI {
    public static void main(String[] args){
        int a,b;
        String str1 = JOptionPane.showInputDialog("请输入a的值","0");
        a = Integer.parseInt(str1);
        String str3 = JOptionPane.showInputDialog("请输入运算符","0");
        String str2 = JOptionPane.showInputDialog("请输入b的值","0");
        b = Integer.parseInt(str2);
        int c = a+b;
        if(str3.equals("+")){
            c = a + b;
        }
        if(str3.equals("-")){
            c = a - b;
        }
        if(str3.equals("*")){
            c = a * b;
        }
        if(str3.equals("/")){
            c = a / b;
        }
//        switch (str3){
//            case "+" : c = a + b;
//            break;
//            case "-" : c = a - b;
//                break;
//            case "*" : c = a * b;
//                break;
//            case "/" : c = a / b;
//                break;
//            default:
//        }
        if(str3.contains("/")){
            if(b != 0){
                c = a / b;
            }else{
                c = 0;
            }
        }
//        String str1 = JOptionPane.showInputDialog("输入消息框","0");
//        int n = JOptionPane.showConfirmDialog(null,"请选择："+JOptionPane.YES_NO_CANCEL_OPTION);
        JOptionPane.showMessageDialog(null,c);
    }
}
