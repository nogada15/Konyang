<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script language="javascript">
function showadd()
{
	window.open("addsearch","addsearch","width=400, heigh=300,left=100,top=50");
}

function showschool()
{
	window.open("schoolsearch","schoolsearch","width=400, heigh=300,left=100,top=50");
}

function cancel()
{
	var con_test = confirm("작성하신 내용이 모두 삭제되고, 해당 페이지를 닫습니다. 취소하시겠습니까?");
	if(con_test == true){
		  location.href="delall?pk=${pk.pk}";
		}
		else if(con_test == false){
		  close.self();
		}	
}

	function save() {
		var f = document.reg_3;
		f.action = "save";
		f.submit();
}
	
	function next() {
		var f = document.reg_3;
		f.action = "reg_3";
		f.submit();
}
	
	
</script>	

</head>
<body>
	<form name="reg_3" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<td>채용공고</td>
				<td>${title.title}<input type="hidden" name="title" value="${title.title}" id="pk">
				<input type="hidden" name="pk" value="${pk.pk}" id="pk">
				<input type="hidden" name="apk" value="${apk.apk}">
				</td>
			</tr>
			<tr>
				<td>지원분야</td>
				<td><select name=선택>
						<option value=경력>경력</option>
						<option value=신입>신입</option>
						<option value=인턴>인턴</option>
				</select> <select name=직무선택>
						<option value=1>직무선택</option>
						<option value=12>직무선택</option>
				</select></td>
			</tr>
		</table>
		<p>기본인적사항
		<p>
		<table>
			<tr>
				<td>성명</td>
				<td>${name.name} <input type="hidden" name="name" value="${name.name}"> [한자]<input type="text" name="china">[영문]<input type="text" name="eng"></td>
			</tr>
			<tr>
				<td>생년월일</td>
				<td>${birthyear.birthyear}년${birthmonth.birthmonth}월${birthday.birthday}일
				<input type="hidden" name="birthyear" value="${birthyear.birthyear}">
				<input type="hidden" name="birthmonth" value="${birthmonth.birthmonth}">
				<input type="hidden" name="birthday" value="${birthday.birthday}">
				<select name=birthdetail>
				<option value="양력">양력</option>
				<option value="음력">음력</option>
				</select>
				</td>
			</tr>
			
			<tr>
				<td rowspan="2">현주소</td>
				<td colspan="4"><input type="text" name="addressnum" id="addressnum"><input type="button" value="우편번호찾기" onclick="showadd();"><p>
				<input type="text" name="address" id="address"><input type="text" name="restaddress">
				
				</td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td rowspan="2">연락처</td>
				<td>휴대폰</td>
				<td><input type="text" name="phone"></td>
				<td>전화번호</td>
				<td><input type="text" name="hp"></td>
			</tr>
			<tr>
				<td>E-mail</td>
				<td>${email.email}<input type="hidden" name="email" value="${email.email}"></td>
			</tr>
			<tr>
				<td>종교</td>
				<td><input type="text" name="faith"></td>
			</tr>
			<tr>
				<td>결혼여부</td>
				<td><select name="marry">
						<option value=미혼>미혼</option>
						<option value=기혼>기혼</option>
				</select></td>
			</tr>
		</table>

		
		<table>
			<tr>
				<td>
				<input type="file" name="pic">				
				</td>
			</tr>
		
		</table>
		
		
		<table>
			<tr>
				<td>보훈여부</td>
				<td>
				<select name="bohunYN">
				<option value="비대상">비대상</option>
				<option value="대상">대상</option>
				</select>
				</td>
				<td>보훈번호</td>
				<td><input type="text" name="bohunnum"></td>
				<td>장애여부</td>
				<td>
				<select name="disableYN">
				<option value="비대상">비대상</option>
				<option value="대상">대상</option>
				</select>
				</td>
				<td>장애등급</td>
				<td><input type="text" name="disablenum">급</td>
			</tr>
			<tr>
				<td>희망근무지</td>
				<td><input type="text" name="hopework"></td>
				<td>희망직위</td>
				<td><input type="text"></td>
				<td>희망연봉</td>
				<td><input type="text" name="hopeincome">만원</td>
				<td>취미/특기</td>
				<td><input type="text" name="hobby"></td>
		</table>
		학력사항
		<p>
		<table>
			<tr>
				<td>구분</td>
				<td>기간</td>
				<td>학교명</td>
				<td>전공</td>
				<td>소재지</td>
				<td>주/야간</td>
				<td>학점</td>
			</tr>
			<tr>
				<td>고등학교</td>
				<td><select name="highyear">
						<option value="1950">1950년</option>
						<option value="2018">2018년</option>
						<option value="year">년도</option>
				</select> <select name="highmonth">
						<option value="1">1월</option>
						<option value="12">12월</option>
						<option value="month">월</option>
				</select> <select name="graduate">
						<option value="grad">졸업</option>
				</select></td>
				<td><input type="text" name="highschool" id="highschool"><input type="button" onclick="showschool()"> 직접입력</td>
				<td>-</td>
				<td><select name="higharea">
						<option value="선택">선택</option>
				</select></td>
				<td>-</td>
				<td></td>
			</tr>
			<tr>
				<td>전문대학</td>
				<td><select name="collegeyear">
						<option value="1950">1950년</option>
						<option value="2018">2018년</option>
						<option value="year">년도</option>
				</select> <select name="collegemonth">
						<option value="1">1월</option>
						<option value="12">12월</option>
						<option value="month">월</option>
				</select> <select name="join">
						<option value="join">입학</option>
				</select> <select name="collegeendyear">
						<option value="1950">1950년</option>
						<option value="2018">2018년</option>
						<option value="year">년도</option>
				</select> <select name="collegeendmonth">
						<option value="1">1월</option>
						<option value="12">12월</option>
						<option value="month">월</option>
				</select> <select name="collegegraduateYN">
						<option value="졸업">졸업</option>
						<option value="졸업예정">졸업예정</option>
						<option value="수료">수료</option>
						<option value="재학">재학</option>
				</select></td>
				<td><input type="text" name="collegename"> 직접입력</td>
				<td><input type="text" name="collegedepartname">학과</td>
				<td><select name="collegearea">
						<option value="선택">선택</option>
				</select></td>
				<td><select name="collegedaynight">
						<option value="주간">주간</option>
						<option value="야간">야간</option>
				</select></td>
				<td><input type="text" name="collegescore">/ <select
					name="collegescorevalue">
						<option value="4.5">4.5</option>
						<option value="4.3">4.3</option>
						<option value="self">직접입력</option>
				</select></td>
			</tr>
			<tr>
				<td>대학교</td>
				<td><select name="univyear">
						<option value="1950">1950년</option>
						<option value="2018">2018년</option>
						<option value="year">년도</option>
				</select> <select name="univmonth">
						<option value="1">1월</option>
						<option value="12">12월</option>
						<option value="month">월</option>
				</select> <select name="join">
						<option value="join">입학</option>
				</select> <select name="univendyear">
						<option value="1950">1950년</option>
						<option value="2018">2018년</option>
						<option value="year">년도</option>
				</select> <select name="univendmonth">
						<option value="1">1월</option>
						<option value="12">12월</option>
						<option value="month">월</option>
				</select> <select name="univgraduateYN">
						<option value="졸업">졸업</option>
						<option value="졸업예정">졸업예정</option>
						<option value="수료">수료</option>
						<option value="재학">재학</option>
				</select></td>
				<td><input type="text" name="univname"> 직접입력</td>
				<td><input type="text" name="univdepartname">학과</td>
				<td><select name="univarea">
						<option value="선택">선택</option>
				</select></td>
				<td><select name="univdaynight">
						<option value="주간">주간</option>
						<option value="야간">야간</option>
				</select></td>
				<td><input type="text" name="univscore">/ <select
					name="univscorevalue">
						<option value="4.5">4.5</option>
						<option value="4.3">4.3</option>
						<option value="self">직접입력</option>
				</select></td>
			</tr>
			<tr>
				<td>편입대학교</td>
				<td><select name="transyear">
						<option value="year">년도</option>
				</select> <select name="transmonth">
						<option value="month">월</option>
				</select> <select name="join">
						<option value="join">졸업</option>
				</select> <select name="transendyear">
						<option value="year">년도</option>
				</select> <select name="transendmonth">
						<option value="month">월</option>
				</select> <select name="transgraduateYN">
						<option value="grad">졸업</option>
				</select></td>
				<td><input type="text" name="transname"> 직접입력</td>
				<td><input type="text" name="transdepartname">학과</td>
				<td><select name="transarea">
						<option value="선택">선택</option>
				</select></td>
				<td><select name="transdaynight">
						<option value="주간">주간</option>
						<option value="야간">야간</option>
				</select></td>
				<td><input type="text" name="transscore">/ <select
					name="transscorevalue">
						<option value="4.5">4.5</option>
						<option value="4.3">4.3</option>
						<option value="self">직접입력</option>
				</select></td>
			</tr>
			<tr>
				<td>대학원(석사)</td>
				<td><select name="masteryear">
						<option value="year">년도</option>
				</select> <select name="mastermonth">
						<option value="month">월</option>
				</select> <select name="join">
						<option value="join">입학</option>
				</select> <select name="masterendgeyear">
						<option value="year">년도</option>
				</select> <select name="masterendmonth">
						<option value="month">월</option>
				</select> <select name="mastergraduateYN">
						<option value="grad">졸업</option>
				</select></td>
				<td><input type="text" name="mastername"> 직접입력</td>
				<td><input type="text" name="masterdepartname">학과</td>
				<td><select name="masterarea">
						<option value="선택">선택</option>
				</select></td>
				<td><select name="masterdaynight">
						<option value="day">주간</option>
						<option value="night">야간</option>
				</select></td>
				<td><input type="text" name="masterscore">/ <select
					name="masterscorevalue">
						<option value="4.5">4.5</option>
						<option value="4.3">4.3</option>
						<option value="self">직접입력</option>
				</select></td>
			</tr>
			<tr>
				<td>대학원(박사)</td>
				<td><select name="doctoryear">
						<option value="year">년도</option>
				</select> <select name="doctormonth">
						<option value="month">월</option>
				</select> <select name="join">
						<option value="join">입학</option>
				</select> <select name="doctorendyear">
						<option value="year">년도</option>
				</select> <select name="doctorendmonth">
						<option value="month">월</option>
				</select> <select name="doctorgraduateYN">
						<option value="grad">졸업</option>
				</select></td>
				<td><input type="text" name="doctorname"> 직접입력</td>
				<td><input type="text" name="doctordepartname">학과</td>
				<td><select name="doctorarea">
						<option value="선택">선택</option>
				</select></td>
				<td><select name="doctordaynight">
						<option value="day">주간</option>
						<option value="night">야간</option>
				</select></td>
				<td><input type="text" name="doctorscore">/ <select
					name="doctorscorevalue">
						<option value="4.5">4.5</option>
						<option value="4.3">4.3</option>
						<option value="self">직접입력</option>
				</select></td>
			</tr>
		</table>
		외국어사항
		<p>
		<table>
			<tr>
				<td>외국어명</td>
				<td>시험명</td>
				<td>시험일자</td>
				<td>점수(등급)</td>
				<td>유효기간</td>
				<td>회화수준</td>
			</tr>
			<tr>
				<td><select name="language1">
						<option value="선택">선택</option>
				</select></td>
				<td><select name="testname1">
						<option value="선택">선택</option>
				</select></td>
				<td><select name="testyear1">
						<option value="year">년도</option>
				</select> <select name="testmonth1">
						<option value="month">월</option>
				</select> <select name="testday1">
						<option value="day">일</option>
				</select></td>
				<td><input type="text" name="testscore1"></td>
				<td><select name="testbbyear1">
						<option value="year">년도</option>
				</select> <select name="testbbmonth1">
						<option value="month">월</option>
				</select> <select name="testbbday1">
						<option value="day">일</option>
				</select></td>
				<td><select name="level1">
						<option value="선택">선택</option>
				</select></td>
			</tr>
			<tr>
				<td><select name="language2">
						<option value="선택">선택</option>
				</select></td>
				<td><select name="testname2">
						<option value="선택">선택</option>
				</select></td>
				<td><select name="testyear2">
						<option value="year">년도</option>
				</select> <select name="testmonth2">
						<option value="month">월</option>
				</select> <select name="testday2">
						<option value="day">일</option>
				</select></td>
				<td><input type="text" name="testscore2"></td>
				<td><select name="testbbyear2">
						<option value="year">년도</option>
				</select> <select name="testbbmonth2">
						<option value="month">월</option>
				</select> <select name="testbbday2">
						<option value="day">일</option>
				</select></td>
				<td><select name="level2">
						<option value="선택">선택</option>
				</select></td>
			</tr>
			<tr>
				<td><select name="language3">
						<option value="선택">선택</option>
				</select></td>
				<td><select name="testname3">
						<option value="선택">선택</option>
				</select></td>
				<td><select name="testyear3">
						<option value="year">년도</option>
				</select> <select name="testmonth3">
						<option value="month">월</option>
				</select> <select name="testday3">
						<option value="day">일</option>
				</select></td>
				<td><input type="text" name="testscore3"></td>
				<td><select name="testbbyear3">
						<option value="year">년도</option>
				</select> <select name="testbbmonth3">
						<option value="month">월</option>
				</select> <select name="testbbday3">
						<option value="day">일</option>
				</select></td>
				<td><select name="level3">
						<option value="선택">선택</option>
				</select></td>
			</tr>
			<tr>
				<td><select name="language4">
						<option value="선택">선택</option>
				</select></td>
				<td><select name="testname4">
						<option value="선택">선택</option>
				</select></td>
				<td><select name="testyear4">
						<option value="year">년도</option>
				</select> <select name="testmonth4">
						<option value="month">월</option>
				</select> <select name="testday4">
						<option value="day">일</option>
				</select></td>
				<td><input type="text" name="testscore4"></td>
				<td><select name="testbbyear4">
						<option value="year">년도</option>
				</select> <select name="testbbmonth4">
						<option value="month">월</option>
				</select> <select name="testbbday4">
						<option value="day">일</option>
				</select></td>
				<td><select name="level4">
						<option value="선택">선택</option>
				</select></td>
			</tr>
			<tr>
				<td><select name="language5">
						<option value="선택">선택</option>
				</select></td>
				<td><select name="testname5">
						<option value="선택">선택</option>
				</select></td>
				<td><select name="testyear5">
						<option value="year">년도</option>
				</select> <select name="testmonth5">
						<option value="month">월</option>
				</select> <select name="testday5">
						<option value="day">일</option>
				</select></td>
				<td><input type="text" name="testscore5"></td>
				<td><select name="testbbyear5">
						<option value="year">년도</option>
				</select> <select name="testbbmonth5">
						<option value="month">월</option>
				</select> <select name="testbbday5">
						<option value="day">일</option>
				</select></td>
				<td><select name="level5">
						<option value="선택">선택</option>
				</select></td>
			</tr>
		</table>
		<input type="button" value="추가" name="추가"> <input
			type="button" value="삭제" name="삭제">
		<p>자격사항
		<p>
		<table>
			<tr>
				<td>자격증명</td>
				<td>취득일자</td>
				<td>발행기관</td>
				<td>자격증 번호</td>
			</tr>
			<tr>
				<td><input type="text" name="liecensename1"></td>
				<td><select name="liecenseyear1">
						<option value="년도">년도</option>
				</select> <select name="liecensemonth1">
						<option value="월">월</option>
				</select> <select name="liecenseday1">
						<option value="일">일</option>
				</select></td>
				<td><input type="text" name="liecenseori1"></td>
				<td><input type="text" name="liecensecode1"></td>
			</tr>
			<tr>
				<td><input type="text" name="liecensename2"></td>
				<td><select name="liecenseyear2">
						<option value="년도">년도</option>
				</select> <select name="liecensemonth2">
						<option value="월">월</option>
				</select> <select name="liecenseday2">
						<option value="일">일</option>
				</select></td>
				<td><input type="text" name="liecenseori2"></td>
				<td><input type="text" name="liecensecode2"></td>
			</tr><tr>
				<td><input type="text" name="liecensename3"></td>
				<td><select name="liecenseyear3">
						<option value="년도">년도</option>
				</select> <select name="liecensemonth3">
						<option value="월">월</option>
				</select> <select name="liecenseday3">
						<option value="일">일</option>
				</select></td>
				<td><input type="text" name="liecenseori3"></td>
				<td><input type="text" name="liecensecode3"></td>
			</tr><tr>
				<td><input type="text" name="liecensename4"></td>
				<td><select name="liecenseyear4">
						<option value="년도">년도</option>
				</select> <select name="liecensemonth4">
						<option value="월">월</option>
				</select> <select name="liecenseday4">
						<option value="일">일</option>
				</select></td>
				<td><input type="text" name="liecenseori4"></td>
				<td><input type="text" name="liecensecode4"></td>
			</tr><tr>
				<td><input type="text" name="liecensename5"></td>
				<td><select name="liecenseyear5">
						<option value="년도">년도</option>
				</select> <select name="liecensemonth5">
						<option value="월">월</option>
				</select> <select name="liecenseday5">
						<option value="일">일</option>
				</select></td>
				<td><input type="text" name="liecenseori5"></td>
				<td><input type="text" name="liecensecode5"></td>
			</tr>
		</table>
		<input type="button" value="추가" name="추가"> <input
			type="button" value="삭제" name="삭제">
		<p>경력사항
		<p>
		<table>
			<tr>
				<td>회사명</td>
				<td>근무부서</td>
				<td>담당업무</td>
				<td>직위</td>
				<td>근무기간</td>
				<td>근무연수</td>
				<td>연봉</td>
			</tr>
			<tr>
				<td><input type="text" name="company1"></td>
				<td><input type="text" name="depart1"></td>
				<td><input type="text" name="work1"></td>
				<td><input type="text" name="level1"></td>
				<td><select name="joinyear1">
						<option value="year">년도</option>
				</select> <select name="joinmonth1">
						<option value="month">월</option>
				</select> ~ <select name="resignyear1">
						<option value="year">년도</option>
				</select> <select name="resignmonth1">
						<option value="month">월</option>
				</select></td>
				<td>년월</td>
				<td><input type="text" name="income1">만원</td>
			</tr>
			<tr>
				<td><input type="text" name="company2"></td>
				<td><input type="text" name="depart2"></td>
				<td><input type="text" name="work2"></td>
				<td><input type="text" name="level2"></td>
				<td><select name="joinyear2">
						<option value="year">년도</option>
				</select> <select name="joinmonth2">
						<option value="month">월</option>
				</select> ~ <select name="resignyear2">
						<option value="year">년도</option>
				</select> <select name="resignmonth2">
						<option value="month">월</option>
				</select></td>
				<td>년월</td>
				<td><input type="text" name="income2">만원</td>
			</tr>
		</table>
		<input type="button" value="추가" name="추가"> <input
			type="button" value="삭제" name="삭제">
		<p>해외경험
		<p>
		<table>
			<tr>
				<td>국가(지역)</td>
				<td>기관</td>
				<td>기간</td>
				<td>내용</td>
			</tr>
			<tr>
				<td><input type="text" name="nation1"></td>
				<td><input type="text" name="agency1"></td>
				<td><select name="startyear1">
						<option value="year">년도</option>
				</select> <select name="startmonth1">
						<option value="month">월</option>
				</select> <select name="startday1">
						<option value="day">일</option>
				</select> ~ <select name="endyear1">
						<option value="year">년도</option>
				</select> <select name="endmonth1">
						<option value="month">월</option>
				</select> <select name="endday1">
						<option value="day">일</option>
				</select></td>
				<td><input type="text" name="contents1"></td>
			</tr>
			<tr>
				<td><input type="text" name="nation2"></td>
				<td><input type="text" name="agency2"></td>
				<td><select name="startyear2">
						<option value="year">년도</option>
				</select> <select name="startmonth2">
						<option value="month">월</option>
				</select> <select name="startday2">
						<option value="day">일</option>
				</select> ~ <select name="endyear2">
						<option value="year">년도</option>
				</select> <select name="endmonth2">
						<option value="month">월</option>
				</select> <select name="endday2">
						<option value="day">일</option>
				</select></td>
				<td><input type="text" name="contents2"></td>
			</tr>
			<tr>
				<td><input type="text" name="nation3"></td>
				<td><input type="text" name="agency3"></td>
				<td><select name="startyear3">
						<option value="year">년도</option>
				</select> <select name="startmonth3">
						<option value="month">월</option>
				</select> <select name="startday3">
						<option value="day">일</option>
				</select> ~ <select name="endyear3">
						<option value="year">년도</option>
				</select> <select name="endmonth3">
						<option value="month">월</option>
				</select> <select name="endday3">
						<option value="day">일</option>
				</select></td>
				<td><input type="text" name="contents3"></td>
			</tr>
		</table>
		<input type="button" value="추가" name="추가"> <input
			type="button" value="삭제" name="삭제">
		<p>병역사항
		<p>
		<table>
			<tr>
				<td>군필여부</td>
				<td><select name="military">
						<option value="Y">Y</option>
						<option value="N">N</option>
				</select></td>
				<td>군별</td>
				<td><select name="militarypart">
						<option value="육군">육군</option>
						<option value="해군">해군</option>
						<option value="공군">공군</option>
						<option value="해병대">해병대</option>
				</select></td>
				<td>병과</td>
				<td><select name="militaryver">
						<option value="선택">선택</option>
				</select></td>
				<td>계급</td>
				<td><select name="militarylevel">
						<option value="선택">선택</option>
				</select></td>
			</tr>
			<tr>
				<td>복무기간</td>
				<td colspan="3"><select name="startyearm">
						<option value="year">년도</option>
				</select> <select name="startmonthm">
						<option value="month">월</option>
				</select> <select name="startdaym">
						<option value="day">일</option>
				</select> ~ <select name="endyearm">
						<option value="year">년도</option>
				</select> <select name="endmonthm">
						<option value="month">월</option>
				</select> <select name="enddaym">
						<option value="day">일</option>
				</select></td>
				<td colspan="2">의가사/면제 사유</td>
				<td colspan="2"><input type="text" name="reason"></td>
			</tr>
		</table>

		가족사항
		<p>
		<table>
			<tr>
				<td>관계</td>
				<td>성명</td>
				<td>연령</td>
				<td>최종학력</td>
				<td>직업(근무처/직위)</td>
				<td>동거여부</td>
			</tr>
			<tr>
				<td><input type="text" name="family1"></td>
				<td><input type="text" name="name1"></td>
				<td><input type="text" name="age1"></td>
				<td><select name="education1">
						<option value="선택">선택</option>
				</select></td>
				<td><input type="text" name="job1"></td>
				<td><select name="live1">
						<option value="선택">선택</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="text" name="family2"></td>
				<td><input type="text" name="name2"></td>
				<td><input type="text" name="age2"></td>
				<td><select name="education2">
						<option value="선택">선택</option>
				</select></td>
				<td><input type="text" name="job2"></td>
				<td><select name="live2">
						<option value="선택">선택</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="text" name="family3"></td>
				<td><input type="text" name="name3"></td>
				<td><input type="text" name="age3"></td>
				<td><select name="education3">
						<option value="선택">선택</option>
				</select></td>
				<td><input type="text" name="job3"></td>
				<td><select name="live3">
						<option value="선택">선택</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="text" name="family4"></td>
				<td><input type="text" name="name4"></td>
				<td><input type="text" name="age4"></td>
				<td><select name="education4">
						<option value="선택">선택</option>
				</select></td>
				<td><input type="text" name="job4"></td>
				<td><select name="live4">
						<option value="선택">선택</option>
				</select></td>
			</tr>
		</table>
		<input type="button" value="추가" name="추가"> <input
			type="button" value="삭제" name="삭제">
		<p>
		<p>지원서상의 모든 기재사항은 사실이며, 허위로 판명될 경우 어떠한 인사상 불이익을 받더라도 이의를 제기하지 않을
			것을 서약합니다.
		<p>지원자 ${name.name} (인)
		<p>
		<p>
			<input type="button" value="취소" onclick="cancel();">
			<input type="button" value="저장" onclick="save();">
			<input type="button" value="다음" onclick="next();">
	</form>
</body>
</html>