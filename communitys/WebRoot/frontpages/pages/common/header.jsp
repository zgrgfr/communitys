<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
	<div class="header">	
		<div class="colorwrap clearfix">
			<i class="header-blue"></i><i class="header-orange"></i><i class="header-red"></i><i class="header-green"></i>
		</div>
		<div class="logo-and-login">
			<div class="login">
				<c:choose>
					<c:when test="${sessionScope.accountFront != null}">
						<p class="login-success">
							欢迎您，${sessionScope.accountFront.name}。
							|
							<a href="/communitys/LoginController?method=frontpageLogOut">注销</a>
						</p>
					</c:when>
					<c:otherwise>
						<p class="login-success">
							<a href="frontpages/pages/login.jsp">登录</a>
							|
							<a href="frontpages/pages/register.jsp">注册</a>
						</p>
					</c:otherwise>
				</c:choose>
			</div>
			<div class="link">
				<a href="javascript:;" class="code"></a>
				<a href="/communitys/WelcomeController?method=welcomeToFrontIndex" class="home"></a>
			</div>
		</div>
		<div class="nav">
			<ul class="clearfix">
				<li class="front-color"></li>
				<li class="nav-content">
					<ul> 
						<li class="nav1"><a href="/communitys/LeaguesIntroduceController?method=listByTypeAndShowType&type=审核通过&showType=首页显示">社联概况</a></li>
						<li class="nav2"><a href="frontpages/pages/style/show.jsp">社团风采</a></li>
						<li class="nav3"><a href="/communitys/frontpages/pages/services/place.jsp">基本业务</a></li>
						<li class="nav4"><a href="/communitys/ClassController?method=listByTypeAndclassType&classType=全部课程">精品课程</a></li>
						<li class="nav5"><a href="/communitys/SocialProgramsController?method=listByType">社会项目</a></li>
						<li class="nav6"><a href="/communitys/ResourceShareController?method=listByType">资源共享</a></li>
						<li class="nav7"><a href="/communitys/DatumDownloadController?method=listDatumDownload2">资料下载</a></li>
						<li class="last-color"></li>
					</ul>
				</li>
			</ul>
		</div>
	</div>