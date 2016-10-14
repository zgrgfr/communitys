<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html class="no-js">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">
<head>
	<meta charset="utf-8">
	<title>login</title>
	<link rel="stylesheet" type="text/css" href="frontpages/recourse/css/pages/login.css" >
	<link rel="shortcut icon" href="frontpages/recourse/img/common/favicon.icon" >
	<script type="text/javascript" src="frontpages/recourse/js/jquery-1.8.3.min.js"></script>
	<script charset="utf-8" language="javascript" type="text/javascript" src="frontpages/recourse/js/register.js"></script>
</head>
<body>
	<div class="page">
		
		<div class="box login-box">
			<form action="/communitys/LoginController" method="post">
				<input type="hidden" name="method" value="frontpageLogin">
				${msg}
				<dl class="tip">
					还没有账号，请
					<span id="registerChoice"><a href="frontpages/pages/register.jsp">注册</a></span>
				</dl>
				
				<dl class="form-item">
					<dt class="item-tit">账号</dt>
					<dd>
						<input type="text" name="account" class="account" />
					</dd>
				</dl>
				<dl class="form-item">
					<dt class="item-tit">密码</dt>
					<dd>
						<input type="password" name="password" class="password" />	
					</dd>
				</dl>
				<dl class="form-item">
					<input type="submit" value="登录" name="loginBtn" class="loginBtn btn" id="loginBtn" />
					<!-- <div class=" forgot"><a href="zhaohui.jsp">找回密码</a></div> -->
				</dl>
			</form>
		</div>
	</div>
</body>
</html>
    