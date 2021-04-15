package com.kosta.empcontroller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kosta.model.EmpDAO;
import com.kosta.model.EmpVO;
import com.sun.glass.ui.Application;

/**
 * Servlet implementation class EmpListServlet
 */
@WebServlet("/emp/emplist")
public class EmpListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 요청 URL에 대한 정보를 취득
		String cp = request.getContextPath();
		System.out.println("application이름 : " + cp);
		System.out.println("IP: " + request.getLocalAddr());
		System.out.println("port: " + request.getLocalPort());
		System.out.println("URI: " + request.getRequestURI());
		System.out.println("URL: " + request.getRequestURL());
		
		EmpDAO dao = new EmpDAO();
		request.setAttribute("emplist", dao.selectAll());
		
		// 서블릿이 요청을 받아서 JSP에게 위임
		// 1. request영역에 데이터 저장
		request.setAttribute("myname", "chaeyeon");
		request.setAttribute("myscore", 100);
		EmpVO myemp = new EmpVO();
		myemp.setFirst_name("직원이름");
		myemp.setSalary(500);
		request.setAttribute("myemp", myemp);
		// 2. servlet context : application당 하나
		// 서버가 꺼질때까지 데이터가 살아있음
		// 아무데서나 사용 가능. 전달할 필요가 없다.
		ServletContext app = getServletContext();
		// ServletContext app2 = getServletContext();	//싱글톤
		app.setAttribute("appInfo", "우리사이트에 오신것을 환영합니다.");
		
		
		RequestDispatcher rd = request.getRequestDispatcher("emplist.jsp");
		rd.forward(request, response);
		
		System.out.println("info:" + request.getAttribute("info"));
		System.out.println("dbname:" + app.getInitParameter("dbname"));
		System.out.println("userid:" + app.getInitParameter("userid"));
		
	}
}
