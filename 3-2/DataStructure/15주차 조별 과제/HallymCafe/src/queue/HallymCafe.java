package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class Customer {
    String name;
    String order;	
    int prepTime;

    public Customer(String name, String order, int prepTime) {
        this.name = name;
        this.order = order;
        this.prepTime = prepTime;
    }
}

public class HallymCafe {
    public static void main(String[] args) {
        Queue<Customer> queue = new LinkedList<>();
        Random rand = new Random();
        String[] menu = {"오렌지주스", "카페라테", "카페모카"};
        int[] prepTimes = {1, 5, 6}; // 각 메뉴 조리 시간

        int totalMinutes = 60; //60분동안 시뮬레이션
        int currentMinute = 0;

        int customerCounter = 1;
        int baristaFreeAt = 0; // 바리스타가 자유로워지는 시간

        while (currentMinute < totalMinutes) {
                int addCustomer=rand.nextInt(10);
        	if (addCustomer<3) {//매분 30%의 확률로 손님발생
                    int menuIndex = rand.nextInt(menu.length);
                    Customer c = new Customer("손님" + customerCounter, menu[menuIndex], prepTimes[menuIndex]); //손님 c 생성
                    queue.add(c); //손님 c를 큐에 추가
                    System.out.println("[" + currentMinute + "분] " + c.name + " 입장, 주문: " + c.order);
                    customerCounter++; //큐에 추가된 손님수. 60분동안 서비스한 손님수 출력에 사용
            }

            // 바리스타가 큐에 있는 손님을 처리
            if (!queue.isEmpty() && currentMinute >= baristaFreeAt) {
                Customer c = queue.poll(); //딩동. 대기 첫번째 손님 큐를 떠남
                baristaFreeAt = currentMinute + c.prepTime; //바리스타는 현재시간+메뉴조리시간동안 바쁨
                System.out.println("[" + currentMinute + "분] " + c.name + " 주문 시작 (" + c.order + " " + c.prepTime + "분 소요)");
            }

            currentMinute++; //1분시간증가
        }

        // 60분이 지나고 남은 손님 처리
        while (!queue.isEmpty()) {
            Customer c = queue.poll();
            System.out.println("[" + baristaFreeAt + "분] " + c.name + " 주문 시작 (" + c.order + " " + c.prepTime + "분 소요)");
            baristaFreeAt += c.prepTime;
        }

        System.out.println("시뮬레이션 종료");
    }
}
