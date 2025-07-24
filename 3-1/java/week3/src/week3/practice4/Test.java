package week3.practice4;


public class Test {
    public static void main(String[] args) {
        // 회원 객체 생성 (이름과 생년월일 입력)
        Member member1 = new Member("김철수", new Date(1995, 5, 20));
        Member member2 = new Member("이영희", new Date(2002, 11, 15));

        // 회원 정보 출력 (toString() 메서드 자동 호출)
        System.out.println(member1);
        System.out.println();
        System.out.println(member2);

        // 날짜 출력 테스트
        System.out.println("\n날짜 출력 테스트:");
        Date date = new Date(2024, 3, 18);
        date.print1(); // 2024.3.18
        date.print2(); // March 18, 2024
    }
}
