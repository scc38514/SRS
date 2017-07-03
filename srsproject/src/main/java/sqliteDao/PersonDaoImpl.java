package sqliteDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dao.PersonDao;
import model.Professor;
import model.Student;
import util.DBUtil;

public class PersonDaoImpl implements PersonDao {


	@Override
	public HashMap<String, Professor> findAllProfessors() {
		Connection Conn = DBUtil.getSqliteConnection();
		HashMap<String, Professor> professors = new HashMap<String, Professor>();
		String sql = "select ssn, name ,title, department from Person where type='Professor'";
		PreparedStatement pstmt=null;
		try {
			pstmt = Conn.prepareStatement(sql);
			ResultSet rs = null;
			rs = pstmt.executeQuery();
			while(rs.next()){
				Professor professor;
				professor = new Professor(rs.getString("name"), rs.getString("ssn"), rs.getString("title"), rs.getString("department"));
				professors.put(professor.getSsn(), professor);
			}if(rs != null){
				rs.close();
			}
			pstmt.close();
			Conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return professors;
	}

	@Override
	public HashMap<String, Student> findAllStudents() {
		Connection Conn = DBUtil.getSqliteConnection();
		HashMap<String, Student> students = new HashMap<String, Student>();
		String sql = "select ssn,name ,major, degree from Person where type='Student'";
		PreparedStatement pstmt=null;
		try {
			pstmt = Conn.prepareStatement(sql);
			ResultSet rs = null;
			rs = pstmt.executeQuery();
			while(rs.next()){
			Student student;
			student = new Student(rs.getString("name"), rs.getString("ssn"),rs.getString("major"), rs.getString("degree"));
			students.put(student.getSsn(), student);
			}if(rs != null){
				rs.close();
			} 
			pstmt.close();
			Conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return students;
	}	
	
	@Override
	public void addProfessor(String type,Professor professor) {
		Connection Conn = DBUtil.getSqliteConnection();
		String sql = "INSERT INTO Person(type,ssn,name,title,department) VALUES(?,?,?,?,?)";
		PreparedStatement stmt=null;
		try {
			stmt = Conn.prepareStatement(sql);
		    stmt.setString(1, type);
		    stmt.setString(2, professor.getSsn());
		    stmt.setString(3, professor.getName());
		    stmt.setString(4, professor.getTitle());
		    stmt.setString(5, professor.getDepartment());
			stmt.executeUpdate();
			stmt.close();
			Conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	@Override
	public List<Professor> searchProfessor(Professor professor) {
		Connection Conn = DBUtil.getSqliteConnection();
		String sql = "select ssn,name ,title, department from Person where type='Professor'";
		PreparedStatement pstmt=null;
		ArrayList<Professor> professors = new ArrayList<Professor>();
		try {
			pstmt = Conn.prepareStatement(sql);
			ResultSet rs = null;
			rs = pstmt.executeQuery();
			while(rs.next()){
				professor = new Professor(null, null, null, null);
				professor.setSsn(rs.getString("ssn"));
				professor.setName(rs.getString("name"));
				professor.setTitle(rs.getString("title"));
				professor.setDepartment(rs.getString("department"));
				professors.add(professor);
			}if(rs!=null){
				rs.close();
				pstmt.close();
				Conn.close();
			} 
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return  professors;
			
		}

	@Override
	public void deleteProfessor(Professor professor) {
		Connection Conn = DBUtil.getSqliteConnection();
		String sql = "DELETE FROM Person WHERE ssn=?";
		PreparedStatement pstmt=null;
		try {
			pstmt = Conn.prepareStatement(sql);
			pstmt.setString(1, professor.getSsn());
			pstmt.executeUpdate();
			pstmt.close();
			Conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
	}

	@Override
	public void updateProfessor(Professor professor) {
		Connection Conn = DBUtil.getSqliteConnection();
		String sql = "update Person set ssn=?,name=?,title=? ,department=? where  ssn=?";
		PreparedStatement stmt=null;
		try {
			stmt = Conn.prepareStatement(sql);
		    stmt.setString(1, professor.getSsn());
		    stmt.setString(2, professor.getName());
		    stmt.setString(3, professor.getTitle());
		    stmt.setString(4, professor.getDepartment());
			stmt.setString(5, professor.getSsn());
			stmt.executeUpdate();
			stmt.close();
			Conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	

