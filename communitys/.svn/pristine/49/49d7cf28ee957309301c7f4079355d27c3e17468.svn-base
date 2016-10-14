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
		${msg}
		<h3 class="content-title">${classDto.cla.name}</h3>
		<div class="info">
			<span>学校：${classDto.cla.school}</span>
			<span>举办者：${classDto.cla.author}</span>
			<span>现已有<i style="font-size: 18px;color: #4fc6aa;">${classDto.number }</i>人参加</span>
		</div>
		<div style="text-align: center;">
			<span>${classDto.cla.startTime}&nbsp - &nbsp${classDto.cla.endTime}</span>
		</div>
		<div class="content">
			<div class="introduce">
				<span class="cot-cap">简介：</span>
				<p>
					${classDto.cla.introduce}
				</p>
			</div>
			<div class="main-con">
				内容：
				<div>
					${course.content }
				</div>
			</div>
			<div style="width: 100%;text-align: center;margin-top: 44px;">
				<a href="/communitys/ClassEnterController?method=enterClass&classId=${classDto.cla.id}&accountId=${sessionScope.accountFront.id}" class="u-btn">立即报名参加</a>
			</div>
		</div>
		
	</div>
	<c:import url="../common/footer.html"></c:import>
	<c:import url="../common/script.html"></c:import>
</body>
</html>