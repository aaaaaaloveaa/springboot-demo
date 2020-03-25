package com.java.springbootdemo.huawei;

/**
 * @author lch
 * @create 2020-03-25 10:24
 */
public class People {

    static {
        System.out.println("这是静态代码块-----people-----");
    }

    public People() {
        System.out.println("这是构造方法-------people-----");
    }

    {
        System.out.println("这是局部代码块------people-----");
    }

    public static void main(String[] args) {
        A a = new A();

    }

}

class A extends People{

    static {
        System.out.println("这是静态代码块-----A-----");
    }

    public A () {
        System.out.println("这是构造方法-------A-----");
    }

    {
        System.out.println("这是局部代码块------A-----");
    }
}
