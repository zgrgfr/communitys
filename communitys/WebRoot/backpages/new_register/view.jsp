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
                            <li><a href="javascript:;">新社团注册</a>
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
                                <label class="col-sm-3 control-label">社团名称</label>
                                <div class="col-sm-6">
                                    <p class="form-control">${communityRegisterDto.community.name}</p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">社团负责人</label>
                                <div class="col-sm-6">
                                    <p class="form-control">${communityRegisterDto.community.nameHead}</p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">负责人学号</label>
                                <div class="col-sm-6">
                                    <p class="form-control">${communityRegisterDto.community.studentIdNumber}</p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">内容</label>
                                <div class="col-sm-6">
                                    <p>${communityRegisterDto.community.content}</p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">电话</label>
                                <div class="col-sm-6">
                                    <p class="form-control">${communityRegisterDto.community.phone}</p>
                                </div>
                            </div>
                         </form>  
                    </div>
                </div>
                <label class="col-sm-3 control-label">申请人信息</label>
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-default">        
                            <div class="panel-body">
                                <table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
                                    <thead>
                                        <tr>
                                            <th>申请人姓名</th>
                                            <th>申请人学院</th>
                                            <th>申请人学号</th>
                                            <th>申请人电话</th>
                                        </tr>
                                    </thead>

                                    <tbody>
                                    	<tr>
                                            <td>${communityRegisterDto.account.name}</td> 
                                            <td>${communityRegisterDto.account.academy}</td>
                                            <td>${communityRegisterDto.account.idNumber}</td> 
                                            <td>${communityRegisterDto.account.phone}</td>
                                        </tr>
                                    </tbody>
                                </table>
                                <c:if test="${sessionScope.account.role eq '超级管理员'}">
                                	<label>当审核通过的话，该申请人自动成为该社团的社团负责人！</label>
                                </c:if>
                            </div>
                        </div>
                    </div>
                </div>

</body>

</html>
