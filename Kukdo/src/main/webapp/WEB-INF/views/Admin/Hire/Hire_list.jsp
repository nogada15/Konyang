<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>first</title>
<%@ include file="/resources/include/include_header.jsp" %>
</head>
<body>
<h2>채용공고</h2>
<form id="hiremodify" method="post" action="openhirelistserch">
<select name="searchOption" id="searchOption">
			<option value="">전체</option>
			<option value="경력">경력</option>
			<option value="신입">신입</option>
			<option value="인턴">인턴</option>
			</select>
			
제목<input name="keyword" value="${hire.keyword }">
<input type="submit" value="검색">
</form>
<table style="border:1px solid #ccc">
    <colgroup>
        <col width="5%"/>
        <col width="10%"/>
        <col width="*%"/>
        <col width="10%"/>
        <col width="10%"/>
        <col width="10%"/>
        <col width="15%"/>
        <col width="5%"/>
    </colgroup>
    <thead>
        <tr>
            <th scope="col">번호</th>
            <th scope="col">모집분야</th>
            <th scope="col">제목</th>
            <th scope="col">시작일</th>
            <th scope="col">마감일</th>
            <th scope="col">공고마감</th>
            <th scope="col">상태</th>
            <th scope="col">노출여부</th>
        </tr>
    </thead>
    <tbody>
        <c:choose>
            <c:when test="${fn:length(list) > 0}">
                <c:forEach items="${list }" var="row">
                    <tr>
                        <td>${row.bId }</td>
                        <td>${row.bField }</td>
                        <td class="title">
                        	<a href="#this" name="title">${row.bTitle }</a>
                        	<input type="hidden" id="bId" value="${row.bId }">
                        </td>
                        <td>${row.bStartdate }</td>
                        <td>${row.bEnddate }</td>
                        <td><script type="text/javascript">
                     var d = new Date();
                     var dy = d.getTime();
                     var f = new Date("${row.bEnddate }");
                     var fy = f.getTime();
                     var dday=Math.floor((fy-dy)/(1000*60*60*24));
                     document.write("D" + "-" +dday);
                     </script>
</td>
                        <td>${row.bCondition }</td>
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
	            fn_openHirewrite();
	        });
			$("a[name='title']").on("click", function(e){//수정페이지
	            e.preventDefault();
	            fn_openHiremodify($(this));//a태그
	        });
			
		});
		
			function fn_openHirewrite(){
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/Admin/openhirewrite' />");
		        comSubmit.submit();
		    }
			
			function fn_openHiremodify(obj){
		        var comSubmit = new ComSubmit();//자바스크립트 객체 생성(common.js에 submit기능 함수 만듦)
		        comSubmit.setUrl("<c:url value='/Admin/openhirech' />");
		        comSubmit.addParam("bId", obj.parent().find("#bId").val());//동적인 값을 이용
		        comSubmit.submit();
		    }

		
	</script>
</body>
</html>
