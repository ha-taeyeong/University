package practice7;

class Person implements IComparable {
    private String name;
    private double height;

    public Person(String name, double height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public int compareTo(Object other) {
        if(other instanceof Person) {
            Person p = (Person) other;
            if (this.height > p.height) {
                return 1;
            } else if (this.height == p.height) {
                return 0;
            } else {
                return -1;
            }
        }
        // 잘못된 타입의 객체가 들어오더라도 프로그램이 에러 없이 동작하도록 처리
        return -1;
    }

    public String toString() {
        return "Person [name=" + name + ", height=" + height + "]";
    }
}
