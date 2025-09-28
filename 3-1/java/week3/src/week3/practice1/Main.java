package week3.practice1;

public class Main {

	public static void main(String[] args) {
		Engine engine1 = new Engine("V8");
        Engine engine2 = new Engine("Electric");

        Car car1 = new Car("Mustang", engine1);
        Car car2 = new Car("Tesla", engine2);

        Car[] cars = {car1, car2}; // 사용 관계: 메인 메소드에서 Car 배열을 사용

        Car.displayCarsInfo(cars); // 정적 메소드 호출(클래스 이름으로 호출할 수 있다)
	}

}
