package com.yangtao.www.class6.collection.generic;

/**
 * @author CoderYT
 * @date 2020/5/16
 **/
public class FanXingMethod<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <Q> void show(Q q){
        System.out.println(q);
        System.out.println(t);
    }
}