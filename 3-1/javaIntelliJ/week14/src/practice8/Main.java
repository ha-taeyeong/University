package practice8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<Integer, Member> map = new HashMap<>();
        int count = 0;
        System.out.println("마라톤 참가자를 등록합니다.");
        System.out.println("참가자 이름을 입력해주세요 (종료하려면 'exit' 입력):");
        while(true) {
            System.out.print("참가자 이름 : ");
            String name = sc.next();
            if(name.equals("exit")) {
                break;
            }
            count++;
            map.put(count, new Member(count, name));
            System.out.println("등록 완료! 현재 참가자 수 : " + count);
        }
        System.out.println("\n 참가자 목록:");
        for (Member m : map.values()){
            System.out.println(m);
        }
    }
}
