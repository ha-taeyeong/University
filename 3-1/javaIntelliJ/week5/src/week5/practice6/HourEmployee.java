package week5.practice6;

public class HourEmployee extends Person {
    // 변수 선언
    private int hourlySalary;
    private int workedHours;

    // 생성자
    public HourEmployee(String name, String employeeId, int hourlySalary, int workedHours) {
        super(name, employeeId);
        this.hourlySalary = hourlySalary;
        this.workedHours = workedHours;
    }

    // 설정자 및 접근자
    public int getHourlySalary() {
        return hourlySalary * workedHours; // 금액 계산
    }

    public void setHourlySalary(int hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    @Override // 피드백 수정
    public int computeSalary() {
        return hourlySalary * workedHours; // 임금 계산
    }

    // toString()
    @Override
    public String toString() {
        return super.toString() + ", 시간당 임금: " + hourlySalary + ", 일한시간: " + workedHours + ", 금액: " + computeSalary();
    }
}
