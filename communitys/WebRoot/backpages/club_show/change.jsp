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
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>东北师范大学校社联</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    
    <link rel="shortcut icon" href="backpages/assets/img/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" href="backpages/assets/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="backpages/assets/css/main.css">

    <script src='backpages/assets/ueditor/ueditor.config.js' type='text/javascript'></script>
    <script src='backpages/assets/ueditor/ueditor.all.min.js' type='text/javascript'></script>
    <script src='backpages/assets/ueditor/lang/zh-cn/zh-cn.js' type='text/javascript'></script>

    <style type="text/css">
        body{
            background-color: #fff;
        }
    </style>
</head>
<body>
        <!--main content start-->
  
                <div class="row">
                    <div class="col-md-12">
                        <!--breadcrumbs start -->
                        <ul class="breadcrumb">
                            <li><a href="javascript:;">社团展示</a>
                            </li>
                            <li>修改</li>
                        </ul>
                        <!--breadcrumbs end -->
                    </div>
                </div>

                <div class="row">
                     <div class="col-md-12">
                        <form class="form-horizontal form-border" id="form" action="/communitys/CommunityShowController" enctype="multipart/form-data" method="post">
                            <input type="hidden" name="method" value="updateCommunityShow">
                            <input type="hidden" name="communityId" value="${community.id}">
                            <input type="hidden" name="type" value="${communityShow.type}">
                            <input type="hidden" name="id" value="${communityShow.id}">
                            <div class="form-group">
                                <label class="col-sm-3 control-label">校区</label>
                                <div class="col-sm-6">
                                	<c:if test="${communityShow.campus eq '本部'}">
                                		<label class="radio-inline"><input class="icheck" type="radio" checked name="campus" value="本部">本部</label>
                                    	<label class="radio-inline"><input class="icheck" type="radio" name="campus" value="净月">净月</label>
                                	</c:if>
                                	<c:if test="${communityShow.campus eq '净月'}">
                                		<label class="radio-inline"><input class="icheck" type="radio" name="campus" value="本部">本部</label>
                                    	<label class="radio-inline"><input class="icheck" type="radio" checked name="campus" value="净月">净月</label>
                                	</c:if>
                                    
                                </div>
                            </div>
                            <!-- 等级 -->
                            <input type = "hidden" name = "grade" value="${communityShow.grade}">
                            <%-- <div class="form-group">
                                <label class="col-sm-3 control-label">等级</label>
                                <div class="col-sm-6">
                                	<c:if test="${communityShow.grade eq 'A'}">
                                		<label class="radio-inline"><input class="icheck" type="radio" checked name="grade" value="A">A</label>
	                                    <label class="radio-inline"><input class="icheck" type="radio" name="grade" value="B">B</label>
	                                    <label class="radio-inline"><input class="icheck" type="radio" name="grade" value="C">C</label>
	                                    <label class="radio-inline"><input class="icheck" type="radio" name="grade" value="D">D</label>
                                	</c:if>
                                	<c:if test="${communityShow.grade eq 'B'}">
                                		<label class="radio-inline"><input class="icheck" type="radio" name="grade" value="A">A</label>
	                                    <label class="radio-inline"><input class="icheck" type="radio" checked name="grade" value="B">B</label>
	                                    <label class="radio-inline"><input class="icheck" type="radio" name="grade" value="C">C</label>
	                                    <label class="radio-inline"><input class="icheck" type="radio" name="grade" value="D">D</label>
                                	</c:if>
                                	<c:if test="${communityShow.grade eq 'C'}">
                                		<label class="radio-inline"><input class="icheck" type="radio" name="grade" value="A">A</label>
	                                    <label class="radio-inline"><input class="icheck" type="radio" name="grade" value="B">B</label>
	                                    <label class="radio-inline"><input class="icheck" type="radio" checked name="grade" value="C">C</label>
	                                    <label class="radio-inline"><input class="icheck" type="radio" name="grade" value="D">D</label>
                                	</c:if>
                                	<c:if test="${communityShow.grade eq 'D'}">
                                		<label class="radio-inline"><input class="icheck" type="radio" name="grade" value="A">A</label>
	                                    <label class="radio-inline"><input class="icheck" type="radio" name="grade" value="B">B</label>
	                                    <label class="radio-inline"><input class="icheck" type="radio" name="grade" value="C">C</label>
	                                    <label class="radio-inline"><input class="icheck" type="radio" checked name="grade" value="D">D</label>
                                	</c:if>
                                </div>
                            </div> --%>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">社团类型</label>
                               <div class="col-sm-6">
                               		<c:if test="${communityShow.communityType eq '科研实践'}">
                               			<label class="radio-inline"><input class="icheck" type="radio" checked name="communityType" value="科研实践">科研实践</label>
	                                    <label class="radio-inline"><input class="icheck" type="radio" name="communityType" value="公益服务">公益服务</label>
	                                    <label class="radio-inline"><input class="icheck" type="radio" name="communityType" value="文娱体育">文娱体育</label>
	                                    <label class="radio-inline"><input class="icheck" type="radio" name="communityType" value="思想理论">思想理论</label>
                               		</c:if>
                               		<c:if test="${communityShow.communityType eq '公益服务'}">
                               			<label class="radio-inline"><input class="icheck" type="radio" name="communityType" value="科研实践">科研实践</label>
	                                    <label class="radio-inline"><input class="icheck" type="radio" checked name="communityType" value="公益服务">公益服务</label>
	                                    <label class="radio-inline"><input class="icheck" type="radio" name="communityType" value="文娱体育">文娱体育</label>
	                                    <label class="radio-inline"><input class="icheck" type="radio" name="communityType" value="思想理论">思想理论</label>
                               		</c:if>
                               		<c:if test="${communityShow.communityType eq '文娱体育'}">
                               			<label class="radio-inline"><input class="icheck" type="radio" name="communityType" value="科研实践">科研实践</label>
	                                    <label class="radio-inline"><input class="icheck" type="radio" name="communityType" value="公益服务">公益服务</label>
	                                    <label class="radio-inline"><input class="icheck" type="radio" checked name="communityType" value="文娱体育">文娱体育</label>
	                                    <label class="radio-inline"><input class="icheck" type="radio" name="communityType" value="思想理论">思想理论</label>
                               		</c:if>
                               		<c:if test="${communityShow.communityType eq '思想理论'}">
                               			<label class="radio-inline"><input class="icheck" type="radio" name="communityType" value="科研实践">科研实践</label>
	                                    <label class="radio-inline"><input class="icheck" type="radio" name="communityType" value="公益服务">公益服务</label>
	                                    <label class="radio-inline"><input class="icheck" type="radio" name="communityType" value="文娱体育">文娱体育</label>
	                                    <label class="radio-inline"><input class="icheck" type="radio" checked name="communityType" value="思想理论">思想理论</label>
                               		</c:if>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">logo</label>
                                <div class="col-sm-6">
                                    	选择新logo：<input type="file"  name = "file" id="exampleInputFile" style="display: inline-block;">
                                    <span style="display: inline-block;width: 100px;height: 100px;">
                                        	原logo：<img src="backpages/image/${communityShow.logo}" style="width: 100%;height: 100%">
                                        			<input type="hidden" name="logo" value="${communityShow.logo}">
                                    </span>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-offset-8 col-sm-10">
                                    <input type="submit" class="btn btn-primary" value="提交" />
                                </div>
                             </div>
                         </form>  
                    </div>
                </div>
</body>

</html>
