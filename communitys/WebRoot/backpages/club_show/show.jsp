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
        .logoimg{
            width: 100px;
            height: 100px;
        }
        .logoimg img{
            width: 100%;
            height:100%;
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
                            <li><a href="javascript:;">社团展示</a>
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
                                            <th>等级</th>
                                            <th>社团类型</th>
                                            <th>logo</th>
                                            <th>操作</th>
                                        </tr>
                                    </thead>

                                    <tbody id="datalist">
                                        <tr>
                                            <td>${communityShow.campus}</td> 
                                            <td>${communityShow.grade}</td>
                                            <td>${communityShow.communityType}</td>
                                            <td class="logoimg"><img src="backpages/image/${communityShow.logo}"></td>
                                            <td>
                                            	<c:if test="${communityShow != null}">
                                            		<a href="/communitys/CommunityShowController?method=deleteById&id=${communityShow.id}" class="btn btn-default btn-sm" onclick="return confirm('确认删除？')">删除</a>
                                                	<a href="/communitys/CommunityShowController?method=toUpdate&id=${communityShow.id}" class="btn btn-primary btn-sm">修改</a>
                                            	</c:if>
                                            </td>
                                        </tr>
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
    var PageSize  = 5;//设置每页，你准备显示几条
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
    for(i=0;i<5;i++){
        $('#datalist').append(pageArray[i]);
    };
    
    // 显示数据
    function showPage(whichPage){
        $('#datalist').html('');
        for(i = (whichPage-1)*5; i < 5*whichPage ; i++){
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
