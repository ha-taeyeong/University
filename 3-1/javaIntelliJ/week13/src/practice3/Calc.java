package practice3;

import java.util.Arrays;

public class Calc {
    private String[] arr;
    private int[] nums;
    public Calc(String digitStr) {
        arr = digitStr.split(",");
        nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].trim();
            nums[i] = Integer.parseInt(arr[i].trim());
        }
    }

    public void show() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.print("소수 : ");
        for (int i = 0; i < nums.length; i++) {
            if(isPrime(nums[i])) {
                System.out.print(nums[i] + " ");
            }
        }
        System.out.println("");
    }

    public boolean isPrime(int n) {
        if (n <= 1) { // 1이하면 소수가 아님
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) { // 약수가 있으면 소수가 아님
                return false;
            }
        }
        return true;
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(isPrime(nums[i])) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
