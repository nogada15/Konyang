<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table width="500" cellpadding="0" cellspacing="0" border="1">
		<form action="write" method="post">
			<tr>
				<td> 사이트 </td>
				<td> <input type="text" name="" size = "50"> </td>
			</tr>
			<tr>
				<td> 제목 </td>
				<td> <input type="text" name="bTitle" size = "50"> </td>
			</tr>
			
			<tr>
				<td> 기간</td>
				<td> date</td>
			</tr>
			
			<tr>
				<td> 스크롤 허용 여부</td>
				<td> Y/N </td>
			</tr>
			
			<tr>
				<td> 위치</td>
				<td> Left : <input type="text" name="" size = "25">px   
					 Top : <input type="text" name="" size = "25">px
				</td>
			</tr>
			
			<tr>
				<td> 크기</td>
				<td> Width : <input type="text" name="" size = "25">px
					 Height : <input type="text" name="" size = "25">px
				</td>
			</tr>
			
			<tr>
				<td> 링크</td>
				<td> <input type="text" name="" size = "50"> </td>
			</tr>
			
			<tr>
				<td> 팝업종류</td>
				<td> 윈도우팝업, 레이어팝업, 상단팝업</td>
			</tr>
			
			<tr>
				<td> 노출여부</td>
				<td> Y/N </td>
			</tr>
			
			<tr>
				<td> 내용 </td>
				<td> <textarea name="bContent" rows="20" ></textarea> </td>
			</tr>
			<tr >
				<td colspan="2"> <input type="submit" value="등록"> &nbsp;&nbsp; <a href="list.do">목록보기</a></td>
			</tr>
		</form>
	</table>
	

</body>
</html>