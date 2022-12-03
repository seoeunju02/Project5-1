<%--
  Created by IntelliJ IDEA.
  User: seoeunju
  Date: 2022/11/30
  Time: 5:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Title</title>
</head>
<script>
    function deleteok(sq){
        var a=confirm("정말로 삭제하겠습니까?");
        if(a) location.href='deleteok/'+id;
    }
</script>
<style>
    #list {
        font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
        border-collapse: collapse;
        width: 100%;
    }
    #list td, #list th {
        border: 1px solid #ddd;
        padding: 8px;
        text-align:center;
    }
    #list tr:nth-child(even){background-color: #f2f2f2;}
    #list tr:hover {background-color: #ddd;}
    #list th {
        padding-top: 12px;
        padding-bottom: 12px;
        text-align: center;
        background-color: #006bb3;
        color: white;
    }
</style>
<body>
<h1> 월드컵 점수 정복하기! </h1>
<table id="list" width="90%">
    <tr>
        <th>Id</th>
<%--        <th>Category</th>--%>
        <th>조</th>
        <th>홈팀 나라</th>
        <th>원정 팀 나라</th>
        <th>홈팀 득점</th>
        <th>원정 팀 득점</th>
        <th>유효 슈팅 수</th>
        <th>경고 수</th>
        <th>퇴장 수</th>
        <th>등록 날짜</th>
        <th>수정</th>
        <th>삭제</th>
    </tr>
    <c:forEach items="${list}" var="u">
        <tr>
            <td>${u.seq}</td>
            <td>${u.groups}</td>
            <td>${u.home}</td>
            <td>${u.gre}</td>
            <td>${u.hscore}</td>
            <td>${u.gscore}</td>
            <td>${u.shoot}</td>
            <td>${u.warning}</td>
            <td>${u.leaves}</td>
            <td>${u.regdate}</td>
            <td><a href="editform/${u.seq}">Edit</a></td>
                <%--        <td><a href="javascript:deleteok/${u.seq}">Delete</a></td>--%>
            <td><a href="deleteok/${u.seq}">Delete</a></td>
        </tr>
    </c:forEach>
</table>

<br/><button type="button" onclick="location.href='board/add'">Add New Post</button>
</body>
</html>
