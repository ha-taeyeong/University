package practice8;

import java.util.Scanner;

//중첩 클래스
class NestStudent {
    // 1) 필드 선언
    // 학생 이름(private, String)
    private String name;
    // 수강과목(private, Suject)
    private Subject subject;

    public NestStudent(String name, int cnt) {
        //학생 이름 초기화
        this.name = name;
        System.out.println(name + "==>");
        //Subject 객체 생성, 생성자 매개변수로 cnt 전달
        subject = new Subject(cnt);
    }
    void stdPrint() { // 객체 내용 출력
        // 학생 이름 출력
        System.out.println("======================================");
        System.out.println(name + "학생의 수강과목");
        // Subject 객체의 subjectprint() 를 호출하여 수강과목 출력
        subject.subjectprint();
    }

    //인스턴스 멤버 클래스
    class Subject {

        // 수강 과목을 저장할 배열 선언
        private String[] subs;

        public Subject(int num) {
            //매개변수로 받은 값만큼 배열을 생성하고 수강과목을 입력 받아 저장
            subs = new String[num];
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < num; i++) {
                System.out.print("수강과목(" + (i + 1) + ") : ");
                subs[i] = sc.next();
            }
        }

        public void subjectprint() {
            //배열에 저장된 수강과목 출력
            for (int i = 0; i < subs.length; i++) {
                System.out.println(subs[i]);
            }
        }
    }
}
