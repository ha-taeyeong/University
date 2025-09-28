package example.time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeInfo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        String strDateTime = now.getYear() + "년 ";
        strDateTime += now.getMonthValue() + "월 ";
        strDateTime += now.getDayOfMonth() + "일 ";
        strDateTime += now.getDayOfWeek() + " ";
        strDateTime += now.getHour() + "시 ";
        strDateTime += now.getMinute() + "분 ";
        strDateTime += now.getSecond() + "초 ";
        System.out.println(strDateTime + "\n");

        LocalDate nowDate = now.toLocalDate();
        if(nowDate.isLeapYear()) {
            System.out.println("올해는 윤년: 2월은 29일까지 있습니다.\n");
        } else {
            System.out.println("올해는 평년: 2월은 28일까지 있습니다.\n");
        }
    }
}
