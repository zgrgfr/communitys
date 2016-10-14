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
	<title>用户注册</title>
	<meta http-equiv="Content-Type" content="text/html;charset=utf-8" /> 
	<link rel="stylesheet" type="text/css" href="frontpages/recourse/css/pages/login.css" >
	<link rel="shortcut icon" href="frontpages/recourse/img/common/favicon.icon" >
	<script type="text/javascript" src="frontpages/recourse/js/jquery-1.8.3.min.js"></script>
	<script charset="utf-8" language="javascript" type="text/javascript" src="frontpages/recourse/js/register.js"></script>
</head>
<body>
	<div class="page">
		
		<div class="box register-box">
			<form action="/communitys/AccountController" method="post">
			<input type="hidden" name="method" value="newAccount">
			<input type="hidden" name="type" value="未审核">
			<input type="hidden" name="role" value="一般学生">
			<input type="hidden" name="placeRole" value="未授权">
				<dl class="tip">
					已有账号，请
					<a href="frontpages/pages/login.jsp" id="login">登录</a>
				</dl>
				<dl class="form-item">
					<dt class="item-tit" style="top:-26px;">账号</dt>
					<dd>
						<input type="text" name="account" id="name" />
						<p class="item-ts">
							<span>&nbsp</span>
						</p>
					</dd>
				</dl>
				<dl class="form-item">
					<dt class="item-tit">密码</dt>
					<dd>
						<input type="password" name="password" class="password" />
					</dd>
				</dl>
				<dl class="form-item">
					<dt class="item-tit">学生姓名</dt>
					<dd>
						<input type="text" name="name" class="id_number" />	
					</dd>
				</dl>
				<dl class="form-item">
					<dt class="item-tit">学院</dt>
					<dd>
						<select name="academy" style="width: 322px;padding: 5px">
							<option>教育学部</option>
						    <option>政法学院</option>
						    <option>经济学院</option>
						    <option>商学院</option>
						    <option>文学院</option>
						    <option>历史文化学院</option>
						    <option>外国语学院</option>
						    <option>音乐学院</option>
						    <option>美术学院</option>
						    <option>马克思主义学院</option>
						    <option>数学与统计学院</option>
						    <option>计算机科学与信息技术学院</option>
						    <option>信息与软件工程学院</option>
						    <option>物理学院</option>
						    <option>化学学院</option>
						    <option>生命科学学院</option>
						    <option>地理科学学院</option>
						    <option>环境学院</option>
						    <option>体育学院</option>
						    <option>传媒科学学院</option>
						    <option>远程与继续教育学院</option>
						    <option>国际汉学院（海外教育学院）</option>
						    <option>民族教育学院</option>
						    <option>东北师范大学罗格斯大学·纽瓦克学院</option>
						</select>
					</dd>
				</dl>
				<dl class="form-item">
					<dt class="item-tit">学号</dt>
					<dd>
						<input type="text" name="idNumber" class="address" />
					</dd>
				</dl>
				<dl class="form-item">
					<dt class="item-tit">电话</dt>
					<dd>
						<input type="text" name="phone" />
					</dd>
				</dl>
				<dl class="form-item">
					<dt class="item-tit" style="top:-26px;">邮箱</dt>
					<dd>
						<input type="text" name="email" id="email" />
						<p class="item-ts">
							<i>必须为东北师范大学邮箱@nenu.edu.cn</i>
						</p>
					</dd>
				</dl>
				<dl class="form-item">
					<dt class="item-tit">验证码</dt>
					<dd>
						<div>
							<input  type="text"   id="input1" style="padding: 5px" />  
							<input type="text" onclick="createCode()" readonly="readonly" id="checkCode" class="unchanged" style="width: 50px" value="23e5" />
						</div>
					</dd>
				</dl>
				<dl class="form-item">
					<input type="submit" value="用户注册" name="loginBtn" class="resiterBtn btn" id="registerButton"/>
				</dl>
			</form>
		</div>
	</div>
	<script type="text/javascript">
		$("#name").blur(function(){

			var account = $(this).val();
		
			$.ajax({
				type:"get",
		    	url:"/communitys/AccountController?method=AccountCnki",
		
				dataType:"", 
				contentType: "application/x-www-form-urlencoded; charset=utf-8", 
				data: 
				{
					account: account
				},

				success:function(data){
					$(".item-ts").children("span").html(data);
				}
			});
		});

	</script>
</body>
</html>