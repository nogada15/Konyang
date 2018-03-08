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

	<form id="admininsert" method="post">

<table class="admin_write" >
			
			<tr>
				<td> 아이디 </td>
				<td> <input type="text" id="buserId" name="buserId" size = "50"></td>
			</tr>
			
			<tr>
				<td> 비밀번호 </td>
				<td> <input type="password" id="bPassword" name="bPassword" size = "50"></td>
			</tr>
			
			<tr>
				<td> 비밀번호 확인 </td>
				<td> <input type="password" id="bPassword2" name="bPassword2" size = "50"></td>
			</tr>
			
			<tr>
				<td> 성명 </td>
				<td> <input type="text" id="bName" name="bName" size = "50"></td>
			</tr>
			
			<tr>
				<td> 부서 </td>
				<td> <input type="text" id="bDepartment" name="bDepartment" size = "50"></td>
			</tr>
			
			<tr>
				<td> 이메일 </td>
				<td> <input type="text" id="bEmail" name="bEmail" size = "50"></td>
			</tr>
			
			<tr>
				<td> 휴대폰 </td>
				<td> <input type="text" id="bTnumber" name="bTnumber" size = "50"></td>
				<th> 사내 전화번호</th>
				<th> <input type="text" id=bTbusniess name="bTbusniess" size = "50"></th>
			</tr>
			
			
			<tr>
				<td> 사용여부</td>
				<td><select name="ENABLED" id="ENABLED">
				<option value=0>Y</option>
				<option value=1>N</option>
				</select> </td>
			</tr>
			<tr>
				<td>권한설정</td>
				<td><input type="checkbox" id="bMain" name="bMain" class="checkSelect" value="Y" />메인
    			<input type="checkbox" id="bInvestment" name="bInvestment" class="checkSelect" value="Y" />투자정보
    			<input type="checkbox" id="bHire" name="bHire" class="checkSelect" value="Y" />인재채용
    			<input type="checkbox" id="bNews" name="bNews" class="checkSelect" value="Y" />뉴스센터
    			<input type="checkbox" id="bKdolife" name="bKdolife" class="checkSelect" value="Y" />국도라이프
    			<input type="checkbox" id="bTerms" name="bTerms" class="checkSelect" value="Y" />약관관리
    			<input type="checkbox" id="bAdmin" name="bAdmin" class="checkSelect" value="Y" />관리자</td>
			</tr>
			
			
		
	</table>
	<input type="hidden" id="bAcknowledgment" name="bAcknowledgment"value="Y">
	<input type="hidden" id="bType" name="bType" value="A">
	<a href="#this" class="btn" id="write">등록</a>
	<a href="#this" class="btn" id="list"> 취소</a>
	</form>
	
	<%@ include file="/resources/include/include_body.jsp" %>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#list").on("click", function(e){
	            e.preventDefault();
	            fn_openAdminList();
	        });
			$("#write").on("click", function(e){
				var userId = $("#buserId").val();
	            var userPw = $("#bPassword").val();
	            var userPwCheck = $("#bPassword2").val();
	            var userName = $("#bName").val();
	            var department = $("#bDepartment").val();
	            var userEmail = $("#bEmail").val();
	            var userTel = $("#bTnumber").val();
	            var comTel = $("#bTbusniess").val();
	            if(userId == ""){
	                alert("아이디를 입력하세요.");
	                $("#id").focus(); // 입력포커스 이동
	                return; // 함수 종료
	            }
	            if(userPw == ""){
	                alert("비밀번호를 입력하세요.");
	                $("#password").focus();
	                return;
	            }
	            if(userName == ""){
	            	alert("이름을 입력하세요.");
	            	$("#bName").focus();
	            	return;
	            }
	            if(department == ""){
	            	alert("부서를 입력하세요.");
	            	$("#bDepartment").focus();
	            	return;
	            }
	            if(userEmail == ""){
	            	alert("이메일을 입력하세요.");
	            	$("#bEmail").focus();
	            	return;
	            }
	            if(userTel == ""){
	            	alert("전화번호를 입력하세요.");
	            	$("#bTnumber").focus();
	            	return;
	            }
	            if(comTel == ""){
	            	alert("사내전화번호를 입력하세요.");
	            	$("#bTbusniess").focus();
	            	return;
	            }
	            if(userPw != userPwCheck){
	            	alert("입력한 비밀번호가 일치하지 않습니다.");
	            	$("#bPassword2").focus();
	            	return;
	            }
	            var retVal = confirm("등록한 내용을 저장하시겠습니까?");
				   if( retVal == false ) return;
	            e.preventDefault();
	            fn_openAdmininsert();
	        });
			
		});
			function fn_openAdminList(){
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/Admin/openAdminlist' />");
		        comSubmit.submit();
		    }
			
			function fn_openAdmininsert(){
		        var comSubmit = new ComSubmit("admininsert");//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/Admin/openAdminlistinsert' />");
		        comSubmit.submit();
		    }

		
	</script>
	

</body>
</html>