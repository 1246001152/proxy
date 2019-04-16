package com.java;

/**
 * @author : 张晋飞
 * date : 2019/4/16
 */
public class Proxy implements Car {

    private Zhangsan zhangsan;

    public void setZhangsan(Zhangsan zhangsan) {
        this.zhangsan = zhangsan;
    }

    @Override
    public void mai() {
        System.out.println("准备买车");
        zhangsan.mai();
        System.out.println("买车结束");
    }
}
