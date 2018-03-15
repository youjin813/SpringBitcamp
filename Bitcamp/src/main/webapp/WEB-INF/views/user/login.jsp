<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

		<section id="index_section">
			<article>
				<table id="index_table">
					<tr id="first_child">
						<td colspan="5">
								<table id="index_login_box" >
				 					<tr>
				 						<td > 
					 						<input id="userid" type="text" name="userid" placeholder="id"/>
				 						</td>
				 						<td  rowspan="2">
					 					<button id="login_btn">로그인</button>
										</td>
				 					</tr>
				 					<tr>
				 						<td >
				 						<input id="password" type="text" name="password" placeholder="pass"/>
				 						</td>
				 					</tr>
				 				</table>
							<a id="go_admin_link" >관리자</a>
							<a id="go_join_link" >회원가입</a>
							<a id="go_jdbc_link" >JDBC TEST</a>
						</td>
					</tr>
				</table>	
			</article>
		</section>

<script>
	$('#login_btn').on('click',function(){
		var id = $('#userid').val();
		var pass = $('#password').val();
		alert('마이페이지 이동');
		location.href = "${path.context}/login/"+id+"/"+pass;
	});
</script>