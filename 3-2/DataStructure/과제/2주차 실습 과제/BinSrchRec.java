
public class BinSrchRec {
	public static int binarySearch1(int[] arr, int key, int low, int high) {
		int mid;
		if (low<=high) {
			mid=(low+high)/2;
			if (key==arr[mid]) {
				return mid;
			} else if (key<arr[mid]) { // 오른쪽 부분을 제외
				return binarySearch1(arr, key, low, mid-1);
			} else { // 오른쪽 부분제외
				return binarySearch1(arr, key, mid+1, high);
			}
		}
		// 탐색실패
		return -1;
	}
	public static void main(String[] args) {
		System.out.println("Hello Java");
		int[] arr = {1,3,5,7,9,11,13,14,16,17,18}; // 정렬된 데이터
		int key = 17;
		int low = 0; // 왼쪽경계
		int high = arr.length-1; // 오른쪽경계
		int x=binarySearch1(arr, key, low, high);
		System.out.println(x);
	}
}
