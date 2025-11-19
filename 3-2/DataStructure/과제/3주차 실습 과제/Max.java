
public class Max {

	public static void main(String[] args) {
		int arr[] = {70, 80, 50, 60, 30, 20, 90, 100};
		int max=arr[0];
		int index=0;
		int max2=max;
		for(int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max2=max;
				max=arr[i];
				index=i;
			} else if(max2<arr[i]){
				max2=arr[i];
			}
		}
		System.out.println("max="+max+ "index="+index);
		System.out.println("max2="+max2);

	}

}
