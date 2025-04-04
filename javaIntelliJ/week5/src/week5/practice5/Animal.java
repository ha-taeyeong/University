package week5.practice5;

abstract class Animal {
    // 변수 선언
    protected String name;      // 이름
    protected boolean isTailUp; // 꼬리상태

    // 생성자
    public Animal(String name, boolean isTailUp) {
        this.name = (name != null) ? name : "Anonymous";
        this.isTailUp = isTailUp;
    }

    // getter
    // getter만 하는 이유 name을 추상클래스에서 선언해도 수정할 수 없기 때문이다.
    public String getName() {
        return name;
    }

    // 메소드
    public abstract String getType();
    public abstract void sound();

    public String reaction(Animal ani) {
        return isTailUp ? "꼬리올리고" : "꼬리내리고";
    }

    @Override
    public String toString() {
        return name + getType();
    }
}
