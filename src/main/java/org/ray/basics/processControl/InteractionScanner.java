package org.ray.basics.processControl;

import java.util.Scanner;

public class InteractionScanner {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("使用next接收： ");
//
//        // 判断用户输入
          // next()不能得到带有空格的字符串
//        if (scanner.hasNext()) {
//            String string = scanner.next();
//            System.out.println("输入内容为：" + string);
//        }
//
//        // 凡是属于IO流的类若不关闭会一直占用资源，若不使用最好关闭
//        scanner.close();

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        // nextLine() 获得 回车前 的所有内容
        if (scanner.hasNextLine()) {
            String string = scanner.nextLine();
            System.out.println("输入内容为： " + string);
        }
        scanner.close();
    }
}
