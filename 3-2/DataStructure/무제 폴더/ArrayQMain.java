package queue;

interface Queue {
	boolean isEmpty();
	void enqueue(Object x);
	//Object dequeue(); //
	Object peek();
}

class ArrayQ implements Queue{
	Object[] q;
	int front, rear, qSize;
	public ArrayQ() {
		q= new Object[10]; // 
		front=0; rear=0; qSize=0;
	}
	public boolean isEmpty() {// 큐가 공백인가?
		if(front==rear) return true;
		else return false;
//		return false;
	}
	public void enqueue(Object x) { //원소 x를 삽입
		if ((rear+1)%q.length==front) {
			System.out.println("queue full");
			return;
		}
		rear=(rear+1)%q.length;
		q[rear]=x;
		qSize++;
	}
	public Object dequeue() { // 선두원소를 삭제하고 값 반환
		Object tmp;
		if(isEmpty()) {
			System.out.println("queue empty");
			return null;
		}
		front=(front+1)%q.length;
		tmp=q[front];
		qSize--;
		return tmp;
	}
	public Object peek() { //선두원소값을 반환
		if(isEmpty()) {
			System.out.println("queue empty");
			return null;
		}
		return q[(front+1)%q.length];
	}
}

public class ArrayQMain {
	public static void main(String[] args) {
		System.out.println("Hello Java");
		ArrayQ aq1 = new ArrayQ();
		aq1.enqueue(10);
		aq1.enqueue(20);
		aq1.enqueue(30);
		aq1.enqueue(40);
		System.out.println(aq1.dequeue());
		
	}
}
