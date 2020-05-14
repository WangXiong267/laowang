package com.example.demo;

/**
 * @Author Wang
 * @Date 2020/5/5
 */
public class Son extends Father {


    void eat(){
        System.out.println("子类吃的方法");
    }

    public Son() {
        super();
        System.out.println("子类构造方法");
    }

    public static void main(String[] args) {
      // GrandFather grandFather= new Father();
//        Father father = new Son();
//        father.eat();
//        String wang="sadhjg";
        String s=new String("sadhjg");



    }
}
