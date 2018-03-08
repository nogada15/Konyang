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
 채용공고<p>
 <table width="500" cellpadding="0" cellspacing="0" border="1">
 	<tr>
 		<td>번호</td>
 		<td>모집분야</td>
 		<td>제목</td>
 		<td>시작일</td>
 		<td>마감일</td>
 		<td>공고마감</td>
 		<td>상태</td>
 		<td>노출여부</td>
 	</tr>
 	<c:forEach items="${list}" var="EmployModel">
 	<tr>
 		<td>${EmployModel.pk}</td>
 		<td>${EmployModel.applysession}</td>
 		<td><a href="content_view/${EmployModel.pk}">${EmployModel.title}</a></td>
 		<td>${EmployModel.startterm}</td>
 		<td>${EmployModel.endterm}</td>
 		<td>공고마감</td>
 		<td>${EmployModel.state}</td>
 		<td>${EmployModel.exposeYN}</td>
 	</tr>
 	</c:forEach>
 </table>
 
 
</body>
</html>