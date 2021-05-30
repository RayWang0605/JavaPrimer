package org.ray.basics.clsInCls;

public class Application {

    public static void main(String[] args) {

        Outer outer = new Outer();

        Outer.Inner innner = outer.new Inner();
        innner.in();
        innner.getID();
    }
}
