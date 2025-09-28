package answer1;

public class Test3 {
    public static void main(String[] args) {
        try {
            sub();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
    public static void sub() throws ArrayIndexOutOfBoundsException {
        int[] array = new int[10];
        int i = array[10]; // 배열의 인덱스 범위를 벗어나 예외 발생
    }
}
