package example.thread.inheritance;

public class ThreadEx_02 {
    public static void main(String[] args) { // 메인 스레드
        Thread thread = new Thread(){ // 익명 자식 객체
            public void run(){
                for(int cnt = 0 ; cnt < 10 ; cnt++){
                    System.out.print(cnt);
                }
            }
        };

        thread.start(); // 익명 자식 객체 스레드
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print(ch);
        }
        System.out.println();
    }
}
