import java.util.PriorityQueue;

public class UtilPQTest {
	public static void main(String[] args) {
		PriorityQueue<String> pQueue = new PriorityQueue<String>();
		pQueue.add("Kim");
		pQueue.add("Lee");
		pQueue.add("Choi");
		pQueue.add("Park");
		System.out.println("삽입 후 큐 상태: " + pQueue);
		
		while (!pQueue.isEmpty()) {
			System.out.println("Poll: " + pQueue.poll());
		}
		System.out.println("삭제 큐 상태: " + pQueue);
	}
}
