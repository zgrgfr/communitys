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
	<link rel="stylesheet" type="text/css" href="frontpages/recourse/css/pages/services/services.css">
</head>
<body>
	<c:import url="../common/header.jsp"></c:import>
	<div class="page clearfix">
		<div class="sidebar">
			<a href="frontpages/pages/services/apply.jsp"><p>活动申请</p></a>
			<a href="/communitys/CommunityBookController?method=listCommunityBook2"><p class="select-select" id="book">社团宝典</p></a>
			<a href="frontpages/pages/services/place.jsp"><p>场地借用</p></a>
			<a href="frontpages/pages/services/register.jsp"><p>社团注册</p></a>
			<a href="frontpages/pages/services/borrow.jsp"><p>物品借用</p></a>
		</div>
		<div class="main-content">
			<c:forEach items="${communityBookList}" var="communityBook">
           		<tr>
                    <td><a href="backpages/file/${communityBook.path}" target="_blank"><span id="url">点击在线查看</span></a></td>
                </tr>
            </c:forEach>
		</div>
	</div>
	<c:import url="../common/footer.html"></c:import>
	<c:import url="../common/script.html"></c:import>
	<script type="text/javascript" src="frontpages/recourse/js/services/services.js"></script>
</body>
</html>