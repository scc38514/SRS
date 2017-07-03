package service;

import java.util.HashMap;

import dao.DaoFactory;
import dao.TranscriptDao;
import model.TranscriptEntry;
import model.User;

public class TranscriptService {
	private TranscriptDao dao = DaoFactory.createTranscriptDao();
	
	public HashMap<String, TranscriptEntry> findTranscriptByStudent(User user){
		HashMap<String,TranscriptEntry> transcripts = dao.findTranscriptByStudent(user);
		return transcripts;
	}
}
