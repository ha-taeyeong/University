package example.string;

public class StringSplitExample {
    public static void main(String[] args) {
        String text = "홍길동&이수홍,박연수,김자바-최명호";
        String[] names = text.split("&|,|-");
        for (String word : names) {
            System.out.println(word);
        }
    }
}
