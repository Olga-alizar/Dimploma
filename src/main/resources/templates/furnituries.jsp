<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP List furnituries Records</title>
</head>
<body>
	<tr>
		<th>id</th>
		<th>name</th>
		<th>description</th>
		<th>Actions</th>
	</tr>
    <table border="1" cellpadding="5">
		<c:forEach var="furniture" items="${categories}">
				<tr>
					<td><c:out value="${category.id}" /></td>
					<td><c:out value="${category.name}" /></td>
					<td><c:out value="${category.description}" /></td>
					<td><button><a href="/link/to/page2">Furniture</a></button></td>
				</tr>
			</c:forEach>
	</table>
</body>
</html>
