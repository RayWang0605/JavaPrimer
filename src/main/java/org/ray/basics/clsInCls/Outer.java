package org.ray.basics.clsInCls;

public class Outer {

    private int id=10;
    public void out() {
        System.out.println("Outer method");
    }

    class Inner {
        public void in() {
            System.out.println("内部类的方法");
        }

        // 通过内部类获取外部类的私有属性、私有方法
        public void getID() {
            System.out.println(id);
        }
    }



}
