package org.ray.basics.processControl;


public class ForLoop {

    public static void main(String[] args) {

        printTriangle();
//        enhanceForLoop();
//        multTable();
    }

    // 打印乘法表
    public static void multTable() {
        for (int i = 1; i <= 9; i++) {
            for (int i1 = 1; i1 <= i; i1++) {
                System.out.print(i+"*"+i1+"="+(i*i1)+"\t");
            }
            System.out.println();
        }
    }

    // 增强for
    public static void enhanceForLoop() {
        int[] array = {1, 2, 6, 2, 0};
        for (int element : array) {
            System.out.print(element + "\t");
        }
    }

    // 打印三角形
    public static void printTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
