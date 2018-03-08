<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<form action="insert">
<table width="500" cellpadding="0" cellspacing="0" border="1">
 	<tr><td>외국어명</td><td><input type="text" name="lang"></td></tr>
 	<tr><td>테스트이름</td><td><input type="text" name="testName"></td></tr>
 	<tr><td>노출여부</td><td><input type="text" name="exposeYN"></td></tr>
	<tr><td>등록일자</td><td><input type="text" name="regDay"></td></tr>
	<tr><td><input type="submit" value="Submit"></td></tr>
</table>
</form>
</body>
</html>