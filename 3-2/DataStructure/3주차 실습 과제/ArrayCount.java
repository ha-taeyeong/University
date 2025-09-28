
public class ArrayCount {
	public static void main(String[] args) {
		int[] score = new int[] {84, 66, 79, 51, 80, 78, 98, 70, 92, 61};
		int count = 0;
		for(int i=0; i<score.length; i++) {
			if(score[i] < 70) {
				count++;
			}
		}
		System.out.println("재평가 인원 수 = " + count);
	}
}
