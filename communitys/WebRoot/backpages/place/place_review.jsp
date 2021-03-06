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
                            <li><a href="javascript:;">场地借用</a>
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
                                            <th>校区</th>
                                            <th>活动日期</th>
                                            <th>开始时间-结束时间</th>
                                            <th>地点</th>
                                            <th>申请人</th>
                                            <th>申请人电话</th>
                                            <th>用途</th>
                                            <th>审核状态</th>
                                            <th>操作</th>
                                        </tr>
                                    </thead>

                                    <tbody>
                                    <c:forEach items="${placeApplyDtoList}" var="placeApplyDto">
                                    	<tr>
                                            <td>${placeApplyDto.placeApply.campus}</td>
                                            <td>${placeApplyDto.placeApply.dayTime}</td>
                                            <td>${placeApplyDto.placeApply.startTime}-${placeApplyDto.placeApply.endTime}</td>
                                            <td>${placeApplyDto.placeApply.place}</td>
                                            <td>${placeApplyDto.account.name}</td>
                                            <td>${placeApplyDto.account.phone}</td> 
                                            <td>${placeApplyDto.placeApply.uses}</td> 
                                            <td>${placeApplyDto.placeApply.type}</td>
                                            <td>
                                               <a href="/communitys/PlaceApplyController?method=deleteById&id=${placeApplyDto.placeApply.id}" class="btn btn-default btn-sm" onclick="return confirm('确认删除？')">删除</a>
                                                <%-- <a href="/communitys/PlaceApplyController?method=toUpdate&id=${placeApplyDto.placeApply.id}" class="btn btn-primary btn-sm">修改</a> --%>
                                                <a href="/communitys/PlaceApplyController?method=passOrNotPass&id=${placeApplyDto.placeApply.id}&type=审核通过" class="btn btn-info btn-sm" onclick="return confirm('确认审核通过？')">审核通过</a>
                                                <a href="/communitys/PlaceApplyController?method=passOrNotPass&id=${placeApplyDto.placeApply.id}&type=审核不通过" class="btn btn-danger btn-sm" onclick="return confirm('确认审核不通过？')">审核不通过</a>
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
