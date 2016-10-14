$(document).ready(function(){
	// console.log($jq().jquery);
	// 社团宝典
	var href = $("#url"); 
	$(href).click();

	// 场地申请表单
	$(".td-body").click(function(){
		var account = $("#login").val();
		if ( account != "" ) {
			$(".apply").show();
		}else{
			alert("请先登录");
		}
		
	});

	$(".close").click(function(){
		$(".apply").hide();
	});

	// 异步获取数据
	var campus = '本部';
	var place = ' ';
	var day = ' ';

	// 校区联动教室
	var ajaxsite = function(){
		$.ajax({
			type: "get",
			url: "/communitys/PlaceController?method=listByCampus",
			data: {
				campus:campus
			},
			dataType: "",
			success: function(data){
				//教室信息 
				$("#roomList").html('');
				var list = ' ';
				var data1 = JSON.parse(data);
				$.each(data1, function (index, item) {  
					list += "<option>"+item.name +"</option>";
				});
				$(list).appendTo("#roomList");

				//教室参数 
				place = $("#roomList").children("option").eq(0).text();
				// 发送参数,获取显示数据
				ajaxfun();
			}

		});
	};

	// 时间,星期一
	function getMonday( offset ){
   		var d = new Date(); 
   		return  new Date( d - ((d.getDay() ||7) -1  - (offset||0) *7 )  *86400000 ); 
 	};
	var mondayTime = getMonday();
	//一周 
	function showtime(){
		var t = new Date(mondayTime);
    	var dd = t.getDay();

    	$(".td-date").html('');
    	$(".td-date").each(function(index){
    		var dayt = new Date((index - dd + 1 )*(3600*24*1000)+t.getTime());
    		var year =  dayt.getFullYear();
			var month = (dayt.getMonth()+1);
			var date = dayt.getDate();
			allweek = year +"-" +month + "-" + date;
			$(this).append(allweek);
			$(this).attr("title",allweek);
		});

	};
	showtime();
	// 周一，周日
	function week(){
		var mydate = new Date(mondayTime);
		var weekStartDate;
		var weekEndDate;

		weekStartDate = new Date((1 - mydate.getDay())*(3600*24*1000)+mydate.getTime());
		weekStartDate = weekStartDate.getFullYear()+ "-"  + ( weekStartDate.getMonth()+1)+ "-"  +  weekStartDate.getDate();

		weekEndDate = new Date((7 - mydate.getDay())*(3600*24*1000)+mydate.getTime());
		weekEndDate = weekEndDate.getFullYear()+ "-"  + (weekEndDate.getMonth()+1)+ "-"  + weekEndDate.getDate();

   		$(".week-date").html('');
		$(".week-date").append(weekStartDate+" - "+weekEndDate);

		day = weekStartDate;
		
	};
	week();

	
	// 发送请求信息，获取显示数据
	var ajaxfun = function(){
		$.ajax({
				type: "get",
				url: "/communitys/PlaceApplyController?method=queryByAllCondition",
				data: {
					campus:campus,
					place:place,
					day: day
				},
				dataType: "",
				success: function(data){
					$(".td-body").html("");
					var data2= JSON.parse(data);
					$.each(data2, function (index, item) { 

						var s = item.startTime;//开始时间，top
						var e = item.endTime;//结束-开始，height
						var d = item.date;//left
						// 根据时间差定位
						s = parseInt(s);
						e = parseInt(e);
						var top = (s-8)*40;
						var height = (e-s)*40;
						// 转换日期格式
						var reg = new RegExp("-0","g"); 
						if (d[5] == 0) {
							d = d.replace(reg,"-");
						};
						
						// 匹配位置
						$(".td-date").each(function(i,val){
							if($(this).attr("title") == d){
								var occ = $(this).parent().siblings(".td-body");
								var occupied = "<div class='occupied' style='height:"+height+"px;top:"+top+"px;'><div id='text'>"+item.text+"</div><div id='timeall'>"+item.startTime+"-"+item.endTime+"</div><div id='apply'>审核状态："+item.apply+"</div><div class='none' id='daTee'>"+item.date+"</div><div class='none' id='accountt'>"+item.account+"</div><div class='none' id='placee'>"+item.place+"</div></div>";
								$(occ).append(occupied);
							}
						});

					});

					// 查看信息
					$(".occupied").click(function(e){
						$(".applyshow").show();
						$(".applyshow dd").html('');

						var placee = $(this).children("#placee").text();
						var accountt = $(this).children("#accountt").text();
						var datee = $(this).children("#daTee").text();
						var timeall = $(this).children("#timeall").text();
						var apply = $(this).children("#apply").text();

						$("#daTe").append(datee);
						$("#acCount").append(accountt);
						$("#siTe").append(placee);
						$("#timeAll").append(timeall);
						$("#applyShow").append(apply.substr(5));
						
						e.stopPropagation();
					});
					$(".showclose").click(function(){
						$(".applyshow").hide();
					});	
				
				}

			});
	};
	// 初始化默认信息
	ajaxsite();

	//校区变动
	$(".selection-site span").click(function(e){
		$(this).addClass("site-selected").siblings().removeClass("site-selected");
		campus = $(this).text();

		ajaxsite();
	});

	// 教室变动
	$("#roomList").change(function(){
		place = $(this).children("option:selected").text();
		ajaxfun();
	});

	// 时间下一周/上一周
	var m = '';
	m = $("#count").html();

	$(".week-nex").click(function(){	
		m++;

		mondayTime = getMonday(m);
		showtime();
		week();
		ajaxfun();
		
		m = m ;
		$("#count").text(m);
	});

	$(".week-pre").click(function(){
		m--;

		mondayTime = getMonday(m);
		showtime();
		week();
		ajaxfun();
		
		m = m ;
		$("#count").text(m);
	});

});
