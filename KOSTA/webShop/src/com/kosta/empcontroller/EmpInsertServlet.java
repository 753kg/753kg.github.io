package com.kosta.empcontroller;

import java.io.IOException;

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
 * Servlet implementation class EmpInsertServlet
 */
@WebServlet("/emp/empInsert")
public class EmpInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("emp_insert.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// DB에 insert
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
		int result = dao.insertEmp(emp);
		String message = result>0?"등록성공":"등록실패";
		request.setAttribute("message", message);
		RequestDispatcher rd = request.getRequestDispatcher("emp_result.jsp");
		rd.forward(request, response);
	}

}
