<#assign s=JspTaglibs["/WEB-INF/struts-tags.tld"] />
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-type" content="text/html; charset=UTF-8">
    <title>Input Params</title>
</head>
<body>
    <form action="user_login.action" method="post">
        <label>Name</label>
        <input type="text" name="username" />
        <input type="submit" value="提交" />
    </form>
</body>
</html>