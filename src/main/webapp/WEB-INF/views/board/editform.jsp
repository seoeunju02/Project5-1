<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<form:form modelAttribute="boardVO" method="post" action="../editok">
<%--<form:form action="editok" method="post">--%>
<%--<form:form commandName="boardVO" method="POST" action="editok">--%>
    <form:hidden path="seq"/>
    <table id="edit">
        <tr><td>조</td><td><form:input path="groups"/></td></tr>
        <tr><td>홈팀 나라</td><td><form:input path="home"/></td></tr>
        <tr><td>원정 팀 나라</td><td><form:input path="gre"/></td></tr>
        <tr><td>홈팀 득점</td><td><form:input path="hscore"/></td></tr>
        <tr><td>원정 팀 득점</td><td><form:input path="gscore"/></td></tr>
        <tr><td>유효 슈팅 수</td><td><form:input path="shoot"/></td></tr>
        <tr><td>경고 수</td><td><form:input path="warning"/></td></tr>
        <tr><td>퇴장 수</td><td><form:input path="leaves"/></td></tr>
    </table>
    <button type="button" onclick="location.href='../'">취소</button>
    <button type="submit">업데이트</button>
</form:form>
