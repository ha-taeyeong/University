package practice8;

public class Test {
    public static void main(String[] args) {
        Person [] per = new Person[6];

        per[0] = new Person();
        per[1] = new Person("benny", 20);
        per[2] = new Student();
        per[3] = new Student(2015, 3);
        per[4] = new Staff();
        per[5] = new Staff(8);

        for(Person obj : per) {
            System.out.println(obj);
        }
    }
}
