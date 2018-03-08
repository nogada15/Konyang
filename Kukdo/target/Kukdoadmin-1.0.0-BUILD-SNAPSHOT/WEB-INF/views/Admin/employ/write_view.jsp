<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<script type="text/javascript">
function popup(){
	window.open("applylist","list","width=400, heigh=300,left=100,top=50");
}

</script>

<%
	String applycareer = request.getParameter("career");
	String applyintern = request.getParameter("intern");
	String applynewcomer = request.getParameter("newcomer");

%>

	<form action="insert">
		<table cellpadding="0" cellspacing="0" border="1">
			<tr>
				<td>제목</td>
				<td colspan="3"><input type="text" name="title"></td>
				<td>지원자 현황 받기</td>
			</tr>
			<tr>
				<td>상태</td>
				<td colspan="4"><select name="state"><option
							value="서류접수중">서류접수중</option>
						<option value="서류접수 마감">서류접수 마감</option>
						<option value="서류전형 중">서류전형 중</option>
						<option value="서류전형 결과 발표">서류전형 결과 발표</option>
						<option value="면접 전형 중">면접 전형 중</option>
						<option value="면접전형 결과 발표">면접전형 결과 발표</option>
						<option value="최종 결과 발표">최종 결과 발표</option>
						<option value="관리종료">관리종료</option></select></td>
			</tr>
			<tr>
				<td>노출여부</td>
				<td><select name="exposeYN"><option value="N">N</option>
						<option value="Y">Y</option></select></td>
			</tr>
			<tr>
				<td>기간</td>
				<td><input type="text" name="startterm"></td>
				<td>~</td>
				<td><input type="text" name="endterm"></td>
			</tr>
			<tr>
				<td rowspan="3">모집분야<a href="/Kukdoadmin/Admin/apply/list">선택하기</a></td>
				<td>경력</td>
				
				<td><input type="text" value="${area.career}" name="applycareer"></td>
				
			</tr>
			<tr>
				<td>신입</td>
				
				<td><input type="text" value="${area.newcomer}" name="applynewcomer"></td>
			</tr>
			<tr>
				<td>인턴</td>
			
				<td><input type="text" value="${area.intern}" name="applyintern"></td>
				
			</tr>
			<tr>
				<td>평가위원수</td>
				<td><input type="text" name="judgemen"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><input type="text" name="contents"></td>
			</tr>
			<tr>
				<td>서류전형 합격자 공지</td>
				<td><input type="text" name="paperpasser"></td>
			</tr>
			<tr>
				<td>면접전형 합격자 공지</td>
				<td><input type="text" name="interviewpasser"></td>
			</tr>
			<tr>
				<td>최종 합격자 공지</td>
				<td><input type="text" name="finalpasser"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>