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
		<input type="text" name="job_id" value="${emp.job_id }"><br>
		<label>급여:</label>
		<input type="number" name="salary" value="${emp.salary }"><br>
		<label>커미션:</label>
		<input type="number" step=0.01 name="commission_pct" value="${emp.commission_pct}"><br>
		<label>매니저:</label>
		<input type="number" name="manager_id" value="${emp.manager_id }"><br>
		<label>부서:</label>
		<input type="number" name="department_id" value="${emp.department_id }"><br>
		<input type="submit" value="수정하기">
	</form>
</body>
</html>