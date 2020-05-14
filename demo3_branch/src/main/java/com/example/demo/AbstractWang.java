package com.example.demo;

/**
 * @Author Wang
 * @Date 2020/5/5
 */
public abstract class AbstractWang {

    abstract void eat();

    public AbstractWang() {
        System.out.println("抽象父类的构造方法");
    }
}

class ShiXian extends AbstractWang{

    public ShiXian() {
        System.out.println("子类的构造方法");
    }
    @Override
    void eat() {
        System.out.println("实现类的重写吃");
    }


    public static void main(String[] args) {
        AbstractWang wang=new ShiXian();
        wang.eat();
		System.out.println("多加了一行代码");

    }
}
