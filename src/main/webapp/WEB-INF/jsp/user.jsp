<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Welcome Servlet</title>
</head>
<body>
<div>First name: ${name}</div>
<security:authorize access="isAuthenticated()">
    <a href="${pageContext.request.contextPath}/logout">Logout</a>
</security:authorize>
</body>
</html>
