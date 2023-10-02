package com.org;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;

import com.org.domain.Teacher;
import com.org.repo.TeacherRepo;

@SpringBootApplication
public class TeacherRestApiQbeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context 
		= SpringApplication.run(TeacherRestApiQbeApplication.class, args);
		
		TeacherRepo repo = context.getBean(TeacherRepo.class);
		
	/*	List<Teacher> list=new ArrayList<>();
		list.add(new Teacher(201, "Ramaa", "Male", "java@gmail.com", 6000.0));
		list.add(new Teacher(202, "Krishna", "Male", "python@gmail.com", 6000.0));
		list.add(new Teacher(203, "Siva", "Male", "dev@gmail.com", 8000.0));
		list.add(new Teacher(204, "Hari", "Male", "sit@gmail.com", 9000.0));
		list.add(new Teacher(205, "Subbu", "Male", "uit@gmail.com", 4000.0));
		list.add(new Teacher(206, "Anyineyulu", "Male", "java@gmail.com", 3000.0));
		repo.saveAll(list);*/
		//prepare dynamic query
		Teacher teacher=new Teacher();
/*		teacher.setGender("Male");
		Example<Teacher> teache=Example.of(teacher);
		List<Teacher> teachers = repo.findAll();
		teachers.forEach(System.out::println);*/
		System.out.println("=============================");

		teacher.setEmail("java@gmail.com");
		Example<Teacher> of = Example.of(teacher);
		List<Teacher> teachs = repo.findAll();
		teachs.forEach(System.out::println);
		
		
	}

}
