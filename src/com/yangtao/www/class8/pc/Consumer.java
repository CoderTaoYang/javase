package com.yangtao.www.class8.pc;

/**
 * @author CoderYT
 * @date 2020/5/22
 **/
public class Consumer implements Runnable{

    private Goods good;

    public Consumer(Goods good) {
        this.good = good;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            System.out.println("消费者消费了"+good.getBrand()+good.getName());
        }
    }
}
