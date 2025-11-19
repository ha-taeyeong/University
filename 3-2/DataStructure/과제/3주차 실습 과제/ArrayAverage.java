
public class ArrayAverage {
	public static void main(String[] args) {
		int[] score = new int[] {84, 66, 79, 51, 80, 78, 98, 70, 92, 61};
		int total = 0;
		for(int i : score) {
			total += i;
		}
		double average = (double)total / score.length;
		System.out.println("평균 = " + average);
	}
}
