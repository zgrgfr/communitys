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

    <link href="backpages/assets/time/style/mobiscroll.2.13.2.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="backpages/assets/time/script/jquery-1.9.1.js" ></script>
    <script type="text/javascript" src="backpages/assets/time/script/mobiscroll.2.13.2.js" ></script>

    <link rel="stylesheet" type="text/css" href="backpages/assets/edit/design/css/trumbowyg.css">
   <script src='backpages/assets/ueditor/ueditor.config.js' type='text/javascript'></script>
    <script src='backpages/assets/ueditor/ueditor.all.min.js' type='text/javascript'></script>
    <script src='backpages/assets/ueditor/lang/zh-cn/zh-cn.js' type='text/javascript'></script>

    <style type="text/css">
        body{
            background-color: #fff;
        }
        .timehidden{
            position: absolute;
            left: 26px;
            top: 6px;
        }
        .none{
            display: none;
        }
    </style>
</head>

<body>
        <!--main content start-->
  
                <div class="row">
                    <div class="col-md-12">
                        <!--breadcrumbs start -->
                        <ul class="breadcrumb">
                            <li><a href="javascript:;">社联通知</a>
                            </li>
                            <li>修改</li>
                        </ul>
                        <!--breadcrumbs end -->
                    </div>
                </div>

                <div class="row">
                     <div class="col-md-12">
                        <form class="form-horizontal form-border" id="form" action="/communitys/CommunityPresenceController" method="post">
                        	<input type="hidden" name="method" value="updateCommunityPresence2">
                        	<input type="hidden" name="id" value="${communityPresence.id}">
                        	<input type="hidden" name="communityId" value="${communityPresence.communityId}">
                        	<input type="hidden" name="type" value="${communityPresence.type}">
                            <div class="form-group">
                                <label class="col-sm-3 control-label">文章类型</label>
                                <div class="col-sm-6">
                                    	社联通知
                                    <input type="hidden" name="articleType" value="社联通知">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">标题</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" name="title" required="" value="${communityPresence.title}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">作者</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" name="author" id="input1" required="" value="${communityPresence.author}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">时间</label>
                                <div class="col-sm-6">
                                    <input type="text" class="demo-test-date demo-test-datetime demo-test-time demo-test-credit com"  required="" id="tests" value="">
                                    <span class="timehidden" >${communityPresence.time}</span>
                                    <input type="hidden" name="time" value="${communityPresence.time}" id="timehidden" />
                                </div>
                            </div>
                            <div class="settings" style="display:none;">
                                <select name="demo" id="demo">
                                    <option value="date">日期</option>
                                </select>
                            </div>
                           
                             <div class="form-group">
                                <label class="col-sm-3 control-label">内容</label>
                                <div class="col-sm-6">
                            
                                    <textarea id="editor" name="content" type="text/plain" style="height:350px;">${communityPresence.content}</textarea>
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
</body>
    <script type="text/javascript">
        $(function () {
            var curr = new Date().getFullYear();
            var opt={};
            opt.date = {preset : 'date'};
            opt.datetime = {preset : 'datetime'};
            opt.time = {preset : 'time'};

          opt.default = {
                theme: 'android-holo light', //皮肤样式
                display: 'modal', //显示方式 
                mode: 'scroller', //日期选择模式
                dateFormat: 'yyyy-mm-dd',
                lang: 'zh',
                showNow: true,
                nowText: "今天",
                stepMinute: 5,
                startYear: curr - 0, //开始年份
                endYear: curr + 0 //结束年份
            };
            $('.settings').bind('change', function() {

                var demo = 'datetime';
                if (!demo.match(/select/i)) {
                    $('.demo-test-' + demo).val('');
                }
                $('.demo-test-' + demo).scroller('destroy').scroller($.extend(opt['datetime'], opt['default']));
                $('.demo').hide();
                $('.demo-' + demo).show();
            });
            $('#demo').trigger('change');
        });
    </script>
   <script type="text/javascript">
        var ue = UE.getEditor('editor');
    </script>
    <script type="text/javascript">
        $(function(){
            $(".timehidden").click(function(){
                $("#tests").click();
            });
            $("#tests").click(function(){
                $(".timehidden").addClass("none");
            });

            $("#submit").click(function(){
                var real = $("#tests").val();
                
                if (real != "") {
                  
                    $("#timehidden").val(real);
                };
            });

        });
    </script>
</html>
