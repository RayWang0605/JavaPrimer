package org.ray.basics.array;

public class Array {
    public static void main(String[] args) {
        arrayDemo1();
        System.out.println();
        arrayDemo2();
        System.out.println();
        System.out.println("---------------------");
    }


    public static void arrayDemo2() {
        int[] arrays = {1, 5, 8, 3, 1, 0, 9};
        for (int i : arrays) {
            System.out.print(i + "\t");
        }
    }

    public static void arrayDemo1() {
        int[] nums1;    // 声明数组
        int nums2[];
        nums1 = new int[5]; // 创建数组
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = i*i;
        }
        System.out.println(nums1);  // 数组nums1首个元素的 存储地址
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + "\t");
        }
    }
}
