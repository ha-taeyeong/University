package practice7;

import java.io.*;
import java.util.*;

public class WriteObjectDat {
    public static void main(String[] args) throws IOException {
        List<Book> bookList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("도서명, 저자를 입력하세요 : ");
            String[] arr = sc.nextLine().split(" ");
            if (arr.length < 2) {
                System.out.println("도서명과 저자명을 모두 입력하세요.");
                continue;
            }
            bookList.add(new Book(arr[0], arr[1]));

            System.out.print("리스트에 저장을 원하지 않으면 q 입력 : ");
            String quit = sc. next();
            sc.nextLine(); // 버퍼 정리
            if (quit.equalsIgnoreCase("q")){
                System.out.println("리스트를 파일에 저장합니다.");
                break;
            }

        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.dat"))) {
            oos.writeObject(bookList);
        }
    }
}
