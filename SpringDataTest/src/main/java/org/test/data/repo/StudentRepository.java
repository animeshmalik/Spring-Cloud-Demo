package org.test.data.repo;

import org.springframework.data.repository.CrudRepository;
import org.test.data.entity.Student;

/**
 * DataSource Management for the Students at the University.
 * <p>
 * Created by maryellenbowman
 */
public interface StudentRepository extends CrudRepository<Student, Integer> {
}
