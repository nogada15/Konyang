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


<form id=Managerinsert method="post">
	<table class="manager_write">
			<tr>
				<td> 사이트</td>
				<td><select name="bSite" id="bSite">
				<option value="국문">국문</option>
				<option value="영문">영문</option>
				</select> </td>
			</tr>
			<tr>
				<td> 사업영역</td>
				<td><select name="bBusiness" id="bBusiness">
				<option value="에폭시">에폭시</option>
				<option value="경화재">경화재</option>
				<option value="복합소재">복합소재</option>
				<option value="폴리우레탄">폴리우레탄</option>
				<option value="폴리이미드">폴리이미드</option>
				</select> </td>
			</tr>
			
			<tr>
				<td> 담당자 </td>
				<td> <input type="text" name="bName" size = "50"value = "${manager.bName }"> </td>
			</tr>
			
			<tr>
				<td> 전화번호 </td>
				<td> <input type="text" name="bTnumber" size = "50" value = "${manager.bTnumber }"> </td>
			</tr>
			
			<tr>
				<td> E-Mail </td>
				<td> <input type="text" name="bEmail" size = "50" value="${manager.bEmail }"> </td>
			</tr>
			
			<tr>
				<td> 노출여부</td>
				<td><select name="bExposure" id="bExposure">
				<option value="Y">Y</option>
				<option value="N">N</option>
				</select> </td>
			</tr>
	</table>
	<a href="#this" class="btn" id="list">목록</a>
	<a href="#this" class="btn" id="delete"> 삭제</a>
	<a href="#this" class="btn" id="modify"> 수정</a>
	</form>
	
	<%@ include file="/resources/include/include_body.jsp" %>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#list").on("click", function(e){
	            e.preventDefault();
	            fn_openManagerList();
	        });
			$("#delete").on("click", function(e){
	            e.preventDefault();
	            fn_openManagerdelete();
	        });
			$("#modify").on("click", function(e){
				var userName = $("#bName").val();
	            var department = $("#bTnumber").val();
	            var userEmail = $("#bEmail").val();
	            
	            if(userName == ""){
	            	alert("담당자명을 입력하세요.");
	            	$("#bName").focus();
	            	return;
	            }
	            if(department == ""){
	            	alert("전화번호를 입력하세요.");
	            	$("#bDepartment").focus();
	            	return;
	            }
	            if(userEmail == ""){
	            	alert("이메일을 입력하세요.");
	            	$("#bEmail").focus();
	            	return;
	            }
	            var retVal = confirm("수정한 내용을 저장하시겠습니까?");
				   if( retVal == false ) return;
	            e.preventDefault();
	            fn_openManagermodify();
	        });
			
		});
			function fn_openManagerList(){
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/Admin/openManagerlist' />");
		        comSubmit.submit();
		    }
			
			function fn_openManagerdelete(){
				var bId = "${manager.bId }"
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/Admin/openManagerdelete' />");
		        comSubmit.addParam("bId", bId);
		        comSubmit.submit();
		    }
			
			function fn_openManagermodify(){
				var bId = "${manager.bId }"
		        var comSubmit = new ComSubmit("Managerinsert");//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/Admin/openManagermodify' />");
		        comSubmit.addParam("bId", bId);
		        comSubmit.submit();
		    }

	</script>

</body>
</html>