class ListNode3 {
    String name;
    ListNode3 link;
    public ListNode3(String name, ListNode3 link) {
        this.name = name;
        this.link = link;
    }
}

public class ThirdList {
    public static void printList(ListNode3 list) {
        ListNode3 p = list;
        while (p != null) {
            System.out.print(" " + p.name);
            p = p.link;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 1. 배열로 리스트 만들기
        String[] arrList1 = {"Choi", "Kim", "Lee", "Park", "Yoo"};
        System.out.print("배열 전체 출력: ");
        for (String name : arrList1) {
            System.out.print(" " + name);
        }
        // 2번 문제 : 배열에서 4번째 요소 출력 (인덱스 3)
        System.out.println("\n배열의 4번째 요소: " + arrList1[3]);

        // 2. 연결 리스트로 리스트 만들기
        ListNode3 tmp1 = new ListNode3("Choi", null);
        ListNode3 tmp2 = new ListNode3("Kim", null);
        ListNode3 tmp3 = new ListNode3("Lee", null);
        ListNode3 tmp4 = new ListNode3("Park", null);
        ListNode3 tmp5 = new ListNode3("Yoo", null);
        ListNode3 linkList1 = tmp1;
        tmp1.link = tmp2;
        tmp2.link = tmp3;
        tmp3.link = tmp4;
        tmp4.link = tmp5;
        System.out.print("\n연결 리스트 전체 출력:");
        printList(linkList1);
        
        // 3번 문제 : 연결 리스트에서 4번째 요소 출력 (link를 3번 따라감)
        ListNode3 p = linkList1;
        for (int i = 0; i < 3; i++) {
            p = p.link;
        }
        System.out.println("연결 리스트의 4번째 요소: " + p.name);
    }
}
