package example.thread.runnable;

public class ThreadExam {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadImp());
        thread.start(); // 스레드를 시작
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch);
        }
    }
}
