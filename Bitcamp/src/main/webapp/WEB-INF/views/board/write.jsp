<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<form id="form-write" name="form-write">
     <table>
        <tr>
          <td>제목</td>     
          <td><input size="47" type="text" name="title"></td>
        </tr>
        <tr>
          <td>작성자</td>
          <td><input size="47" type="text" name="title">
         </tr>
         <tr>
          <td >
            <textarea cols="55" rows="15" name="content"></textarea>
           </td>
           <td>
         	 <img src="${path.img}/${uploadImage}" alt="" />
           </td>
       	  </tr>
       </table>
</form>
        <tr >
       	 <td colspan="2">

          <button id="submit-btn">확인</button>
          <button id="cancel-btn">취소</button>
		 </td>        
        </tr>

<!-- link that opens popup -->
<a class="popup-with-form" href="#test-form">파일</a>

<!-- form itself -->
<form id="test-form" action="${path.context}/board/fileupload" class="mfp-hide white-popup" method="post" enctype="multipart/form-data">
	<h1>Form</h1>
	   <div class="jumbotron" style="background-color: white;">
	<div class="container text-center">
<button type="button" class="btn btn-default" aria-label="Left Align">
 <span class="glyphicon glyphicon-align-left" aria-hidden="true"></span>
</button>
<h1>
    FileUpload
</h1>
<h2>200MB</h2>
<div class="row">
    <div class="col-sm-4"></div>
    <div  class="col-sm-4">
        <div class="input-group">
            <input style="width: 350px;" type="file" name="file" class="form-control"/>
        </div>
    </div>
    <div class="col-sm-4"></div>
</div>       
	<input type="submit" value="선 택" />
	<input type="reset" value="취 소" />
   
</div>
</div>
</form>

<script>
$(document).ready(function(){
	$('.popup-with-form').magnificPopup({
		type: 'inline',
		preloader: false,
		focus: '#name',

		// When elemened is focused, some mobile browsers in some cases zoom in
		// It looks not nice, so we disable it:
		callbacks: {
			beforeOpen: function() {
				if($(window).width() < 700) {
					this.st.focus = false;
				} else {
					this.st.focus = '#name';
				}
			}
		}
	});
});

$('#submit-btn').on('click',function(){
	$('#form-write')
	.attr('action','${path.context}/list')
	.attr('method','post')
	.submit();
});
$('#file-btn').on('click',function(){
	app.move("board/fileUpload");
});
</script>
