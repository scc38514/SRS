package dao;

import java.util.HashMap;

import model.Section;
import model.TranscriptEntry;
import model.User;


public interface TranscriptDao {
	public HashMap<String, TranscriptEntry> findAll();
	public HashMap<String, TranscriptEntry> findTranscriptByStudent(User user);
	public void addTranscript(TranscriptEntry transcriptentry);
	public void deleteTranscript(String fullSectionNo);
	public void updateTranscript(String fullSectionNo, String ssn , String grade);
	HashMap<String, TranscriptEntry> getTranscriptBySsn(User user);
	HashMap<String, TranscriptEntry> getBysection(Section se);
}
