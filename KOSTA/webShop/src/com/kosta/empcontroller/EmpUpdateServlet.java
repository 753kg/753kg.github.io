package com.kosta.empcontroller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kosta.model.EmpDAO;
import com.kosta.model.EmpVO;
import com.kosta.util.ConvertUtil;

/**
 * Servlet implementation class EmpUpdateServlet
 */
@WebServlet("/emp/empUpdate")
public class EmpUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		EmpVO emp = new EmpVO();
		emp.setEmployee_id(ConvertUtil.convertInt(request.getParameter("employee_id")));
		emp.setFirst_name(request.getParameter("first_name"));
		emp.setLast_name(request.getParameter("last_name"));
		emp.setEmail(request.getParameter("email"));
		emp.setPhone_number(request.getParameter("phone_number"));
		emp.setHire_date(ConvertUtil.convertDate(request.getParameter("hire_date")));
		emp.setJob_id(request.getParameter("job_id"));
		emp.setSalary(ConvertUtil.convertInt(request.getParameter("salary")));
		emp.setCommission_pct(ConvertUtil.convertDouble(request.getParameter("commission_pct")));
		emp.setManager_id(ConvertUtil.convertInt(request.getParameter("manager_id")));
		emp.setDepartment_id(ConvertUtil.convertInt(request.getParameter("department_id")));
		EmpDAO dao = new EmpDAO();
		int result = dao.updateEmp(emp);
		String message = result>0?"수정성공":"수정실패";
		request.setAttribute("message", message);
		RequestDispatcher rd = request.getRequestDispatcher("emp_result.jsp");
		rd.forward(request, response);
	}
	

}
