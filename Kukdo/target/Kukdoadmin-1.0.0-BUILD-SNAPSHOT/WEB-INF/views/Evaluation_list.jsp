<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>first</title>
<%@ include file="/resources/include/include_header.jsp" %>
</head>
<body>
<h2>평가위원 관리</h2>
<form id="Evaluationmodify" method="post" action="openEvaluationlistserch">
<select name="searchOption" id="searchOption">
			<option value="buserId">아이디</option>
			<option value="bName">성명</option>
			<option value="bDepartment">부서</option>
			</select>
			<input type="text" name="keyword" >
<input type="submit" value="검색">
</form>
<table style="border:1px solid #ccc">
    <colgroup>
        <col width="5%"/>
        <col width="15%"/>
        <col width="*%"/>
        <col width="10%"/>
        <col width="10%"/>
        <col width="5%"/>
    </colgroup>
    <thead>
        <tr>
            <th scope="col">번호</th>
            <th scope="col">아이디</th>
            <th scope="col">성명</th>
            <th scope="col">부서</th>
            <th scope="col">등록일</th>
            <th scope="col">승인여부</th>
        </tr>
    </thead>
    <tbody>
        <c:choose>
            <c:when test="${fn:length(list) > 0}">
                <c:forEach items="${list }" var="row">
                    <tr>
                        <td>${row.bId }</td>
                        <td class="title">
                        	<a href="#this" name="title">${row.buserId }</a>
                        	<input type="hidden" id="bId" value="${row.bId }">
                        </td>
                        <td class="title">
                        	<a href="#this" name="title">${row.bName }</a>
                        	<input type="hidden" id="bId" value="${row.bId }">
                        </td>
                        <td>${row.bDepartment }</td>
                        <td>${row.bDate }</td>
                        <c:if test="${row.ENABLED == 1}">
                        <td>                        
                        <a href="#this" name="change" >승인</a> 
                        	<input type="hidden" id="bId" value="${row.bId }">
                        	<input type="hidden" id="ENABLED" value="${row.ENABLED }"></td>
                        </c:if>
                        <c:if test="${row.ENABLED == 0}">
                        <td>                        
                        <a href="#this" name="change" >미승인</a> 
                        	<input type="hidden" id="bId" value="${row.bId }">
                        	<input type="hidden" id="ENABLED" value="${row.ENABLED }"></td>
                        </c:if>
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

<%@ include file="/resources/include/include_body.jsp" %>
	<script type="text/javascript">
		$(document).ready(function() {
			$("a[name='title']").on("click", function(e){//수정페이지
	            e.preventDefault();
	            fn_openopenEvaluationmodify($(this));//a태그
	        });
			$("a[name='change']").on("click", function(e){//수정페이지
	            e.preventDefault();
	            onchange_event($(this));//a태그
	        });
		});
		
			function onchange_event(obj) {
				var comSubmit = new ComSubmit();
				comSubmit.setUrl("<c:url value='/openEvaluationauthority' />");
				comSubmit.addParam("bId", obj.parent().find("#bId").val());//동적인 값을 이용
				comSubmit.addParam("ENABLED", obj.parent().find("#ENABLED").val());
		        comSubmit.submit();
			}
			
			function fn_openopenEvaluationmodify(obj){
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/openEvaluationch' />");
		        comSubmit.addParam("bId", obj.parent().find("#bId").val());//동적인 값을 이용
		        comSubmit.submit();
		    }

		
	</script>
</body>
</html>
