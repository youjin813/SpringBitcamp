<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Home</title>
        <script src="${js}/jquery-3.3.1.min.js"></script>
    </head>
    <body>
        <h1>
            Hello world!  
        </h1>
        <button id="btn">
            로그인
        </button>
    </body>
    <script>
        $('#btn').on('click',function(){
        alert('제이쿼리가 작동');});
    </script>
</html>