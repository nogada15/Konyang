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
	<form id="hireupdate" method="post">

<table class="hire_write" >
			
			<tr>
				<td> 제목 </td>
				<td> <input type="text" id="bTitle" name="bTitle" size = "50" value="${hire.bTitle }">
					 <input type="button" id="" name="" value="지원자 현황 받기"> </td>
			</tr>
			
			<tr>
				<td> 상태</td>
				<td><select name="bCondition" id="bCondition">
					<option value="서류접수 중">서류접수 중</option>
					<option value="서류접수 마감">서류접수 마감</option>
					<option value="서류전형 중">서류전형 중</option>
					<option value="서류전형 마감">서류전형 마감</option>
					<option value="면접 전형 결과 발표">면접 전형 결과 발표</option>
					<option value="최종결과 발표">최종결과 발표</option>
					<option value="관리종료">관리종료</option>
					</select> </td>
			</tr>
			
			<tr>
				<td> 노출여부</td>
				<td><select name="bExposure" id="bExposure">
				<option value="Y">Y</option>
				<option value="N">N</option>
				</select> </td>
				<td> 우선노출
					<input type="checkbox" name="bExposurein" value="1">
				</td>
			</tr>
			
			<tr>
				<td> 기간</td>
				<td><input id="bStartdate" name="bStartdate" type="text" value="${hire.bStartdate }">
				<input id="bEnddate" name="bEnddate" type="text" value="${hire.bEnddate }">
				상시<input type="checkbox" name="" value="1"></td>
			</tr>
			
			<tr>
				<td> 모집분야 </td>
				<td> 
				<select id="bField" name="bField">
					<option value="경력">경력</option>
					<option value="신입">신입</option>
					<option value="인턴">인턴</option>
					</select>
				</td>
			</tr>
			
			<tr>
				<td> 평가위원수</td>
				<td><select name="bNum" id="bNum">
					<option value="1">1명</option>
					<option value="2">2명</option>
					<option value="3">3명</option>
					<option value="4">4명</option>
					<option value="5">5명</option>
					<option value="6">6명</option>
					<option value="7">7명</option>
					<option value="8">8명</option>
					</select> </td>
			</tr>
			
			<tr>
				<td> 내용 </td>
				<td> <textarea name="bContent" id="bContent" rows="20" cols="100">${hire.bContent }</textarea> </td>
			</tr>
			<tr>
				<td> 서류전형 합격자 공지 </td>
				<td> <textarea name="bDocument" id="bDocument" rows="20" cols="100">${hire.bDocument }</textarea> </td>
			</tr>
			<tr>
				<td> 서류전형 불합격자 공지 </td>
				<td> <textarea name="bDocumentn" id="bDocumentn" rows="20" cols="100">${hire.bDocumentn }</textarea> </td>
			</tr>
			<tr>
				<td> 면접전형 합격자 공지 </td>
				<td> <textarea name="bInterview" id="bInterview" rows="20" cols="100">${hire.bInterview }</textarea> </td>
			</tr>
			<tr>
				<td> 면접전형 불합격자 공지 </td>
				<td> <textarea name="bInterviewn" id="bInterviewn" rows="20" cols="100">${hire.bInterviewn }</textarea> </td>
			</tr>
			<tr>
				<td> 최종합격자 공지 </td>
				<td> <textarea name="bPass" id="bPass" rows="20" cols="100">${hire.bPass }</textarea> </td>
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
	            fn_openHireList();
	        });
			$("#delete").on("click", function(e){
	            e.preventDefault();
	            fn_openHiredelete();
	        });
			$("#modify").on("click", function(e){
				var title = $("#bTitle").val();
				var content = $("#bContent").val();
				
				if(title == ""){
					alert("제목을 입력하세요.");
               	 	$("#bTitle").focus();
                	return;
				}
				if(content = ""){
					alert("내용을 입력하세요");
					$("#bContent").focus();
					return;
				}
				var retVal = confirm("수정한 내용을 저장하시겠습니까?");
				   if( retVal == false ) return;
	            e.preventDefault();
	            fn_openHiremodify();
	        });
			
		});
			function fn_openHireList(){
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/openhirelist' />");
		        comSubmit.submit();
		    }
			
			function fn_openHiredelete(){
				var bId = "${hire.bId }"
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/openhiredelete' />");
		        comSubmit.addParam("bId", bId);
		        comSubmit.submit();
		    }
			
			function fn_openHiremodify(){
				var bId = "${hire.bId }"
		        var comSubmit = new ComSubmit("hireupdate");//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/openhiremodify' />");
		        comSubmit.addParam("bId", bId);
		        comSubmit.submit();
		    }

		
	</script>
	

</body>
</html>