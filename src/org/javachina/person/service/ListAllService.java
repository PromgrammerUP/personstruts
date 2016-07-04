package org.javachina.person.service;

import java.util.ArrayList;

import org.javachina.person.dao.StudentDao;
import org.javachina.person.dto.StudentDto;

public class ListAllService {
	public ArrayList<StudentDto> ListAll(){
		StudentDao dao = new StudentDao();
		return dao.quaryAll();
	}
}
