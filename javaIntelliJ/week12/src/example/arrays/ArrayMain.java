package example.arrays;

import java.util.Arrays;

public class ArrayMain {
    public static void main(String[] args) {
        iMember m1 = new iMember("홍길동");
        iMember m2 = new iMember("박동수");
        iMember m3 = new iMember("김민수");
        iMember[] members = {m1, m2, m3};
        Arrays.sort(members);
        for(int i=0; i<members.length; i++) {
            System.out.println("members[" + i + "] = " + members[i].name);
        }
        int index = Arrays.binarySearch(members, m1);
        System.out.println("찾은 인덱스: " + index);
    }
}
