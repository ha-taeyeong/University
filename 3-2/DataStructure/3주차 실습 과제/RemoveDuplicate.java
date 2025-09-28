import java.io.*;

// RemoveDuplicate 클래스: 정렬된 배열에서 중복을 제거하는 메서드 포함
public class RemoveDuplicate {
    // 정렬된 배열의 중복 원소를 제거하고, 남은 부분은 0으로 채움
    static void removeDuplicates(int arr[], int n) {
        if (n == 0) return; // 배열이 비어있으면 바로 종료

        int count = 1; // count는 중복이 없는 원소가 들어갈 위치, 첫 원소는 항상 포함

        // 1단계: 앞에서부터 이전 값과 다르면 count 위치에 저장
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[count - 1]) {   // 직전 값과 다를 때만
                arr[count++] = arr[i];        // count 위치에 저장, count 증가
            }
        }

        // 2단계: 남은 부분에 0 채우기
        while (count < n) {
            arr[count++] = 0;
        }
    }

    // 테스트 main 함수
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 30, 40, 50, 50};
        int n = arr.length;

        removeDuplicates(arr, n); // 중복을 제거

        System.out.print("중복 제거 결과: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
