<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
    .table {
 width: 600px; margin-top:150px; text-align: center;
    }
</style>
	<table class="table">
		<tr>	
			<td>아이디</td>
			<td >
				<input name="id" id="id" type="text"/>
				<button id="check_dupl_btn" name="check_dupl_btn">중복 확인</button>
			</td>
		</tr>
		<tr>
			<td >비밀번호</td>
			<td>
				<input name="pass" id="pass" type="text" />
			</td>
		</tr>
		<tr>
			<td>비밀번호 확인</td>
			<td>
				<input type="text"/>
					<button style="width: 160px; height: 30px">확인</button>
			</td>
		</tr>
		<tr>
			<td>이름</td>			
			<td>
				<input id="name" name="name" type="text" />
			</td>
		</tr>
		<tr>
		<td>가입일</td>
		<td><input type="date"/></td>
		</tr>
		<tr>
			<td>주민번호</td>
			<td>
				<input name="ssn" type="text" />
			</td>
		</tr>
		<tr>
			<td>핸드폰번호</td>
			<td>
				<input name="phone" type="tel"  />
				<input type="radio"value="KT" />KT
				<input type="radio"value="SKT"/>SKT
				<input type="radio"value="LG"/>LG
				<br />
				<select>
				<option>010</option>
				</select>
				<input pattern="[0-9]{4}" type="text" />
				<input pattern="[0-9]{4}" type="text" />
			</td>
		</tr>
		<tr>
			<td>이메일</td>
			<td>
				<input type="email" />@<select name="email" id=""></select>
			</td>
		</tr>
		<tr>
			<td>주소</td>
			<td>
				<input name="addr" type="text" />
					<button style="width: 160px; height: 30px">주소 검색</button>
			</td>
		</tr>
		<tr>
			<td>프로필사진</td>
			<td>
				<input name="profile" type="text"/>
				
			</td>
		</tr>
		<tr>
			<td colspan="2">
			<button id="join_confirm_btn" style="width: 160px; height: 30px">확인</button>
			<button style="width: 160px; height: 30px">취소</button>
			</td>
		</tr>
	</table>

<script>
$('#join_confirm_btn').on('click',function(){
	alert('회원가입 하시겠습니까?');
	var id = $('#id').val();
	var name = $('#name').val();
	var pass = $('#pass').val();
	location.href = "${path.context}/join/"+id+"/"+pass+"/"+name;

});
//아이디 이름 비번
</script>
