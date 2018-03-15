<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<article>
	<table id="mypage_table">
		<tr>
			<td rowspan="5"><img src="" /></td>
			<td class="column">ID</td>
			<td>${user.id}</td>
			<td class="column">PW</td>
			<td>${user.pass}</td>
		</tr>
		<tr>
			<td class="column">NAME</td>
			<td>${user.name}</td>
			<td class="column">GENDER</td>
			<td>${user.ssn}</td>
		</tr>
		<tr>
			<td class="column">BIRTHDAY</td>
			<td>${user.ssn}</td>
			<td class="column">PHONE</td>
			<td id="td-phone"></td>
				
		</tr>
		<tr>
			<td class="column">EMAIL</td>
			<td>${user.email}</td>
			<td class="column">ADDRESS</td>
			<td>${user.addr}</td>
		</tr>
			<tr>
			<td class="column">ACCOUNT</td>
			<td></td>
			<td class="column"></td>
			<td id="td-account"></td>
		</tr>
	</table>
		<button id="pass_update_btn" name ="pass_update_btn" style="width: 200px">비밀번호 변경</button>
		<input type="hidden" name="cmd" value="move" />
		<input type="hidden" name="dir" value="user" />
		<input type="hidden" name="page" value="change_pass" />

		<button id="delete_btn" name ="delete_btn" style="width: 200px">탈퇴</button> 
		<button id="btn-mypage-change" style="width: 200px">수정</button> 
		<button id="nav_btn">네비 바 이동</button>
	</article>

<script>
$(function(){
	var phone = ("${phone}"==="") ? "개통하기" : ""
	$('#td-phone').html('<a id="phone_open" href="#">'+phone+'</a>');
});


	$('#btn-mypage-change').on('click',function(){
		alert('마이페이지 이동');
	});
	
	$('#phone_open').on('click',function(){
		alert('개통!!!');
		location.href = "${path.context}/mobile/main";
	});
	
</script>