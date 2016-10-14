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
                            <li><a href="javascript:;">新社团注册</a>
                            </li>
                            <li>修改</li>
                        </ul>
                        <!--breadcrumbs end -->
                    </div>
                </div>

                <div class="row">
                     <div class="col-md-12">
                        <form class="form-horizontal form-border" id="form" action="/communitys/CommunityController" method="post">
                        	<input type="hidden" name="method" value="updateCommunity">
                        	<input type="hidden" name="id" value="${community.id }">
                        	<input type="hidden" name="type" value="${community.type }">
                        	
                            <div class="form-group">
                                <label class="col-sm-3 control-label">社团名称</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" name="name" id="input1" required="" value="${community.name}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">社团负责人</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" name="nameHead" id="input1" required="" value="${community.nameHead}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">负责人学号</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" name="studentIdNumber" id="input1" required="" value="${community.studentIdNumber}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">电话</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" name="phone" id="input1" required="" value="${community.phone}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">内容</label>
                                <div class="col-sm-6">
                                    <div class="col-sm-12">
                                        <textarea id="editor" name="content" type="text/plain" style="height:350px;">${community.content}</textarea>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-offset-8 col-sm-10">
                                    <input type="submit" class="btn btn-primary" value="提交" id="submit" />
                                </div>
                             </div>
                         </form>  
                    </div>
                </div>
<script type="text/javascript">
    var ue = UE.getEditor('editor');
</script>
</body>

</html>
