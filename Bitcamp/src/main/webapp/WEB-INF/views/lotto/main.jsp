<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<br />
<br />
<br />
<br />
<br />
<br />
<br />
<br />








<section>
<article>
	구매 금액 : <input type="text" id="money" name="money" placeholder="게임 당 1000원 최대 5게임" />
	<button id="btn_money">전송</button>		
</article>
</section>
<aside></aside>
<script>
$('#btn_money').on('click',function(){
	var money = $('#money').val();         
	alert("입금 받은 돈은"+money);
	location.href = "${path.context}/lotto/"+money;
});
</script>



