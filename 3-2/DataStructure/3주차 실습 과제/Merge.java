
public class Merge {
    // 정렬된 두 배열을 합병하여 중복 없이 arr3에 저장
    static int merge(int arr1[], int n1, int arr2[], int n2, int arr3[]) {
        int i = 0, j = 0, k = 0;
        
        // 두 배열 모두 순회하며 병합
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                // arr3이 비었거나 직전 값과 다르면 추가
                if (k == 0 || arr3[k-1] != arr1[i]) {
                    arr3[k++] = arr1[i];
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (k == 0 || arr3[k-1] != arr2[j]) {
                    arr3[k++] = arr2[j];
                }
                j++;
            } else { // 값이 같으면 하나만 추가
                if (k == 0 || arr3[k-1] != arr1[i]) {
                    arr3[k++] = arr1[i];
                }
                i++;
                j++;
            }
        }
        // arr1이 남은 경우 처리
        while (i < n1) {
            if (k == 0 || arr3[k-1] != arr1[i]) {
                arr3[k++] = arr1[i];
            }
            i++;
        }
        // arr2가 남은 경우 처리
        while (j < n2) {
            if (k == 0 || arr3[k-1] != arr2[j]) {
                arr3[k++] = arr2[j];
            }
            j++;
        }
        return k; // arr3의 실제 길이 반환
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 6, 7, 8, 9, 14, 16};
        int arr2[] = {4, 5, 10, 13};
        int arr3[] = new int[arr1.length + arr2.length]; // 최악의 경우 길이

        int len = merge(arr1, arr1.length, arr2, arr2.length, arr3);

        System.out.print("합병 후 결과: ");
        for (int i = 0; i < len; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
