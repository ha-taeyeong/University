package student.service;

import student.domain.Student;
import student.repository.StudentRepository;

public class StudentService {

    private final StudentRepository studentRepository;

    // Service는 Repository가 필요하므로 생성자를 통해 주입받습니다.
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    
    // 학생을 등록하는 비즈니스 로직
    public void registerStudent(Student student) {
        studentRepository.save(student);
    }

    // 학생을 조회하는 비즈니스 로직
    public Student findStudent(String studentId) {
        return studentRepository.findById(studentId);
    }
}
