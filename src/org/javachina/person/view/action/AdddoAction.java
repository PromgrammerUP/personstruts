package org.javachina.person.view.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.javachina.person.dto.StudentDto;
import org.javachina.person.service.AddDoService;
import org.javachina.person.view.form.AdddoForm;

public class AdddoAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		AdddoForm addform = (AdddoForm) form;
		StudentDto dto = new StudentDto();
		dto.setName(addform.getUserId());
		dto.setAge(addform.getAge());
		dto.setBirth(addform.getBirth());
		System.out.println(dto.getName());
		AddDoService service = new AddDoService();
		boolean isOk = service.addStudent(dto);
		String msg="fail";
		if(isOk){
			msg="ok";
		}
		response.getWriter().println("<script language='javascript'>alert('"+msg+"');"
				+ "location='"+request.getContextPath()+"/listall.do';</script>");
		return null;
	}

}
