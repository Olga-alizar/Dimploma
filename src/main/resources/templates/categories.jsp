<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="stag" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP List categories Records</title>
</head>
<body>
	<tr>
		<th>id</th>
		<th>name</th>
		<th>description</th>
		<th>Actions</th>
	</tr>
    <table border="1" cellpadding="5">
		<c:forEach var="category" items="${categories}">
				<tr>
					<td><c:out value="${category.id}"/></td>
					<td><c:out value="${category.name}"/></td>
					<td><c:out value="${category.description}" /></td>
					<td><button><a href="/category/furniture?id=${category.id}">Furniture</a></button></td>
				</tr>
		</c:forEach>
	</table>
</body>
</html>
