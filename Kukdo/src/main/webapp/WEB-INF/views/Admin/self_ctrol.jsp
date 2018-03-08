<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>first</title>
<%@ include file="/resources/include/include_header.jsp" %>
</head>
<body>
<h2>자기소개서 관리</h2>

		분류
		<select name="sRecruiment" id="select">
			<option value="1">경력</option>
			<option value="2">신입</option>
			<option value="3">인턴</option>
			</select>
		
	
<table style="border:1px solid #ccc" id="stock_table">
	
    <colgroup>
        <col width="5%"/>
        <col width="5%"/>
        <col width="*%"/>
        <col width="20%"/>
        <col width="15%"/>
        <col width="5%"/>
    </colgroup>
    <thead id="stock_thead">
        <tr>
            <th scope="col">번호</th>
            <th scope="col">분류</th>
            <th scope="col">항목</th>
            <th scope="col">허용글자수</th>
            <th scope="col">노출여부</th>
            <th scope="col">삭제</th>
        </tr>
    </thead>
    <tbody id="stock_tbody">
        
               <tr>
                   <td>1</td>
                   <td>${select }</td>
                   <td><input type="text" name="opty"></td>
                        
                   <td><input type="text" name="optx">자</td>
                   <td>
            	<select name="sRecruiment" name="optc" id="excu">
         		<option value="1">Y</option>
				<option value="2">N</option>
				</select>
           </td>
            <td><input type=button name="optz" value="행삭제" onclick="del_row();"></td>
     </tr>
                
         
    </tbody>
</table>
<br/>
<input type=button value="행추가" onclick="add_row();">
<a href="#this" class="btn" id="write">저장</a>

<%@ include file="/resources/include/include_body.jsp" %>
	<script type="text/javascript">
	var stock_table = document.getElementById('stock_table');
	var stock_thead = document.getElementById('stock_thead');
	var stock_tbody = document.getElementById('stock_tbody');
	var stock_tr = null;
	var stock_td = null;
	var stock_x = 0;
	var stock_y = 0;
	var msg = document.getElementById('msg');

	function add_row() 
	{
	    // 행 추가
	    stock_tr = document.createElement('tr');
	    stock_tbody.appendChild(stock_tr);
	    stock_td = document.createElement('td');
	    stock_tr.appendChild(stock_td);
	    add_input('opty_subj[]');
	    stock_y++;

	    // 열의 갯수에 따라 추가된 행의 열 추가
	    var stock_thead_td = stock_thead.getElementsByTagName('td');
	    for (i=0; i<stock_thead_td.length-1; i++)
	    {
	        stock_td = document.createElement('td');
	        stock_tr.appendChild(stock_td);
	        add_input('opt['+stock_y+'][]');
	    }
	}


	function add_input(name)
	{
	    var inp = document.createElement('input');
	    inp.setAttribute('type', 'text');
	    inp.setAttribute('size', '10');
	    inp.setAttribute('name', name);
	    stock_td.appendChild(inp);
	}

	function del_row()
	{
	    var stock_tbody_tr = stock_tbody.getElementsByTagName('tr');
	    if (stock_tbody_tr.length > 1) {
	        stock_tbody.deleteRow(stock_tbody_tr.length-1);
	        stock_y--;
	    }
	}


		
	</script>
</body>
</html>
