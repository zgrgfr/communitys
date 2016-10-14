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
	<c:import url="common/link.html"></c:import>
	<link rel="stylesheet" type="text/css" href="frontpages/recourse/css/pages/index.css">
	<script type="text/javascript" src="frontpages/recourse/js/jquery-1.8.3.min.js"></script>
	<script charset="utf-8" language="javascript" type="text/javascript" src="frontpages/recourse/js/index.js"></script>
</head>
<body>
	
	<div class="headerbox">	
		<div class="front-header">
			<c:import url="common/header.jsp"></c:import>
			<div class="front-banner-box">
				<!-- 图片，文字-->
				<ul class="front-banner">
				<c:forEach items="${homeCarouselList}" var="homeCarousel">
					<li class="li-first" id="0">
						<div class="front-banner-img">
							<img src="backpages/image/${homeCarousel.path}">
						</div>
						<div class="front-banner-words">
							<p class="quintessence">${homeCarousel.title}</p>
						</div>
					</li>
				</c:forEach>
				</ul>
				<!-- 小图标 -->
				<div class="number">
					<i class="number-now" id="0"></i>
				</div>
				<!-- 前后页 -->
				<div class="arrows">
					<i class="prev-arrows"></i>
					<i class="next-arrows"></i>
				</div>
			</div>	
			<div class="news-banner">
				<!-- 滚动新闻 -->
				<ul class="clearfix">
					<c:forEach items="${communityPresenceList2}" var="communityPresence">
						<li class="footer-orange">
							<h2><a href="/communitys/CommunityPresenceController?method=detailsView2&id=${communityPresence.id}">${communityPresence.title}</a></h2>
							<span>${communityPresence.time}</span>
						</li>
					</c:forEach>
				</ul>
			</div>
		</div>
		<!-- 背景 -->
		<div class="bg-header">		
			<div class="filter"></div>
			<div class="cover"></div>
			<div class="bg-banner"></div>
		</div>
	</div>
	<div class="page">
		<div class="style-and-track clearfix">
			<div class="style">
				<h2 class="caption style-caption">社团<span>风采</span><i class="com">Community</i><i class="pre">presence</i></h2>
				<div class="flash">
					<ul class="flash-special">
						<c:forEach items="${communityPresenceList1}" var="communityPresence">
							<li>
								<a href="/communitys/CommunityPresenceController?method=detailsView2&id=${communityPresence.id}" class="special-pic"><img src="frontpages/recourse/img/index/top-tens/001.png"></a>
								<a href="/communitys/CommunityPresenceController?method=detailsView2&id=${communityPresence.id}" class="tit">${communityPresence.title}</a>
							</li>
						</c:forEach>
						
					</ul>
					<ul class="flash-list clearfix">
						<li>
							<a href="javascript:;" class="list-pic"><img src="frontpages/recourse/img/index/style/001.png"></a>
						</li>
						<li>
							<a href="javascript:;" class="list-pic"><img src="frontpages/recourse/img/index/style/001.png"></a>
						</li>
						<li>
							<a href="javascript:;" class="list-pic"><img src="frontpages/recourse/img/index/style/001.png"></a>
						</li>
					</ul>
				</div>
				<div class="news-list">
					<ul>
						<c:forEach items="${communityPresenceList1}" var="communityPresence">
							<li>
								<a href="/communitys/CommunityPresenceController?method=detailsView2&id=${communityPresence.id}">${communityPresence.title}</a>
							</li>
						</c:forEach>
					</ul>
				</div>
			</div>
			<div class="track">
				<h2 class="caption track-caption">社联<span>通知</span><a href="/communitys/frontpages/pages/shelian_info.jsp" class="more">more>></a></h2>
				
				<div class="colorwrap clearfix">
					<i class="footer-blue"></i><i class="footer-orange"></i><i class="footer-green"></i><i class="footer-red"></i>
				</div>
				<ul>
					<c:forEach items="${communityPresenceList3}" var="communityPresence">
						<li><a href="/communitys/CommunityPresenceController?method=detailsView2&id=${communityPresence.id}">${communityPresence.title}</a></li>
					</c:forEach>
				</ul>
			</div>
		</div>
		<div class="show">
			<h2 class="caption show-caption">社团<span>展示</span><i class="com">Community</i><i class="pre">presence</i></h2>
			  <!-- <ul id="demo" class="show-list">
				<li>
					<img src="frontpages/recourse/img/index/shows/001.png">
					<div><a href="javacropt:;">标题</a></div>
				</li>
				<li>
					<img src="frontpages/recourse/img/index/shows/002.png">
					<div><a href="javacropt:;">标题</a></div>
				</li>
				<li>
					<img src="frontpages/recourse/img/index/shows/003.png">
					<div><a href="javacropt:;">标题</a></div>
				</li>
				<li>
					<img src="frontpages/recourse/img/index/shows/004.png">
					<div><a href="javacropt:;">标题</a></div>
				</li>
				<li>
					<img src="frontpages/recourse/img/index/shows/005.png">
					<div><a href="javacropt:;">标题</a></div>
				</li>
				<li>
					<img src="frontpages/recourse/img/index/shows/006.png">
					<div><a href="javacropt:;">标题</a></div>
				</li>
			</ul> -->
			 <ul id="demo" class="show-list"> 
			 	<c:forEach items="${communityShowDtoList1}" var="communityShowDto">
					<li>
						<img src="backpages/image/${communityShowDto.communityShow.logo}" width="100%"  height="319" />
						<div><a href="/communitys/CommunityShowController?method=toEnter&communityShowId=${communityShowDto.communityShow.id}">${communityShowDto.community.name}</a></div>
					</li>
				</c:forEach>
			</ul> 
		</div>
		<div class="top-ten">
			<h2 class="caption top-caption"><span>十佳</span>社团<i class="com">Community</i><i class="pre">presence</i></h2>
			<ul class="clearfix">
			<c:forEach items="${communityShowDtoList2}" var="communityShowDto">
				<li>
					<a href="/communitys/CommunityShowController?method=toEnter&communityShowId=${communityShowDto.communityShow.id}" class="top-ten-img"><img src="backpages/image/${communityShowDto.communityShow.logo}"></a>
					<a href="/communitys/CommunityShowController?method=toEnter&communityShowId=${communityShowDto.communityShow.id}" class="top-ten-tit">${communityShowDto.community.name}</a>
				</li>
			</c:forEach>
			</ul>
		</div>
		<div class="groups-and-basic clearfix">
			<div class="groups">
				<h2 class="caption group-caption">社团<span>类别</span></h2>
				<ol class="group-list clearfix">
					<li class="scientific"><a href="javascript:;">科研实践</a></li>
					<li class="public-service"><a href="javascript:;">公益服务</a></li>
					<li class="sports"><a href="javascript:;">文娱体育</a></li>
					<li class="theory"><a href="javascript:;">思想理论</a></li>
				</ol>
			</div>
			<div class="basic">
				<h2 class="caption basic-caption">基本业务</h2>
				<ul class="clearfix">
					<li>
						<a href="JavaScript:;" class="basic-img">
							<img src="frontpages/recourse/img/index/basic/001.png" width="48%">
						</a>
						<a href="communitys/frontpages/pages/services/apply.jsp" class="basic-tit">活动申请</a>
					</li>
					<li>
						<a href="JavaScript:;" class="basic-img">
							<img src="frontpages/recourse/img/index/basic/004.png" width="57%">
						</a>
						<a href="/communitys/CommunityBookController?method=listCommunityBook2" class="basic-tit">社团宝典</a>
					</li>
					<li>
						<a href="JavaScript:;" class="basic-img">
							<img src="frontpages/recourse/img/index/basic/005.png" width="72%">
						</a>
						<a href="frontpages/pages/services/place.jsp" class="basic-tit">场地借用</a>
					</li>
					<li>
						<a href="JavaScript:;" class="basic-img">
							<img src="frontpages/recourse/img/index/basic/002.png" width="77%" class="basicimg">
						</a>
						<a href="frontpages/pages/services/register.jsp" class="basic-tit">社团注册</a>
					</li>
					<li>
						<a href="JavaScript:;" class="basic-img">
							<img src="frontpages/recourse/img/index/basic/003.png" width="64%" class="basicimg">
						</a>
						<a href="frontpages/pages/services/borrow.jsp" class="basic-tit">物品借用</a>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<c:import url="common/footer.html"></c:import>
	<script type="text/javascript" src="frontpages/recourse/js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="frontpages/recourse/js/showlist.js"></script>
</body>
</html>