package practice2;

class  Calculator{
    //1) 인터페이스 Control 타입을 갖는 필드 변수 cal 선언 – 본인 작성
    Control cal;

    //2) 인터페이스 Control 타입 매개변수 1개를 갖는 setControl() 메소드 구현 – 본인 작성
    //반환값 없으며 매개변수를 필드 변수 값으로 대입
    void setControl(Control cal){
        this.cal = cal;
    }

    void compute(int a, int b){
        cal.run(a, b);
    }

    static interface Control{ // static 생략 가능
        void run(int a, int b);
    }
}