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
	<form id="popupmodify" method="post">

<table class="popup_write" >
			<tr>
				<td> 사이트 </td>
				<td><select name="bSite" id="bSite">
					<option value="PC 국문">PC 국문</option>
					<option value="PC 영문">PC 영문</option>
					<option value="Mobile 국문">Mobile 국문</option>
					<option value="Mobile 영문">Mobile 영문</option>
					</select> </td>
			</tr>
			<tr>
				<td> 제목 </td>
				<td> <input type="text" id="bTitle" name="bTitle" size = "50" value="${popup.bTitle }"> </td>
			</tr>
			
			<tr>
				<td> 기간</td>
				<td><input id="bStartdate" name="bStartdate" type="text" value="${popup.bStartdate }"></td>
				<td><input id="bEnddate" name="bEnddate" type="text" value="${popup.bEnddate }"></td>
			</tr>
			
			<tr>
				<td> 스크롤 허용 여부</td>
				<td><select name="bScroll" id="bScroll">
				<option value="Y">Y</option>
				<option value="N">N</option>
				</select> </td>
			</tr>
			
			<tr>
				<td> 위치</td>
				<td> Left : <input type="text" name="bLpoint" id="bLpoint" value="${popup.bLpoint }">px   
					 Top : <input type="text" name="bTpoint" id="bTpoint" value="${popup.bTpoint }">px
				</td>
			</tr>
			
			<tr>
				<td> 크기</td>
				<td> Width : <input type="text" name="bWsize" id="bWsize" value="${popup.bWsize }">px
					 Height : <input type="text" name="bHsize" id="bHsize" value="${popup.bHsize }">px
				</td>
			</tr>
			
			<tr>
				<td> 링크</td>
				<td> <input type="text" name="bLink" size = "50" value="${popup.bLink }"> </td>
			</tr>
			
			<tr>
				<td> 팝업종류</td>
				<td> <input type="radio" id="bPopup" name="bPopup" class="checkSelect" value="윈도우팝업" checked="checked" />윈도우팝업
    			<input type="radio" id="bPopup" name="bPopup" class="checkSelect" value="레이어팝업" />레이어팝업
    			<input type="radio" id="bPopup" name="bPopup" class="checkSelect" value="상단팝업" />상단팝업</td>
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
				<td> <textarea name="bContent" id="bContent" rows="20" cols="100" >${popup.bContent }</textarea> </td>
			</tr>
			<!--  <tr >
				<td colspan="2"> <input type="submit" value="등록">
				<a href="openPopuplist">목록보기</a></td>
			</tr>
			-->
		
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
	            fn_openPopupList();
	        });
			$("#delete").on("click", function(e){
	            e.preventDefault();
	            fn_openPopupdelete();
	        });
			$("#modify").on("click", function(e){
				var title = $("#bTitle").val();
	            var userSdate = $("#bStartdate").val();
	            var userEdate = $("#bEnddate").val();
	            var userLpoint = $("#bLpoint").val();
	            var userTpoint = $("#bTpoint").val();
	            var userWsize = $("#bWsize").val();
				var userHsize = $("#bHsize").val();
	            var userLink = $("#bLink").val();
	            var content = $("#bContent").val();
	            if(title == ""){
	                alert("제목을 입력하세요.");
	                $("#bTitle").focus(); // 입력포커스 이동
	                return; // 함수 종료
	            }
	            if(userSdate == ""){
	                alert("기간을 입력하세요.");
	                $("#bStartdate").focus();
	                return;
	            }
	            if(userEdate == ""){
	            	alert("기간을 입력하세요.");
	            	$("#bEnddate").focus();
	            	return;
	            }
	            if(userLpoint == ""){
	            	alert("위치를 입력하세요.");
	            	$("#bLpoint").focus();
	            	return;
	            }
	            if(userTpoint == ""){
	            	alert("위치를 입력하세요.");
	            	$("#bTpoint").focus();
	            	return;
	            }
	            if(userWsize == ""){
	            	alert("크기를 입력하세요.");
	            	$("#bWsize").focus();
	            	return;
	            }
	            if(userHsize == ""){
	            	alert("크기를 입력하세요.");
	            	$("#bHsize").focus();
	            	return;
	            }
	            if(userLink == ""){
	            	alert("링크를 입력하세요.");
	            	$("#bLink").focus();
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
	            fn_openPopupmodify();
	        });
			
		});
			function fn_openPopupList(){
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/openPopuplist' />");
		        comSubmit.submit();
		    }
			
			function fn_openPopupdelete(){
				var bId = "${popup.bId}"
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/openPopupdelete' />");
		        comSubmit.addParam("bId", bId);
		        comSubmit.submit();
		    }
			
			function fn_openPopupmodify(){
				var bId = "${popup.bId}"
		        var comSubmit = new ComSubmit("popupmodify");//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/openPopupmodify' />");
		        comSubmit.addParam("bId", bId);
		        comSubmit.submit();
		    }

		
	</script>
	

</body>
</html>