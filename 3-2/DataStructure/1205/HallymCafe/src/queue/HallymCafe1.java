package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

// ----------------------
// 1. Customer 클래스 정의 (도착 시간, 대기 시간 필드 추가)
// ----------------------
class Customer1 {
    String name;
    String order;	
    int prepTime;
    int arrivalTime; // 고객이 큐에 도착한 시간 (분 단위)
    int waitingTime = 0; // 고객이 서비스 시작 전까지 대기한 시간

    public Customer1(String name, String order, int prepTime, int arrivalTime) {
        this.name = name;
        this.order = order;
        this.prepTime = prepTime;
        this.arrivalTime = arrivalTime;
    }
}

public class HallymCafe1 {
    public static void main(String[] args) {
        // ----------------------
        // 변수 초기화 및 지표 추적 변수 추가
        // ----------------------
        Queue<Customer1> queue = new LinkedList<>();
        Random rand = new Random();
        String[] menu = {"오렌지주스", "카페라테", "카페모카"};
        int[] prepTimes = {1, 5, 6}; // 각 메뉴 조리 시간 (분)

        int totalMinutes = 60; // 60분동안 시뮬레이션
        int currentMinute = 0;

        int customerCounter = 1;
        int baristaFreeAt = 0; // 바리스타가 자유로워지는 시간 (이전 서비스 종료 시간)

        // 지표 추적을 위한 변수
        int totalWaitTime = 0; // 총 대기 시간 누적
        int maxWaitTime = 0;   // 최대 대기 시간
        int totalIdleTime = 0; // 바리스타 총 유휴 시간 누적
        int servedCustomerCount = 0; // 60분 시뮬레이션 이후에 처리된 손님 포함

        // ----------------------
        // 60분 시뮬레이션 루프
        // ----------------------
        while (currentMinute < totalMinutes) {
            // A. 손님 발생 및 큐 추가 (도착 시간 기록)
            int addCustomer = rand.nextInt(10);
            if (addCustomer < 3) { // 매분 30%의 확률로 손님 발생
                int menuIndex = rand.nextInt(menu.length);
                
                // Customer 객체 생성 시 현재 시간(currentMinute)을 도착 시간으로 기록
                Customer1 c = new Customer1("손님" + customerCounter, menu[menuIndex], prepTimes[menuIndex], currentMinute);
                queue.add(c);
                System.out.println("[" + currentMinute + "분] " + c.name + " 입장, 주문: " + c.order + ", 도착시간: " + c.arrivalTime);
                customerCounter++;
            }

            // B. 바리스타가 큐에 있는 손님을 처리
            if (!queue.isEmpty() && currentMinute >= baristaFreeAt) {
                Customer1 c = queue.poll(); // 대기 첫 번째 손님 큐를 떠남
                
                // 1. 대기 시간 계산 및 최대 대기 시간 업데이트
                int wait = currentMinute - c.arrivalTime;
                c.waitingTime = wait;
                totalWaitTime += wait;
                if (wait > maxWaitTime) {
                    maxWaitTime = wait;
                }
                
                // 2. 바리스타 유휴 시간 계산 및 누적
                // 바리스타가 자유로운 시간(baristaFreeAt)이 현재 시간(currentMinute)보다 작거나 같다면 
                // 바리스타는 대기하지 않았거나(baristaFreeAt == currentMinute),
                // 현재 시간보다 일찍 자유로워져서(baristaFreeAt < currentMinute) 그 시간만큼 유휴 상태였음.
                // 하지만 시뮬레이션 루프가 분 단위로 진행되므로, 손님 처리 시점인 currentMinute에서
                // baristaFreeAt와의 차이가 바리스타가 고객을 기다린 시간, 즉 유휴 시간임.
                // *주의: currentMinute >= baristaFreeAt 조건을 이미 만족하고 있음*
                int idle = currentMinute - baristaFreeAt;
                if (idle > 0) {
                    totalIdleTime += idle;
                }

                // 3. 서비스 시작 및 바리스타 종료 시간 업데이트
                baristaFreeAt = currentMinute + c.prepTime; // 바리스타는 현재 시간 + 메뉴 조리 시간동안 바쁨
                servedCustomerCount++;
                
                System.out.println(
                    "[" + currentMinute + "분] " + c.name + 
                    " 주문 시작 (대기시간: " + c.waitingTime + 
                    "분, " + c.order + " " + c.prepTime + "분 소요)");
            }

            currentMinute++; // 1분 시간 증가
        }

        // ----------------------
        // 60분이 지나고 남은 손님 처리 (잔여 고객 처리)
        // ----------------------
        while (!queue.isEmpty()) {
            Customer1 c = queue.poll();
            
            // 서비스 시작 시간은 바리스타가 자유로워지는 시간(baristaFreeAt)이 됨
            int serviceStartTime = baristaFreeAt;

            // 대기 시간 계산 및 최대 대기 시간 업데이트
            int wait = serviceStartTime - c.arrivalTime;
            c.waitingTime = wait;
            totalWaitTime += wait;
            if (wait > maxWaitTime) {
                maxWaitTime = wait;
            }
            
            // 유휴 시간 계산 (이 루프는 60분 이후의 연속된 서비스이므로, 유휴 시간은 0임.
            // 바리스타가 한 번 자유로워지면 연속적으로 고객을 처리함)

            baristaFreeAt += c.prepTime;
            servedCustomerCount++;

            System.out.println(
                "[" + serviceStartTime + "분] " + c.name + 
                " 주문 시작 (대기시간: " + c.waitingTime + 
                "분, " + c.order + " " + c.prepTime + "분 소요)");
        }
        
        // ----------------------
        // 결과 출력
        // ----------------------
        System.out.println("\n==================================");
        System.out.println("          시뮬레이션 종료           ");
        System.out.println("==================================");

        if (servedCustomerCount > 0) {
            // 1. 고객의 평균 대기 시간 계산
            double averageWaitTime = (double) totalWaitTime / servedCustomerCount;

            System.out.println("1. 총 서비스된 고객 수: " + servedCustomerCount + "명");
            System.out.println("2. 가장 오래 기다린 고객의 대기 시간: " + maxWaitTime + "분");
            System.out.printf("3. 고객의 평균 대기 시간: %.2f분\n", averageWaitTime);
            System.out.println("4. 바리스타 총 유휴 시간: " + totalIdleTime + "분");
        } else {
            System.out.println("60분 동안 서비스된 고객이 없습니다.");
            System.out.println("바리스타 총 유휴 시간: " + totalMinutes + "분");
        }
    }
}