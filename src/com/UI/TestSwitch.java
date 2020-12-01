package com.UI;

import javax.swing.*;

public class TestSwitch {
    public static void main(String[] args){
        int n = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("请输入一个月份值:"));
        String str = "";
        str = monthToSeason(n);
        JOptionPane.showMessageDialog(null,str);
    }
    public static String monthToSeason(int n){
        String result = "";
        switch(n){
            case 2:
            case 3:
            case 4:
                result = "春季";
                break;
            case 5:
            case 6:
            case 7:
                result = "夏季";
                break;
            case 8:
            case 9:
            case 10:
                result = "秋季";
                break;
            case 11:
            case 12:
            case 1:
                result = "冬季";
                break;
            default:
                result = "不属于月份值！";
        }
        return result;
    }
}
