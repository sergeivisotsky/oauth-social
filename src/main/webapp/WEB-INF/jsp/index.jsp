<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Welcome Servlet</title>
</head>
<body>
<h2>Oauth with Facebook</h2>
<form action="<c:url value="/connect/facebook"/>" method="post">
    <input type="hidden" name="scope" value="read_stream"/>
    <p>
        <button type="submit">Login with Facebook</button>
    </p>
</form>
</body>
</html>
