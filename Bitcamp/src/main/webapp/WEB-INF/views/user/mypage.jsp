<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>마이페이지</title>
	<script src="${js}/jquery-3.3.1.min.js"></script>
</head>
<body>
<article>
<form name="change_pass" id="change_pass" action="${ctx}/user.do">
	<table id="mypage_table">
		<tr>
			<td rowspan="5"><img src="" /></td>
			<td class="column">ID</td>
			<td></td>
			<td class="column">PW</td>
			<td></td>
		</tr>
		<tr>
			<td class="column">NAME</td>
			<td></td>
			<td class="column">GENDER</td>
			<td></td>
		</tr>
		<tr>
			<td class="column">BIRTHDAY</td>
			<td></td>
			<td class="column">PHONE</td>
			<td></td>
		</tr>
		<tr>
			<td class="column">EMAIL</td>
			<td></td>
			<td class="column">ADDRESS</td>
			<td></td>
		</tr>
			<tr>
			<td class="column">ACCOUNT</td>
			<td></td>
			<td class="column"></td>
			<td></td>
		</tr>
	</table>
		<button id="pass_update_btn" name ="pass_update_btn" style="width: 200px">비밀번호 변경</button>
		<input type="hidden" name="cmd" value="move" />
		<input type="hidden" name="dir" value="user" />
		<input type="hidden" name="page" value="change_pass" />
</form>	
		<button id="delete_btn" name ="delete_btn" style="width: 200px">탈퇴</button> 
		<button id="logout_btn" name ="logout_btn" style="width: 200px">로그아웃</button> 
		<button id="nav_btn">네비 바 이동</button>
	</article>
</body>

<script>
	$('#nav_btn').on('click',function(){
		location.href= "${context}/nav";
	});	

</script>
</html>