package ua.edu.constantine.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.edu.constantine.jdbc.data.Student;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("JavaBeans.xml");
		Worker w = (Worker) context.getBean("worker");
		Student student = new Student();
		student.setName("Test Name Namovich");
		student.setCourse(80);
		w.saveStudentToDB(student);
	}
}
