package practice5;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. output.txt에 문자열 저장
        FileWriter fw = new FileWriter("output.txt");
        fw.write("d g e i d k d j s w t k d");
        fw.close();

        System.out.println("파일 복사 완료");

        // 2. output.txt → copy.txt로 복사 및 화면 출력
        FileReader fr = new FileReader("output.txt");
        FileWriter fw2 = new FileWriter("copy.txt");
        int data;
        System.out.println("====== output.txt 파일 내용 ======");
        while ((data = fr.read()) != -1) {
            fw2.write(data); // output.txt 데이터를 copy.txt에 저장
            System.out.print((char) data); // output.txt 데이터 조회
        }
        fr.close();
        fw2.close();

        // 3. copy.txt 내용 화면 출력
        FileReader fr2 = new FileReader("copy.txt");
        int copyData;
        System.out.println("\n====== copy.txt 파일 내용 ======");
        while ((copyData = fr2.read()) != -1) {
            System.out.print((char) copyData);
        }
        fr2.close();
    }
}
