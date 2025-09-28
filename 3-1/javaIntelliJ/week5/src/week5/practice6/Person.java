package week5.practice6;

class Person {
    // 변수 선언
    private String name;        // 이름
    private String employeeId;  // 사번

    // 생성자
    public Person(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // 설정자 및 접근자
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    // 피드백 수정
    public int computeSalary() {
        return 0; // 메소드 타입이 void가 아닌 경우 반환 값이 존재해야한다.
    }

    // toString()
    @Override
    public String toString() {
        return "이름 : " + name + ", 사번 : " + employeeId;
    }
}
