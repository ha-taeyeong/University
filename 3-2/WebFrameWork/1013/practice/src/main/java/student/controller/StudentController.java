package student.controller;

import student.domain.Student; // import 경로 변경!
import student.service.StudentService;

public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public void printStudentById(String studentId) {
        // Service에게 특정 학번의 학생을 찾아달라고 요청
        Student student = studentService.findStudent(studentId);

        System.out.println("학번 : " + student.getStudentId());
        System.out.println("성명 : " + student.getName());
        System.out.println("주소 : " + student.getAddress());
        System.out.println("연락처 : " + student.getPhone());
    }
}
