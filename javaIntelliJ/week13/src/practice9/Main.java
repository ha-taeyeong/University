package practice9;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine(); // Did you sleep well last night?
        System.out.println(str);

        StringTokenizer st = new StringTokenizer(str, " ");

        String[] words = new String[st.countTokens()];

        int i = 0;
        while(st.hasMoreTokens()) {
            words[i++] = st.nextToken();
        }
        System.out.println("정렬 전 결과 :");
        for(String word : words) {
            System.out.print(word + "   ");
        }
        System.out.println("");
        Arrays.sort(words);
        System.out.println("정렬 후 결과 :");
        for(String word : words) {
            System.out.print(word + "   ");
        }
    }
}
