package practice3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        InputStream in = new FileInputStream("out_a.txt");

        try {
            while (true) {
                int data = in.read();
                if (data == -1) {
                    break;
                }
                System.out.print((char) data);
            }
        } finally {
            if(in != null) {
                in.close();
            }
            System.out.println(" : out_a.txt 파일의 모든 내용을 읽었습니다.");
        }
    }
}
