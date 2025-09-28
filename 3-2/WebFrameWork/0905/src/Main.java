import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        while(true) {
            System.out.print("개인 정보를 입력(이름, 학과, 나이, 성적 순으로 입력하세요)     : ");
            String input = sc.nextLine().trim();
            String[] parts = input.split("\\s+");

            if(parts.length < 4) {
                System.out.println("->모든 정보를 입력하셔야 합니다. 다시 입력하세요.");
                continue;
            }

            try {
                String name = parts[0];
                String department = parts[1];
                int age = Integer.parseInt(parts[2]);
                int score = Integer.parseInt(parts[3]);

                student.inputData(name, department, age, score);
                student.calculateGrade();
                student.passOrFail();

                System.out.println("->입력이 모두 완료되었습니다. 해당 결과를 출력합니다.");
                student.printInfo();
                break;
            } catch(NumberFormatException e) {
                System.out.println("->나이와 성적은 숫자로 입력해야 합니다. 다시 입력하세요.");
            }
        }
        sc.close();
    }
}