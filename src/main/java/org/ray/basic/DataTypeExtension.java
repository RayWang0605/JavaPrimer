package org.ray.basic;

public class DataTypeExtension {
    public static void main(String[] args) {
        // 整数扩展
        // 二进制：0b   八进制0    十进制    十六进制0x
        int i1 = 10;
        int i2 = 010;
        int i3 = 0x10;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("-------------------------------");

        //-------------------------------
        // 浮点数
        //-------------------------------
        // float 有限 离散 舍入误差 接近但不等于
        // double
        // 避免使用float进行比较
        // 避免使用float进行比较
        // 避免使用float进行比较

        float f = 0.1f;
        double d = 1.0/10;

        System.out.println(f==d);

        float d1 = 32324153163645754252f;
        float d2 = d1 + 1;

        System.out.println(d1==d2);
        System.out.println("-------------------------------");

        //-------------------------------
        // 字符
        //-------------------------------
        char c1 = 'a';
        char c2 = '类';

        System.out.println(c1);
        System.out.println((int) c1);

        System.out.println(c2);
        System.out.println((int) c2);
        // 所有字符本质为数字
        // 编码 Unicode 2字节(char同为2字节，范围0~65536)
        // ASCII表(A=65, a=97)

        //  \ 转义字符
        // \t 制表符
        // \n 换行
        char c3 = '\u0061';
        System.out.println(c3);
        System.out.println("Hello\tworld");

        System.out.println("-------------------------------");
        //-------------------------------
        String s1 = new String("Hello world");
        String s2 = new String("Hello world");
        System.out.println(s1 == s2);

        String s3 = "Hello world";
        String s4 = "Hello world";
        System.out.println(s3 == s4);

        System.out.println("-------------------------------");

        // bool扩展
        boolean flag1 = true;
        if (flag1==true) {}
        if (flag1) {}
        // 两句等效
    }
}
