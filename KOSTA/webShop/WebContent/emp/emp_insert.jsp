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
	<h1>직원 신규 등록</h1>
	<form action="empInsert" method="post">
		<label>직원번호:</label>
		<input type="text" name="employee_id"><br>
		<label>성:</label>
		<input type="text" name="last_name"><br>
		<label>이름:</label>
		<input type="text" name="first_name"><br>
		<label>이메일:</label>
		<input type="text" name="email"><br>
		<label>전화번호:</label>
		<input type="text" name="phone_number"><br>
		<label>입사일:</label>
		<input type="text" name="hire_date" placeholder="YYYY-MM-DD"><br>
		<label>JOB:</label>
		<input type="text" name="job_id"><br>
		<label>급여:</label>
		<input type="number" name="salary"><br>
		<label>커미션:</label>
		<input type="number" step=0.01 name="commission_pct"><br>
		<label>매니저:</label>
		<input type="number" name="manager_id"><br>
		<label>부서:</label>
		<input type="number" name="department_id"><br>
		<input type="submit" value="등록하기">
	</form>
</body>
</html>
<!-- 숙제 : JOB, 매니저, 부서 선택으로 바꾸기!! -->