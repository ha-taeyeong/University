package practice9;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest{
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            list.add(new Student("name" + i, "phone" + i));
        }
        for (Student s : list)
            System.out.println(s);

        boolean running = true;
        while(running) {
            System.out.println("1. 등록, 2. 검색, 3. 삭제, 4. 전체조회, 5. 종료");
            int menu = 0;
            System.out.print("메뉴 번호를 입력해주세요 : ");
            menu = sc.nextInt();
            switch (menu){
                case 1: //사용자에게 이름을 입력 받아 추가 – 본인작성
                    System.out.print("이름을 입력하세요 : ");
                    String name = sc.next();
                    System.out.print("전화번호를 입력하세요 : ");
                    String phone = sc.next();
                    list.add(new Student(name, phone));
                    System.out.println("등록완료되었습니다.");
                    break;
                case 2: //사용자에게 이름을 입력 받아 전화번호 검색 – 본인 작성
                    System.out.print("전화번호 검색할 이름을 입력해주세요 : ");
                    String search = sc.next();
                    boolean found = false;

                    for (Student s : list) {
                        if (s.getName().equals(search)) {
                            System.out.println(search + "의 전화번호 : " + s.getPhone());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println(search + "의 정보를 찾을 수 없습니다.");
                    }
                    break;
                case 3: //사용자에게 이름을 입력 받아 삭제 – 본인 작성
                    System.out.print("삭제할 이름을 입력해주세요 : ");
                    String del = sc.next();
                    Student toRemove = null;
                    // 향상된 for문(for-each)에서 직접 삭제하면 ConcurrentModificationException 발생할 수 있다.
                    for (Student s : list) {
                        if (s.getName().equals(del)) {
                            toRemove = s;
                            break;
                        }
                    }
                    if (toRemove != null) {
                        list.remove(toRemove);
                        System.out.println(del + "의 정보가 삭제되었습니다.");
                    } else {
                        System.out.println(del + "의 정보를 찾을 수 없습니다.");
                    }
                    break;
                case 4: //모든 사용자 정보 출력 – 본인 작성
                    for (Student s : list) {
                        System.out.println(s);
                    }
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("잘못된 입력하였습니다.");
            }
        }
    }
}
