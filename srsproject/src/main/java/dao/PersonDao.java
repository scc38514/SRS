package dao;

import java.util.HashMap;
import java.util.List;

import model.Professor;
import model.Student;


public interface PersonDao {
	public HashMap<String, Professor> findAllProfessors();
	public HashMap<String, Student> findAllStudents();
	void addProfessor(String type,Professor professor);
	List<Professor> searchProfessor(Professor professor);
	void updateProfessor(Professor professor);
	void deleteProfessor(Professor professor);
}
