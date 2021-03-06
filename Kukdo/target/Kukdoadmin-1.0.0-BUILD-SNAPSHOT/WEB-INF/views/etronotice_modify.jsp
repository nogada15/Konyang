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


<form id="etronoticeinsert" method="post" enctype="multipart/form-data">
	<table class="etronotice_write">
			<tr>
				<td> 사이트</td>
				<td><select name="bSite" id="bSite">
				<option value="국문_PC">국문</option>
				<option value="영문_PC">영문</option>
				</select> </td>
			</tr>
			<tr>
				<td> 제목 </td>
				<td> <input type="text" name="bTitle" size = "50" value="${etronotice.bTitle }">  </td>
			</tr>
			
			
			<tr>
				<td> 노출여부</td>
				<td><select name="bExposure" id="bExposure">
				<option value="Y">Y</option>
				<option value="N">N</option>
				</select> </td>
			</tr>
			
			<tr>
				<td> 파일첨부 </td>
				<td><input type="file" name="uploadfile" id="uploadfile" value="${etronotice.bFileName }"></td>
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
	            fn_openetronoticeList();
	        });
			$("#delete").on("click", function(e){
	            e.preventDefault();
	            fn_openetronoticedelete();
	        });
			$("#modify").on("click", function(e){
				var title = $("#bTitle").val();
				
				if(title == ""){
					alert("제목을 입력하세요.");
               	 	$("#bTitle").focus();
                	return;
				}
				var retVal = confirm("수정한 내용을 저장하시겠습니까?");
				   if( retVal == false ) return;
	            e.preventDefault();
	            fn_openetronoticemodify();
	        });
			
		});
			function fn_openetronoticeList(){
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/openEtronoticelist' />");
		        comSubmit.submit();
		    }
			
			function fn_openetronoticedelete(){
				var bId="${etronotice.bId}"
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/openEtronoticedelete' />");
		        comSubmit.addParam("bId", bId);
		        comSubmit.submit();
		    }
			
			function fn_openetronoticemodify(){
				var bId="${etronotice.bId}"
		        var comSubmit = new ComSubmit("etronoticeinsert");//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/openEtronoticemodify' />");
		        comSubmit.addParam("bId", bId);
		        comSubmit.submit();
		    }

		
	</script>

</body>
</html>