package practice6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] result = new int[6];
        Random random = new Random();
        int count = 0; // 배열 원소 개수 초기값 0

        while(count < 6) { // count가 6까지 반복
            int number = random.nextInt(45) + 1; // 1~45까지의 정수 난수 발생
            boolean isDuplicate = false; // 중복유무 초기값 false

            for (int i = 0; i < count; i++) {
                // 중복체크
                if(result[i] == number) {
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate) {
                result[count] = number;
                count++;
            }
        }
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
