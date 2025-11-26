package queue;

interface Queue {
	boolean isEmpty();
	void enqueue(Object x);
	//Object dequeue(); //
	Object peek();
}

class Node {
	Object data;
	Node link;
	public Node(Object x) {
		data=x;
		link=null;
	}
}

class LinkQ implements Queue{
	Node front, rear;
	int qSize;
	public LinkQ() {
		front=rear=null;
		qSize=0;
	}
	public boolean isEmpty() {// 큐가 공백인가?
		return (front==null);
	}
	public void enqueue(Object x) { //원소 x를 삽입
		Node newNode = new Node(x);
		if(isEmpty()) {
			front=newNode;
			rear=newNode;
		}else {
			rear.link=newNode;
			rear=newNode;
		}
		qSize++;
	}
	public Object dequeue() { // 선두원소를 삭제하고 값 반환
		if(isEmpty()) {return null;}
		Object tmp=front.data;
		front=front.link;
		qSize--;
		return tmp;
	}
	public Object peek() { //선두원소값을 반환
		if(isEmpty()) {return null;}
		return front.data;
	}
}
public class LinkQMain {
	public static void main(String[] args) {
		System.out.println("Hello Java");
		LinkQ linkq1 = new LinkQ();
		linkq1.enqueue(10);
		linkq1.enqueue(20);
		linkq1.enqueue(30);
		linkq1.enqueue(40);
		System.out.println(linkq1.dequeue());
		System.out.println(linkq1.dequeue());
	}
}
