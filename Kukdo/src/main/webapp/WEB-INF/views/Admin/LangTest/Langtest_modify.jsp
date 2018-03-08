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

<form id="langtestinsert" method="post">
	<table class="langtest_write">
			<tr>
				<td> 외국어명 </td>
				<td> <input type="text" name="bLang" size = "50" value="${langtest.bLang }"> </td>
			</tr>
			<tr>
				<td> 시험명 </td>
				<td> <input type="text" name="bTestname" size = "50" value="${langtest.bTestname }"> </td>
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
	            fn_openLangtestList();
	        });
			$("#delete").on("click", function(e){
	            e.preventDefault();
	            fn_openLangtestdelete();
	        });
			$("#modify").on("click", function(e){
				var lang = $("#bLang").val();
				var langName = $("#bTestname").val();
				
				if(lang == ""){
					alert("외국어명을 입력하세요.");
               	 	$("#bLang").focus();
                	return;
				}
				if(langName == ""){
					alert("시험명을 입력하세요.");
               	 	$("#bTestname").focus();
                	return;
				}
				var retVal = confirm("수정한 내용을 저장하시겠습니까?");
				   if( retVal == false ) return;
	            e.preventDefault();
	            fn_openLangtestmodify();
	        });
			
		});
			function fn_openLangtestList(){
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/Admin/openLangtestlist' />");
		        comSubmit.submit();
		    }
			
			function fn_openLangtestdelete(){
				var bId = "${langtest.bId }"
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/Admin/openLangtestdelete' />");
		        comSubmit.addParam("bId", bId);
		        comSubmit.submit();
		    }
			
			function fn_openLangtestmodify(){
				var bId = "${langtest.bId }"
		        var comSubmit = new ComSubmit("langtestinsert");//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/Admin/openLangtestmodify' />");
		        comSubmit.addParam("bId", bId);
		        comSubmit.submit();
		    }

		
	</script>

</body>
</html>