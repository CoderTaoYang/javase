package com.yangtao.www.class3_6.innerclass;

/**
 * @author CoderYT
 * @date 2020/5/14
 **/
public class NoNameInnerClassDemo {

    public static void main(String[] args) {
        System.out.println("有一万行代码");
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        System.out.println("有一万行代码");
    }


}
class Runner implements Runnable{

    @Override
    public void run() {

    }
}