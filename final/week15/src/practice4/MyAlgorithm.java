package practice4;

public class MyAlgorithm {
    public static <T> void swap(T[] a, int i, int j) { // a[i]와 a[j]를 서로 교환
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
