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
 
 <form>
 	<select>
 		<option value=1>외국어명
 		<option value=2>시험명
 	</select>
 	<input type="text">
 	<input type="submit" value="검색">
 </form>
 
 <table width="500" cellpadding="0" cellspacing="0" border="1">
 	<tr>
 		<td>번호</td>
 		<td>외국어명</td>
 		<td>시험명</td>
 		<td>등록일</td>
 		<td>노출여부</td>
 	</tr>
 	<c:forEach items="${list}" var="Language">
 	<tr>
 		<td>${Foreign.pk}</td>
 		<td>${Foreign.language}</td>
 		<td>${Foreign.testName}</td>
 		<td>${Foreign.regDay}</td>
 		<td>${Foreign.exposeYN}</td>
 	</tr>
 	</c:forEach>
 </table>
 
 
</body>
</html>