<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>用户信息添加3</h1>
	<form action="user/add3.do" method="post">
		编号：<input type="text"  name="userId"/><br/>
		姓名：<input type="text"  name="userName"/><br/>
		性别：<input type="text"  name="userSex"/><br/>
		兴趣爱好：
		<input type="checkbox" name="xingXq" value="lol"/>lol
		<input type="checkbox" name="xingXq" value="英雄联盟"/>英雄联盟
		<input type="checkbox" name="xingXq" value="dota"/>dota<br/>
		
		<input type="submit" value="提交" />
	</form>
</body>
</html>