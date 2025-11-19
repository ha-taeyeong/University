package student;

import org.springframework.context.support.GenericXmlApplicationContext;
import student.controller.StudentController;
import student.domain.Student;
import student.service.StudentService;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext("classpath:applicationContext.xml");

        // --- 데이터 준비 (원래는 사용자 입력으로 받겠죠) ---
        Student newStudent = new Student();
        newStudent.setStudentId("20250101");
        newStudent.setName("홍길동");
        newStudent.setAddress("강원도 한림대학길");
        newStudent.setPhone("010-1111-2222");

        // Service를 통해 학생을 Repository에 등록
        StudentService service = ctx.getBean("serviceBean", StudentService.class);
        service.registerStudent(newStudent);
        // ---------------------------------------------
        
        // Controller를 통해 학생 정보를 조회하고 출력
        StudentController controller = ctx.getBean("controllerBean", StudentController.class);
        controller.printStudentById("20250101");

        ctx.close();
    }
}