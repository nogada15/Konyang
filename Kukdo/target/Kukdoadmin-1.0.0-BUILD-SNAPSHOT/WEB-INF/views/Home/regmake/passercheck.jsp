<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
합격자 발표<p>
<p>
개인정보확인<p>
<p>
<form action="check" method="post">
<table>
	<tr>
		<td>채용공고</td>
		<td colspan="3"><select name="채용공고">
		<option value="선택">선택</option>
		</select></td>
	<tr>
		<td>성명</td>
		<td colspan="3"><input type="text"	name="name"></td>
	</tr>
	<tr>
		<td>생년월일</td>
		<td><select name="birthyear">
		<option value="선택">선택</option>
		</select>년</td>
		<td><select name="birthmonth">
		<option value="선택">선택</option>
		</select>월</td>
		<td><select name="birthday">
		<option value="선택">선택</option>
		</select>일</td>
	</tr>
	<tr>
		<td colspan="3"><input type="text" name="email">@<input type="text" name="email2"><select name="emailend">
		<option value="직접입력">직접입력</option>
		</select></td>
</table>

<input type="text"><p>
<input type="text"><p>
<input type="submit" value="확인">
</form>

</body>
</html>