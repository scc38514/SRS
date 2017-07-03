package service;

import java.util.HashMap;

import dao.DaoFactory;
import dao.SectionDao;
import model.Section;

public class SectionService {

	private SectionDao dao = DaoFactory.createSectionDao();
	
	public HashMap<String, Section> findAll(){
		HashMap<String, Section> sections = dao.findAll();
		return sections;
	}
	
}
