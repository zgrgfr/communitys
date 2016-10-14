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
    
    <link rel="stylesheet" href="backpages/assets/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="backpages/assets/css/main.css">

    <script src='backpages/assets/ueditor/ueditor.config.js' type='text/javascript'></script>
    <script src='backpages/assets/ueditor/ueditor.all.min.js' type='text/javascript'></script>
    <script src='backpages/assets/ueditor/lang/zh-cn/zh-cn.js' type='text/javascript'></script>
    <link rel="stylesheet" type="text/css" href="backpages/activity/datetime/css/lq.datetimepick.css">

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
                            <li><a href="javascript:;">活动审批</a>
                            </li>
                            <li>修改</li>
                        </ul>
                        <!--breadcrumbs end -->
                    </div>
                </div>

                <div class="row">
                     <div class="col-md-12">
                        <form class="form-horizontal form-border" id="form" action="/communitys/ActivityApplyController" method="post">
                            <input type="hidden" name="method" value="updateActivityApply">
                            <input type="hidden" name="id" value="${activityApply.id}">
                            <!-- 社团管理员修改的时候会变成未审核 -->
                            <c:choose>
                                <c:when test="${sessionScope.account.role eq '社团管理员'}">
                                    <input type="hidden" name="type" value="未审核">
                                </c:when>
                                <c:otherwise>
                                    <input type="hidden" name="type" value="${activityApply.type}">
                                </c:otherwise>
                            </c:choose>
                            <input type="hidden" name="type" value="未审核">
                            <input type="hidden" name="accountId" value="${activityApply.accountId}">
                            <div class="form-group">
                                <label class="col-sm-3 control-label">活动名称</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" name="name" required="" value="${activityApply.name}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">申请人</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" name="holder" required="" value="${activityApply.holder}">
                                </div>
                            </div>
                             <div class="form-group">
                                <label class="col-sm-3 control-label">活动内容</label>
                                <div class="col-sm-6">
                                    <textarea id="editor" name="content" type="text/plain" style="height:350px;">${activityApply.content}</textarea>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">活动日期</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" name="time" id="date" required="" value="${activityApply.time}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">活动开始时间</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" name="timeStart" id="time" required="" value="${activityApply.timeStart}">
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

<script type="text/javascript" src="backpages/activity/datetime/js/jquery.js"></script>
<script src='backpages/activity/datetime/js/selectUi.js' type='text/javascript'></script>
<script src='backpages/activity/datetime/js/lq.datetimepick.js' type='text/javascript'></script>
<script type="text/javascript">
    var ue = UE.getEditor('editor');
    $("#date").on("click",function(e){
        e.stopPropagation();
        $(this).lqdatetimepicker({
            css : 'datetime-day',
            dateType : 'D',
            selectback : function(){

            }
        });
    });

    $("#time").on("click",function(e){
        e.stopPropagation();
        $(this).lqdatetimepicker({
            css : 'datetime-hour'
        });
    });
</script>
</body>

</html>
