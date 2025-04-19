import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for(int x = 1; x * x <= n; x++) {
            if (n % x != 0) continue;

            int y = n / x;

            if((x + y) % 2 != 0) continue;
            if((y - x) % 2 != 0) continue;

            int A = (x + y) / 2;;
            int B = (y - x) / 2;

            if(A <= 500 && B >= 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
