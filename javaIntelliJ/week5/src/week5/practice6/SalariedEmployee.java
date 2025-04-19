package week5.practice6;

public class SalariedEmployee extends Person {
    // 변수 선언
    private int salary;  // 월급

    // 생성자
    public SalariedEmployee(String name, String employeeId, int salary) {
        super(name, employeeId);
        this.salary = salary;
    }

    // 설정자 및 접근자
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // 메소드
    @Override // 피드백 수정
    public int computeSalary() {
        return salary * 12; // 연봉
    }

    // toString()
    @Override
    public String toString() {
        return super.toString() + ", 급여 : " + salary + ", 연봉 : " + computeSalary();
    }
}
