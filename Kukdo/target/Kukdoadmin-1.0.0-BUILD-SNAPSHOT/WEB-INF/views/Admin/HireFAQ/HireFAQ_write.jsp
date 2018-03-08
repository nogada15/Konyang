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
	<form id="hireFAQinsert" method="post">

<table class="hireFAQ_write" >
			
			<tr>
				<td> 제목 </td>
				<td> <input type="text" id="bTitle" name="bTitle" size = "50">
					  </td>
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
				<td> <textarea name="bContent" id="bContent" rows="20" cols="100"></textarea> </td>
			</tr>
			
			
		
	</table>
	
	<a href="#this" class="btn" id="write">등록</a>
	<a href="#this" class="btn" id="list"> 취소</a>
	</form>
	
	<%@ include file="/resources/include/include_body.jsp" %>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#list").on("click", function(e){
	            e.preventDefault();
	            fn_openHireFAQList();
	        });
			$("#write").on("click", function(e){
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
				var retVal = confirm("등록한 내용을 저장하시겠습니까?");
				   if( retVal == false ) return;
	            e.preventDefault();
	            fn_openHireFAQinsert();
	        });
			
		});
			function fn_openHireFAQList(){
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/Admin/openhireFAQlist' />");
		        comSubmit.submit();
		    }
			
			function fn_openHireFAQinsert(){
		        var comSubmit = new ComSubmit("hireFAQinsert");//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/Admin/openhireFAQinsert' />");
		        comSubmit.submit();
		    }

		
	</script>
	

</body>
</html>