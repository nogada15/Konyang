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
	<form id="PRinsert" method="post" enctype="multipart/form-data">

<table class="news_write" >
			
			<tr>
				<td> 사이트</td>
				<td><select name="bSite" id="bSite">
				<option value="국문">국문</option>
				<option value="영문">영문</option>
				</select> </td>
			</tr>
			
			<tr>
				<td> 제목 </td>
				
				<td> <input type="text" id="bTitle" name="bTitle" size = "50" value="${pr.bTitle }"></td>
			</tr>
			
			
			
			<tr>
				<td> 이미지 </td>
				<td><input type="file" name="uploadfile" id="uploadfile"></td>
			</tr>
			
			<tr>
				<td> 파일첨부 </td>
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
				<td> <textarea name="bContent" id="bContent" rows="20" cols="100">${pr.bContent }</textarea> </td>
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
	            fn_openPRList();
	        });
			$("#delete").on("click", function(e){
	            e.preventDefault();
	            fn_openPRdelete();
	        });
			$("#modify").on("click", function(e){
				var title = $("#bTitle").val();
				var content = $("#bContent").val();
				
				if(title == ""){
					alert("제목을 입력하세요.");
               	 	$("#bTitle").focus();
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
	            fn_openPRmodify();
	        });
			
		});
			function fn_openPRList(){
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/Admin/openPRlist' />");
		        comSubmit.submit();
		    }
			
			function fn_openPRdelete(){
				var bId = "${pr.bId }"
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/Admin/openPRdelete' />");
		        comSubmit.addParam("bId", bId);
		        comSubmit.submit();
		    }
			
			function fn_openPRmodify(){
				var bId = "${pr.bId }"
		        var comSubmit = new ComSubmit("PRinsert");//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/Admin/openPRmodify' />");
		        comSubmit.addParam("bId", bId);
		        comSubmit.submit();
		    }

		
	</script>
	

</body>
</html>