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
	
	<script src='frontpages/pages/services/ueditor/ueditor.config.js' type='text/javascript'></script>
    <script src='frontpages/pages/services/ueditor/ueditor.all.min.js' type='text/javascript'></script>
    <script src='frontpages/pages/services/ueditor/lang/zh-cn/zh-cn.js' type='text/javascript'></script>
</head>
<body>
	<c:import url="../common/header.jsp"></c:import>
	<div class="page clearfix">
		<div class="sidebar">
			<a href="frontpages/pages/services/apply.jsp"><p>活动申请</p></a>
			<a href="/communitys/CommunityBookController?method=listCommunityBook2"><p>社团宝典</p></a>
			<a href="frontpages/pages/services/place.jsp"><p>场地借用</p></a>
			<a href="frontpages/pages/services/register.jsp"><p class="select-select">社团注册</p></a>
			<a href="frontpages/pages/services/borrow.jsp"><p>物品借用</p></a>
		</div>
		<div class="main-content">
		<c:if test="${sessionScope.accountFront.role ne '一般学生'}">
			一般学生登陆才可进行活动申请
		</c:if>
		${msg}
			<form class="apply-from"  action="/communitys/CommunityController" method="post">
			<input type="hidden" name="applyId" value="${sessionScope.accountFront.id}">
			<input type="hidden" name="method" value="newCommunity">
			<input type="hidden" name="type" value="未审核">
			<div class="one">
				<p>
					<label>社团名称</label>
					<input type="text" class="text txt1" name="name">
				</p>
				<p>
					<label>负责人姓名</label>
					<input type="text" class="text txt2" name="nameHead">
				</p>
				<p>
					<label>负责人学号</label>
					<input type="text" class="text txt3" name="studentIdNumber">
				</p>
				<p>
					<label>负责人手机号</label>
					<input type="text" class="text txt4" name="phone">
				</p>
			</div>
				<div>
					<label style="padding-top: 28px;vertical-align: top;color: rgb(93,95,99);">社团运营内容</label>
					<div class="editor-content">
						<textarea id="editor" name="content" type="text/plain" style="height:350px;"></textarea>
					</div>
				</div>
				
				<p>
					<input type="submit" class="btn" value="提交" />
				</p>
			</form>
		</div>
	</div>
	<c:import url="../common/footer.html"></c:import>
	<script type="text/javascript">
   		var ue = UE.getEditor('editor');
	</script>
	<script type='text/javascript'>
		var $parent = $(".one");
		$(".one :input").blur(function(){
			str1 = $(".txt1").val(); 
			str2 = $(".txt2").val(); 
			str3 = $(".txt3").val(); 
			str4 = $(".txt4").val(); 	
		});
		$(function(){
			$(".btn").click(function(){
				$(".one :input").trigger('blur');
				if(str4==""||str1==""||str2==""||str3==""){
					alert("必填项不能为空！");
					return false;
				}
			})
		})
	</script>
</body>
</html>