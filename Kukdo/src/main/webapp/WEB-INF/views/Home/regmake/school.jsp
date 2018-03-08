<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import = "java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function sendSchool(school)
	{
		opener.document.getElementById("highschool").value=school
		window.close();
	}

</script>

<body>
	학교 검색
	<p>
	<p><form action="searchschool" method="post">
		학교명 <input type="text" name="schoolsearch">
		<input type="submit" value="검색">
		</form>
	<table>
		<tr>
			<td colspan="2">학교명</td>
			<td>지역</td>
		</tr>
		<c:forEach items="${school}" var="School">
		<tr>
			<td colspan="2"><a href="#" onClick="sendSchool('${School.school}'); return false;"><u>${School.school}</u></a></td>
			<td>${School.area}</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>