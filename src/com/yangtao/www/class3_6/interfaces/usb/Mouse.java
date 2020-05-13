package com.yangtao.www.class3_6.interfaces.usb;

/**
 * @author CoderYT
 * @date 2020/5/13
 **/
public class Mouse implements Usb{
    @Override
    public void dataTransfer() {
        System.out.println("鼠标来点击屏幕");
    }

    @Override
    public void play() {
        System.out.println("鼠标在自己玩");
    }
}
