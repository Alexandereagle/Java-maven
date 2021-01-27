package com.atguigu;

import com.atguigu.hello.GetHello;

public class HelloFriend {
    public static void getHello() {
        GetHello getHello = new GetHello();
        System.out.println(getHello.getHello());
    }

    public static void main(String[] args) {
        getHello();
    }
}
