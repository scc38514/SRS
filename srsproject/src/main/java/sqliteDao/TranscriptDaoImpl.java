package sqliteDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map.Entry;
import dao.TranscriptDao;
import model.Section;
import model.Student;
import model.TranscriptEntry;
import model.User;
import util.DBUtil;


public class TranscriptDaoImpl implements TranscriptDao {
	
	@Override
	public HashMap<String, TranscriptEntry> findAll() {
		Connection Conn = DBUtil.getSqliteConnection();
		HashMap<String, Student> students = new PersonDaoImpl().findAllStudents();
		HashMap<String, Section> sections = new SectionDaoImpl().findAll();
		HashMap<String, TranscriptEntry> transcripts = new HashMap<String, TranscriptEntry>();
		String sql = "select * from Transcript";
		try{
			PreparedStatement pstmt = Conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				String str = rs.getString(2);
				Student student = students.get(rs.getString(1));
				Section section = sections.get(str.substring(str.indexOf("-")+2,str.length()));
				TranscriptEntry transcriptEntry = new TranscriptEntry(student, rs.getString(3), section);
				transcripts.put(section.getFullSectionNo(), transcriptEntry);
			}
			if(rs != null){
				rs.close();
				pstmt.close();
				Conn.close();
			} 
		}catch (SQLException e) {
				
			e.printStackTrace();
		}		
		return transcripts;
	}

	@Override
	public HashMap<String, TranscriptEntry> getTranscriptBySsn(User user) {
		Connection Conn = DBUtil.getSqliteConnection();
		HashMap<String, Student> students = new PersonDaoImpl().findAllStudents();
		HashMap<String, Section> sections = new SectionDaoImpl().findAll();
		HashMap<String, TranscriptEntry> transcripts = new HashMap<String, TranscriptEntry>();
		String sql = "select * from Transcript where StudentSsn=?";
		try{
			PreparedStatement pstmt = Conn.prepareStatement(sql);
			pstmt.setString(1, user.getSsn());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				String str = rs.getString(2);
				Student student = students.get(rs.getString(1));
				Section section = sections.get(str.substring(str.indexOf("-")+2,str.length()));
				TranscriptEntry transcriptEntry = new TranscriptEntry(student, rs.getString(3), section);
				transcripts.put(section.getFullSectionNo(), transcriptEntry);
			}
			if(rs != null){
				rs.close();
				pstmt.close();
				Conn.close();
			} 
		}catch (SQLException e) {
			
		e.printStackTrace();
	}		
	return transcripts;
	}

	@Override
	public HashMap<String, TranscriptEntry> findTranscriptByStudent(User user) {
		HashMap<String, TranscriptEntry> studentTranscripts = new HashMap<String, TranscriptEntry>();
		HashMap<String, TranscriptEntry> transcripts = new TranscriptDaoImpl().findAll();
		for (Entry<String,TranscriptEntry> t : transcripts.entrySet()) {
			String str = t.getKey();
			String sectionNo = str.substring(str.indexOf("-")+2,str.length());
			Section section = new SectionDaoImpl().findAll().get(sectionNo);
			TranscriptEntry transcriptEntry = t.getValue();
			Student student = transcriptEntry.getStudent();
			student.addSection(section);
			if (user.getSsn().equals(student.getSsn())) {
				studentTranscripts.put(transcriptEntry.getSection().getFullSectionNo(), transcriptEntry);
			}
		}
		return studentTranscripts;
	}

	@Override
	public void addTranscript(TranscriptEntry transcriptentry) {
		Connection Conn = DBUtil.getSqliteConnection();
		Student student = transcriptentry.getStudent();
		Section section = transcriptentry.getSection();
		String sql = "INSERT INTO Transcript(studentSsn,fullSectionNo,grade) VALUES(?,?,?)";
		PreparedStatement stmt = null;
		try {
			stmt = Conn.prepareStatement(sql);
			stmt.setString(1, student.getSsn());
			stmt.setString(3, transcriptentry.getGrade());
			stmt.setString(2, section.getFullSectionNo());
			stmt.executeUpdate();
			stmt.close();
			Conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public HashMap<String, TranscriptEntry> getBysection(Section se) {
		Connection Conn = DBUtil.getSqliteConnection();
		HashMap<String, Section> sections = new SectionDaoImpl().findAll();
		HashMap<String, Student> students = new PersonDaoImpl().findAllStudents();
		HashMap<String, TranscriptEntry> transcripts = new HashMap<String, TranscriptEntry>();
		String sql = "select * from Transcript where fullSectionNo=?";
		try{
			PreparedStatement pstmt = Conn.prepareStatement(sql);
			pstmt.setString(1, se.getFullSectionNo());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				String str = rs.getString(2);
				Student student = students.get(rs.getString(1));
				Section section = sections.get(str.substring(str.indexOf("-")+2,str.length()));
				TranscriptEntry transcriptEntry = new TranscriptEntry(student, rs.getString(3), section);
				transcripts.put(section.getFullSectionNo(), transcriptEntry);
			}
			if(rs != null){
				rs.close();
				pstmt.close();
				Conn.close();
			} 
		}catch (SQLException e) {
			
		e.printStackTrace();
	}		
	return transcripts;
	}

	@Override
	public void deleteTranscript(String fullSectionNo) {
		Connection Conn = DBUtil.getSqliteConnection();
		String sql = "DELETE FROM Transcript WHERE name=? and sectionID=?  ";
		PreparedStatement stmt = null;
		try {
			stmt = Conn.prepareStatement(sql);
			stmt.setString(1, fullSectionNo);
			stmt.executeUpdate();
			stmt.close();
			Conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateTranscript(String fullSectionNo, String ssn ,String grade) {
		Connection Conn = DBUtil.getSqliteConnection();
		String sql = "update Transcript set grade=? where  fullSectionNo=? StudentSsn=?";
		PreparedStatement pstmt = null;
		try {
			pstmt = Conn.prepareStatement(sql);
			pstmt.setString(1, ssn);
			pstmt.setString(2, fullSectionNo);
			pstmt.setString(3, grade);
			pstmt.executeUpdate();
			pstmt.close();
			Conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	

}
