package com.example.demo;

/**
 * @Author Wang
 * @Date 2020/5/5
 */
public interface Jie {

    default void eat(){
        System.out.println("吃");
    }


    public static void main(String[] args) {
        Jie jie = new JieShixian();
        jie.eat();
    }


}
class JieShixian implements Jie{

    ThreadLocal<String> t=new ThreadLocal<>();


}

