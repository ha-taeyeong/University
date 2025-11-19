package student.repository;

import org.springframework.stereotype.Repository;
import student.domain.Student;

import java.util.HashMap;
import java.util.Map;

public class MemoryStudentRepository implements StudentRepository {

    // 메모리 DB 역할을 할 HashMap
    private static final Map<String, Student> store = new HashMap<>();

    @Override
    public void save(Student student) {
        store.put(student.getStudentId(), student);
    }

    @Override
    public Student findById(String studentId) {
        return store.get(studentId);
    }
}
