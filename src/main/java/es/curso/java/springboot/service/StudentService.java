package es.curso.java.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import es.curso.java.springboot.model.Student;

@Component
public class StudentService {

	private static List<Student> students = new ArrayList<>();

	static {


		Student ranga = new Student("Emilio", "aa",
				"aa, Progrmador");

		students.add(ranga);
	}

	public Student retrieveStudent(String studentId) {
		for (Student student : students) {
			if (student.getId().equals(studentId)) {
				return student;
			}
		}
		return null;
	}

}