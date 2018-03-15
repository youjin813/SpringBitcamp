<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style>
    .navbar-brand {
        padding-top: 1px;
    }
</style>
<nav class="navbar navbar-inverse navbar-fixed-top">

        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">
          	<img src="${path.img}/common/logo.jpg" alt="" />
          </a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">
            	<span class="glyphicon glyphicon-home" aria-hidden="true">&nbsp;HOME</span>
            </a>
            </li>
        
            <li>
            <a href="#">
            	<span class="glyphicon glyphicon-home" aria-hidden="true">&nbsp;MAIL</span>
            	</a>
            	</li>

            <c:choose>
                <c:when test="${user eq null}">
                    <li>
                        <a id="a-login" href="#"> 
                            <span class="glyphicon glyphicon-user" aria-hidden="true">&nbsp;LOGIN</span>
                        </a>
                     </li>
                     <li>   
                         <a id="a-join" href="#"> 
                            <span class="glyphicon glyphicon-user" aria-hidden="true">&nbsp;JOIN</span>
                        </a>
                    </li>
                </c:when>
                <c:otherwise>          
                    <li>
                        <a id="a-logout" href="#">
                            <span class="glyphicon glyphicon-remove-circle" aria-hidden="true">&nbsp;LOGOUT</span>
                        </a>
                    </li>                
                </c:otherwise>
                </c:choose>

  
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" 
           data-toggle="dropdown" aria-haspopup="true" role="button" aria-expanded="false" style="">
          유틸리티
          <span class="caret">
          </span>
        </a>
        
     	<ul id="ul-util">
     		<li><a>로또</a></li>
     		<li><a>햄버거주문</a></li>
     		<li><a>핸드폰 개통</a></li>     
     	</ul>
       	   </li>
       	      <li>
            <a id="a-board" href="#">
            	<span class="glyphicon glyphicon-home" aria-hidden="true">&nbsp;자유게시판</span>
            	</a>
            	</li>
       	   </ul>
  </div>
    </nav>
    <script>
    $("#ul-util").addClass("dropdown-menu");

    $('.dropdown-menu a').eq(0).on('click',function(){
    	app.move("lotto/main");
    	});
    
    $('.dropdown-menu a').eq(1).on('click',function(){
    	app.move("burgerking/main");
    });
    
    $('.dropdown-menu a').eq(2).on('click',function(){
    	app.move("mobile/main");
    });
 	
    $('#a-login').on('click',function(){
    	alert('로그인 페이지로 이동');
    	app.move("user/login");
       // location.href = "${path.context}/move/user/login";
    });  
 	
 	$('#a-logout').on('click',function(){
    	alert('로그아웃 페이지로 이동');
        location.href = "${path.context}/logout";
    });  
 	
 	$('#a-join').on('click',function(){
    	alert('회원가입');
        location.href = "${path.context}/move/user/join";
        });  
 
 	$('#a-board').on('click',function(){
 	 	app.boardList(1);
        });  
 
    </script>