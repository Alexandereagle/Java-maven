package com.atguigu.getHello;

import com.atguigu.hello.GetHello;
import org.junit.Test;

public class TestHello {

    @Test
    public void test01() {
        GetHello getHello = new GetHello();
        System.out.println(getHello.getHello());
    }
}
