<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Welcome Servlet</title>
</head>
<body>
<h2>Login with: </h2>
<%--Facebook--%>
<form action="<c:url value="/connect/facebook"/>" method="post">
    <input type="hidden" name="scope" value="read_stream"/>
    <p>
        <button type="submit">Login with Facebook</button>
    </p>
</form>

<%--Google--%>
<form action="<c:url value="/connect/google"/>" method="post">
    <input type="hidden" name="scope" value="read_stream"/>
    <p>
        <button type="submit">Login with Google</button>
    </p>
</form>
</body>
</html>
