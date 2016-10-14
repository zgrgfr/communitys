$(function(){
    // 添加数组
    var pageArray = [];

    var liCount = $('#datalist li').length;//获取记录条数
    var PageSize  = 10;//设置每页，你准备显示几条
    var PageCount  = Math.ceil(liCount/PageSize);//计算出总共页数
    var currentPage = 1;//设置当前页
    
    if (liCount ==0 ) {
        $(".main-content").html('暂无数据');
    };
    // 添加分页按钮
    var i=0;

    for(i=1; i<=PageCount; i++){
        $('<a href="javascript:;" pageNum="'+i+'" >'+i+'</a>').appendTo('#pageIt');
    };
    // 默认第一页样式
    $("#pageIt").children("a").eq(0).addClass("nowbtn");

    // 遍历数据
    var $li =  $('#datalist li');
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