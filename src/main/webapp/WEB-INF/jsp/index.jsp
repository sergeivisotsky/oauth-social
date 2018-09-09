<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Welcome Servlet</title>
</head>
<body>
<h2>Oauth with Facebook</h2>
<form action="/connect/facebook" method="post">
    <input type="hidden" name="scope" value="read_stream"/>
    <p>
        <button type="submit">Login With Facebook</button>
    </p>
</form>
</body>
</html>
