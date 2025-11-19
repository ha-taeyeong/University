import java.io.*;

public class MoveZero {
    // 배열의 0을 제일 오른쪽 끝으로 이동시키는 함수
    static void pushZerosToEnd(int arr[], int n) {
        int count = 0; // 0이 아닌 요소들을 앞으로 옮길 위치(인덱스)

        // 1단계: 0이 아닌 값을 앞으로 순서대로 채운다
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {          // 0이 아니면
                arr[count++] = arr[i];  // 앞쪽에 채우고, count 증가
            }
        }

        // 2단계: 남은 뒷부분에 0을 채운다 (count부터 끝까지)
        while (count < n) {
            arr[count++] = 0;
        }
    }

    // 테스트를 위한 main 함수
    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;

        pushZerosToEnd(arr, n); // 0을 오른쪽 끝으로 이동

        System.out.println("배열에서 0을 오른쪽 끝으로 이동한 결과: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
