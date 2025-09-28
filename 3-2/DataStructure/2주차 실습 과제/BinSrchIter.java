
public class BinSrchIter {
	public static int[] arr = {1, 3, 5, 7, 8, 10, 20, 35, 99, 100};
	
	public static int binarySearch(int key, int low, int high) {
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (key == arr[mid]) {
				return mid; // 찾은 경우 인덱스 반환
			} else if (key < arr[mid]) {
				high = mid - 1; // 왼쪽 탐색
			} else {
				low = mid + 1; // 오른쪽 탐
			}
		}
		return -1; // 못 찾은 경
	}
	
	
	public static void main(String[] args) {
		int key = 35;
		int idx = binarySearch(key, 0, arr.length - 1);
		if (idx == -1) {
			System.out.println("탐색 실패");
		} else {
			System.out.println(key + "는 배열의 " + idx + "번 인덱스에 있음");
		}
		
	}
}
