<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
�հ��� ��ǥ<p>
<p>
��������Ȯ��<p>
<p>
<form action="check" method="post">
<table>
	<tr>
		<td>ä�����</td>
		<td colspan="3"><select name="ä�����">
		<option value="����">����</option>
		</select></td>
	<tr>
		<td>����</td>
		<td colspan="3"><input type="text"	name="name"></td>
	</tr>
	<tr>
		<td>�������</td>
		<td><select name="birthyear">
		<option value="����">����</option>
		</select>��</td>
		<td><select name="birthmonth">
		<option value="����">����</option>
		</select>��</td>
		<td><select name="birthday">
		<option value="����">����</option>
		</select>��</td>
	</tr>
	<tr>
		<td colspan="3"><input type="text" name="email">@<input type="text" name="email2"><select name="emailend">
		<option value="�����Է�">�����Է�</option>
		</select></td>
</table>

<input type="text"><p>
<input type="text"><p>
<input type="submit" value="Ȯ��">
</form>

</body>
</html>