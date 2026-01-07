import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Arrays;
import java.util.List;

class MyNode1 implements Comparable<MyNode1> {
    int id;
    String name;
    int score;

    public MyNode1(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(MyNode1 other) {
        return other.score - this.score; 
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Score: " + score;
    }
}

public class PQComparable1 {
    public static void main(String[] args) {
        Queue<MyNode1> pq = new PriorityQueue<>();

        List<MyNode1> inputData = Arrays.asList(
            new MyNode1(1, "Kim", 88),
            new MyNode1(2, "Lee", 68),
            new MyNode1(3, "Park", 88),
            new MyNode1(4, "You", 55),
            new MyNode1(5, "Choi", 99)
        );

        for (MyNode1 node : inputData) {
            pq.offer(node);
        }

        System.out.println("--- 성적순(Score 내림차순) 출력 ---");
        
        while (!pq.isEmpty()) {
            MyNode1 node = pq.poll();
            System.out.println(node);
        }
    }
}