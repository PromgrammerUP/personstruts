package org.javachina.person.view.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.javachina.person.dto.StudentDto;
import org.javachina.person.service.ListAllService;

public class ListAllAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//取得参数
		//处理逻辑
		ListAllService listAll = new ListAllService();
		ArrayList<StudentDto> all = listAll.ListAll();
		request.setAttribute("all", all);
		//页面转发
		return mapping.findForward("listall");
	}

}
