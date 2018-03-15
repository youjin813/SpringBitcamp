<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="container">
<button class="pull-right" id="btn-write">글쓰기</button>
<div>
	총 게시글 수 : ${page.totalCount} 개
</div>
<table class="table table-striped">
	<tr>
		<th>글번호</th>
		<th>제 목</th>
		<th>작성자</th>
		<th>작성일</th>
	</tr>
	<c:forEach begin="" items="${list}" step="1" var="article" varStatus="">
		<tr>
			<td>${article.bbsSeq}</td>
			<td>
				<a href="${path.context}/board/detail/${article.bbsSeq}">
					${article.title}
				</a>
			</td>
			<td>${article.id}</td>
			<td>${article.regdate}</td>
		</tr>
	</c:forEach>
</table>
<nav>
  <ul class="pagination">
  	<c:if test="${page.prevBlock}">
  	 	<li>
     	 <a href="#" aria-label="Previous" onclick="app.boardList(${page.pageStart-page.pageSize});return false;">
        	<span aria-hidden="true">&laquo;</span>
      	 </a>
   	  </li> 
  	</c:if>
 
    <c:forEach begin="${page.pageStart}" end="${page.pageEnd}" step="1" varStatus="i">
	   	<c:choose>
	   		<c:when test="">
	   			<li><a style="color: red" href="#" onclick="${path.context}/board/list?pageNum=${i.index}">${i.index}</a></li>
	   		</c:when>
	   		<c:otherwise>
	   			<li><a href="#" onclick="app.boardList('${i.index}')">${i.index}</a></li>
	   		</c:otherwise>
	   	</c:choose>
    </c:forEach>
    
    <c:if test="${page.nextBlock}">
    	 <li>
     		 <a href="#" onclick="app.boardList(${page.pageStart+page.pageSize});return false;" aria-label="Next">
       			 <span aria-hidden="true">&raquo;</span>
     		 </a>
    	</li>  
    </c:if>
  </ul>
</nav>
</div>
<script>
$('#btn-write').on('click',function(){
	app.move("board/write");
});
</script>