package org.javachina.person.service;

import org.javachina.person.dao.StudentDao;
import org.javachina.person.dto.StudentDto;

public class AddDoService {
	public boolean addStudent(StudentDto dto){
		StudentDao dao = new StudentDao();
		int i = dao.insert(dto);
		if(i==0){
			return false;
		}
		return true;
	}
}
