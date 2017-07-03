package service;

import java.util.List;

import dao.DaoFactory;
import dao.PlanOfStudyDao;
import model.Course;
import model.Student;

public class PlanOfStudyService {
	
	private PlanOfStudyDao dao = DaoFactory.createPlanOfStudyDao();
	
	
	public List<Course> findByStudent(Student student){
		List<Course> courses = dao.findByStudent(student);
		return courses;
	}
}
