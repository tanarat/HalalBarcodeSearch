<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Location list</title>
</head>
<body>

<table>
	<tr>
		<th>ID</th>
		<th>Location</th>
	</tr>
	<c:forEach items="${locationList}" var="location">
		<tr>
			<td>${location.id }</td>
			<td>${location.address1 }</td>
		</tr>
	</c:forEach>
	
</table>
</body>
</html>