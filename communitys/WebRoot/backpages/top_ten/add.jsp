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
    <title>东北师范大学学生社团联合会</title>
    <meta charset="utf-8" />
    <link rel="stylesheet" type="text/css" href="frontpages/recourse/css/base/reset.css">
    <link rel="stylesheet" type="text/css" href="frontpages/recourse/css/common/common.css">
     <link rel="stylesheet" href="backpages/assets/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/communitys/frontpages/recourse/css/pages/style/style.css">
    <style type="text/css">
         .dengbox{
           background: #fff;
            left: 25%;
            position: absolute;
            top: 60px;
            z-index: 999;
            padding: 50px 0 50px 80px;
        }
        .deng{
            cursor: pointer;

        }
        .deng:hover{
             text-decoration: underline;
            color: #f6821f;
        }
    </style>
</head>
<body>
    <div class="page clearfix">
        <div class="main-content">
            <div class="select-option">
                <div class="option-show">
                    已选择：
                    <div class="showlist">
                        
                    </div>
                    <span class="search none">查询</span>
                </div>
                <div class="option-list">
                    <dl>
                        <dt class="school" name="校区：">
                            <span>校区：</span>
                            <a href="javascript:;">本部</a>
                            <a href="javascript:;">净月</a>
                        </dt>
                        <dt class="grade" name="等级">
                            <span>等级：</span>
                            <a href="javascript:;">A</a>
                            <a href="javascript:;">B</a>
                            <a href="javascript:;">C</a>
                            <a href="javascript:;">D</a>
                        </dt>
                        <dt class="type" name="类型：">
                            <span>类型：</span>
                            <a href="javascript:;">科研实践</a>
                            <a href="javascript:;">公益服务</a>
                            <a href="javascript:;">文娱体育</a>
                            <a href="javascript:;">思想概论</a>
                        </dt>
                    </dl>
                </div>
            </div>
            <div class="img-list">
                <ul class="clearfix" id="list">
                    <!-- <c:forEach items="${communityShowDtoList}" var="communityShowDto">
                        <li>
                            <a href="javascript:;">
                                <div class="img-box">
                                    <img src="backpages/image/${communityShowDto.communityShow.logo}">
                                </div>
                                <p class="img-cap">${communityShowDto.community.name}</p>
                            </a>    
                        </li>
                    </c:forEach> -->
                </ul>
            </div>
        </div>

                    <div  class="col-md-8 none" style="position:absolute;background-color: rgba(0,0,0,0.4);height: 50%;" id="dengbox">
                        <div class="col-md-6 dengbox">
                            <div class="form-group">
                                <label class="col-sm-5 control-label">十佳社团分配</label>
                                <div class="col-sm-5" >
                                    <label class="radio-inline"><input class="icheck" type="radio" name="grade" value="1" checked="">是</label>
                                    <label class="radio-inline"><input class="icheck" type="radio" name="grade" value="0">否</label>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-offset-3 col-sm-10" style="margin-top: 28px">
                                    <input type="submit" class="btn btn-primary" value="确认" id="sub" />
                                </div>
                             </div>
                        </div>
                    </div>

    </div>
    <script type="text/javascript" src="/communitys/backpages/assets/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="/communitys/backpages/top_ten/show.js"></script>
</body>
</html>