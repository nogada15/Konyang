<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	채용공고
	<p>
	<form action="reg_apply">
		<table>
			<tr>
				<td>제목<input type="hidden" name="pk" value=${area.pk}></td>
				<td>${area.title}<input type="hidden" name="title" value="${area.title}"></td>
			</tr>
			<tr>
				<td>상태</td>
				<td>${area.state}</td>
			</tr>
			<tr>
				<td>기간</td>
				<td>${area.startterm}~${area.endterm}</td>
			</tr>
			<tr>
				<td>내용</td>
				<td>${area.contents}</td>
			</tr>
		</table>
		<a href=/Gogbo/employ/list><input type=button value="목록"></a>
		<input type="submit" value="지원하기">

	</form>

</body>
</html>