<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>first</title>
<%@ include file="/resources/include/include_header.jsp" %>
</head>
<body>
<h2>전자 공고</h2>
<form id="listsearch">
<select name="keyword" id="keyword">
				<c:choose>
				<c:when test="${etronotice.keyword == '' }"><option value="" selected="selected">전체</option></c:when>
				<c:otherwise><option value="">전체</option></c:otherwise>
				</c:choose>
				<c:choose>
				<c:when test="${etronotice.keyword == '국문' }"><option value="국문" selected="selected">국문</option></c:when>
				<c:otherwise><option value="국문">국문</option></c:otherwise>
				</c:choose>
				<c:choose>
				<c:when test="${etronotice.keyword == '영문' }"><option value="영문" selected="selected">영문</option></c:when>
				<c:otherwise><option value="영문">영문</option></c:otherwise>
				</c:choose>
</select>
</form>
<table style="border:1px solid #ccc">
    <colgroup>
        <col width="10%"/>
        <col width="20%"/>
        <col width="*%"/>
        <col width="5%"/>
        <col width="15%"/>
        <col width="5%"/>
    </colgroup>
    <thead>
        <tr>
            <th scope="col">번호</th>
            <th scope="col">사이트</th>
            <th scope="col">제목</th>
            <th scope="col">첨부</th>
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
                        <td class="title">
                        	<a href="#this" name="title">${row.bTitle }</a>
                        	<input type="hidden" id="bId" value="${row.bId }">
                        </td>
                        <td><c:choose>
						<c:when test="${row.bFileName == null}"> </c:when>
						<c:otherwise>그림</c:otherwise>
						</c:choose></td>
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
	            fn_openEtronoticewrite();
	        });
			$("a[name='title']").on("click", function(e){//수정페이지
	            e.preventDefault();
	            fn_openEtronoticemodify($(this));//a태그
	        });
			$("#keyword").on("change", function(){//등록하기
	            fn_openEtronoticech();
	        });
			
		});
		
		function fn_openEtronoticech(){
	        var comSubmit = new ComSubmit("listsearch");//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
	        comSubmit.setUrl("<c:url value='/openEtronoticelistserch' />");
	        comSubmit.submit(this.value);
	    }
		
			function fn_openEtronoticewrite(){
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/openEtronoticewrite' />");
		        comSubmit.submit();
		    }
			
			function fn_openEtronoticemodify(obj){
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/openEtronoticech' />");
		        comSubmit.addParam("bId", obj.parent().find("#bId").val());//동적인 값을 이용
		        comSubmit.submit();
		    }

		
	</script>
</body>
</html>