import java.util.Arrays;

class Node1 {
	int data;
	Node1 link;
	Node1(int data, Node1 link) {
		this.data = data;
		this.link = link;
	}
}

public class ListSwitch {
	static void printList(Node1 p) {
		while (p != null) {
			System.out.print(p.data + (p.link != null ? ", " : "\n"));
			p = p.link;
		}
	}
	public static void main(String[] args) {
		// 1. 두 수 값 바꾸기
        int x=3, y=5;
        System.out.println("x="+x+", y="+y);
        int tmpInt = x; x = y; y = tmpInt;
        System.out.println("x="+x+", y="+y);

        // 2. 배열 switch
        int[] a = {1,2,3,4};
        int[] b = {5,6,7,8,9};
        System.out.println("a[]="+Arrays.toString(a));
        System.out.println("b[]="+Arrays.toString(b));
        int[] tmpArr = a; a = b; b = tmpArr;
        System.out.println("a[]="+Arrays.toString(a));
        System.out.println("b[]="+Arrays.toString(b));

        // 3. 연결 리스트 생성 및 switch
        Node1 tmp1, tmp2, tmp3, tmp4;
        Node1 list1, list2, tmp;
        // list1 생성
        tmp1=new Node1(10, null);
        tmp2=new Node1(40, null);
        tmp3=new Node1(100, null);
        tmp4=new Node1(122, null);
        tmp1.link=tmp2; tmp2.link=tmp3; tmp3.link=tmp4; list1=tmp1;
        // list2 생성
        tmp1=new Node1(15, null);
        tmp2=new Node1(30, null);
        tmp3=new Node1(80, null);
        tmp4=new Node1(150, null);
        tmp1.link=tmp2; tmp2.link=tmp3; tmp3.link=tmp4; list2=tmp1;

        System.out.print("list1="); printList(list1);
        System.out.print("list2="); printList(list2);

        // switch
        tmp=list1; list1=list2; list2=tmp;
        System.out.print("list1 바꾼 후="); printList(list1);
        System.out.print("list2 바꾼 후="); printList(list2);
	}
	
}
