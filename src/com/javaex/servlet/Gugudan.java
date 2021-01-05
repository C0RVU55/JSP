package com.javaex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Gugudan")
public class Gugudan extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 서블렛 구구단 코드
		// 1.원하는 숫자 dan을 받음
		int dan = Integer.parseInt(request.getParameter("dan"));
		
		// 2. dan값을 받을 수 있게 하는 코드. 받은 값이 out에 담겨서 out으로 html로 출력될 거에 넣어줌.
		PrintWriter out = response.getWriter();
		
		out.println("<table border = '1'>"); // html 문법 줄마다 다 넣어줌. 브라우저에 문법 넣는 거.
		for(int i=0; i<=9; i++) {
			out.println("	<tr>");
			out.println("		<td>"+ dan +"</td>");
			out.println("		<td>"+ i +"</td>");
			out.println("		<td>"+ dan*i +"</td>");
			out.println("	</tr>");
		}
		out.println("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// doGet(request, response);
	}

}
