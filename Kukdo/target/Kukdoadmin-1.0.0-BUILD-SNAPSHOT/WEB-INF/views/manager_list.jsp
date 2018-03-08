<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>first</title>
<%@ include file="/resources/include/include_header.jsp" %>
</head>
<body>
<h2>사업영역 담당자 관리</h2>
<form id="listsearch" method="post">
<select name="serchOption1" id="serchOption1">
				<c:choose>
				<c:when test="${manager.serchOption1 == '' }"><option value="" selected="selected">전체</option></c:when>
				<c:otherwise><option value="">전체</option></c:otherwise>
				</c:choose>
				<c:choose>
				<c:when test="${manager.serchOption1 == '국문' }"><option value="국문" selected="selected">국문</option></c:when>
				<c:otherwise><option value="국문">국문</option></c:otherwise>
				</c:choose>
				<c:choose>
				<c:when test="${manager.serchOption1 == '영문' }"><option value="영문" selected="selected">영문</option></c:when>
				<c:otherwise><option value="영문">영문</option></c:otherwise>
				</c:choose>
				</select>
	<select name="serchOption2" id="serchOption2">
				<c:choose>
				<c:when test="${manager.serchOption2 == '' }"><option value="" selected="selected">전체</option></c:when>
				<c:otherwise><option value="">전체</option></c:otherwise>
				</c:choose>
				<c:choose>
				<c:when test="${manager.serchOption2 == '에폭시' }"><option value="에폭시" selected="selected">에폭시</option></c:when>
				<c:otherwise><option value="에폭시">에폭시</option></c:otherwise>
				</c:choose>
				<c:choose>
				<c:when test="${manager.serchOption2 == '경화재' }"><option value="경화재" selected="selected">경화재</option></c:when>
				<c:otherwise><option value="경화재">경화재</option></c:otherwise>
				</c:choose>
				<c:choose>
				<c:when test="${manager.serchOption2 == '복합소재' }"><option value="복합소재" selected="selected">복합소재</option></c:when>
				<c:otherwise><option value="복합소재">복합소재</option></c:otherwise>
				</c:choose>
				<c:choose>
				<c:when test="${manager.serchOption2 == '폴리우레탄' }"><option value="폴리우레탄" selected="selected">폴리우레탄</option></c:when>
				<c:otherwise><option value="폴리우레탄">폴리우레탄</option></c:otherwise>
				</c:choose>
				<c:choose>
				<c:when test="${manager.serchOption2 == '폴리이미드' }"><option value="폴리이미드" selected="selected">폴리이미드</option></c:when>
				<c:otherwise><option value="폴리이미드">폴리이미드</option></c:otherwise>
				</c:choose>
				</select>
		<!-- <input type="submit" value="검색"> -->
	</form>	
<table style="border:1px solid #ccc">
    <colgroup>
        <col width="5%"/>
        <col width="10%"/>
        <col width="15%"/>
        <col width="10%"/>
        <col width="15%"/>
        <col width="25%"/>
        <col width="10%"/>
        <col width="5%"/>
    </colgroup>
    <thead>
        <tr>
            <th scope="col">번호</th>
            <th scope="col">사이트</th>
            <th scope="col">사업영역</th>
            <th scope="col">담당자</th>
            <th scope="col">전화번호</th>
            <th scope="col">E-Mail</th>
            <th scope="col">등록일</th>
            <th scope="col">노출여부</th>
        </tr>
    </thead>
    <tbody>
        <c:choose>
            <c:when test="${fn:length(list) > 0}">
                <c:forEach items="${list }" var="row">
                    <tr>
                        <td>${row.bId }</td>
                        <td>${row.bSite }</td>
                        <td>${row.bBusiness }</td>
                        <td class="name">
                        	<a href="#this" name="name">${row.bName }</a>
                        	<input type="hidden" id="bId" value="${row.bId }">
                        </td>
                        <td>${row.bTnumber }</td>
                        <td>${row.bEmail }</td>
                        <td>${row.bDate }</td>
                        <td>${row.bExposure }</td>
                    </tr>
                </c:forEach>
            </c:when>
            <c:otherwise>
                <tr>
                    <td colspan="4">조회된 결과가 없습니다.</td>
                </tr>
            </c:otherwise>
        </c:choose>
         
    </tbody>
   
</table>
<br/>
<a href="#this" class="btn" id="write">등록하기</a>

<%@ include file="/resources/include/include_body.jsp" %>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#write").on("click", function(e){//등록하기
	            e.preventDefault();
	            fn_openManagerwrite();
	        });
			$("a[name='name']").on("click", function(e){//수정페이지
	            e.preventDefault();
	            fn_openManagermodify($(this));//a태그
	        });
			$("#serchOption1").on("change", function(){//등록하기
	            fn_openManagerListSearch1();
	        });
			$("#serchOption2").on("change", function(){//등록하기
				fn_openManagerListSearch2();
	        });
			
		});
		
		function fn_openManagerListSearch1(){
	        var comSubmit = new ComSubmit("listsearch");//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
	        comSubmit.setUrl("<c:url value='/openManagerlistserch' />");
	        comSubmit.submit(this.value);
	    }
		function fn_openManagerListSearch2(){
	        var comSubmit = new ComSubmit("listsearch");//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
	        comSubmit.setUrl("<c:url value='/openManagerlistserch' />");
	        comSubmit.submit(this.value);
	    }
		
			function fn_openManagerwrite(){
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/openManagerwrite' />");
		        comSubmit.submit();
		    }
			
			function fn_openManagermodify(obj){
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/openManagerch' />");
		        comSubmit.addParam("bId", obj.parent().find("#bId").val());//동적인 값을 이용
		        comSubmit.submit();
		    }

		
	</script>
</body>
</html>