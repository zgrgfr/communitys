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
                            <li><a href="javascript:;">场地授权</a>
                            </li>
                            <li>列表信息</li>
                        </ul>
                        <!--breadcrumbs end -->
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-default">        
                            <div class="panel-body">
                                <table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
                                    <thead>
                                        <tr>
                                            <th>学生姓名</th>
                                            <th>学院名称</th>
                                            <th>学号</th>
                                            <th>电话</th>
                                            <th>身份</th>
                                            <th>场地授权状态</th>
                                            <th>操作</th>
                                        </tr>
                                    </thead>

                                    <tbody>
                                    <c:forEach items="${accountList}" var="account">
                                    	<tr>
                                            <td>${account.name}</td>
                                            <td>${account.academy}</td>
                                            <td>${account.idNumber}</td>
                                            <td>${account.phone}</td>
                                            <td>${account.role}</td>
                                            <td>${account.placeRole}</td> 
                                            <td>
                                                <a href="/communitys/AccountController?method=placeSetOrNotSetRole2&placeRole=已授权&id=${account.id}" class="btn btn-info btn-sm" onclick="return confirm('确认授权？')">授权</a>
                                                <a href="/communitys/AccountController?method=placeSetOrNotSetRole2&placeRole=未授权&id=${account.id}" class="btn btn-danger btn-sm" onclick="return confirm('确认取消授权？')">取消授权</a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>

                            </div>
                        </div>
                    </div>
                </div>

</body>

</html>
