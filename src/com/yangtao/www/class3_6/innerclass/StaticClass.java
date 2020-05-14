package com.yangtao.www.class3_6.innerclass;

/**
 * @author CoderYT
 * @date 2020/5/14
 **/
public class StaticClass {

    private int id;

    public void test(){
        System.out.println("test");
    }
    static class InnerClass{
        private String name;
        public void show(){
            System.out.println("show");
        }

    }

    public static void main(String[] args) {
        InnerClass innerClass = new StaticClass.InnerClass();
//        InnerClass innerClass = new StaticClass().new InnerClass();

    }
}