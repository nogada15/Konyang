<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

 <table width="500" cellpadding="0" cellspacing="0" border="1">
 	<tr>
 		<td>번호</td>
 		<td>제목</td>
 		<td>등록일</td>
 		<td>노출여부</td>
 	</tr>
 	<c:forEach items="${list}" var="FaqModel">
 	<tr>
 		<td>${FaqModel.pk}</td>

 		<td class="title"><a href="content_view/${FaqModel.pk}">${FaqModel.title}</a>
 			<%-- <input type="hidden" id="pk" value="${FaqModel.pk}"> --%>
 		</td>
		
 		<td>${FaqModel.regDay}</td>
 		<td>${FaqModel.exposeYN}</td>
 	</tr>
 	</c:forEach>
 </table>
 <form action="write">
 	<input type="submit" value="등록하기">
 </form>
 
 
</body>
</html>