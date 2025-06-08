package week07.concept1;

class Out {
    private int outfield;

    Out() {System.out.println("Out 객체 생성");}
    class In { // 중첩 클래스
        int infield;

        static int sfield = 10; // 정적 필드
        static void in_static_method() {
            System.out.println("In 클래스 내부의 정적 메소드");
        }

        In() {
            System.out.println("in 객체 생성");
            outfield = 50;
            infield = 40;
        }

        void inmethod() {
            System.out.println("-- 내부 클래스 inmethod 실행 --");
            System.out.println("바깥 클래스 멤버 outfield : " + outfield);
            System.out.println("안쪽 클래스 멤버 infield : " + infield);
        }

    }

    void useB() {
        // 중첩 클래스 인스턴스 필드 및 메소드 사용
        In in = new In();
        System.out.println("내부 클래스 인스턴스 필드 : " + in.infield);
        in.inmethod();
        // 중첩 클래스 정적 멤버 사용
        System.out.println("내부 클래스 정적 필드 = "+In.sfield);
        In.in_static_method();
    }
}
