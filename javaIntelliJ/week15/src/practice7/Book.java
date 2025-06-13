package practice7;

import java.io.*;

class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name; // 도서명
    private String author; // 저자명
    public Book(String name, String author){
        this.name=name;
        this.author=author;
    }
    public void disPlay(){
        System.out.print("도서명 : " + name);
        System.out.println("\t저자명 : " + author);
    }
}
