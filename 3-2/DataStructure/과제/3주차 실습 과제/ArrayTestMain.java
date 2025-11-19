class HallymArray {
    // 배열 역순 뒤집기
    static void reverseArray(int[] arr) {
        int temp;
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // 배열 출력
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 배열을 왼쪽으로 1칸 시프트 (앞에서 하나 제거하고 뒤에 0 추가)
    static void shiftArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    // 배열을 왼쪽으로 n칸 시프트
    static void shiftnArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            shiftArray(arr);
        }
    }

    // 배열에서 특정 인덱스 요소 삭제 (오른쪽으로 당기고 마지막은 0)
    // 인덱스 범위 검사 필요
    static void delArray(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    // 배열 특정 위치에 값 삽입 (삽입 위치부터 오른쪽 요소 한 칸씩 이동 후 삽입)
    // 마지막 요소는 삭제됨 (덮어짐)
    // 인덱스 범위 검사 필요
    static void insertArray(int[] arr, int index, int value) {
        if (index < 0 || index >= arr.length) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
    }
}

public class ArrayTestMain {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        HallymArray.reverseArray(arr);
        System.out.print("reverseArray: ");
        HallymArray.printArray(arr);

        HallymArray.shiftArray(arr);
        System.out.print("shiftArray(1칸): ");
        HallymArray.printArray(arr);

        HallymArray.shiftnArray(arr, 2);
        System.out.print("shiftnArray(2칸): ");
        HallymArray.printArray(arr);

        HallymArray.delArray(arr, 3);
        System.out.print("delArray(인덱스 3 삭제): ");
        HallymArray.printArray(arr);

        HallymArray.insertArray(arr, 4, 8);
        System.out.print("insertArray(인덱스 4에 8 삽입): ");
        HallymArray.printArray(arr);
    }
}
