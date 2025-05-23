package pracitce3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // lastIndexOf()
        String str1 = "Hello World!";
        System.out.println("str1 = " + str1);
        System.out.println("lastIndexOf() = " + str1.lastIndexOf("l"));

        // equalsIgnoreCase()
        String str2 = "hello world!";
        System.out.println("str2 = " + str2);
        System.out.println("equalsIgnoreCase() = " + str1.equalsIgnoreCase(str2));

        // isBlank()
        String str3 = "";
        System.out.println("str3 = " + str3);
        System.out.println("isBlank() = " + str3.isBlank());

        // toCharArray()
        char[] chars = str1.toCharArray();
        System.out.println("toCharArray() = " + Arrays.toString(chars));
    }
}
