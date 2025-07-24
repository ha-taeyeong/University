package example.string;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String text = "홍길동/이수홍/박연수";

        // how1: 전체 토큰 수를 얻어 for문으로 루핑
        StringTokenizer st = new StringTokenizer(text, "/");
        int countTokens = st.countTokens();
        System.out.println(countTokens);
        for(int i = 0; i < countTokens; i++) {
            String token = st.nextToken();
            System.out.println(token);
        }

        // how2: 남아 있는 토큰을 확인하고 while문으로 루팡
        st = new StringTokenizer(text, "/");
        System.out.println(st.hasMoreTokens());
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
