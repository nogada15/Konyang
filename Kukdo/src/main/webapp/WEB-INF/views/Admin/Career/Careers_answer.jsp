<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="/resources/include/include_header.jsp" %>
</head>
<body>
	<form id="careersanswer" method="post">

<table class="Careers_answer" >
			<tr>
				<th scope="row">문의유형</th>
				<td>${parameter.parameter }</td>
				<th scope="row">접수일자</th>
				<td>${parameter.parameter }</td>
			</tr>
			
			<tr>
				<th scope="row">작성자</th>
				<td>${parameter.parameter }</td>
				<th scope="row">상태</th>
				<td>${parameter.parameter }</td>
			</tr>
			
			<tr>
				<th scope="row">연락처</th>
				<td>${parameter.parameter }</td>
				<th scope="row">E-mail</th>
				<td>${parameter.parameter }</td>
			</tr>
			
			<tr>
				<th scope="row">제목</th>
				<td colspan="3">${parameter.parameter }</td>
				
			</tr>
			
			
			<tr>
				<td> 내용 </td>
				<td colspan="4">${parameter.parameter }</td>
			</tr>
			
			<tr>
				<td> 첨부파일 </td>
				<td colspan="4">${parameter.parameter }파일</td>
			</tr>
			
			<tr>
				<td> 답변내용 </td>
				<td> <textarea name="bContent" id="bContent" rows="20" cols="100"></textarea> </td>
			</tr>
			
		
	</table>
	
	<a href="#this" class="btn" id="write">등록</a>
	<a href="#this" class="btn" id="list">취소</a>
	</form>
	
	<%@ include file="/resources/include/include_body.jsp" %>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#list").on("click", function(e){
	            e.preventDefault();
	            fn_openCareersList();
	        });
			$("#write").on("click", function(e){
	            e.preventDefault();
	            fn_openCareersinsert();
	        });
			
		});
			function fn_openCareersList(){
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/Admin/opencareerslist' />");
		        comSubmit.submit();
		    }
			
			function fn_openCareersinsert(){
		        var comSubmit = new ComSubmit("careersinsert");//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/Admin/opencareersinsert' />");
		        comSubmit.submit();
		    }

		
	</script>
	

</body>
</html>