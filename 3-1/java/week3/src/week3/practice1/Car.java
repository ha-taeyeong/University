package week3.practice1;

public class Car {
	private Engine engine; // 집합 관계: Car는 Engine을 포함
    private String model;

    public Car(String model, Engine engine){
        this.model = model;
        this.engine = engine;
    }

    public void displayCarInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Engine Type: " + engine.getType());
    }

    // 정적 메소드: 여러 자동차 정보를 배열을 통해 출력
    public static void displayCarsInfo(Car[] cars) {
        for (Car car : cars) {
            car.displayCarInfo();
            System.out.println("---------------");
        }
    }
}
