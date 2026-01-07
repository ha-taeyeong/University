import java.util.Arrays;
import java.util.PriorityQueue;

public class Scorvillescale {

	public static int solution(int[] scoville, int K) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for (int s: scoville) {
			pq.add(s);
		}
		
		int mixCount = 0;
		
		while (pq.peek() < K) { //pq.peek() : 큐에서 가장 작은 값 반
			if (pq.size() < 2) {
				return -1;
			}
			
			int leastSpicy = pq.poll();
			int secondLeastSpicy = pq.poll();
			
			int newScoville = leastSpicy + (secondLeastSpicy * 2);
			
			pq.add(newScoville);
			
			mixCount++;
		}
		return mixCount;
		
	}
	
	public static void main(String[] args) {
		int[] scoville = {20, 40, 90, 60, 50, 5, 3};
		int K = 50;
		
		int result = solution(scoville, K);
		
		System.out.println("초기 스코빌 지수: " + Arrays.toString(scoville));
		System.out.println("목표 K 지수: " + K);
		
		if (result == -1) {
			System.out.println("결과: 모든 음식을 K 이상으로 만들 수 없습니다.");
		} else {
			System.out.println("결과: 최소 섞은 횟수는 " + result + "회 입니다.");
		}
	}
	
}
