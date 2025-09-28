
public class MultiArray {
    public static void main(String[] args) {
        // 4x5 배열 선언 (4행 5열)
        int[][] arr = new int[4][5];

        // 3행 4열까지 예시 값 입력 (문제 그림 참고)
        int value = 1;
        for (int i = 0; i < 3; i++) {         // 0~2행
            for (int j = 0; j < 4; j++) {     // 0~3열
                arr[i][j] = value++;
            }
        }

        // 1. 각 행의 합(마지막 열)에 저장
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 4; j++) {
                rowSum += arr[i][j];
            }
            arr[i][4] = rowSum;   // 행 합계, 마지막 열에 저장
        }

        // 2. 각 열의 합(마지막 행)에 저장
        for (int j = 0; j < 5; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += arr[i][j];
            }
            arr[3][j] = colSum;   // 열 합계, 마지막 행에 저장
        }

        // 3. 표 형식으로 결과 출력
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
