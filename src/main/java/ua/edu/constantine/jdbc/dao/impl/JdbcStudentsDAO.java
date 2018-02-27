package ua.edu.constantine.jdbc.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Repository;

import ua.edu.constantine.jdbc.dao.StudentsDAO;
import ua.edu.constantine.jdbc.data.Student;

@SuppressWarnings("deprecation")
@Repository
public class JdbcStudentsDAO implements StudentsDAO {
	
	private static final String SQL_INSERT_STUDENT = "INSERT INTO students(name, course) values (?,?)";

	@Autowired
	private SimpleJdbcTemplate jt;
	
	@Override
	public void addStudent(Student student) {
		jt.update(SQL_INSERT_STUDENT,
				student.getName(),
				student.getCourse());
	}

}
