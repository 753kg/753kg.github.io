<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.loginInfo { border: 5px dotted green; float:right;}
</style>
</head>
<body>
	<!-- 모든 페이지에서 다 보이게 -->
	<div class="loginInfo">
		<h3>로그인 정보</h3>
		<p>${username}님 로그인되었습니다.</p> <!-- session에 저장해서 바로 쓸 수 있다. -->
		<p><a href="../login/logout.kosta">로그아웃</a></p>
	</div>
</body>
</html>