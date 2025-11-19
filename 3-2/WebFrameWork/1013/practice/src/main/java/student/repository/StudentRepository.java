package student.repository;

import student.domain.Student;

public interface StudentRepository {
	// 학생 정보를 저장하는 기능
    void save(Student student);
    
    // 학번(ID)으로 학생을 찾는 기능
    Student findById(String studentId);
}
