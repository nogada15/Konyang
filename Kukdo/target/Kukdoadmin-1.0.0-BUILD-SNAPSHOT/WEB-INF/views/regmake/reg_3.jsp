<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script language="javascript">

function cancel()
{
	var con_test = confirm("작성하신 내용이 모두 삭제되고, 해당 페이지를 닫습니다. 취소하시겠습니까?");
	if(con_test == true){
		  location.href="delall2?pk=${pk.pk}";
		}
		else if(con_test == false){
		  close.self();
		}	
}

	function save() {
		var f = document.reg_confirm;
		f.action = "save2";
		f.submit();
}
	
	function next() {
		var f = document.reg_confirm;
		f.action = "reg_confirm";
		f.submit();
	
	}
	</script>


</head>
<body>
<form name="reg_confirm" method="post" enctype="multipart/form-data">
<input type="hidden" name="pk" value="${pk.pk}">
<input type="hidden" name="apk" value="${apk.apk}">
<b>성장과정 및 장단점</b> 입력글자수<input type="text" name="input1" value="0" size="1" readonly>/100~1000자<p>
<textarea name="self1">${self.self1}
</textarea>
<p>

<b>지향 가치관 및 차별화된 보유역량(3가지)</b> 입력글자수<input type="text" name="inputtextnum" value="0" size="1" readonly>/100~1000자<p>
<textarea name="self2">${self.self2}
</textarea>
<p>

<b>국도화학 지원동기</b> 입력글자수<input type="text" name="inputtextnum" value="0" size="1" readonly>/100~1000자<p>
<textarea name="self3">${self.self3}
</textarea>
<p>

<b>희망업무 및 비전</b> 입력글자수<input type="text" name="inputtextnum" value="0" size="1" readonly>/100~1000자<p>
<textarea name="self4">${self.self4}
</textarea>
<p>

<b>자신의 리더십 소개 및 구체적인 리더십 발휘 사례</b> 입력글자수<input type="text" name="inputtextnum" value="0" size="1" readonly>/100~1000자<p>
<textarea name="self5">${self.self5}
</textarea>
<p>

<b>추가사항(석/박사 논문 또는 세부 경력사항 등)</b> 입력글자수<input type="text" name="inputtextnum" value="0" size="1" readonly>/100~1000자<p>
<textarea name="self6">${self.self6}
</textarea>
<p>

파일첨부
<table>
	<tr>
	<td>파일첨부</td>
	<td colspan="3">
	<input type="file" name="self7">
	</td>
</table>

<input type="button" value="취소" onclick="cancel()">
<input type="button" value="저장" onclick="save()">
<input type="button" value="다음" onclick="next()">

</form>
</body>
</html>