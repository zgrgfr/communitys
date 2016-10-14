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
                            <li>修改</li>
                        </ul>
                        <!--breadcrumbs end -->
                    </div>
                </div>

                <div class="row">
                     <div class="col-md-12">
                        <form class="form-horizontal form-border" id="form" method="post">
                            <div class="form-group">
                                <label class="col-sm-3 control-label">校区</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" name="input1" id="input1" required="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">活动日期</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" name="input1" id="input1" required="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">活动时间</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" name="input1" id="input1" required="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">地点</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" name="input1" id="input1" required="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">申请人</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" name="input1" id="input1" required="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">申请人电话</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" name="input1" id="input1" required="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">用途</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" name="input1" id="input1" required="">
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
   <!--Global JS-->
    <script src="backpages/assets/js/jquery-1.10.2.min.js"></script>
    <script src="backpages/assets/plugins/bootstrap/js/bootstrap.min.js"></script>
    <script src="backpages/assets/plugins/waypoints/waypoints.min.js"></script>
    <script src="backpages/assets/js/application.js"></script>
    <!--Page Level JS-->
    <script src="backpages/assets/plugins/icheck/js/icheck.min.js"></script>
    <script src="backpages/assets/plugins/validation/js/jquery.validate.min.js"></script>
    <script src="backpages/assets/plugins/validation/js/jquery.validate.min.js"></script>
    <script>
        $(document).ready(function() {
            $('#form').validate({
                rules: {
                    input1: {
                        required: true
                    },
                    input2: {
                        minlength: 5,
                        required: true
                    },
                    input3: {
                        maxlength: 5,
                        required: true
                    },
                    input4: {
                        required: true,
                        minlength: 4,
                        maxlength: 8
                    },
                    input5: {
                        required: true,
                        min: 5
                    },
                    input6: {
                        required: true,
                        range: [5, 50]
                    },
                    input7: {
                        minlength: 5
                    },
                    input8: {
                        required: true,
                        minlength: 5,
                        equalTo: "#input7"
                    },
                    input9: {
                        required: true,
                        email: true
                    },
                    input10: {
                        required: true,
                        url: true
                    },
                    input11: {
                        required: true,
                        digits: true
                    },
                    input12: {
                        required: true,
                        phoneUS: true
                    },
                    input13: {
                        required: true,
                        minlength: 5
                    }
                },
                highlight: function(element) {
                    $(element).closest('.form-group').removeClass('success').addClass('error');
                },
                success: function(element) {
                    element.text('OK!').addClass('valid')
                        .closest('.form-group').removeClass('error').addClass('success');
                }
            });
        });
    </script>

</body>

</html>
