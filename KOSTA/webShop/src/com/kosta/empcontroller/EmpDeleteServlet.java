package com.kosta.empcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kosta.model.EmpDAO;

/**
 * Servlet implementation class EmpDeleteServlet
 */
@WebServlet("/emp/empDelete")
public class EmpDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String obj = request.getParameter("empid");
		if(obj == null) throw new ServletException("empid가 없음");
		
		int empid = Integer.parseInt(obj);
		EmpDAO dao = new EmpDAO();
		int result = dao.deleteEmp(empid);
		request.setAttribute("message", result + "건 삭제되었습니다.");
		RequestDispatcher rd = request.getRequestDispatcher("emp_result.jsp");
		rd.forward(request, response);
	}
}
