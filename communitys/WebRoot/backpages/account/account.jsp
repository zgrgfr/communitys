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
   
    <script type="text/javascript" src="backpages/assets/js/jquery-1.10.2.min.js"></script>
    <style type="text/css">
        body{
            background-color: #fff;
        }
        .nowbtn{
            color: #fff !important ;
            border-color: #428bca !important;
            background-color: #428bca !important;
        }
        .databtn a{
            background-color: #fff;
            border: 1px solid #ddd;
            color: #428bca;
            line-height: 1.42857;
            margin-left: -1px;
            padding: 6px 12px;
        }
        .databtn a:hover{
            background-color: #eee;
            color: #2a6496;
        }
    </style>
</head>

<body>
        <!--main content start-->
  
                <div class="row">
                    <div class="col-md-12">
                        <!--breadcrumbs start -->
                        <ul class="breadcrumb">
                            <li><a href="javascript:;">账号管理</a>
                            </li>
                            <li>列表信息</li>
                        </ul>
                        <!--breadcrumbs end -->
                    </div>
                </div>
				${msg}
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-default">        
                            <div class="panel-body">
                                <table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
                                    <thead>
                                        <tr>
                                            <th>姓名</th>
                                            <th>学号</th>
                                            <th>电话</th>
                                            <th>学院</th>
                                            <th>身份</th>
                                            <th>审核状态</th>
                                            <th>场地申请权限</th>
                                            <th>操作</th>
                                        </tr>
                                    </thead>
 
                                    <tbody id="datalist">
                                    <c:forEach items="${accountList}" var="account">
                                    	<tr>
                                            <td>${account.name}</td> 
                                            <td>${account.idNumber}</td>
                                            <td>${account.phone}</td>
                                            <td>${account.academy}</td>
                                            <td>${account.role}</td>
                                            <td>${account.type}</td>
                                            <td>${account.placeRole}</td>
                                            <td>
												<a href="/communitys/AccountController?method=passOrNotPass&id=${account.id}&type=审核通过" class="btn btn-info btn-sm" onclick="return confirm('确认审核通过？')">审核通过</a>
                                               	<a href="/communitys/AccountController?method=passOrNotPass&id=${account.id}&type=审核不通过" class="btn btn-danger btn-sm" onclick="return confirm('确认审核不通过？')">审核不通过</a>
                                            	<c:if test="${sessionScope.account.role eq '超级管理员'}">
                                            		<a href="/communitys/AccountController?method=placeSetOrNotSetRole&id=${account.id}&placeRole=已授权" class="btn btn-info btn-sm" onclick="return confirm('确认授权？')">场地授权</a>
                                            		<a href="/communitys/AccountController?method=placeSetOrNotSetRole&id=${account.id}&placeRole=未授权" class="btn btn-danger btn-sm" onclick="return confirm('确认不授权？')">场地不授权</a>
                                            		<a href="/communitys/AccountController?method=SetRole&id=${account.id}&role=社联管理员" class="btn btn-info btn-sm" onclick="return confirm('确认设为社联管理员？')">设为社联管理员</a>
                                            		<a href="/communitys/AccountController?method=SetRole&id=${account.id}&role=一般学生" class="btn btn-info btn-sm" onclick="return confirm('确认设为一般学生？')">设为一般学生</a>
                                            	</c:if>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>

                                </table>

                                <div class="databtn">
                                    <a href="javascript:;" pageNum="pre" class="pre">上一页</a><span id="pageIt"></span><a href="javascript:;" pageNum="next" class="next">下一页</a>
                                </div>

                            </div>
                           
                        </div>
                    </div>
                </div>


<script type="text/javascript">
$(function(){
    // 添加数组
    var pageArray = [];

    var liCount = $('#datalist tr').length;//获取记录条数
    var PageSize  = 10;//设置每页，你准备显示几条
    var PageCount  = Math.ceil(liCount/PageSize);//计算出总共页数
    var currentPage = 1;//设置当前页
    
    // 添加分页按钮
    var i=0;

    for(i=1; i<=PageCount; i++){
        $('<a href="javascript:;" pageNum="'+i+'" >'+i+'</a>').appendTo('#pageIt');
    };
    // 默认第一页样式
    $("#pageIt").children("a").eq(0).addClass("nowbtn");

    // 遍历数据
    var $li =  $('#datalist tr');
    $li.each(function(){
        pageArray.push(this);
    });
    
    // 清空数据，添加数据条
    $('#datalist').html('');
    for(i=0;i<10;i++){
        $('#datalist').append(pageArray[i]);
    };
    
    // 显示数据
    function showPage(whichPage){
        $('#datalist').html('');
        for(i = (whichPage-1)*10; i < 10*whichPage ; i++){
            $('#datalist').append(pageArray[i]);
        };
    };
    // 点击页面跳转
    var j;
    $('#pageIt a').click(function(){
        $(this).addClass("nowbtn").siblings().removeClass("nowbtn");
        j = $(this).attr('pagenum');
        showPage(j);
    });
    
    // 上一页
    var num;
    $(".pre").click(function(){
        // 获取当前页
        $("#pageIt a").each(function(){
            str = $(this).is(".nowbtn");
            if (str == true) {
                num = $(this).attr('pageNum');
                console.log(num);
            };
        });
        
        if (num == 1) {
            showPage(1);
            $("#pageIt").find('a').eq(0).addClass("nowbtn").siblings().removeClass("nowbtn");
        } else{
            showPage(num-1);
            $("#pageIt").find('a').eq(num-2).addClass("nowbtn").siblings().removeClass("nowbtn");
        }
     
    });

    $(".next").click(function(){
        // 获取当前页
        $("#pageIt a").each(function(){
            str = $(this).is(".nowbtn");
            if (str == true) {
                num = $(this).attr('pageNum');
                console.log(num);
            };
        });
        
        if (num == PageCount) {
            console.log(num);
            showPage(PageCount);
            $("#pageIt").find('a').eq(PageCount).addClass("nowbtn").siblings().removeClass("nowbtn");
        }else{
            var str = ++num;
            showPage(str);
            $("#pageIt").find('a').eq(num-1).addClass("nowbtn").siblings().removeClass("nowbtn");
        }
    });
      
});
</script>

</body>

</html>
