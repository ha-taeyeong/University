package practice7;

import java.io.*;
import java.util.ArrayList;

public class ReadObjectDat {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.dat"))) {
            ArrayList<Book> bookList = (ArrayList<Book>) ois.readObject();

            System.out.println("---- 파일에 저장된 값을 출력합니다 ----");
            for (Book book : bookList) {
                book.disPlay();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
