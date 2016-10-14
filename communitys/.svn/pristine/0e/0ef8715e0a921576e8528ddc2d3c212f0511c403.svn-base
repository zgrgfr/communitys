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
                            <li><a href="javascript:;">社联概况</a>
                            </li>
                            <li>添加内容</li>
                        </ul>
                        <!--breadcrumbs end -->
                    </div>
                </div>

                <div class="row">
                     <div class="col-md-12">
                         <form action="/communitys/LeaguesIntroduceController" class="form-horizontal form-border"  method="post">
                         	<input type="hidden" name="method" value="newLeaguesIntroduce">
                         	<input type="hidden" name="type" value="未审核">

                         	<div class="form-group">
                                <div class="col-sm-12">
                                   <textarea id="editor" name="content" type="text/plain" style="width:980px;height:500px;"></textarea>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-offset-10 col-sm-10">
                                    <input type="submit" class="btn btn-primary" value="提交" id="submit"/>
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
