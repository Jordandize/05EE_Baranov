package ua.edu.constantine.jdbc;

import org.springframework.beans.factory.annotation.Autowired;

import ua.edu.constantine.jdbc.dao.StudentsDAO;
import ua.edu.constantine.jdbc.data.Student;

public class Worker {
	
	@Autowired
	private StudentsDAO studentsDAO;
	
	public void saveStudentToDB(Student student) {
		if(student != null && student.getName() != null && !"".equals(student.getName()) && student.getCourse() > 0) {
			studentsDAO.addStudent(student);
			System.out.println("Student have been saved!");
		}
	}
	
}
