package org.test.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.test.data.entity.Person;
import org.test.data.entity.Student;
import org.test.data.repo.StudentRepository;

@SpringBootApplication
public class SpringDataTestApplication implements CommandLineRunner {
	@Autowired
    StudentRepository studentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataTestApplication.class, args);
	}
	
	
	@Override
	public void run(String... strings) throws Exception {
		studentRepository.save(new Student(new Person("Animesh", "Malik"), true, 29));
		studentRepository.save(new Student(new Person("Suchismita", "Ghosh"), true, 28));
	}
}
