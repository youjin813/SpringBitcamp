<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<head>
	<script src="${js}/jquery-3.3.1.min.js"></script>
</head>
<nav id="nav">
	<ul style="height: 10%">
		<li style="width: 20%; text-align: center;">
			<a id="burgerking">버거킹</a></li>
		<li style="width: 20%; text-align: center">
			<a id="kakao" >카카오뱅크</a></li>
		<li style="width: 20%; text-align: center">
			<a id="bitcamp">비트캠프</a></li>
		<li style="width: 20%; text-align: center">
			<a id="sktelecom">SK 텔레콤</a></li>
		<li style="width: 20%; text-align: center">
			<a id="lotto">로또</a></li>
		<li style="width: 20%; text-align: center">
			<a id="">마이페이지</a></li>
		<li style="width: 20%; text-align: center">
			<a id="">로그아웃</a></li>
	</ul>	
</nav>	
<script>
$('#burgerking').on('click',function(){
	location.href = "${context}/burgerking";
});
$('#kakao').on('click',function(){
	location.href = "${context}/kakao";
});
$('#bitcamp').on('click',function(){
	location.href = "${context}/bitcamp";
});
$('#sktelecom').on('click',function(){
	location.href = "${context}/sktelecom";
});
$('#lotto').on('click',function(){
	location.href = "${context}/lotto";
});

</script>