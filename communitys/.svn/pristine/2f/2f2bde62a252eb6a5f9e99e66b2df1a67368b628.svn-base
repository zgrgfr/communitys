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
	<link rel="stylesheet" type="text/css" href="frontpages/recourse/css/pages/share/share.css">
</head>
<body>
	<c:import url="../common/header.jsp"></c:import>
	<div class="page">
		<div class="main-content">
			<div class="content-list">
				<ul id="datalist">
				<c:forEach items="${resourceShareList}" var="resourceShare">
					<li>
						<a href="/communitys/ResourceShareController?method=detailsView2&id=${resourceShare.id}">
							<p class="share-cap">
								<span class="share-tit">${resourceShare.title}</span>
								<span class="share-unit">${resourceShare.communityName}</span>
							</p>
							<p class="share-con">
								${resourceShare.content}
							</p>
						</a>
					</li>
				</c:forEach>
				</ul>
			</div>

			<div class="databtn">
                <a href="javascript:;" pageNum="pre" class="pre">上一页</a><span id="pageIt"></span><a href="javascript:;" pageNum="next" class="next">下一页</a>
            </div>
		</div>
	</div>
	<c:import url="../common/footer.html"></c:import>
	<c:import url="../common/script.html"></c:import>
	<script type="text/javascript" src="frontpages/recourse/js/common/data.js"></script>
</body>
</html>