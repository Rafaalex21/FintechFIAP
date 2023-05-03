<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Finance</title>
</head>
<body>
    <h1>List Finance</h1>
    <table>
        <tr>
            <th>Description</th>
            <th>Value</th>
            <th>Date</th>
        </tr>
        <c:forEach items="${finances}" var="finance">
            <tr>
                <td>${finance.description}</td>
                <td>${finance.value}</td>
                <td>${finance.date}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
