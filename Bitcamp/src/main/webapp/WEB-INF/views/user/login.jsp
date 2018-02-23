<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Index</title>
	<script src="${js}/jquery-3.3.1.min.js"></script>
</head>
<body>
<div id="wrapper">
<header id="index_header">
	<h1>BIT CAMP SAMPLE PROJECT</h1>
</header>
<section id="index_section">
<article>
<table id="index_table">
	<tr>
		<td colspan="5">
	  			
	  				<table id="index_login_box">
	  				<tr>
	  					<td >
							<input id="index_input_id" type="text" name="id" placeholder="ID"/>						  					
	  					</td>
	  					<td rowspan="2">
	  						<button id="login_btn">로그인</button>
	  						
	  					</td>
	  				</tr>
	  				<tr>
	  					<td>
	  						<input id="index_input_pass" type="text" name="pass" placeholder="PASSWORD"/>
	  						<input type="hidden" name="cmd" value="login" />
	  						<input type="hidden" name="page" value="mypage" />
	  					</td>
	  				</tr>
	  			 </table>	
		
			<a id="go_admin_link">관리자</a>
			<a id="go_join_link">회원가입</a>
			<a id="go_jdbc_link">JDBCTest</a>
</table>
</article>
</section>
</div>
</body>
<script>
	$('#login_btn').on('click',function(){
		alert('마이페이지 이동');
		location.href = "${context}/mypage";
	});
</script>
</html>
