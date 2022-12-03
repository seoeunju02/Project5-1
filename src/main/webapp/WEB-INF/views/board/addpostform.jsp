
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<form action="addok" method="post">
    <td id="edit">
<%--        <tr><td>카테고리</td></tr><input type="text" name="category"/></td></tr>--%>
        <tr><td>조 </td></tr><input type="text" name="groups" /></td></tr></p>
        <tr><td>홈팀 나라 </td></tr><input type="text" name="home" /></td></tr></p>
        <tr><td>원정 팀 나라 </td></tr><input type="text" name="gre" /></td></tr></p>
        <tr><td>홈팀 득점 </td></tr><input type="text" name="hscore" /></td></tr></p>
        <tr><td>원정 팀 득점 </td></tr><input type="text" name="gscore" /></td></tr></p>
        <tr><td>유효 슈팅 수 </td></tr><input type="text" name="shoot" /></td></tr></p>
        <tr><td>경고 수 </td></tr><input type="text" name="warning" /></td></tr></p>
        <tr><td>퇴장 수 </td></tr><input type="text" name="leaves" /></td></tr></p>
    </table>
    <button type="button" onclick="location.href='../'">취소</button>
    <button type="submit">추가</button>
</form>