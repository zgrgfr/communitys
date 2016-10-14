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
		<h3 class="content-title">${resourceShare.title}</h3>
		<div class="info">
			<span>社团名称：${resourceShare.communityName}</span>
		</div>
		<div class="content">
			${resourceShare.content}
		</div>
		
	</div>
	<c:import url="../common/footer.html"></c:import>
	<c:import url="../common/script.html"></c:import>
</body>
</html>