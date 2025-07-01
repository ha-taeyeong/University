package test;

import java.util.*;

public class Test {
    public static void printMap(Map<String, English> map) {
        System.out.println("==== Map에 저장된 결과 ====");
        for (String key : map.keySet()) {
            English value = map.get(key);
            System.out.println("key=" + key + ", value=" + value);
        }
    }
    public static void main(String[] args) {
        Map<String, English> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        String[] word = {"actor", "age", "answer", "arm", "autumn", "air", "airplane"};
        String[] mean = {"배우", "나이", "대답", "팔", "가을", "공기", "비행기"};

        for (int i=0; i<word.length; i++) {
            map.put(word[i], new English(word[i], mean[i]));
        }
        printMap(map);

        System.out.print("\n 삭제하고자 하는 영단어를 입력하시오 >> ");
        String del = sc.next();
        if(map.containsKey(del)) {
            map.remove(del);
            System.out.println(del + " 단어를 삭제합니다.");
        } else {
            System.out.println(del + " 단어가 존재하지 않습니다.");
        }
        printMap(map);

        System.out.print("\n추가 하고자 하는 영단어를 입력하시오 >> ");
        String addWord = sc.next();
        System.out.print("단어의 뜻을 입력하시오 >> ");
        String addMean = sc.next();
        map.put(addWord, new English(addWord, addMean));

        printMap(map);
    }
}