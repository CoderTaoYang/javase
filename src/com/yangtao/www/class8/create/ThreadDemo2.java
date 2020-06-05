package com.yangtao.www.class8.create;

import com.sun.tools.javac.Main;

/**
 * @author CoderYT
 * @date 2020/5/19
 **/
public class ThreadDemo2 implements Runnable{

    @Override
    public void run() {

        for (int i=0;i<10;i++) {
            System.out.println(Thread.currentThread().getName() + "----" + i);
        }
    }

    public static void main(String[] args) {

        ThreadDemo2 threadDemo2 = new ThreadDemo2();
        Thread thread = new Thread(threadDemo2);
        thread.start();

        for (int i=0;i<10;i++) {
            System.out.println(Thread.currentThread().getName() + "----" + i);
        }




    }
}
