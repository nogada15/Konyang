<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>first</title>
<%@ include file="/resources/include/include_header.jsp" %>
</head>
<body>
<h2>채용공고</h2>

<table style="border:1px solid #ccc">
    <colgroup>
        <col width="20%"/>
        <col width="*%"/>
        <col width="5%"/>
        <col width="20%"/>
        <col width="20%"/>
    </colgroup>
    <thead>
        <tr>
            <th scope="col">모집분야</th>
            <th scope="col">제목</th>
            <th scope="col">접수마감</th>
            <th scope="col"></th>
            <th scope="col">상태</th>
        </tr>
    </thead>
    <tbody>
        <c:choose>
            <c:when test="${fn:length(list) > 0}">
                <c:forEach items="${list }" var="row">
                <c:if test="${row.bExposure == 'Y' }">
                    <tr>
                        <td>${row.bField }</td>
                        <td>${row.bTitle }</td>
                       <c:choose>
                       <c:when test="${row.bEverydate == 1 }">
                        <td>D-365</td>
                        <td>-</td>
                        <td>상시</td>
                        </c:when>
                       
                       <c:otherwise>
                        <td><script type="text/javascript">
                     var d = new Date();
                     var dy = d.getTime();
                     var f = new Date("${row.bEnddate }");
                     var fy = f.getTime();
                     var dday=Math.floor((fy-dy)/(1000*60*60*24));
                     document.write("D" + "-" +dday);
                     </script>
						</td>
						<td>${row.bStartdate }</td>
                        <td>${row.bCondition }</td>
                       </c:otherwise>
                       </c:choose>
                    </tr>
                    
                    </c:if>
                </c:forEach>
            </c:when>
            <c:otherwise>
                <tr>
                    <td colspan="4">현재 신규채용을 하지 않습니다.</td>
                </tr>
            </c:otherwise>
        </c:choose>
         
    </tbody>
</table>

<%@ include file="/resources/include/include_body.jsp" %>
	
</body>
</html>
