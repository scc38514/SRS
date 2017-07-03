package model;

import java.util.ArrayList;

public class PlanOfStudy {

	private Student student;
	private ArrayList<Course> courses;
	
	
	
	
	public PlanOfStudy(Student student) {
		this.setStudent(student);
		
		courses = new ArrayList<Course>();
	}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	public boolean VerifyPlan(Section s1){
		boolean ss = false;
		
		Course c1 = s1.getRepresentedCourse();
		
		for(Course c2 : courses){
			if(c1.getCourseNo().equals(c2.getCourseNo())){
				ss = true;
				break;
			}
		}
		return ss;
	}

}
