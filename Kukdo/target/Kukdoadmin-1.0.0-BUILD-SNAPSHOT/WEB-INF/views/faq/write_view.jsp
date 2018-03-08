<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>채용FAQ(등록)</title>
</head>
<body>
<form action="insert">
<table width="500" cellpadding="0" cellspacing="0" border="1">
<tr>
	<td>제목</td>
	<td><input type="text" name=title></td>
</tr>
<tr>
	<td>노출여부</td>
	<td><select name=exposeYN>
			<option value=N>N
			<option value=Y>Y
		</select>
	</td>
</tr>
<tr>
	<td>내용</td>
	<td><input type="text" name=contents></td>
</tr>
</table>
<input type="submit" value="등록">
</form>
</body>
</html>