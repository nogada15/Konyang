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
		<form action="insertbener.do" method="post">
			<tr>
				<td> 사이트 </td>
				<td> <input type="text" name="bSite" size = "50"> </td>
			</tr>
			<tr>
				<td> 배너 롤링 시간 </td>
				<td> <input type="text" name="bTime" size = "50"> 초</td>
			</tr>
			
			<tr>
				<td> 이미지 등록 </td>
				<tr>
					<td>Default</td>
					<tr>
						<td>파일첨부</td>
						<td>...</td>
					</tr>
					<tr>
						<td>링크</td>
						<td>...</td>
					</tr>
				</tr>
					
					
				<tr>
					<td>1</td>
					<td>이미지 첨부</td>
					<td>...</td>
					<td>링크</td>
					<td><input type="text" name="bLink1" size = "50"></td>
				</tr>
				
				<tr>
					<td>2</td>
					<td>이미지 첨부</td>
					<td>...</td>
					<td>링크</td>
					<td><input type="text" name="bLink2" size = "50"></td>
				</tr>
				
				<tr>
					<td>3</td>
					
						<td>이미지 첨부</td>
						<td>...</td>
					
					
						<td>링크</td>
						<td><input type="text" name="bLink3" size = "50"></td>
					
				</tr>
				
				<tr>
					<td>4</td>
					
						<td>이미지 첨부</td>
						<td>...</td>
					
					
						<td>링크</td>
						<td><input type="text" name="bLink4" size = "50"></td>
					
				</tr>
				
				<tr>
					<td>5</td>
					
					<td>이미지 첨부</td>
					<td>...</td>
					
					
					<td>링크</td>
					<td><input type="text" name="bLink5" size = "50"></td>
					
				</tr>
				
				<tr>
					<td>6</td>
					
					<td>이미지 첨부</td>
					<td>...</td>
					
					
					<td>링크</td>
					<td><input type="text" name="bLink6" size = "50"></td>
					
				</tr>
						
			</tr>
			<tr >
				<td colspan="2"> <input type="submit" value="저장"></td>
			</tr>
		</form>
	
	</table>
	
</body>
</html>