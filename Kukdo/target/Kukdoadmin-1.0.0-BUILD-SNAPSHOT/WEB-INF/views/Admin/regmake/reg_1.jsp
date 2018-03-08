<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<form action="reg_2" method="post">
		<table>
			<tr>
				<td>채용공고</td>
					<td>${area.title}<input type="hidden" name="title" value="${area.title}">
					<input type="hidden" name="pk" value="${area.pk}"></td>
			</tr>
			<tr>
				<td>성명</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>생년월일</td>
				<td><select name=birthyear>
						<option value=1950>1950</option>
						<option value=2018>2018</option>
				</select> 년 <select name=birthmonth>
						<option value=1>1</option>
						<option value=12>12</option>
				</select> 월 <select name=birthday>
						<option value=1>1</option>
						<option value=31>31</option>
				</select> 일</td>
			</tr>
			<tr>
				<td>E-mail</td>
				<td><input type="text" name="email1">@<input type="text"><select name="email2">
						<option value=naver.com>naver.com</option>
						<option value=daum.net>daum.net</option>
						</select>
						</td>
			</tr>
		</table>
		<p>개인정보취급방침
		<p>
			<input type="textarea">
		<p>
			<input type="textarea">
		<p>
			<input type="submit" value="지원하기">
	</form>
</body>
</html>