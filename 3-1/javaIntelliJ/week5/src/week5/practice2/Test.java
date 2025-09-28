package week5.practice2;

// Test 클래스
public class Test {
    public static void main(String[] args) {
        // Fruit 타입의 배열을 생성하고 다양한 객체를 저장합니다.
        Fruit[] fary = new Fruit[4];
        fary[0] = new Grape();
        fary[1] = new Apple();
        fary[2] = new Grape();
        fary[3] = new Pear();

        // printFruit() 메소드를 호출하여 각 객체의 me() 메소드 실행
        printFruit(fary);
    }

    // printFruit() 메소드: 매개변수로 전달된 객체에 대해 me() 메소드를 호출
    public static void printFruit(Fruit[] fruits) {
        for (Fruit fruit : fruits) {
            fruit.me();  // me() 메소드 호출
            if (fruit instanceof Grape) {
                System.out.println(fruit.save());  // Grape 객체일 경우 save() 호출
            }
        }
    }
}
