<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
   function cancel(){
      var con_test = confirm("작성하신 내용이 모두 삭제되고, 해당 페이지를 닫습니다. 취소하시겠습니까?");
      if(con_test == true){
      window.close();
      }
         else if(con_test == false){
           close.self();
         }   
   }
   
   function send(){
      var f = document.question;
      f.action="send";
      f.submit();
      var con_test = confirm("정상적으로 문의가 접수되었습니다. 담당자 확인 후 빠른 시일 내에 답변을 드리도록 하겠습니다. 감사합니다");
   }
   

</script>
</head>
<body>

   <form name="question" method="post" enctype="multipart/form-data">
      <table>
         <tr>
            <td>문의분류</td>
            <td><select name="문의분류" disable=true>
                  <option value="채용">채용</option>
            </select></td>
         </tr>
      </table>
      <table>
         <tr>
            <td>성명</td>
            <td><input type="text" name="name"></td>
         </tr>
         <tr>
            <td>연락처</td>
            <td><input type="text" name="phone1">-<input
               type="text" name="phone2">-<input type="text" name="phone3"></td>
         </tr>
         <tr>
            <td>E-mail</td>
            <td><input type="text" name="email1">@<input type="text"
               name="email2"> <select name="email3">
                  <option value="naver.com">naver.com</option>
                  <option value="daum.net">daum.net</option>
            </select></td>
         </tr>
      </table>

      <table>
         <tr>
            <td>제목</td>
            <td><input type="text" name="title"></td>
         </tr>
         <tr>
            <td>내용</td>
            <td><textarea name="contents"></textarea></td>
         </tr>
         <tr>
            <td>첨부파일</td>
            <td><input type="file" name="file">
      </table>

      <input type="button" value="취소" onclick="cancel()"> 
      <input type="button" value="발송" onclick="send()"> 
   </form>


</body>
</html>