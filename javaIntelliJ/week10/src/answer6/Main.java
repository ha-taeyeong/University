package answer6;
public class Main {
    public static int searchArray(int[] arr, int target) throws NotFoundExecption {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        throw new NotFoundExecption("배열에서 찾을 수 없습니다.");
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        try {
            int target = 7;
            int idx = searchArray(arr, target);
            System.out.println("찾은 인덱스 : " + idx);
        } catch (NotFoundExecption e) {
            System.out.println(e.getMessage());
        }
    }
}
