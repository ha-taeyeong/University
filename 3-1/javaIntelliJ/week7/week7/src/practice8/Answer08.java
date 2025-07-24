package practice8;

public class Answer08 {
    public static void main(String[] args) {
        NestStudent obj[] = { new NestStudent("홍길동", 2), new NestStudent("임꺽정", 3),
                new NestStudent("심청이", 1) };
        for (NestStudent ns : obj)
            ns.stdPrint();
    }
}
