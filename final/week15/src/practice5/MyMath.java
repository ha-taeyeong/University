package practice5;

// Byte, Short, Integer, Double, Float, Long은 Number의 하위 클래스임으로, Number의 하위 클래스로 제한
class MyMath<T extends Number> {
    public double getAverage(T[] numbers) {
        // 데이터가 비어있는지 확인
        if (numbers == null || numbers.length == 0) {
            return 0.0;
        }
        // 총합 초기화
        double sum = 0.0;

        // 평균 계산
        for (T num : numbers) {
            sum += num.doubleValue(); // 실수형 타입으로 변환하여 총합에 더한다.
        }
        return sum / numbers.length;
    }
}
