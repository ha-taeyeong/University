package practice4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"))){
            System.out.println("기초 자료형을 파일로 출력합니다.");
            dos.writeShort(3);
            dos.writeInt(34);
            dos.writeLong(3456L);
            dos.writeFloat(3.14f);
            dos.writeDouble(3.14);
        }

        try(DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))) {
            System.out.println("파일에 저장된 기초 자료형을 출력합니다.");
            System.out.println(dis.readShort());
            System.out.println(dis.readInt());
            System.out.println(dis.readLong());
            System.out.println(dis.readFloat());
            System.out.println(dis.readDouble());
        }
    }
}
