<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<%
/* セッションスコープからユーザー情報を取得  */
User loginUser = (User) session.getAttribute("loginUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>どこつぶ</title>
</head>
<body>

<h1>どこつぶメイン</h1>
<p><%= loginUser.getName() %>さん、ログイン中</p>
<a href="/docoTsubu/Logout">ログアウト</a>

</body>
</html>