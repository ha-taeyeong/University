import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] arr = new float[1000];
        int count = 0;

        while (true) {
            float temp = sc.nextFloat();
            if (temp == 999) {
                break;
            }
            arr[count++] = temp;
        }

        for (int i = 1; i < count; i++) {
            System.out.printf("%.2f\n", arr[i] - arr[i - 1]);
        }

        sc.close();
    }
}
