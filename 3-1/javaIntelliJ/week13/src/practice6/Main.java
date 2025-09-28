package practice6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate after5days = today.plusDays(5);
        System.out.println("현재 날짜 : " + today);
        System.out.println("5일 후 : " + after5days);
    }
}
