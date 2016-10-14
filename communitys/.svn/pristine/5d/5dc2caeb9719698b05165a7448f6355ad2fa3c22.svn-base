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
	<link rel="stylesheet" type="text/css" href="frontpages/recourse/css/pages/style/badminton.css">
</head>
<body>
	<c:import url="../common/header.jsp"></c:import>
	<div class="page show-content clearfix">
		<div class="content-left">
			<div class="title">
				<p class="intro">${communityShowDto.community.name}</p>
			</div>
			<div class="detail">
				<!-- <img src="frontpages/recourse/img/style/pqcode.jpg" class="pqcode" /> -->
				<img src="frontpages/recourse/img/style/badminton.jpg" class="logo" />
				<!-- <img src="frontpages/recourse/img/style/pqcode.jpg" class="pqcode-big" /> -->
				<table class="campus">
					<tr><td class="location">校区</td><td class="colon">：</td><td>${communityShowDto.communityShow.campus}</td></tr>
					<tr><td class="location">等级</td><td class="colon">：</td><td>${communityShowDto.communityShow.grade}</td></tr>
					<tr><td class="location">类型</td><td class="colon">：</td><td>${communityShowDto.communityShow.communityType}</td></tr>
					<tr><td class="location">负责人</td><td class="colon">：</td><td>${communityShowDto.community.nameHead}</td></tr>
					<tr><td class="location">联系电话</td><td class="colon">：</td><td>${communityShowDto.community.phone}</td></tr>
				</table>
				${msg}
				<a href="/communitys/CommunityCorporatorController?method=applyForCommunity&accountId=${sessionScope.accountFront.id}&communityId=${communityShowDto.community.id}&communityShowId=${communityShowDto.communityShow.id}" class="join">申请加入</a>
			</div>
		</div>
		
		<div class="content-right">
			<div class="title2">
				<p class="intro" style="color: #6ab542">${communityShowDto.community.content}</p>
				
			</div>
		</div>
	</div>

	<c:import url="../common/footer.html"></c:import>
	<c:import url="../common/script.html"></c:import>
	<script type="text/javascript" src="frontpages/recourse/js/jquery-1.8.3.min.js"></script>
	<!-- <script type="text/javascript" src="frontpages/recourse/js/style/badminton.js"></script> -->
</body>
</html>