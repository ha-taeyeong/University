package practice3;

import java.util.Scanner;

public class Answer03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("기기를 선택하세요\n 1: MP3 2: CDPlay 3: WindowMediaPlay >>");
        String instru = sc.next();
        //Media 클래스를 상속받는 익명 자식 객체 구현 – 본인 작성
        Media media = new Media(){
            public void play(String instru) {
                switch(instru){
                    case "1":
                        System.out.println("MP3를 재생합니다.");
                        break;
                    case "2":
                        System.out.println("CDPlay를 재생합니다.");
                        break;
                    case "3":
                        System.out.println("WindowMediaPlay를 재생합니다.");
                        break;
                    default:
                        System.out.println("잘못된 입력입니다.");
                }
            }
            public void stop(String instru){
                switch(instru){
                    case "1":
                        System.out.println("MP3를 중지합니다.");
                        break;
                    case "2":
                        System.out.println("CDPlay를 중지합니다.");
                        break;
                    case "3":
                        System.out.println("WindowMediaPlay를 중지합니다.");
                        break;
                    default:
                        System.out.println("잘못된 입력입니다.");
                }
            }
        };
        //메뉴를 선택하고 실행 – 본인 작성
        media.play(instru);
        media.stop(instru);
    }
}
