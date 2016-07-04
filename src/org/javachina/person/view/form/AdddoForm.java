package org.javachina.person.view.form;

import java.sql.Date;

import org.apache.struts.action.ActionForm;

public class AdddoForm extends ActionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userId;
	private int age;
	private Date birth;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
