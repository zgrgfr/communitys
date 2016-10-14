<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html class="no-js">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">
<head>
	<title>东北师范大学学生社团联合会</title>
	<meta charset="utf-8" />
	<c:import url="../common/link.html"></c:import>
	<link rel="stylesheet" type="text/css" href="frontpages/recourse/css/pages/content.css">
</head>
<body>
	<c:import url="../common/header.jsp"></c:import>
	<div class="page">
		<h3 class="content-title">${socialPrograms.name}</h3>
		<div class="info">
			<span>发起者：${socialPrograms.holder}</span>
			
		</div>
		<div style="text-align: center;">
			<span>活动时间：${socialPrograms.activityTime}</span>
		</div>
		<div class="content" style="margin-top: 18px;">
			<p>${socialPrograms.activityContent}</p>
		</div>
		<div class="content" style="margin-top:22px;color: #888;">
			<span>赞助内容 ：</span>
			<p>
				${socialPrograms.supportContent}
			</p>
		</div>
	</div>
	<c:import url="../common/footer.html"></c:import>
	<c:import url="../common/script.html"></c:import>
</body>
</html>