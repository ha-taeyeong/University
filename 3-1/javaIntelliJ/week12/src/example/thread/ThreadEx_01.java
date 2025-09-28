package example.thread;

public class ThreadEx_01 {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch);
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
        System.out.println();

        for (int cnt = 0; cnt < 10; cnt++) {
            System.out.print(cnt);
            try{
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}
