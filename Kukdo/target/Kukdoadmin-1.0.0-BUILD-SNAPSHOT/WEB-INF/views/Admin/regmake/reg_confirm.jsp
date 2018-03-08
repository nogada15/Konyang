<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script language="javascript">
function finalapply()
{
	var con_test = confirm("최종 지원 후에는 지원서 수정이 불가능 합니다. 최종 지원 하시겠습니까?");
	if(con_test == true){
		location.href="passercheck";
		}
		else if(con_test == false){
		  close.self();
		}	
}
</script>
<body>

	<table>
		<tr>
			<td>채용공고</td>
			<td>${area.title}제목</td>
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
			<td>${regmm.name}</td>
		</tr>
		<tr>
			<td>생년월일</td>
			<td>${regmm2.birthyear}년${regmm2.birthmonth}월${regmm2.birthday}일</td>
		</tr>
		<tr>
			<td>현주소</td>
			<td>${regmm.address}${regmm.restaddress}${regmm.addressnum}</td>
		</tr>
		<tr>
			<td>연락처</td>
		</tr>
		<tr>
			<td>휴대폰</td>
			<td>${regmm.phone}</td>
		</tr>
		<tr>
			<td>전화번호</td>
			<td>${regmm.hp}</td>
		</tr>
		<tr>
			<td>E-mail</td>
			<td>${regmm.email}</td>
		</tr>
		<tr>
			<td>종교</td>
			<td>${regmm2.faith}</td>
		</tr>
		<tr>
			<td>결혼여부</td>
			<td>${regmm.marry}
		</tr>
	</table>

	<table>
		<tr>
			<td>보훈여부</td>
			<td>${regmm.bohunYN}</td>
			<td>보훈번호</td>
			<td>${regmm.bohunnum}</td>
			<td>장애여부</td>
			<td>${regmm.disableYN}</td>
			<td>장애등급</td>
			<td>${regmm.disablenum}</td>
		</tr>
		<tr>
			<td>희망근무지</td>
			<td>${regmm2.hopework}</td>
			<td>희망직위</td>
			<td>${regmm2.hopelevel}</td>
			<td>희망연봉</td>
			<td>${regmm2.hopeincome}만원</td>
			<td>취미/특기</td>
			<td>${regmm2.hobby}</td>
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
			<td>${acam.highyear}년${acam.highmonth}월</td>
			<td>${acam.highschool}</td>
			<td>-</td>
			<td>${acam.higharea}</td>
			<td>-</td>
			<td></td>
		</tr>
		<tr>
			<td>전문대학</td>
			<td>${acam.collegeyear}년${acam.collegemonth}월</select> <select
				name="join">
					<option value="join">입학</option>
			</select> ${acam.collegeendyear}년${acam.collegeendmonth} <select
				name="collegegraduateYN">
					<option value="졸업">졸업</option>
					<option value="졸업예정">졸업예정</option>
					<option value="수료">수료</option>
					<option value="재학">재학</option>
			</select></td>
			<td>${acam.collegename}</td>
			<td>${acam.collegedepartname}학과</td>
			<td>${acam.collegearea}</td>
			<td>${acam.collegedaynight}</td>
			<td>${acam.collegescore}/${acam.collegescorevalue}</td>
		</tr>
		<tr>
			<td>대학교</td>
			<td>${acam.univyear}년${acam.univmonth}월<select name="join">${acam.univendyear}${acam.univendmonth}<select
					name="univgraduateYN">
				</select></td>
			<td>${acam.univname}</td>
			<td>${acam.univdepartname}학과</td>
			<td>${acam.univarea}</td>
			<td>${acam.univdaynight}</td>
			<td>${acam.univscore}/${acam.univscorevalue}</td>
		</tr>
		<tr>
			<td>편입대학교</td>
			<td>${acam.transyear}년${acam.transmonth}월<select name="join">
					<option value="join">졸업</option>
			</select>${acam.transendyear}년${acam.transendmonth}월<select
				name="transgraduateYN">
					<option value="grad">졸업</option>
			</select></td>
			<td>${acam.transname}</td>
			<td>${acam.transdepartname}학과</td>
			<td>${acam.transarea}</td>
			<td>${acam.transdaynight}</td>
			<td>${acam.transscore}/${acam.transscorevalue}</td>
		</tr>
		<tr>
			<td>대학원(석사)</td>
			<td>${acam.masteryear}년${acam.mastermonth}월<select name="join">
					<option value="join">입학</option>
			</select>${acam.masterendyear}년${acam.masterendmonth}월 <select
				name="mastergraduateYN">
					<option value="grad">졸업</option>
			</select></td>
			<td>${acam.mastername}</td>
			<td>${acam.masterdepartname}학과</td>
			<td>${acam.masterarea}</td>
			<td>${acam.masterdaynight}</td>
			<td>${acam.masterscore}/${acam.masterscorevalue}</td>
		</tr>
		<tr>
			<td>대학원(박사)</td>
			<td>${acam.doctoryear}년${acam.doctormonth}월<select name="join">
					<option value="join">입학</option>
			</select>${acam.doctorendyear}년${acam.doctorendmonth}월<select
				name="doctorgraduateYN">
					<option value="grad">졸업</option>
			</select></td>
			<td>${acam.doctorname}</td>
			<td>${acam.doctordepartname}학과</td>
			<td>${acam.doctorarea}</td>
			<td>${acam.doctordaynight}</td>
			<td>${acam.doctorscore}/${acam.doctorscorevalue}</td>
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
			<td>${langt.language1}</td>
			<td>${langt.testname1}</td>
			<td>${langt.testyear1}년${langt.testmonth1}월${langt.testday1}일</td>
			<td>${langt.testscore1}</td>
			<td>${langt.testbbyear1}년${langt.testbbmonth1}월${langt.testbbday1}일</td>
			<td>${langt.level1}</td>
		</tr>
		<tr>
			<td>${langt.language2}</td>
			<td>${langt.testname2}</td>
			<td>${langt.testyear2}년${langt.testmonth2}월${langt.testday2}일</td>
			<td>${langt.testscore2}</td>
			<td>${langt.testbbyear2}년${langt.testbbmonth2}월${langt.testbbday2}일</td>
			<td>${langt.level2}</td>
		</tr>
		<tr>
			<td>${langt.language3}</td>
			<td>${langt.testname3}</td>
			<td>${langt.testyear3}년${langt.testmonth3}월${langt.testday3}일</td>
			<td>${langt.testscore3}</td>
			<td>${langt.testbbyear3}년${langt.testbbmonth3}월${langt.testbbday3}일</td>
			<td>${langt.level3}</td>
		</tr>
		<tr>
			<td>${langt.language4}</td>
			<td>${langt.testname4}</td>
			<td>${langt.testyear4}년${langt.testmonth4}월${langt.testday4}일</td>
			<td>${langt.testscore4}</td>
			<td>${langt.testbbyear4}년${langt.testbbmonth4}월${langt.testbbday4}일</td>
			<td>${langt.level4}</td>
		</tr>
		<tr>
			<td>${langt.language5}</td>
			<td>${langt.testname5}</td>
			<td>${langt.testyear5}년${langt.testmonth5}월${langt.testday5}일</td>
			<td>${langt.testscore5}</td>
			<td>${langt.testbbyear5}년${langt.testbbmonth5}월${langt.testbbday5}일</td>
			<td>${langt.level5}</td>
		</tr>
	</table>
	<input type="button" value="추가" name="추가">
	<input type="button" value="삭제" name="삭제">
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
			<td>${lm.liecensename1}</td>
			<td>${lm.liecenseyear1}년${lm.liecensemonth1}월${lm.liecenseday1}일</td>
			<td>${lm.liecenseori1}</td>
			<td>${lm.liecensecode1}</td>
		</tr>
		<tr>
			<td>${lm.liecensename2}</td>
			<td>${lm.liecenseyear2}년${lm.liecensemonth2}월${lm.liecenseday2}일</td>
			<td>${lm.liecenseori2}</td>
			<td>${lm.liecensecode2}</td>
		</tr>
		<tr>
			<td>${lm.liecensename3}</td>
			<td>${lm.liecenseyear3}년${lm.liecensemonth3}월${lm.liecenseday3}일</td>
			<td>${lm.liecenseori3}</td>
			<td>${lm.liecensecode3}</td>
		</tr>
		<tr>
			<td>${lm.liecensename4}</td>
			<td>${lm.liecenseyear4}년${lm.liecensemonth4}월${lm.liecenseday4}일</td>
			<td>${lm.liecenseori4}</td>
			<td>${lm.liecensecode4}</td>
		</tr>
		<tr>
			<td>${lm.liecensename5}</td>
			<td>${lm.liecenseyear5}년${lm.liecensemonth5}월${lm.liecenseday5}일</td>
			<td>${lm.liecenseori5}</td>
			<td>${lm.liecensecode5}</td>
		</tr>
	</table>
	<input type="button" value="추가" name="추가">
	<input type="button" value="삭제" name="삭제">
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
			<td>${cp.company1}</td>
			<td>${cp.depart1}</td>
			<td>${cp.work1}</td>
			<td>${cp.level1}</td>
			<td>${cp.joinyear1}년${cp.joinmonth1}월~
				${cp.resignyear1}년${cp.resignmonth1}월</td>
			<td>년월</td>
			<td>${cp.income1}만원</td>
		</tr>
		<tr>
			<td>${cp.company2}</td>
			<td>${cp.depart2}</td>
			<td>${cp.work2}</td>
			<td>${cp.level2}</td>
			<td>${cp.joinyear2}년${cp.joinmonth2}월~
				${cp.resignyear2}년${cp.resignmonth2}월</td>
			<td>년월</td>
			<td>${cp.income2}만원</td>
		</tr>
	</table>
	<input type="button" value="추가" name="추가">
	<input type="button" value="삭제" name="삭제">
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
			<td>${ovs.nation1}</td>
			<td>${ovs.agency1}</td>
			<td>${ovs.startyear1}년${ovs.startmonth1}월${ovs.startday1}일~
				${ovs.endyear1}년${ovs.endmonth1}월${ovs.endday1}일</td>
			<td>${ovs.contents1}</td>
		</tr>
		<tr>
			<td>${ovs.nation2}</td>
			<td>${ovs.agency2}</td>
			<td>${ovs.startyear2}년${ovs.startmonth2}월${ovs.startday2}일~
				${ovs.endyear2}년${ovs.endmonth2}월${ovs.endday2}일</td>
			<td>${ovs.contents2}</td>
		</tr>
		<tr>
			<td>${ovs.nation3}</td>
			<td>${ovs.agency3}</td>
			<td>${ovs.startyear3}년${ovs.startmonth3}월${ovs.startday3}일~
				${ovs.endyear3}년${ovs.endmonth3}월${ovs.endday3}일</td>
			<td>${ovs.contents3}</td>
		</tr>
	</table>
	<input type="button" value="추가" name="추가">
	<input type="button" value="삭제" name="삭제">
	<p>병역사항
	<p>
	<table>
		<tr>
			<td>군필여부</td>
			<td>${mm.military}</td>
			<td>군별</td>
			<td>${mm.militarypart}</td>
			<td>병과</td>
			<td>${mm.militaryver}</td>
			<td>계급</td>
			<td>${mm.militarylevel}</td>
		</tr>
		<tr>
			<td>복무기간</td>
			<td colspan="3">${mm.startyearm}년${mm.startmonthm}월${mm.startdaym}일
				~ ${mm.endyearm}년${mm.endmonthm}월${mm.enddaym}일</td>
			<td colspan="2">의가사/면제 사유</td>
			<td colspan="2">${mm.reason}</td>
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
			<td>${fm.family1}</td>
			<td>${fm.name1}</td>
			<td>${fm.age1}</td>
			<td>${fm.education1}</td>
			<td>${fm.job1}</td>
			<td>${fm.live1}</td>
		</tr>
		<tr>
			<td>${fm.family2}</td>
			<td>${fm.name2}</td>
			<td>${fm.age2}</td>
			<td>${fm.education2}</td>
			<td>${fm.job2}</td>
			<td>${fm.live2}</td>
		</tr>
		<tr>
			<td>${fm.family3}</td>
			<td>${fm.name3}</td>
			<td>${fm.age3}</td>
			<td>${fm.education3}</td>
			<td>${fm.job3}</td>
			<td>${fm.live3}</td>
		</tr>
		<tr>
			<td>${fm.family4}</td>
			<td>${fm.name4}</td>
			<td>${fm.age4}</td>
			<td>${fm.education4}</td>
			<td>${fm.job4}</td>
			<td>${fm.live4}</td>
		</tr>
	</table>
	<input type="button" value="추가" name="추가">
	<input type="button" value="삭제" name="삭제">
	<b>성장과정 및 장단점</b> 입력글자수
	<input type="text" name="inputtextnum">/100~1000자
	<p>
		<textarea readonly="readonly">${self1.self1}
</textarea>
	<p>
	<p>
		<b>지향 가치관 및 차별화된 보유역량(3가지)</b> 입력글자수<input type="text"
			name="inputtextnum">/100~1000자
	<p>
		<textarea readonly="readonly">${self1.self2}
</textarea>
	<p>

		<b>국도화학 지원동기</b> 입력글자수<input type="text" name="inputtextnum">/100~1000자
	
	<p>
		<textarea readonly="readonly">${self1.self3}
</textarea>
	<p>

		<b>희망업무 및 비전</b> 입력글자수<input type="text" name="inputtextnum">/100~1000자
	
	<p>
		<textarea readonly="readonly">${self1.self4}
</textarea>
	<p>

		<b>자신의 리더십 소개 및 구체적인 리더십 발휘 사례</b> 입력글자수<input type="text"
			name="inputtextnum">/100~1000자
	<p>
		<textarea readonly="readonly">${self1.self5}
</textarea>
	<p>

		<b>추가사항(석/박사 논문 또는 세부 경력사항 등)</b> 입력글자수<input type="text"
			name="inputtextnum">/100~1000자
	<p>
		<textarea readonly="readonly">${self1.self6}
</textarea>
	<p>
	<p>
	<p>지원서상의 모든 기재사항은 사실이며, 허위로 판명될 경우 어떠한 인사상 불이익을 받더라도 이의를 제기하지 않을 것을
		서약합니다.
	<p>지원자 ${regmm.name} (인)
	<p>
	<p>
	<form action=modify>
		<input type="submit" value="수정" name="modify">
		<input type=hidden value="${pk.pk}" name="pk">
		<input type=hidden value="${regmm.apk}" name="apk">
		
	</form>
		 <input type="button" value="최종 지원" onclick="finalapply();">
</body>
</html>