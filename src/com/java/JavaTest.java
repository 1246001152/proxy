package com.java;

/**
 * @author : 张晋飞
 * date : 2019/4/16
 */
public class JavaTest {
    // 手动代理
    public static void main(String[] args) {

        Zhangsan zhangsan = new Zhangsan();
        Proxy proxy =  new Proxy();
        proxy.setZhangsan(zhangsan);
        proxy.mai();
    }
}
