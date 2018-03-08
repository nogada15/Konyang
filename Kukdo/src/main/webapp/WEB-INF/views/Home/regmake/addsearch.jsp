<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import = "java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function sendAddress(addrzip1, addrzip2, addrsi, addrgu, addrdong, addrbunji, addrseq)
	{
		var address = addrzip1+" "+addrzip2+" "+addrsi+" "+addrgu+" "+addrdong+" "+addrbunji;
		
		opener.document.getElementById("address").value=address
		opener.document.getElementById("addressnum").value=addrseq
		
		window.close();
	}

</script>
<body>
	우편번호 검색
	<p>
	<p><form action="search" method="post">
		지번/도로명<input type="text" name="addsearch">
		<input type="submit" value="검색">
		</form>
	<table>
		<tr>
			<td colspan="2" >주소</td>
			<td>우편번호</td>
		</tr>
		<c:forEach items="${list}" var="Address">
			<tr>
				<td>도로명지번</td>
				<td>${Address.addrzip1}${Address.addrzip2}${Address.addrsi}
					${Address.addrgu} ${Address.addrdong} ${Address.addrbunji}</td>
				<td><a href="#" onClick="sendAddress('${Address.addrzip1}', '${Address.addrzip2}', '${Address.addrsi}', '${Address.addrgu}', '${Address.addrdong}', '${Address.addrbunji}', '${Address.seq}'); return false;">${Address.seq}</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>