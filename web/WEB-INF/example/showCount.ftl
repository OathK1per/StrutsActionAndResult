<#assign s=JspTaglibs["/WEB-INF/struts-tags.tld"] />
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-type" content="text/html; charset=UTF-8">
    <title>Input Params</title>
</head>
<body>
    Welcome to this page: ${username!""}
    <br/><br/>
    People online: ${count!0}
    <br/><br/>
    <a href="user_logout.action">Logout</a>
</body>
</html>