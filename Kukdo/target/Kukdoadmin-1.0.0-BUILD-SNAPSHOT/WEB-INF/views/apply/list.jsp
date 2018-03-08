<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="insert">
		<table width="500" cellpadding="0" cellspacing="0" border="1">
			<tr>
				<td rowspan="2">모집분야추가</td>
				<td><input type="radio" name=apply value="career">경력<input
					type="radio" name=apply value="newcomer">신입<input
					type="radio" name=apply value="intern">인턴</td>
				<td rowspan="2"><input type="submit" value="등록"></td>
			</tr>
			<tr>
				<td><input type="text" name="applycontents"></td>
			</tr>
		</table>
	</form>

	<form action="select">
		<input type="submit" value="선택반영">

		<table style="text-align: top;">
			<tr>
				<td>
					<table width="500" cellpadding="0" cellspacing="0" border="1">
						<tr>
							<td>경력</td>
						</tr>
						<c:forEach items="${careerList}" var="Career">
							<tr>
								<td><input type="radio" name="career" value=${Career.career}>${Career.career}</td>
							</tr>
						</c:forEach>
					</table>
				</td>
				<td>
					<table width="500" cellpadding="0" cellspacing="0" border="1">
						<tr>
							<td>신입</td>
						</tr>
						<c:forEach items="${newComerList}" var="newComer">
							<tr>
								<td><input type="radio" name="newcomer" value=${newComer.newComer}>${newComer.newComer}</td>
							</tr>
						</c:forEach>

					</table>
				</td>
				<td>
					<table width="500" cellpadding="0" cellspacing="0" border="1">
						<tr>
							<td>인턴</td>
						</tr>
						<c:forEach items="${internList}" var="intern">
							<tr>
								<td><input type="radio" name="intern" value=${intern.intern}>${intern.intern}</td>
							</tr>
						</c:forEach>

					</table>
				</td>
			</tr>
		</table>
	</form>


</body>
</html>