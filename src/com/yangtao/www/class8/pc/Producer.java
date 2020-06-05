package com.yangtao.www.class8.pc;

/**
 * @author CoderYT
 * @date 2020/5/22
 **/
public class Producer implements Runnable {

    private Goods good;

    public Producer(Goods good) {
        this.good = good;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            if (i % 2 == 0) {
                good.setName("矿泉水");
                good.setBrand("娃娃哈");
                System.out.println("生产者生产了"+good.getBrand()+good.getName());
            } else {
                good.setBrand("旺仔");
                good.setName("小馒头");
                System.out.println("生产者生产了"+good.getBrand()+good.getName());
            }
        }

    }




}
