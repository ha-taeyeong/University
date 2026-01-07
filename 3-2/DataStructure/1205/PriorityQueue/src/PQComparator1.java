import java.util.Comparator;
import java.util.PriorityQueue;

class MyNode {
    int id;
    String name;
    int score;
    
    public MyNode(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
    
    @Override
    public String toString() {
    	return "ID: " + id + ", Name: " + name + ", Score: " + score;
    }
}

class MyNodeComparator implements Comparator<MyNode> {
    
    @Override
    public int compare(MyNode n1, MyNode n2) {
        return n2.score - n1.score; 
    }
}

public class PQComparator1 {
    
    public static void main(String[] args) {
    	
        Comparator<MyNode> comparator1 = new MyNodeComparator();
        PriorityQueue<MyNode> queue = new PriorityQueue<MyNode>(10, comparator1);
        
        queue.add(new MyNode(1, "Kim", 88));
        queue.add(new MyNode(2, "Lee", 68));
        queue.add(new MyNode(3, "Park", 88));
        queue.add(new MyNode(4, "You", 55));
        queue.add(new MyNode(5, "Choi", 99));
        
        System.out.println("--- PriorityQueue (성적순 내림차순) ---");
        
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}