package week5.practice6;

public class Test {
    public static void main(String[] args) {

        SalariedEmployee emp1 = new SalariedEmployee("soft", "2345", 70);
        SalariedEmployee emp2 = new SalariedEmployee("hallym", "6534", 85);

        HourEmployee emp3 = new HourEmployee("info", "2345", 60, 6);
        HourEmployee emp4 = new HourEmployee("computer", "8546", 55, 8);

        System.out.println("------------------- 직원 목록 출력 -------------------");
        System.out.println(emp1);
        System.out.println(emp3);
        System.out.println(emp2);
        System.out.println(emp4);

        System.out.println("--------------- SalariedEmployee 연봉 출력 -------------------");
        System.out.println("이름 : " + emp1.getName() + ", 연봉 : " + emp1.computeSalary());
        System.out.println("이름 : " + emp2.getName() + ", 연봉 : " + emp2.computeSalary());
    }
}
