package org.ray.basic;

public class TypeConvertion {
    public static void main(String[] args) {

        //  强制转换    高 -> 低
        int i1 = 128;
        byte i2 = (byte)i1;
        System.out.println(i1);
        System.out.println(i2);     // 内存溢出

        System.out.println("----------------------------");

        //  自动转换    低 -> 高
        double i3 = i1;
        System.out.println(i1);
        System.out.println(i3);

        System.out.println("----------------------------");

        char c1 = 'a';
        int c2 = c1 + 1;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println((char) c2);

        System.out.println("----------------------------");

        // JDK7新特性：数字间可以用下换线分割
        int bigNum1 = 10_0000_0000;
        System.out.println(bigNum1);
    }
}
