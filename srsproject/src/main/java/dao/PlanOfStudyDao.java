package dao;

import java.util.List;

import model.Course;
import model.Student;


public interface PlanOfStudyDao {

	List<Course> findByStudent(Student student);
	

}
