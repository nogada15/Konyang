<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page session="true" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/resources/include/include_header.jsp" %>
<title>Admin main</title>
</head>
<body>
	<a href="logoutprocess">로그아웃</a>
	
	<table>
	
		<c:if test="${admin.bMain == 'Y'}">
		<tr>
			<td>메인</td>
			<td><a href="openbenerview">메인베너관리</a></td>
			<td><a href="openPopuplist">팝업관리 </a></td>
		</tr>
		</c:if>
		
		<c:if test="${admin.bInvestment == 'Y' }">
		<tr>
			<td>투자정보</td>
			<td><a href="openEtronoticelist">전자공고 </a></td>
		</tr>
		</c:if>
		
		<tr>
			<td>사업영역</td>
			<td><a href="openManagerlist">사업영역 담당자 관리 </a></td>
		</tr>
		
		<c:if test="${admin.bHire == 'Y' }">
		<tr>
			<td>인재채용</td>
				<td><a href="openLangtestlist">외국어시험관리 </a></td>
				<td><a href="apply/list">모집분야관리</a></td>
				<td><a href="openselfcontrol">자기소개서 항목 관리</a></td>
				<td><a href="openhirelist">채용공고</a></td>
				<td><a href="">지원자 조회 및 전형처리(공개채용)</a></td>
				<td><a href="">지원자 조회 및 전형처리(상시채용)</a></td>
				<td><a href="opencareerslist">채용문의</a></td>
				<td><a href="">과거 지원자 조회</a></td>	
				<td><a href="openhireFAQlist">채용FAQ</a></td>
		</tr>
		</c:if>
		
		<c:if test="${admin.bNews == 'Y' }">
		<tr>
			<td>뉴스센터</td>
				<td><a href="openNewslist">뉴스</a></td>
				<td><a href="openPRlist">홍보물</a></td>
		</tr>
		</c:if>
		
		<c:if test="${admin.bKdolife == 'Y' }">
		<tr>
			<td>국도라이프</td>
				<td><a href="openKdointerviewlist">국도인터뷰</a></td>
				<td>국도인의 하루</td>
		</tr>
		</c:if>
		
		<tr>
			<td>문의사항</td>
			<td><a href="">문의관리</a></td>
		</tr>
			
		<c:if test="${admin.bTerms == 'Y' }">
		<tr>
			<td>약관관리</td>
			<td>이용약관</td>
			<td>개인정보취급방침</td>
		</tr>
		</c:if>
		
		<c:if test="${admin.bAdmin == 'Y' }">
		<tr>
			<td>관리자</td>
			<td><a href="openAdminlist">관리자조회/관리</a></td>
			<td><a href="openEvaluationlist">평가위원조회/관리</a></td>
		</tr>
		</c:if>
				
	</table>
</body>
</html>