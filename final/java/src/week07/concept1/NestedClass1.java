package week07.concept1;

public class NestedClass1 {
    public static void main(String[] args){
        Out out1 = new Out();
        out1.useB();

        // 외부클래스에서 중첩 클래스 인스턴스 생성 및 사용
        Out out2 = new Out();
        Out.In in=out2.new In();
        in.inmethod();
        Out.In.in_static_method();
    }
}
