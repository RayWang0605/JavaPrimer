package org.ray.processControl;

public class MethodTest {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 6, 0, 1, 4};
        test(1.2, array);

    }

    // 可变参数
    public static void test(double var1, int... numbers) {
        System.out.println(var1);
        if (!(numbers.length==0)) {
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }
    }
}
