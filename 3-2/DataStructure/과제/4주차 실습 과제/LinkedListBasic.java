class Node {
	String name;
	Node link;
	public Node(String name, Node link) {
		this.name = name;
		this.link = link;
	}
}

public class LinkedListBasic {
	
	public static void printList(Node list) {
		Node p;
		p=list;
		while(p!=null) {
			System.out.print(" "+p.name);
			p=p.link;
		}
		System.out.println();
	}

	public static int printCount(Node list) {
		int count=0;
		Node p;
		p=list;
		while(p!=null) {
			count++;
			p=p.link;
		}
		System.out.println();
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello Java");
		Node tmp1, tmp2, tmp3, tmp4, tmp5;
		Node list2;
		tmp1=new Node("apple", null);
		tmp2=new Node("strawberry", null);
		tmp3=new Node("orange", null);
		tmp4=new Node("banana", null);
		tmp5=new Node("melon", null);
		list2 = tmp1;
		
		// 1번문제
		tmp1.link = tmp2;
		tmp2.link = tmp3;
		tmp3.link = tmp4;
		tmp4.link = tmp5;
		printList(list2);
		
		// 2번문제
		tmp1 = new Node("pineapple", null);
		tmp1.link = list2;
		list2 = tmp1;
		printList(list2);
		
		// 3번문제
		Node p;
		p = list2;
		int count = 0;
		while((p!=null)&&(count<1)) {
			count++;
			System.out.print(" " + p.name);
			p = p.link;
		}
		// p는 두번째 원소의 주소를 가지고 있음
		System.out.println(" 두번째 원소="+p.name);
		p.link = p.link.link;
		printList(list2);
		
		// 4번 문제 : list2의 원소의 개
		System.out.println("원소의 개수=" + printCount(list2));
		
		// 5번 문제 : 마지막에 원소추가
		tmp1 = new Node("durian", null);
		p=list2;
		while(p.link!=null) {
			System.out.print(" "+p.name);
			p=p.link;
		}
		//p는 마지막원소
		System.out.println();
		p.link=tmp1;
		printList(list2);
		
		// 6번 문제: 네 번째(3번 인덱스)에 tomato 삽입
		Node newNode = new Node("tomato", null);
		p = list2;
		for (int i = 0; i < 2; i++) {
		    p = p.link;
		}
		newNode.link = p.link;
		p.link = newNode;
		printList(list2);
		
	}
}
