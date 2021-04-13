<%@page import="com.kosta.model.DeptVO"%>
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
	td { padding:5px; }
	tr:first-of-type { background-color: lightgray; }
</style>
<%
List<DeptVO> dlist = (List<DeptVO>)request.getAttribute("deptAll");
%>
</head>
<body>
	<h1>부서전체목록</h1>
	<table>
		<tr>
			<td>부서코드</td><td>부서이름</td><td>매니저</td><td>지역코드</td>
		</tr>
		<%for(DeptVO dept:dlist){ %>
		<tr>
			<td><a href="deptDetail?deptid=<%=dept.getDepartment_id()%>"><%=dept.getDepartment_id() %></a></td>
			<td><%=dept.getDepartment_name() %></td>
			<td><%=dept.getManager_id() %></td>
			<td><%=dept.getLocatoin_id() %></td>
		</tr>
		<%} %>
	</table>
</body>
</html>