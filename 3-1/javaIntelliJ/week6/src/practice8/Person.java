package practice8;

class Person {
    protected String name;
    protected int age;
    protected String num;

    public Person(){
        this("anonymous", 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
