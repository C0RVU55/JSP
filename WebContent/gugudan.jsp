<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<% // 이 기호 안에 있는 코드는 자바 코드로 인식
	int dan = Integer.parseInt(request.getParameter("dan")); // request는 문자열이라 int로 변환. 계속 꺼내씀.
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<table border="1">
	<% for(int i=1; i<=9; i++){ // 줄마다 일일이 묶어줘야 됨. %>
	<tr>
		<td><%=dan %></td>
		<td><%=i %></td>
		<td><%=dan*i %></td>
	</tr>
	<%} // 이 자바코드가 브라우저에서 바로 처리되는 게 아니라 WAS에서 처리된 결과가 html 문법에 따른 문자열이라 이걸 브라우저에서 처리하는 거. %>
	</table>

</body>
</html>