package service;

import dao.SectionDao;
import model.ScheduleOfClasses;

public class ScheduleOfClassesService {
	
    private static ScheduleOfClasses sc;
    private static SectionDao dao;
    public ScheduleOfClasses getScheduleOfClasses() {
		return sc;
	}    

    public ScheduleOfClassesService(String semester, SectionDao dao){
    	sc = new ScheduleOfClasses(semester, dao.findBySemester(semester));
    }
}
