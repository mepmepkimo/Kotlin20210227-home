package com.jtest;

import com.ktest.KHello;

public class JHello {
    public void callMe(){
        System.out.println("0912345678");
    }
    public static void main(String[] args) {
        System.out.println("Hello Java");
        //呼叫 callMe()
        JHello j= new JHello();//新增物件
        j.callMe();//呼叫物件的callMe

        //呼叫KHello的callMe
        KHello k = new KHello();
        k.callMe();
    }

}
