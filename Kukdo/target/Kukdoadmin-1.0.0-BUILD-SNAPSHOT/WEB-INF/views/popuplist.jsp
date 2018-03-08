<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>first</title>
<%@ include file="/resources/include/include_header.jsp" %>
</head>
<body>
<h2>팝업관리</h2>

			
<form id="popupmodify" method="post" action="openPopuplistserch">
<select name="searchOption">
			<option value="">전체</option>
			<option value="국문">국문</option>
			<option value="영문">영문</option>
			</select>
제목<input name="keyword" value="${popup.keyword }">
<input type="submit" value="검색">
</form>
<table style="border:1px solid #ccc">
    <colgroup>
        <col width="10%"/>
        <col width="20%"/>
        <col width="*%"/>
        <col width="10%"/>
        <col width="10%"/>
        <col width="5%"/>
    </colgroup>
    <thead>
        <tr>
            <th scope="col">글번호</th>
            <th scope="col">사이트</th>
            <th scope="col">제목</th>
            <th scope="col">시작일</th>
            <th scope="col">종료일</th>
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
                        <td>${row.bStartdate }</td>
                        <td>${row.bEnddate }</td>
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
	            fn_openPopupwrite();
	        });
			
			$("a[name='title']").on("click", function(e){//수정페이지
	            e.preventDefault();
	            fn_openPopupmodify($(this));//a태그
	        });
			
		});
		
			function fn_openPopupwrite(){
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/openPopupwrite' />");
		        comSubmit.submit();
		    }
			
			
			function fn_openPopupmodify(obj){
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/openPopupch' />");
		        comSubmit.addParam("bId", obj.parent().find("#bId").val());//동적인 값을 이용
		        comSubmit.submit();
		    }

		
	</script>
</body>
</html>
