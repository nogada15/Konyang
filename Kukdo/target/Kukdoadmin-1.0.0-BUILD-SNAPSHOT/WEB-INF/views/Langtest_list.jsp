<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>first</title>
<%@ include file="/resources/include/include_header.jsp" %>
</head>
<body>
<h2>외국어시험관리</h2>
<form id="Langtestmodify" method="post" action="openLangtestlistserch">
<select name="searchOption1" id="searchOption1">
				<option value="bLang">외국어명</option>
				<option value="bTestname">시험명</option>
				</select>
				<input type="text" name="keyword" size = "10" value="${langtest.keyword }">
				<input type="submit" value="검색">
</form>
<table style="border:1px solid #ccc">
    <colgroup>
        <col width="10%"/>
        <col width="20%"/>
        <col width="*%"/>
        <col width="10%"/>
        <col width="5%"/>
    </colgroup>
    <thead>
        <tr>
            <th scope="col">번호</th>
            <th scope="col">외국어명</th>
            <th scope="col">시험명</th>
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
                        <td>${row.bLang }</td>
                        <td class="title">
                        	<a href="#this" name="Testname">${row.bTestname }</a>
                        	<input type="hidden" id="bId" value="${row.bId }">
                        </td>
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
	            fn_openLangtestwrite();
	        });
			$("a[name='Testname']").on("click", function(e){//수정페이지
	            e.preventDefault();
	            fn_openLangtestmodify($(this));//a태그
	        });
			
		});
		
			function fn_openLangtestwrite(){
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/openLangtestwrite' />");
		        comSubmit.submit();
		    }
			
			function fn_openLangtestmodify(obj){
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/openLangtestch' />");
		        comSubmit.addParam("bId", obj.parent().find("#bId").val());//동적인 값을 이용
		        comSubmit.submit();
		    }

		
	</script>
</body>
</html>
