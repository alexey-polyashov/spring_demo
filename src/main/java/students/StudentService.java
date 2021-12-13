package students;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import students.repo.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Students> findAll() {
        return studentRepository.findAll();
    }

    public void addStudent(Students student){
        studentRepository.save(student);
    }

    public Optional<Students> findById(Long id){
        return studentRepository.findById(id);
    }

    public void delStudent(Long id){
        studentRepository.deleteById(id);
    }
}
