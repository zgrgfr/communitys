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
                            <li><a href="javascript:;">首页轮播</a>
                            </li>
                            <li>添加内容</li>
                        </ul>
                        <!--breadcrumbs end -->
                    </div>
                </div>

                <div class="row">
                     <div class="col-md-12"><!-- /communitys/CommunityShowController -->
                        <form class="form-horizontal form-border" action="/communitys/HomeCarouselController?method=newHomeCarousel" id="form"  enctype="multipart/form-data" method="post">
                            <div class="form-group">
                                <label class="col-sm-3 control-label">标题</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" name="title" id="input1" required="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">logo</label>
                                <div class="col-sm-6">
                                	<input type="file" name="file" >
                                    <!-- <input type="file" name = "file" id="exampleInputFile" style="display: inline-block;"> -->
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-offset-8 col-sm-10">
                                    <input type="submit" class="btn btn-primary" value="提交" />
                                </div>
                             </div>
                         </form>
                         ${message}  
                    </div>
                </div>

</body>

</html>
