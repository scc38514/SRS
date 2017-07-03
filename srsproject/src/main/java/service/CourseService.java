package service;

import model.Course;

import java.util.HashMap;

import dao.CourseDao;
import dao.DaoFactory;

public class CourseService {
	
	private CourseDao dao = DaoFactory.createCourseDao();
	
	public HashMap<String,Course> findAll(){
		HashMap<String,Course> courses = dao.findAll();
		return courses;
	}

	
}
