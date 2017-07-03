package dao;

import java.util.HashMap;
import model.Professor;
import model.Section;
import model.User;

public interface SectionDao {

	public HashMap<String, Section> findAll();
	public HashMap<String,Section> findBySemester(String semester);
	void addSection(Section section,Professor professor,String semester);
	void deleteSection(String FullSectionNo);
	void updateSection(Section section);
	public HashMap<String, Section> findByProfessor(User user);
	
	 
}
