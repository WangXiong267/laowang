package com.example.demo;

/**
 * @Author Wang
 * @Date 2020/5/5
 */
public class Father extends GrandFather{
    void eat(){
        System.out.println("父类吃的方法");
    }

    public Father() {
        System.out.println("父类构造方法");
    }
}
class GrandFather {
    void eat(){
        System.out.println("爷爷吃的方法");
    }

    public GrandFather() {
        System.out.println("爷爷类构造方法");
    }
}