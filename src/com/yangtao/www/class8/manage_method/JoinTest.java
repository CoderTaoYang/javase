package com.yangtao.www.class8.manage_method;

/**
 * @author CoderYT
 * @date 2020/5/20
 **/
public class JoinTest {
    public static void main(String[] args) {
        MyRun run = new MyRun();
        Thread thread = new Thread(run);
        thread.start();

        for(int i = 0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"-----------------"+i);
            if(i==3){
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}