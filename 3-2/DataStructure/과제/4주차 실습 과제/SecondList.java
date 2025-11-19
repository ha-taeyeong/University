
class ListNode2 {
	String name;
	ListNode2 link;
}

public class SecondList {
	public static void main(String[] args) {
		System.out.println("Hello Java");
		// list2 = (Kim, Lee, Park)
		ListNode2 tmp;
		ListNode2 last;
		ListNode2 list2;
		ListNode2 p;
		
		tmp = new ListNode2(); // 첫번째 원소
		tmp.name="Kim"; tmp.link=null;
		last = tmp; // 마지막 노드에 tmp 데이터 추가, 리스트는 항상 첫번째에 데이터가 추가되기 때문이다.
		list2 = tmp; // 초기화
		
		tmp = new ListNode2();
		tmp.name="Lee"; tmp.link=null;
		last.link = tmp; last = tmp;
		
		tmp = new ListNode2();
		tmp.name="Park"; tmp.link=null;
		last.link = tmp; last = tmp;
		
		p=list2; // 선두원소주소
		while(p!=null) {
			System.out.println(" " + p.name);
			p=p.link;
		}
	}
}
