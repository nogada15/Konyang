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
			
<form id="insertbener" method="post" enctype="multipart/form-data">
<table>
		
			  <tr>
				<td> 사이트 </td>
				<td> <select name="bSite" id="bSite">
				<c:choose>
					<c:when test="${bener.bSite == 'PC국문'}"> <option value="PC국문" selected="selected">PC국문</option> </c:when>
					<c:otherwise><option value="PC국문">PC국문</option></c:otherwise>
				</c:choose>			
				<c:choose>
					<c:when test="${bener.bSite == 'Mobile 국문'}"> <option value="Mobile 국문" selected="selected">Mobile 국문</option> </c:when>
					<c:otherwise><option value="Mobile 국문">Mobile 국문</option></c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${bener.bSite == 'PC영문'}"> <option value="PC영문" selected="selected">PC영문</option> </c:when>
					<c:otherwise><option value="PC영문">PC영문</option></c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${bener.bSite == 'Mobile 영문'}"> <option value="Mobile 영문" selected="selected">Mobile영문</option> </c:when>
					<c:otherwise><option value="Mobile 영문">Mobile영문</option></c:otherwise>
				</c:choose>
				</select> </td>
				
			</tr>  
			<tr>
				<td> 배너 롤링 시간 </td>
				<td> <input type="text" name="bTime" size = "50" value="${bener.bTime }"> 초</td>
			</tr>
			
			<c:if test="${bener.bImageo1 == null && bener.bImageo2 == null && bener.bImageo3 == null && bener.bImageo4 == null && bener.bImageo5 == null && bener.bImageo6 == null}">
			<tr>
				<td> 이미지 등록 </td>
				<td>Default</td>
				<th>파일첨부</th>
				<th>Kukdo_main.jpg</th>
			</tr>
			<tr>
				<td>링크</td>
				<td>www.kukdo.com</td>
			</tr>
			</c:if>
					
				<tr>
					<td>1</td>
					<td>이미지 첨부</td>
					<td><input type="file" name="uploadfile" id="uploadfile">
					<c:choose>
					<c:when test="${bener.bImageo1 == null }"> 선택된 파일이 없습니다. </c:when>
					<c:otherwise>${bener.bImageo1 }<input type="button" name="deletefile1" id="deletefile1" value="x"/>
					</c:otherwise>
					</c:choose>
					<select name="bExposure1"id="bExposure1" title="선택해주세요">
					<c:choose>
						<c:when test="${bener.bExposure1 == 'Y' }"><option value="Y" selected="selected">Y</option></c:when>
						<c:otherwise><option value="Y">Y</option></c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${bener.bExposure1 == 'N' }"><option value="N" selected="selected">N</option></c:when>
						<c:otherwise><option value="N">N</option></c:otherwise>
					</c:choose>
					</select>
					</td>
					<td>링크</td>
					<td><c:choose>
					<c:when test="${bener.bLink1 == null }"><input type="text" name="bLink1" id="bLink1"></c:when>
					<c:otherwise>${bener.bLink1 }
					</c:otherwise>
					</c:choose></td>
				</tr>
				
				<tr>
					<td>2</td>
					<td>이미지 첨부</td>
					<td><input type="file" name="uploadfile" id="uploadfile">
					<c:choose>
					<c:when test="${bener.bImageo2 == null }"> 선택된 파일이 없습니다. </c:when>
					<c:otherwise>${bener.bImageo2 }<input type="button" name="deletefile2" id="deletefile2" value="x"/>
					</c:otherwise>
					</c:choose>
					<select name="bExposure2"id="bExposure2" title="선택해주세요">
					<c:choose>
						<c:when test="${bener.bExposure2 == 'Y' }"><option value="Y" selected="selected">Y</option></c:when>
						<c:otherwise><option value="Y">Y</option></c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${bener.bExposure2 == 'N' }"><option value="N" selected="selected">N</option></c:when>
						<c:otherwise><option value="N">N</option></c:otherwise>
					</c:choose>
					</select>
					</td>
					<td>링크</td>
					<td><c:choose>
					<c:when test="${bener.bLink2 == null }"><input type="text" name="bLink2" id="bLink2"></c:when>
					<c:otherwise>${bener.bLink2 }
					</c:otherwise>
					</c:choose></td>
				</tr>
				
				<tr>
					<td>3</td>
					
						<td>이미지 첨부</td>
						<td><input type="file" name="uploadfile" id="uploadfile">
						<c:choose>
					<c:when test="${bener.bImageo3 == null }"> 선택된 파일이 없습니다. </c:when>
					<c:otherwise>${bener.bImageo3 }<input type="button" name="deletefile3" id="deletefile3" value="x">
					</c:otherwise>
					</c:choose>
					<select name="bExposure3"id="bExposure3" title="선택해주세요">
					<c:choose>
						<c:when test="${bener.bExposure3 == 'Y' }"><option value="Y" selected="selected">Y</option></c:when>
						<c:otherwise><option value="Y">Y</option></c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${bener.bExposure3 == 'N' }"><option value="N" selected="selected">N</option></c:when>
						<c:otherwise><option value="N">N</option></c:otherwise>
					</c:choose>
					</select>
					</td>
					
					
						<td>링크</td>
						<td>
						<c:choose>
					<c:when test="${bener.bLink3 == null }"><input type="text" name="bLink3" id="bLink3"></c:when>
					<c:otherwise>${bener.bLink3 }
					</c:otherwise>
					</c:choose></td>
					
				</tr>
				
				<tr>
					<td>4</td>
					
						<td>이미지 첨부</td>
						<td><input type="file" name="uploadfile" id="uploadfile">
						<c:choose>
					<c:when test="${bener.bImageo4 == null }"> 선택된 파일이 없습니다. </c:when>
					<c:otherwise>${bener.bImageo4 }<input type="button" name="deletefile4" id="deletefile4" value="x">
					</c:otherwise>
					</c:choose>
					<select name="bExposure4"id="bExposure4" title="선택해주세요">
					<c:choose>
						<c:when test="${bener.bExposure4 == 'Y' }"><option value="Y" selected="selected">Y</option></c:when>
						<c:otherwise><option value="Y">Y</option></c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${bener.bExposure4 == 'N' }"><option value="N" selected="selected">N</option></c:when>
						<c:otherwise><option value="N">N</option></c:otherwise>
					</c:choose>
					</select>
					</td>
					
					
						<td>링크</td>
						<td>
						<c:choose>
					<c:when test="${bener.bLink4 == null }"><input type="text" name="bLink4" id="bLink4"></c:when>
					<c:otherwise>${bener.bLink4 }
					</c:otherwise>
					</c:choose></td>
					
				</tr>
				
				<tr>
					<td>5</td>
					
					<td>이미지 첨부</td>
					<td><input type="file" name="uploadfile" id="uploadfile">
					<c:choose>
					<c:when test="${bener.bImageo5 == null }"> 선택된 파일이 없습니다. </c:when>
					<c:otherwise>${bener.bImageo5 }<input type="button" name="deletefile5" id="deletefile5" value="x">
					</c:otherwise>
					</c:choose>
					<select name="bExposure5"id="bExposure5" title="선택해주세요">
					<c:choose>
						<c:when test="${bener.bExposure5 == 'Y' }"><option value="Y" selected="selected">Y</option></c:when>
						<c:otherwise><option value="Y">Y</option></c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${bener.bExposure5 == 'N' }"><option value="N" selected="selected">N</option></c:when>
						<c:otherwise><option value="N">N</option></c:otherwise>
					</c:choose>
					</select>
					</td>
					
					
					<td>링크</td>
					<td><c:choose>
					<c:when test="${bener.bLink5 == null }"><input type="text" name="bLink5" id="bLink5"></c:when>
					<c:otherwise>${bener.bLink5 }
					</c:otherwise>
					</c:choose></td>
					
				</tr>
				
				<tr>
					<td>6</td>
					
					<td>이미지 첨부</td>
					<td><input type="file" name="uploadfile" id="uploadfile">
					<c:choose>
					<c:when test="${bener.bImageo6 == null }"> 선택된 파일이 없습니다. </c:when>
					<c:otherwise>${bener.bImageo6 }<input type="button" name="deletefile6" id="deletefile6" value="x">
					</c:otherwise>
					</c:choose>
					<select name="bExposure6"id="bExposure6" title="선택해주세요">
					<c:choose>
						<c:when test="${bener.bExposure6 == 'Y' }"><option value="Y" selected="selected">Y</option></c:when>
						<c:otherwise><option value="Y">Y</option></c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${bener.bExposure6 == 'N' }"><option value="N" selected="selected">N</option></c:when>
						<c:otherwise><option value="N">N</option></c:otherwise>
					</c:choose>
					</select>
					</td>
					
					
					<td>링크</td>
					<td><c:choose>
					<c:when test="${bener.bLink6 == null }"><input type="text" name="bLink6" id="bLink6"></c:when>
					<c:otherwise>${bener.bLink6 }
					</c:otherwise>
					</c:choose></td>
					
				</tr>
	</table>
	<a href="#this" class="btn" id="insert">저장</a>
	</form>
	
	<%@ include file="/resources/include/include_body.jsp" %>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#insert").on("click", function(e){
				var retVal = confirm("변경한 내용을 저장하시겠습니까?");
				   if( retVal == false ) return;
	            e.preventDefault();
	            fn_openbenerInsert();
	        });
		 	 $("#bSite").on("change",function(){
	            fn_chageLangSelect();
	        }); 
		 	 $("#deletefile1").on("click", function() {
		 		var retVal = confirm("해당 이미지를 삭제 하시겠습니까?");
				   if( retVal == false ) return;
		 		fn_openbenerDelete1();
		 	 })
 		 	  $("#deletefile2").on("click", function() {
 		 		var retVal = confirm("해당 이미지를 삭제 하시겠습니까?");
				   if( retVal == false ) return;
		 		fn_openbenerDelete2();
		 	 })
		 	 $("#deletefile3").on("click", function() {
		 		var retVal = confirm("해당 이미지를 삭제 하시겠습니까?");
				   if( retVal == false ) return;
		 		fn_openbenerDelete3();
		 	 })
		 	 $("#deletefile4").on("click", function() {
		 		var retVal = confirm("해당 이미지를 삭제 하시겠습니까?");
				   if( retVal == false ) return;
		 		fn_openbenerDelete4();
		 	 })
		 	 $("#deletefile5").on("click", function() {
		 		var retVal = confirm("해당 이미지를 삭제 하시겠습니까?");
				   if( retVal == false ) return;
		 		fn_openbenerDelete5();
		 	 })
		 	 $("#deletefile6").on("click", function() {
		 		var retVal = confirm("해당 이미지를 삭제 하시겠습니까?");
				   if( retVal == false ) return;
		 		fn_openbenerDelete6();
		 	 })  
		 	 
			 
		});
		
		
		 	function fn_chageLangSelect(){
				var comSubmit = new ComSubmit("insertbener");
		        comSubmit.setUrl("<c:url value='/Admin/openbenerview' />");
		        comSubmit.submit(this.value); 
		        
			}
			 
			
			function fn_openbenerInsert(){
		        var comSubmit = new ComSubmit("insertbener");//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/Admin/openinsertbener' />");
		        comSubmit.submit();
		    }
			
			function fn_openbenerDelete1() {
				var comSubmit = new ComSubmit("insertbener");
				comSubmit.setUrl("<c:url value='/Admin/openbenerdelete1' />");
				comSubmit.submit();
			}
			   function fn_openbenerDelete2() {
				var comSubmit = new ComSubmit("insertbener");
				comSubmit.setUrl("<c:url value='/Admin/openbenerdelete2' />");
				comSubmit.submit();
			}
			function fn_openbenerDelete3() {
				var comSubmit = new ComSubmit("insertbener");
				comSubmit.setUrl("<c:url value='/Admin/openbenerdelete3' />");
				comSubmit.submit();
			}
			function fn_openbenerDelete4() {
				var comSubmit = new ComSubmit("insertbener");
				comSubmit.setUrl("<c:url value='/Admin/openbenerdelete4' />");
				comSubmit.submit();
			}
			function fn_openbenerDelete5() {
				var comSubmit = new ComSubmit("insertbener");
				comSubmit.setUrl("<c:url value='/Admin/openbenerdelete5' />");
				comSubmit.submit();
			}
			function fn_openbenerDelete6() {
				var comSubmit = new ComSubmit("insertbener");
				comSubmit.setUrl("<c:url value='/Admin/openbenerdelete6' />");
				comSubmit.submit();
			}   

		
	</script>
	
</body>
</html>