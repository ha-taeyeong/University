package doublelist;

class DNode {
	DNode llink;
	DNode rlink;
	String data;
	public DNode(String data) {
		this.data = data;
	}
}

class DList {
	DNode head, tail;
	
	public DList() {
		head=null; tail=null;
	}
	
	public void insertFirst(String data) {
		DNode newNode = new DNode(data);
		if(head==null) {
			head=newNode; tail=newNode;
		} else {
			head.llink=newNode;
			newNode.rlink=head;
			head=newNode;
		}
	}
	
	public void insertLast(String data) {	
		DNode newNode = new DNode(data);
		if(head == null) {
			head=newNode; tail=newNode;
		} else {
			tail.rlink=newNode;
			newNode.llink=tail;
			tail=newNode;
		}
	}

	public String deleteFirst() {
		String fVal;
		//원소없음
		if(head==null) {
			return "원소없음";
		}
		//원소가 하나
		fVal=head.data;
		if (head==tail) {
			head=null; tail=null;
			return fVal;
		}
		//원소가 두 개 이상있음
		head=head.rlink;
		head.llink=null;
		return fVal;
	}
	
	public String deleteLast() {
		String lastVal;
		// 원소없음
		if(tail==null) {
			return "원소없음";
		}
		// 원소가 하나
		lastVal=tail.data;
		if (head==tail) {
			head=null; tail=null;
			return lastVal;
		}
		//원소가 두 개 이상있음
		tail=tail.llink;
		tail.rlink=null;
		return lastVal;
	}
	
	public void printList() {
		DNode p;
		p=head;
		while(p!=null) {
			System.out.print(" "+p.data);
			p=p.rlink;
		}
		System.out.println();
	}
	
	
	public void printReverse() {
		DNode p;
	    p=tail;
	    while(p!=null) {
	        System.out.print(" "+p.data);
	        p=p.llink;
	    }
	    System.out.println();
	}
	
	public  int findData(String x) {
		int count=0;
		if (head==null) { return 0; }
		DNode p;
		p=head;
		while(p!=null) {
			//if(p.data.equals(x))
			if(p.data.compareTo(x)==0) { // 같음
				return count;
			}
			count++;
			p=p.rlink;
		}
		return -1;
	}
	
	public void addNode(String x, String y) {
		if (head==null) {
			System.out.println(x+ " not found");
			return;
		}
		DNode p;
		p=head;
		while(p!=null) {
			if(p.data.compareTo(x)==0) { // 같음
				DNode newNode = new DNode(y);
				newNode.rlink=p.rlink;
				newNode.llink=p;
				DNode nextNode=p.rlink;
				if(nextNode==null) {
					p.rlink=newNode;
					tail=newNode;
				} else {
					nextNode.llink=newNode;
					p.rlink=newNode;
				}
				return;
			}
			p=p.rlink;
		}
		System.out.println(y + " not found");
		return;
	}
	
	public void deleteNode(String x) {
		DNode p;
		if (x.equals(head.data)) { // 선두원소삭제
			deleteFirst();
			return;
		}
		if (x.equals(tail.data)) { // 마지막원소삭제
			deleteLast();
			return;
		}
		p=head;
		while(p!=null) {
			if(p.data.equals(x)) {
				DNode prev=p.llink;
				DNode next = p.rlink;
				prev.rlink=p.rlink;
				next.llink=p.llink;
				return;
			}
			p=p.rlink;
		}
		System.out.println(x+ " not found");
		return;

	}
	
}

public class DLinkedListMain {
	
	public static void main(String[] args) {
		System.out.println("Hello Java");
		DList dlist1 = new DList();
		dlist1.insertLast("Kim");
		dlist1.insertLast("Lee");
		dlist1.insertLast("Park");
		dlist1.insertLast("Choi");
		dlist1.printList(); // Kim Lee Park Choi
		dlist1.printReverse(); // Choi Park Lee Kim
		dlist1.printList(); // Kim Lee Park Choi
		dlist1.insertFirst("Yoo");
		dlist1.printList(); // Yoo Kim Lee Park Choi
		System.out.println(dlist1.deleteLast());
		dlist1.printList(); // Yoo Kim Lee Park
		System.out.println(" count="+dlist1.findData("Park")); // count=3
		dlist1.addNode("Park", "Chung");
		dlist1.printList(); // Yoo Kim Lee Park Chung
		dlist1.addNode("Lee", "Yoon");
		dlist1.printList(); // Yoo Kim Lee Yoon Park Chung
		dlist1.deleteNode("Lee");
		dlist1.printList(); // Yoo Kim Yoon Park Chung
		dlist1.deleteNode("Yoo");
		dlist1.printList(); // Kim Yoon Park Chung
		dlist1.deleteNode("Chung");
		dlist1.printList();  // Kim Yoon Park

	}
	
}
