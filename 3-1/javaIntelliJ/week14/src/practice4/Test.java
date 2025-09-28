package practice4;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Integer[] dim= {23, 56,75,32,78,44};
        Character[] cdim = {'자', '바', '프','로','그','램'};

        System.out.println("=== 바꾸기 수행 전 ===");
        System.out.println(Arrays.toString(dim));
        System.out.println(Arrays.toString(cdim));

        MyAlgorithm.swap(dim, 2, 4);
        MyAlgorithm.swap(cdim, 1, 5);

        System.out.println("=== 바꾸기 수행 후 ===");
        System.out.println(Arrays.toString(dim));
        System.out.println(Arrays.toString(cdim));

    }
}
