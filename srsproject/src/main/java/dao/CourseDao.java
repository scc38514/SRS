package dao;

import java.util.HashMap;

import model.Course;

public interface CourseDao {
	
	public Course getByCourseNo(String CourseNo);
	public HashMap<String, Course> findAll();
	void addCourse(Course course);
	void updateCourse(Course course);
	void deleteCourse(Course course);
}
