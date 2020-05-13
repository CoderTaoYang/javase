package com.yangtao.www.class3_6.interfaces.usb;

/**
 * @author CoderYT
 * @date 2020/5/13
 **/
public class UPan implements Usb {
    @Override
    public void dataTransfer() {
        System.out.println("upan可以传输数据");
    }

    @Override
    public void play() {

    }
}