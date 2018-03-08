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

	<form id="Kdointerviewinsert" method="post" enctype="multipart/form-data">

<table class="Kdointerview_write" >
			
			<tr>
				<td> 제목 </td>
				
				<td> <input type="text" id="bTitle" name="bTitle" size = "50" value="${kdointerview.bTitle }"></td>
			</tr>
			
			<tr>
				<td> 간략정보 </td>
				<td> <textarea name="bSimpContent" id="bSimpContent" rows="5" cols="100">${kdointerview.bSimpContent }</textarea> </td>
			</tr>
			
			<tr>
				<td> 이미지 </td>
				<td><input type="file" name="uploadfile" id="uploadfile"></td>
			</tr>
			
			<tr>
				<td> 노출여부</td>
				<td><select name="bExposure" id="bExposure">
				<option value="Y">Y</option>
				<option value="N">N</option>
				</select> </td>
			</tr>

			
			<tr>
				<td> 내용 </td>
				<td> <textarea name="bContent" id="bContent" rows="20" cols="100">${kdointerview.bContent }</textarea> </td>
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
	            fn_openKdointerviewList();
	        });
			$("#delete").on("click", function(e){
	            e.preventDefault();
	            fn_openKdointerviewdelete();
	        });
			$("#modify").on("click", function(e){
				var title = $("#bTitle").val();
				var content = $("#bContent").val();
				var simpleContent = $("bSimpContent").val();
				
				if(title == ""){
					alert("제목을 입력하세요.");
               	 	$("#bTitle").focus();
                	return;
				}
				if(simpleContent == ""){
					alert("간략정보를 입력하세요.");
					$("bSimpContent").focus;
					return;
				}
				
				if(content == ""){
					alert("내용을 입력하세요");
					$("#bContent").focus();
					return;
				}
				var retVal = confirm("수정한 내용을 저장하시겠습니까?");
				   if( retVal == false ) return;
	            e.preventDefault();
	            fn_openKdointerviewmodify();
	        });
			
		});
			function fn_openKdointerviewList(){
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/openKdointerviewlist' />");
		        comSubmit.submit();
		    }
			
			function fn_openKdointerviewdelete(){
				var bId = "${kdointerview.bId }"
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/openKdointerviewdelete' />");
		        comSubmit.addParam("bId", bId);
		        comSubmit.submit();
		    }
			
			function fn_openKdointerviewmodify(){
				var bId = "${kdointerview.bId }"
		        var comSubmit = new ComSubmit("Kdointerviewinsert");//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/openKdointerviewmodify' />");
		        comSubmit.addParam("bId", bId);
		        comSubmit.submit();
		    }

		
	</script>
	

</body>
</html>