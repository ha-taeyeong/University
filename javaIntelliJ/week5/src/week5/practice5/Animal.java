package week5.practice5;

abstract class Animal {
    // 변수 선언
    // 피드백 수정
    protected String name;  // 이름

    // 생성자
    // 피드백 수정
    public Animal(String name) {
        this.name = (name != null) ? name : "Anonymous";
    }

    // 메소드
    public abstract void sound();

    // 피드백 수정
    public String reaction(Animal ani) {
        // instanceof : 객체가 특정 클래스 또는 그 하위 클래스의 인스턴스인지 확인하는 데 사용된다.
        return ani instanceof Dog ? "강아지_꼬리올리고" : "고양이_꼬리내리고";
    }

    @Override
    public String toString() {
        return name;
    }
}
