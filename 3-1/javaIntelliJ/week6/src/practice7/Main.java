package practice7;

public class Main {
    public static void main(String[] args) {
        Person[] per = {
                         new Person("Benny", 180),
                         new Person("Daniel", 178),
                         new Person("joon", 188)
                       };

        System.out.println("------------ Person List ------------");

        for (Person p : per)
            System.out.println(p);

        System.out.println("가장 키 큰 : " + getMaximum(per));
    }

    private static String getMaximum(Person[] per) {
        Person max = per[0]; // max를 0번째로 임시지정
        // int i=1인 이유 : 0번째를 max로 저장했기 때문에 비교할 필요가 없다.
        for (int i = 1; i < per.length; i++) {
            // compareTo()는 키 비교 기준이므로, 키가 더 크면 양수(1) 반환
            if (per[i].compareTo(max) > 0) {
                // max 갱신
                max = per[i];
            }
        }
        return max.toString();
    }

}
