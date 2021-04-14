<%@page import="com.kosta.model.ManagerVO"%>
<%@page import="com.kosta.model.DeptVO"%>
<%@page import="java.util.List"%>
<%@page import="com.kosta.model.EmpVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	input { margin-bottom: 10px; }
	label { 
		display:inline-block; 
		width:80px; 
		text-align: left;
	}
</style>
<%
EmpVO emp = (EmpVO)request.getAttribute("emp");
List<String> joblist = (List<String>)request.getAttribute("joblist");
List<DeptVO> deptlist = (List<DeptVO>)request.getAttribute("deptlist");
List<ManagerVO> mlist = (List<ManagerVO>)request.getAttribute("mlist");
String str = "왓";
%>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
	<h1>직원 정보 수정</h1>
	<form action="empUpdate" method="post">
		<!-- emp는 request.getAttribute("emp")와 같다. -->
		<label>직원번호:</label>
		<input type="text" name="employee_id" value="${emp.employee_id}" readonly><br>
		<label>성:</label>
		<input type="text" name="last_name" value="${emp.last_name }"><br>
		<label>이름:</label>
		<input type="text" name="first_name" value="${emp.first_name }"><br>
		<label>이메일:</label>
		<input type="text" name="email" value="${emp.email }"><br>
		<label>전화번호:</label>
		<input type="text" name="phone_number" value="${emp.phone_number }"><br>
		<label>입사일:</label>
		<input type="text" name="hire_date" value="${emp.hire_date }"><br>
		<label>JOB:</label>
		<select name="job_id">
			<%for(String job : joblist) {%>
			<option value="<%=job %>"><%=job %></option>
			<%} %>
		</select><br>
		<label>급여:</label>
		<input type="number" name="salary" value="${emp.salary }"><br>
		<label>커미션:</label>
		<input type="number" step=0.01 name="commission_pct" value="${emp.commission_pct}"><br>
		<label>매니저:</label>
		<select name="manager_id">
			<%for(ManagerVO m : mlist) {%>
			<option value=<%=m.getManager_id()%>><%=m.getFullname()%></option>
			<%} %>
		</select><br>
		<label>부서:</label>
		<select name="department_id">
			<%for(DeptVO dept : deptlist) {%>
			<option value=<%=dept.getDepartment_id()%>><%=dept.getDepartment_name() %></option>
			<%} %>
		</select><br>
		<input type="submit" value="수정하기">
	</form>
	<script>
	var current_job = "<%=emp.getJob_id()%>";
	var current_manager = "<%=emp.getManager_id()%>";
	var current_dept = "<%=emp.getDepartment_id()%>";
	$('select[name="job_id"]').find('option[value="'+current_job+'"]').attr("selected",true);
	$('select[name="manager_id"]').find('option[value="'+current_manager+'"]').attr("selected",true);
	$('select[name="department_id"]').find('option[value="'+current_dept+'"]').attr("selected",true);
	
	</script>
</body>
</html>