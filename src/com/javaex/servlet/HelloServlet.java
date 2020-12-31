package com.javaex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet") // 이거는 자바파일이라 확장자 없이 이 주소로 웹페이지에 접근 가능.

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HelloServlet() {
		super();

	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 동적인 페이지 jsp로 나타낼 수 있는 거 서블렛(자바 파일)으로 이렇게도 만들 수 있는 거. (뭐가 바뀌면 톰캣 재실행해야 됨.)

		response.setContentType("text/html;charset=utf-8");

		PrintWriter out = response.getWriter();
		out.println("<h1>헬로우월드 servlet, helloworld!!!</h1>"); // html파일이 없어도 이 문자열이 응답해서 감.
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
