// 选择条件

$(function(){
	var school = "";
	var grade = "";
	var type = "";

	$(".school a").click(function(e){
		var num1 = $(this).text();
		school = num1;
		$(".option-show .showlist").append("<span>校区：<i>"+ num1 +"</i><em></em></span>");
		// 隐藏已选信息
		$(".school").addClass("none");
		$(".search").removeClass("none");

		$("em").click(function(){
			$(".school").removeClass("none");
			school = "";
			$(this).parents("span").remove();

			var info = $(".showlist").children("span").length;

			
			if (info == 0) {
				$(".search").addClass("none");
			};
		});
	});

	$(".grade a").click(function(e){
		var num2 = $(this).text();	
		grade= num2;
		$(".option-show .showlist").append("<span>等级：<i>"+ num2 +"</i><em></em></span>");
		// 隐藏已选信息
		$(".grade").addClass("none");
		$(".search").removeClass("none");

		$("em").click(function(){
			$(".grade").removeClass("none");
			grade = "";
			$(this).parents("span").remove();

			var info = $(".showlist").children("span").length;
			
			if (info == 0) {
				$(".search").addClass("none");
			};
		});
	});

	$(".type a").click(function(e){
		var num3 = $(this).text();	
		type = num3;
		$(".option-show .showlist").append("<span>类型：<i>"+ num3 +"</i><em></em></span>");
		// 隐藏已选信息
		$(".type").addClass("none");
		$(".search").removeClass("none");
		// 显示已选信息
		$("em").click(function(){
			$(".type").removeClass("none");
			type = "";
			$(this).parents("span").remove();

			var info = $(".showlist").children("span").length;
			
			if (info == 0) {
				$(".search").addClass("none");
			};
		});
	});

	$(".search").click(function(){
		$.ajax({
			type:"get",
		    url:"/communitys/CommunityShowController?method=listByAllCondition",
		
			dataType:"", 
			contentType: "application/x-www-form-urlencoded; charset=utf-8", 
			data: 
			{
				school: school,
				grade: grade,
				type: type
				
			},
			success: function(data){
				
				if(data == '[{"communityShowId":"0","logo":"","name":""}]'){
					
					$("#list").html('无相应社团');
					
				}else{
					$("#list").html('');
					var list = ' ';
					var data1 = JSON.parse(data);
					
					$.each(data1, function (index, item) {  
	 					//循环获取数据
						list += "<li><a href='/communitys/CommunityShowController?method=toEnter&communityShowId="+ item.communityShowId +"'><div class='img-box'><img src='/communitys/backpages/image/"+item.logo+"'></div><p class='img-cap'>"+item.name+"</p></a></li>";
						
					});
					$(list).appendTo("#list");
				}
            }
		});
	});
	$(document).ready(function(){
		$(".search").click();
	});
});
