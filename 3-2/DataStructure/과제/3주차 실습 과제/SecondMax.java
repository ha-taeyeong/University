
public class SecondMax {
	public static void main(String[] args) {
		int[] score = new int[] {84, 66, 79, 51, 80, 78, 98, 70, 92, 61};
		int max = score[0];
		int max2 = max;
		for(int i=0; i<score.length; i++) {
			if(max<score[i]) {
				max2=max;
				max=score[i];
			} else if(max2 < score[i]) {
				max2=score[i];
			}
		}
		System.out.println("두번째 최대값 = " + max2);
	}
}
