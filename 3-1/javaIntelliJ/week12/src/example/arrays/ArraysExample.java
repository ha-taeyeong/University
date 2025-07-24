package example.arrays;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] scores = { 99, 97, 98 };
        Arrays.sort(scores);
        for(int i=0; i<scores.length; i++) {
            System.out.println("Score[" + i + "]=" + scores[i]);
        }
        int index = Arrays.binarySearch(scores, 99);
        System.out.println("찾은 인덱스: " + index);
        System.out.println();

        String[] names = { "홍길동", "박동수", "김민수"};
        Arrays.sort(names);
        for(int i=0; i<names.length; i++) {
            System.out.println("names[" + i + "]=" + names[i]);
        }
        index = Arrays.binarySearch(names, "홍길동");
        System.out.println("찾은 인덱스: " + index);
        System.out.println();
    }
}
