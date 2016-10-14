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
                            <li><a href="javascript:;">社会项目</a>
                            </li>
                            <li>查看详情</li>
                        </ul>
                        <!--breadcrumbs end -->
                    </div>
                </div>

                <div class="row">
                     <div class="col-md-12">
                        <form class="form-horizontal form-border" id="form" method="post">
                            <div class="form-group">
                                <label class="col-sm-3 control-label">项目名称</label>
                                <div class="col-sm-6">
                                    <p class="form-control">${socialPrograms.name}</p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">举办者</label>
                                <div class="col-sm-6">
                                   <p class="form-control">${socialPrograms.holder}</p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">活动时间</label>
                                <div class="col-sm-6">
                                   <p class="form-control">${socialPrograms.activityTime}</p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">活动内容</label>
                                <div class="col-sm-6">
                                   <p>${socialPrograms.activityContent}</p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">赞助内容</label>
                                <div class="col-sm-6">
                                   <p>${socialPrograms.supportContent}</p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">审核状态</label>
                                <div class="col-sm-6">
                                   <p class="form-control">${socialPrograms.type}</p>
                                </div>
                            </div>
                         </form>   
                    </div>
                </div>

</body>

</html>
