<%@page import="com.kosta.model.EmpVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table, td { border:1px solid black; border-collapse: collapse; }
	td { padding: 5px; }
	tr:first-of-type { background-color: lightgray; }
</style>
<%
List<EmpVO> emplist = (List<EmpVO>)request.getAttribute("emplist2");
%>
</head>
<body>
	<h1>직원 전부 조회</h1>
	<h2>로그인정보: ${username}</h2>
	<%-- jsp 주석 --%>
	<%//자바주석은 html 소스보기하면 안보인다. %>
	<!-- 표준액션: header와 emplist 따로 컴파일 후 합침 -->
	<jsp:include page="../common/header.jsp"></jsp:include>
	<a href="empInsert">신규등록</a>
	<table>
		<tr>
			<td>직원번호</td>
			<td>성</td>
			<td>이름</td>
			<td>이메일</td>
			<td>전화번호</td>
			<td>입사일</td>
			<td>JOB</td>
			<td>급여</td>
			<td>커미션</td>
			<td>매니저</td>
			<td>부서</td>
			<td>수정</td>
			<td>삭제</td>
		</tr>
		<%for(EmpVO emp:emplist) {%>
		<tr>
			<td><%=emp.getEmployee_id() %></td>
			<td><%=emp.getLast_name() %></td>
			<td><%=emp.getFirst_name()%></td>
			<td><%=emp.getEmail()%></td>
			<td><%=emp.getPhone_number()%></td>
			<td><%=emp.getHire_date()%></td>
			<td><%=emp.getJob_id() %></td>
			<td><%=emp.getSalary()%></td>
			<td><%=emp.getCommission_pct()%></td>
			<td><%=emp.getManager_id()%></td>
			<td><%=emp.getDepartment_id() %></td>
			<td><a href="empDetail?empid=<%=emp.getEmployee_id() %>">수정</a></td>
			<td><button onclick="call(<%=emp.getEmployee_id() %>);">삭제</button></td>
		</tr>
		<%} %>
	</table>
	<br>
	<ul>
		<li>myname: ${myname}</li>
		<li>myscore: <%=request.getAttribute("myscore") %></li>
		<li>myemp: ${myemp}</li>
		<li>info: ${info}</li>
	</ul>
	<br>
	<!-- 디렉티브 태그: footer와 emplist 합쳐서 컴파일. -->
	<%@ include file="../common/footer.jsp" %>
	<script>
		function call(empid){
			// get방식
			// post는 form으로만 가능
			location.href = "empDelete?empid=" + empid;
		}
	</script>
</body>
</html>