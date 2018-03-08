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
<h2> 모집분야 추가</h2>
	<form id="popupinsert" method="post">

<table class="popup_write" >
			<tr>
				<td>모집분야 추가</td>
					<td><input type="checkbox" name="Field1" id="Fild1" value="1">경력
						<input type="checkbox" name="Field2" id="Fild2" value="2">신입
						<input type="checkbox" name="Field3" id="Fild3" value="3">인턴</td>
					<th><input type="text" name="add" id="add" value="add"></th>
				<th><a href="#this" class="btn" id="write">등록</a></th>
			</tr>
	</table>
<h2> 모집분야 선택</h2>
<table class="Recruitmentlist" >
	<tr>
		<td><a href="#this" class="btn" id="list"> 선택반영</a></td>
	</tr>
	<tr>
		<td>경력</td>
			<td><input type="checkbox" name="career1" id="career1" value="career1">?</td>
			<td><input type="checkbox" name="career2" id="career2" value="career2">??</td>
			<td><input type="checkbox" name="career3" id="career3" value="career3">???</td>
		
		<td>신입</td>
			<td><input type="checkbox" name="new1" id="new1" value="new1">?</td>
			<td><input type="checkbox" name="new2" id="new2" value="new2">??</td>
			<td><input type="checkbox" name="new3" id="new3" value="new3">???</td>
		<td>인턴</td>
			<td><input type="checkbox" name="Intern1" id="Intern1" value="Intern1">?</td>
			<td><input type="checkbox" name="Intern2" id="Intern2" value="Intern2">??</td>
			<td><input type="checkbox" name="Intern3" id="Intern3" value="Intern3">???</td>
			
	</tr>
</table>
	
	
	
	</form>
	
	<%@ include file="/resources/include/include_body.jsp" %>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#list").on("click", function(e){
	            e.preventDefault();
	            fn_FiledWrite();
	        });
			$("#write").on("click", function(e){
	            e.preventDefault();
	            fn_FiledList();
	        });
			
		});
			function fn_FiledWrite(){
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        
		    }
			
			function fn_FiledList(){
		        var comSubmit = new ComSubmit("popupinsert");//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        
		    }

		
	</script>
	

</body>
</html>