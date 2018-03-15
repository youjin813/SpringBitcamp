<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<form id="form-write" name="form-write">
     <table>
        <tr>
              
          <td colspan="2"><input size="47" type="text" name="title" value="${board.title}"></td>
        </tr>
        <tr>
         <td>작성자</td>
          <td><input size="47" type="text" name="title" value="${board.id}">
          </tr>
        <tr>
          <td colspan="2">
            <textarea cols="55" rows="15" name="content">${board.content}</textarea>
          </td>
        </tr>
        <tr >
       	 <td colspan="2">
          <button id="submit-btn">수정하기</button>
          <button id="cancel-btn">목록보기</button>
		 </td>        
        </tr>
	</table>
</form>
<script>

</script>
