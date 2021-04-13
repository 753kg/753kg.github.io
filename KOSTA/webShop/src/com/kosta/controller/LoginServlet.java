package com.kosta.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginChk.kosta")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost.....");
		
		// 요청
		//읽을 때 post방식은 한글 자동으로 인코딩 안돼서 깨져보임. get은 자동인코딩됨
		request.setCharacterEncoding("utf-8");
		
		// 유저의 요청은 다 request에 들어옴
		String uid = request.getParameter("userid");
		String upw = request.getParameter("userpw");
		
		// 콘솔로 값 확인
		System.out.println("uid= " + uid);
		System.out.println("upw= " + upw);
		
		// document(web화면)에 찍기
		// 응답 한글 안깨지려면 인코딩타입을 줘야한다. getWriter하기 전에
		response.setContentType("text/html;charset=utf-8");	
		PrintWriter out = response.getWriter();
		out.append(String.format("<h1>아이디: %s</h1>", uid));
		out.append(String.format("<h1>비밀번호: %s</h1>", upw));
	}

}
