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
        .timehidden1,.timehidden2{
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
                            <li><a href="javascript:;">精品课程</a>
                            </li>
                            <li>修改</li>
                        </ul>
                        <!--breadcrumbs end -->
                    </div>
                </div>

                <div class="row">
                     <div class="col-md-12">

                         <form action="/communitys/ClassController?method=updateClass" class="form-horizontal form-border" id="form" method="post">
                            <input type="hidden" name="method" value="updateClass">
                            <c:choose>
								<c:when test="${sessionScope.account.role eq '社团管理员'}">
                            		<input type="hidden" name="type" value="未审核">
                            	</c:when>
                            	<c:otherwise>
                            		<input type="hidden" name="type" value="${course.type}">
                            	</c:otherwise>
                            </c:choose>
                        	<input type="hidden" name="communityId" value="${course.communityId}">
                            <input type="hidden" name="id" value="${course.id}">
                            <div class="form-group">
                                <label class="col-sm-3 control-label">名称</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" name="name" value="${course.name}" id="input1" required="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">学校</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" name="school" value="${course.school}" id="input1" required="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">作者</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" name="author" value=" ${course.author}"id="input1" required="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">课程类型</label>
                               <div class="col-sm-6">
                               			<c:if test="${course.classType eq '文学艺术'}">
                               				<label class="radio-inline"><input class="icheck" type="radio" checked name="classType" value="文学艺术">文学艺术</label>
		                                    <label class="radio-inline"><input class="icheck" type="radio" name="classType" value="哲学历史">哲学历史</label>
		                                    <label class="radio-inline"><input class="icheck" type="radio" name="classType" value="经管法学">经管法学</label>
                               			</c:if>
                               			<c:if test="${course.classType eq '哲学历史'}">
                               				<label class="radio-inline"><input class="icheck" type="radio" name="classType" value="文学艺术">文学艺术</label>
	                                    	<label class="radio-inline"><input class="icheck" type="radio" checked name="classType" value="哲学历史">哲学历史</label>
	                                    	<label class="radio-inline"><input class="icheck" type="radio" name="classType" value="经管法学">经管法学</label>
                               			</c:if>
                               			<c:if test="${course.classType eq '经管法学' }">
                               				<label class="radio-inline"><input class="icheck" type="radio" name="classType" value="文学艺术">文学艺术</label>
	                                    	<label class="radio-inline"><input class="icheck" type="radio" name="classType" value="哲学历史">哲学历史</label>
	                                   		<label class="radio-inline"><input class="icheck" type="radio" checked name="classType" value="经管法学">经管法学</label>
                               			</c:if>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">开始时间</label>
                                <div class="col-sm-6">
                                    <input type="text" class="demo-test-date demo-test-datetime demo-test-time demo-test-credit com"  required="" id="tests" value="">
                                    <span class="timehidden1" >${course.startTime}</span>
                                    <input type="hidden" name="startTime" value="${course.startTime}" id="timehidden1" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">结束时间</label>
                                <div class="col-sm-6">
                                    <input type="text" class="demo-test-date demo-test-datetime demo-test-time demo-test-credit com"  required="" id="test" value="">
                                    <span class="timehidden2" >${course.endTime}</span>
                                    <input type="hidden" name="endTime" value="${course.endTime}" id="timehidden2" />

                                </div>
                            </div>
                            <div class="settings" style="display:none;">
                                <select name="demo" id="demo">
                                    <option value="date">日期</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">简介</label>
                                <div class="col-sm-6">
                                   <textarea id="textarea1" name="introduce" type="text/plain" style="height:350px;">${course.introduce }</textarea>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">内容</label>
                                <div class="col-sm-6">
                                    <textarea id="textarea2" name="content" type="text/plain" style="height:350px;">${course.content }</textarea>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-offset-8 col-sm-10">
                                    <input type="submit" class="btn btn-primary" value="提交" id="submit"/>
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
        UE.getEditor("textarea1");
        UE.getEditor("textarea2");
    </script>
    <script type="text/javascript">
        $(function(){
            $(".timehidden1").click(function(){
                $("#tests").click();
            });
            $("#tests").click(function(){
                $(".timehidden1").addClass("none");
            });

            $(".timehidden2").click(function(){
                $("#test").click();
            });
            $("#test").click(function(){
                $(".timehidden2").addClass("none");
            });

            $("#submit").click(function(){

                var real1 = $("#tests").val();
                var real2 = $("#test").val();

                if (real1 != "") { 
                    $("#timehidden1").val(real1);
                };

                if (real2 != "") { 
                    $("#timehidden2").val(real2);
                };

                var start = $("#timehidden1").val();
                var end = $("#timehidden2").val();
                var daytime = compareDate(end,start);

                function compareDate(d1, d2) {  // 时间比较的方法，如果d1时间比d2时间大，则返回true   
                    return Date.parse(d1.replace(/-/g, "/")) > Date.parse(d2.replace(/-/g, "/"));
                };

                if (daytime == false) {
                    alert("结束时间不得比开始时间晚");
                    return false;
                };

            });
        });
    </script>
</html>
