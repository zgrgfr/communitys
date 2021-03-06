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
	<link rel="stylesheet" type="text/css" href="frontpages/recourse/css/pages/download/download.css">
</head>
<body>
	<c:import url="../common/header.jsp"></c:import>
	<div class="page">
		<div class="main-content">
			<div class="content-list">
			${msg}
				<ul id="datalist">
				<c:forEach items="${datumDownloadList}" var="datumDownload">
					<li>
						 <a href="backpages/file/${datumDownload.path}"> 
						<%-- <a href="/communitys/DatumDownloadController?method=downloadFile&name=${datumDownload.path}"> --%>
							<p class="pro-cot">
								<span class="pro-unit">标题：${datumDownload.title}</span>
								<span class="pro-time">上传者：${datumDownload.uploadName}</span>
							</p>
						</a>
					</li>
				</c:forEach>
				</ul>

				<div class="databtn" style="width: 80%;margin: 0 auto;">
                	<a href="javascript:;" pageNum="pre" class="pre">上一页</a><span id="pageIt"></span><a href="javascript:;" pageNum="next" class="next">下一页</a>
            	</div>
			</div>

			
		</div>
	</div>
	<c:import url="../common/footer.html"></c:import>
	<c:import url="../common/script.html"></c:import>
	<script type="text/javascript" src="frontpages/recourse/js/common/data.js"></script>
</body>
</html>