$(document).ready(function(){
	// 刷新页面改变样式
	var showtype = $("#type").text();
	$(".sidebar a").each(function(){
		var typetext = $(this).children("p").text();
		if (typetext == showtype) {
			$(this).children("p").addClass("select-select");
			$(this).siblings().children("p").removeClass("select-select");
		};
	});
	var showtime = $("#time").text();
	console.log(showtime);
	$(".select-btn a").each(function(){
		var timetext = $(this).text();
		console.log(timetext);
		if (timetext == showtime) {
			$(this).addClass("select-select");
			$(this).siblings().removeClass("select-select");
		};
	});
	
	var showtext = "默认";
	showtext =	$("#select").text();
	$("#selectOption option").each(function(){
		var selecttext = $(this).text();
		if (selecttext == showtext) {
			$(this).attr("selected",true);
			$(this).siblings().attr("selected",false);
		};
	});


	// 课程类型
	$(".sidebar a").click(function(e){
		var type = $(this).children("p").text();
		location.href ='/communitys/ClassController?method=listByTypeAndclassType&classType='+type+'&classTime='+showtime+'&select='+showtext;
	});
	// 课程进程
	$(".select-btn a").click(function(ev){
		$(this).addClass("select-select");
		var time = $(this).text();
		location.href ='/communitys/ClassController?method=listByTypeAndclassType&classType='+showtype+'&classTime='+time+'&select='+showtext;
	});
	// 排序
	$("#selectOption").change(function(){
		var select = $("#selectOption option:selected").text();
		location.href ='/communitys/ClassController?method=listByTypeAndclassType&classType='+showtype+'&classTime='+showtime+'&select='+select;
	});
});