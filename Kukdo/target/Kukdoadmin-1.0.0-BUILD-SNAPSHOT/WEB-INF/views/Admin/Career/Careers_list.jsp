<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>first</title>
<%@ include file="/resources/include/include_header.jsp" %>
</head>
<body>
<h2>채용문의</h2>

<select name="sRecruiment" id="select">
			<option value="1">pc 국문</option>
			<option value="2">mobile 국문</option>
			</select>

<select name="sSerche" id="sSerche">
			<option value="1">제목</option>
			<option value="2">작성자</option>
			</select>
			
<input type="text" name="servc" id="1">
<input type=button name="optz" value="검색" onclick="select_row()">
<table style="border:1px solid #ccc">
    <colgroup>
        <col width="5%"/>
        <col width="*"/>
        <col width="10%"/>
        <col width="15%"/>
        <col width="10%"/>
        
    </colgroup>
    <thead>
        <tr>
            <th scope="col">번호</th>
            <th scope="col">제목</th>
            <th scope="col">작성자</th>
            <th scope="col">접수일자</th>
            <th scope="col">상태</th>
            
        </tr>
    </thead>
    <tbody>
        <c:choose>
            <c:when test="${fn:length(list) > 0}">
                <c:forEach items="${list }" var="row">
                    <tr>
                        <td>${row.bId }</td>
                        <td class="title">
                        	<a href="#this" name="title">${row.bTitle }</a>
                        	<input type="hidden" id="bId" value="${row.bId }">
                        </td>
                        <td>${row.bName }</td>
                        <td>${row.bDate }</td>
                        <td>${row.bCondition }</td>
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

<%@ include file="/resources/include/include_body.jsp" %>
	<script type="text/javascript">
		$(document).ready(function() {
			$("a[name='title']").on("click", function(e){//수정페이지
	            e.preventDefault();
	            fn_openHiremodify($(this));//a태그
	        });
			
		});
			
			function fn_openHiremodify(obj){
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/Admin/opencareersanswer' />");
		        comSubmit.addParam("bId", obj.parent().find("#bId").val());//동적인 값을 이용
		        comSubmit.submit();
		    }

		
	</script>
</body>
</html>
