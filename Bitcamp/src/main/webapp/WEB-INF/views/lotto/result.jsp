<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	구매 금액 : <input type="text" id="money" name="money" value="${money}" />
	<button id="btn_money">전송</button>		
</article>
<article>
<div style="height: 40px; width: 300px;"></div>
	<table id="member_list_tab">
		<tr>
			<th>No.</th>
			<th>로또번호</th>
		</tr>
		<c:forEach var="i" items="${lottos}">
		<tr>
			<td>1</td>
			<td>${i.lottoNumber}</td>
		</tr>	
		</c:forEach>
	</table>
</article>
</section>
<aside></aside>
<script>

</script>



