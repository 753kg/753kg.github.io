package controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import model.EmpDAO;
import model.EmpVO;
import view.EmpView;

public class EmpController {

	public static void main(String[] args) {
		// 1. 모든직원조회
		// method1();
		// 2. 기본키로 조회
		// method2(101);
		// 3. 부서번호로 조회
		// method3(60);
		// 4. job_id로 조회
		// method4("IT_PROG");
		// 5. 급여로 조회
		// method5(10000, 15000);
		// 6. 입사일로 조회- String, Date
		// method6("2004/01/01", "2004/12/31");
		// method7("2004-01-01", "2004-12-31");
		// 7. 이름에 특정문자가 들어간 사람 조회
		// method8("ex");
		// 8. 여러 조건으로 조회 (부서, job, salary, hire_date)
		method9(60, "IT_PROG", 1000, "2005-01-01");
	}

	
	

	private static void method9(int dept, String job, int sal, String dt) {
		EmpDAO dao = new EmpDAO();
		List<EmpVO> emplist = dao.selectByCondition(dept, job, sal, Date.valueOf(dt));
		EmpView.display(emplist);
	}

	private static void method8(String str) {
		EmpDAO dao = new EmpDAO();
		List<EmpVO> emplist = dao.selectByName(str);
		EmpView.display(emplist);
	}
	
	private static void method7(String sdate, String edate) {
		EmpDAO dao = new EmpDAO();
		Date d1 = Date.valueOf(sdate);	// String -> java.sql.Date
		Date d2 = Date.valueOf(edate);
//		Date d1 = new Date(Integer.parseInt(sdate.substring(0, 4))-1900, 0, 1);
//		Date d2 = new Date(Integer.parseInt(edate.substring(0, 4))-1900, 11, 31);
		List<EmpVO> emplist = dao.selectByDate2(d1, d2);
		EmpView.display(emplist);
	}
	
	private static void method6(String sdate, String edate) {
		EmpDAO dao = new EmpDAO();
		List<EmpVO> emplist = dao.selectByDate(sdate, edate);
		EmpView.display(emplist);
	}

	private static void method5(int minsal, int maxsal) {
		EmpDAO dao = new EmpDAO();
		List<EmpVO> emplist = dao.selectBySalary(minsal, maxsal);
		EmpView.display(emplist);
	}

	private static void method4(String jobid) {
		EmpDAO dao = new EmpDAO();
		List<EmpVO> emplist = dao.selectByJob(jobid);
		EmpView.display(emplist);
	}

	private static void method3(int deptid) {
		EmpDAO dao = new EmpDAO();
		List<EmpVO> emplist = dao.selectByDept(deptid);
		EmpView.display(emplist);
	}

	private static void method2(int empid) {
		EmpDAO dao = new EmpDAO();
		EmpVO emp = dao.selectById(empid);
		EmpView.display(emp);
	}

	private static void method1() {
		EmpDAO dao = new EmpDAO();
		List<EmpVO> emplist = dao.selectAll();
		EmpView.display(emplist);
	}

}
