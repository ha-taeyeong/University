import java.util.*;

class ParkingLot {
    Stack<Integer> carA = new Stack<>();
    Stack<Integer> carB = new Stack<>();

    public int store(int carNum){
        if (carNum < 1000 || carNum >= 10000) {
            System.out.println("입력 오류\n처음으로 돌아갑니다");
            return -1;
        }

        if (carA.contains(carNum)) {
            System.out.println("이미 주차된 차량입니다.");
            return -1;
        }

        if (carA.size() == 10) {
            System.out.println("만차");
            return -1;
        } else {
            carA.push(carNum);
            System.out.println("주차 완료");
        }
        return 1;
    }

    public int delivery(int carNum){
        if (carNum < 1000 || carNum >= 10000) {
            System.out.println("입력 오류\n처음으로 돌아갑니다");
            return -1;
        }
        
        int carIndex = carA.search(carNum);
        if (carIndex != -1) {
            for (int i = 0; i < carIndex; i++) {
                carB.push(carA.pop());
            }
            System.out.println("출고 차량 번호: " + carB.pop());   
        } else {
            System.out.println("해당하는 차량이 없습니다");
        }
        while (!carB.isEmpty()) {
            carA.push(carB.pop());
        }
        return 1;
    }

    public int CarCount(){
        return carA.size();
    }

    public int searchCar(int carNum) {
        if (carNum < 1000 || carNum >= 10000) {
            System.out.println("입력 오류\n처음으로 돌아갑니다");
            return -1;
        }

        int position = carA.search(carNum);

        if (position != -1) {
            int parkingOrder = carA.size() - position + 1;

            System.out.println("차량 번호 " + carNum + "는 현재 주차 중입니다.");
            System.out.println("주차된 위치(입고 순서): " + parkingOrder + "번째");
            System.out.println("출고 대기 순서: 맨 위에서 " + position + "번째");
            return 1;
        } else {
            System.out.println("차량 번호 " + carNum + "는 주차되어 있지 않습니다.");
            return -1;
        }
    }
}

public class ParkingLotMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParkingLot car = new ParkingLot();
        int optNum = -1;

        System.out.println("==================================================");
        System.out.println("		  한림대 주차 서비스		");
        System.out.println("==================================================");
        System.out.println("종료(0) | 입고(1) | 출고(2) | 주차공간확인(3) | 전체조회(4)");

        while (optNum != 0) {
            System.out.print("옵션 번호: ");
            optNum = sc.nextInt();
            sc.nextLine();
            if (optNum < 0 || optNum > 5) {
                System.out.println("입력 오류\n입력을 다시 받습니다");
                continue;
            }

            switch (optNum) {
                case 0:
                    System.out.println("서비스 종료");
                    break;    
                case 1:
                    System.out.print("입고할 차량 번호(4자리): ");
                    if(car.store(sc.nextInt()) == -1) continue;
                    break;
                case 2:
                    System.out.print("출고할 차량 번호(4자리): ");
                    if(car.delivery(sc.nextInt()) == -1) continue;
                    break;
                case 3:
                    System.out.println("현재 주차된 차량은 " + car.CarCount() + "대 입니다.");
                    System.out.println("남은 주차공간은 " + (10 - car.CarCount()) + "대 입니다.");
                    break;
                case 4:
                    System.out.print("전체 차량 조회 ");
                    System.out.println(car.carA);
                    break;
                case 5:
                    System.out.print("찾을 차량 번호(4자리): ");
                    car.searchCar(sc.nextInt());
                    break;
            }
        }
        sc.close();        
    }
}
