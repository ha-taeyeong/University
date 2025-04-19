package backZoon;
/*
문제
삼각형의 세 변의 길이가 주어질 때 변의 길이에 따라 다음과 같이 정의한다.

Equilateral :  세 변의 길이가 모두 같은 경우
Isosceles : 두 변의 길이만 같은 경우
Scalene : 세 변의 길이가 모두 다른 경우
단 주어진 세 변의 길이가 삼각형의 조건을 만족하지 못하는 경우에는 "Invalid" 를 출력한다. 예를 들어 6, 3, 2가 이 경우에 해당한다. 가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면 삼각형의 조건을 만족하지 못한다.

세 변의 길이가 주어질 때 위 정의에 따른 결과를 출력하시오.

입력
각 줄에는 1,000을 넘지 않는 양의 정수 3개가 입력된다. 마지막 줄은 0 0 0이며 이 줄은 계산하지 않는다.

출력
각 입력에 맞는 결과 (Equilateral, Isosceles, Scalene, Invalid) 를 출력하시오.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Prac7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0 0 0")) {
                break;
            } else {
                String[] stringArray = input.split(" ");
                int[] intArray = new int[stringArray.length];
                for(int i=0; i < stringArray.length; i++) {
                    intArray[i] = Integer.parseInt(stringArray[i]);
                }
                int max = intArray[0];

                for (int i = 1; i < intArray.length; i++) {
                    if (intArray[i] > max) {
                        max = intArray[i];
                    }
                }
                Arrays.sort(intArray);
                int a = intArray[0];
                int b = intArray[1];
                int c = intArray[2]; // 가장 긴 변

                if (c >= a + b) {
                    System.out.println("Invalid");
                } else if((max == (a + b) && max == (a + c)) ||
                        (max == (b + c))){
                    System.out.println("Invalid");
                } else if((a == b && a != c) ||
                        (a == c && a != b) ||
                        (b == c && b != a)) {
                    System.out.println("Isosceles");
                } else if(a != b && b != c) {
                    System.out.println("Scalene");
                } else if(a == b && b == c) {
                    System.out.println("Equilateral");
                } else if (a == 0 && b == 0 && c == 0) {

                }
            }
        }
        scanner.close();
    }
}