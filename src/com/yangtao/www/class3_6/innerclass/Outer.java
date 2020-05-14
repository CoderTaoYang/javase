package com.yangtao.www.class3_6.innerclass;

/**
 * @author CoderYT
 * @date 2020/5/14
 **/
public class Outer {

    private String name = "zhangsan";

    class Inner{
        private String name = "lisi";

        public void show(){
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Outer.this.name);
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}
