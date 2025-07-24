package practice6;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void write(ArrayList<String> list) {
        System.out.println("------ 리스트 출력 ------");
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        String[] s = { "사과", "배", "바나나" };
        ArrayList<String> list = new ArrayList(Arrays.asList(s));  //배열을 리스트로 변환

        // ①	“포도”를 리스트 마지막에 삽입
        list.add(list.size(), "포도");

        // ②	“자몽”을 인덱스 2에 삽입
        list.add(2,"자몽");

        // ③	리스트에 저장된 데이터 출력
        write(list);

        // ④	인덱스 3에 저장된 데이터 출력
        String a = list.get(3);
        System.out.println("----------------------");
        System.out.println("인덱스 3 : " + a);

        // ⑦	“배”가 저장된 위치를 출력
        int idx = list.indexOf("배");
        System.out.println("배가 저장된 위치 : " + idx);

        // ⑤	인덱스 2에 저장된 데이터를 “메론”으로 변경
        list.set(2, "메론");

        // ⑥	“배” 를 리스트 마지막에 삽입
        list.add(list.size(), "배");

        // ⑧	리스트에서 “바나나” 데이터 삭제 – remove(Object obj), remove(int index)
        list.remove("바나나");

        // ⑨	리스트에 저장된 데이터 출력
        write(list);
    }
}
