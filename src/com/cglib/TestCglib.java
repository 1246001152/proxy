package com.cglib;

import com.jdk.Car;
import com.jdk.XiaoMing;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author : 张晋飞
 * date : 2019/4/16
 */
public class TestCglib {

    public static void main(String[] args) {

        Cglib cglib = new Cglib();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(XiaoMing.class);
        enhancer.setCallback(cglib);
        Car car = (Car) enhancer.create();
        car.mai();

    }
}
