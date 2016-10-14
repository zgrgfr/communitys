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
	<link rel="stylesheet" type="text/css" href="frontpages/recourse/css/pages/style/style.css">
</head>
<body>
	<c:import url="../common/header.jsp"></c:import>
	<div class="page clearfix">
		<div class="sidebar">
			<a href="/communitys/CommunityPresenceController?method=listByTypeAndArticleType&articleType=社团风采"><p>社团风采</p></a>
			<a href="/communitys/CommunityPresenceController?method=listByTypeAndArticleType&articleType=社团动态"><p >社团动态</p></a>
			<a href="frontpages/pages/style/show.jsp"><p class="select-select">社团展示</p></a>
		</div>
		<div class="main-content">
			<div class="select-option">
				<div class="option-show">
					已选择：
					<div class="showlist">
						
					</div>
					<span class="search none">查询</span>
				</div>
				<div class="option-list">
					<dl>
						<dt class="school" name="校区：">
							<span>校区：</span>
							<a href="javascript:;">本部</a>
							<a href="javascript:;">净月</a>
						</dt>
						<dt class="grade" name="等级">
							<span>等级：</span>
							<a href="javascript:;">A</a>
							<a href="javascript:;">B</a>
							<a href="javascript:;">C</a>
							<a href="javascript:;">D</a>
						</dt>
						<dt class="type" name="类型：">
							<span>类型：</span>
							<a href="javascript:;">科研实践</a>
							<a href="javascript:;">公益服务</a>
							<a href="javascript:;">文娱体育</a>
							<a href="javascript:;">思想概论</a>
						</dt>
					</dl>
				</div>
			</div>
			<div class="img-list">
				<ul class="clearfix" id="list">
					<!-- <c:forEach items="${communityShowDtoList}" var="communityShowDto">
						<li>
							<a href="javascript:;">
								<div class="img-box">
									<img src="backpages/image/${communityShowDto.communityShow.logo}">
								</div>
								<p class="img-cap">${communityShowDto.community.name}</p>
							</a>	
						</li>
					</c:forEach> -->
				</ul>
			</div>
		</div>
	</div>
	<c:import url="../common/footer.html"></c:import>
	<c:import url="../common/script.html"></c:import>
	<script type="text/javascript" src="frontpages/recourse/js/style/show.js"></script>
</body>
</html>