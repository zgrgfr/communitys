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
	<link rel="stylesheet" type="text/css" href="frontpages/pages/services/datetime/css/lq.datetimepick.css">

	<script type="text/javascript" src="frontpages/pages/services/datetime/js/jquery.js"></script>
	<script src='frontpages/pages/services/datetime/js/selectUi.js' type='text/javascript'></script>
	<script src='frontpages/pages/services/datetime/js/lq.datetimepick.js' type='text/javascript'></script>

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
			<a href="frontpages/pages/services/register.jsp"><p>社团注册</p></a>
			<a href="frontpages/pages/services/borrow.jsp"><p class="select-select">物品借用</p></a>
		</div>
		<div class="main-content">
		<c:if test="${sessionScope.accountFront.role ne '社团管理员'}">
			社团管理员登陆才可进行活动申请
		</c:if><br>
		${msg}
			<form class="apply-from" action="/communitys/ArticleLendController" method="post">
			<input type="hidden" name="method" value="newArticleLend">
			<input type="hidden" name="accountId" value="${sessionScope.accountFront.id}">
			<input type="hidden" name="type" value="未审核">
			<!-- 账号的Id -->
			<input type="hidden" name="accountId" value=1>
			<div class="one">
				<p>
					<label>物品名称</label>
					<input type="text" class="text txt1" name="articleName">
				</p>
				<p>
					<label>社团名称</label>
					<input type="text" class="text txt2" name="communityName">
				</p>
				<p>
					<label>负责人姓名</label>
					<input type="text" class="text txt3" name="header">
				</p>
				<p>
					<label>负责人联系方式</label>
					<input type="text" class="text txt4" name="phone">
				</p>
				<p>
					<label>借用日期</label>
					<input type="text" class="text txt5" name="lendTime" id="date">
				</p>
			</div>
				<div>
					<label style="padding-top: 28px;vertical-align: top;color: rgb(93,95,99);">物品使用内容</label>
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
	
	<script type="text/javascript">
		$(function(){
			$("#date").on("click",function(e){
				e.stopPropagation();
				$(this).lqdatetimepicker({
					css : 'datetime-day',
					dateType : 'D',
					selectback : function(){

					}
				});
			});

		})
		var $parent = $(".one");
		$(".one :input").blur(function(){
			str1 = $(".txt1").val(); 
			str2 = $(".txt2").val(); 
			str3 = $(".txt3").val(); 
			str4 = $(".txt4").val(); 
			str5 = $(".txt5").val(); 	
		});
		$(function(){
			$(".btn").click(function(){
				$(".one :input").trigger('blur');
				if(str5==""||str1==""||str2==""||str3==""||str4==""){
					alert("必填项不能为空！");
					return false;
				}
			})
		})
	</script>
</body>
</html>