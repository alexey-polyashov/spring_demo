package students.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import students.Students;

@Repository
public interface StudentRepository extends JpaRepository<Students, Long>{

}
