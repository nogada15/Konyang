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
<h2>로그인</h2>
<c:url value="/loginProcess" var="loginUrl" />
    <form:form name="form1" method="post" action="${loginUrl }">
        <table border="1" width="400px">
        <c:if test="${msg = failure }">
        	<div style="color: red">
                        아이디 또는 비밀번호가 일치하지 않습니다.
                    </div>
        	</c:if>
            <tr>
                <th><label for="아이디">아이디</label></th>
                <td><input type="text" name="buserId" id="buserId"></td>
            </tr>
            <tr>
                <th><label for="아이디">비밀번호</label></th>
                <td><input type="password" name="bPassword" id="bPassword"></td>
            </tr>
            <tr>
				<td><input id="idSaveCheck" type="checkbox">아이디 저장</td>
                <td><button type="submit" name="btnLogin" id="btnLogin">로그인</button></td>
                
            </tr>
        </table>
    </form:form>
	<a href="Evaluationwrite">평가위원 등록</a>
	<a href="Home">홈메뉴이동(임시)</a>
	<%@ include file="/resources/include/include_body.jsp" %>
	<script>
    $(document).ready(function(){
        $("#btnLogin").click(function(){
            // 태크.val() : 태그에 입력된 값
            // 태크.val("값") : 태그의 값을 변경 
            var userId = $("#buserId").val();
            var userPw = $("#bPassword").val();
            if(userId == ""){
                alert("아이디를 입력하세요.");
                $("#buserId").focus(); // 입력포커스 이동
                return; // 함수 종료
            }
            if(userPw == ""){
                alert("비밀번호를 입력하세요.");
                $("#bPassword").focus();
                return;
            }
         	
            
        });
    });
    
    $(document).ready(function(){
        // 저장된 쿠키값을 가져와서 ID 칸에 넣어준다. 없으면 공백으로 들어감.
        var userInputId = getCookie("userInputId");
        $("input[name='buserId']").val(userInputId);  
         
        if($("input[name='buserId']").val() != ""){ // 그 전에 ID를 저장해서 처음 페이지 로딩 시, 입력 칸에 저장된 ID가 표시된 상태라면,
            $("#idSaveCheck").attr("checked", true); // ID 저장하기를 체크 상태로 두기.
        }
         
        $("#idSaveCheck").change(function(){ // 체크박스에 변화가 있다면,
            if($("#idSaveCheck").is(":checked")){ // ID 저장하기 체크했을 때,
                var userInputId = $("input[name='buserId']").val();
                setCookie("userInputId", userInputId, 7); // 7일 동안 쿠키 보관
            }else{ // ID 저장하기 체크 해제 시,
                deleteCookie("userInputId");
            }
        });
         
        // ID 저장하기를 체크한 상태에서 ID를 입력하는 경우, 이럴 때도 쿠키 저장.
        $("input[name='buserId']").keyup(function(){ // ID 입력 칸에 ID를 입력할 때,
            if($("#idSaveCheck").is(":checked")){ // ID 저장하기를 체크한 상태라면,
                var userInputId = $("input[name='buserId']").val();
                setCookie("userInputId", userInputId, 7); // 7일 동안 쿠키 보관
            }
        });
    });
     
    function setCookie(cookieName, value, exdays){
        var exdate = new Date();
        exdate.setDate(exdate.getDate() + exdays);
        var cookieValue = escape(value) + ((exdays==null) ? "" : "; expires=" + exdate.toGMTString());
        document.cookie = cookieName + "=" + cookieValue;
    }
     
    function deleteCookie(cookieName){
        var expireDate = new Date();
        expireDate.setDate(expireDate.getDate() - 1);
        document.cookie = cookieName + "= " + "; expires=" + expireDate.toGMTString();
    }
     
    function getCookie(cookieName) {
        cookieName = cookieName + '=';
        var cookieData = document.cookie;
        var start = cookieData.indexOf(cookieName);
        var cookieValue = '';
        if(start != -1){
            start += cookieName.length;
            var end = cookieData.indexOf(';', start);
            if(end == -1)end = cookieData.length;
            cookieValue = cookieData.substring(start, end);
        }
        return unescape(cookieValue);
    }
</script>

</body>
</html>