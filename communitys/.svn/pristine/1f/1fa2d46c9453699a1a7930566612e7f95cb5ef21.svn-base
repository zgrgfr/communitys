$(document).ready(function(){
	// 当前页
	var page = 1;
	//图片个数 
//首页顶部轮播------------------
	var img_number = $(".front-banner-img").length-1;
	// 添加图标
	var li_num=$(".front-banner li").length;//shih-----------
	for (var i = 0; i < img_number; i++) {
		var $num_i = $("<i id="+(i+1)+"></i>");

		$num_i.addClass("number-usual");

		$(".number").append($num_i);
	};
	//设置自动播放
	var timer=setInterval(function(){
        $(".next-arrows").click();      
      },2600);
	//向前翻页
	$(".prev-arrows").click(function(){
		var index=$(".front-banner li:visible").attr("id");
		if(index>0){
			$(".front-banner li").eq(0).fadeIn(800);
			$(".front-banner li").eq(index).fadeOut(800);
			$(".number i").eq(0).addClass("number-now")
								.removeClass("number-usual");
			$(".number i").eq(index).removeClass("number-now")
									.addClass("number-usual");
			index = index-1;
		}else{
			$(".front-banner li").eq(li_num-1).fadeIn(800);
			$(".front-banner li").eq(0).fadeOut(800);
			$(".number i").eq(li_num-1).addClass("number-now")
										.removeClass("number-usual");
			$(".number i").eq(0).removeClass("number-now")
								.addClass("number-usual");
			index = li_num-1;
		}
	})
//向后翻页
	$(".next-arrows").click(function(){
		var index=$(".front-banner li:visible").attr("id");
		if(index<li_num-1){
			$(".front-banner li").eq(index+1).fadeIn(800);
			$(".front-banner li").eq(index).fadeOut(800);
			$(".number i").eq(index+1).addClass("number-now")
									.removeClass("number-usual");
			$(".number i").eq(index).removeClass("number-now")
									.addClass("number-usual");
			index+=1;
		}else{
			index=0;
			$(".front-banner li").eq(0).fadeIn(800);
			$(".front-banner li").eq(li_num-1).fadeOut(800);
			$(".number i").eq(0).addClass("number-now")
								.removeClass("number-usual");
			$(".number i").eq(li_num-1).removeClass("number-now")
										.addClass("number-usual");
			index=index+1;
		}
	})

//轮播点mouseover事件
	$(".number i").mouseover(function(){
		var i_num=$(this).attr("id");
		for(i=0;i<li_num;i++){
			if(i==i_num){
				$(".front-banner li").eq(i).fadeIn(800);
				$(".number i").eq(i).addClass("number-now")
								.removeClass("number-usual");
			}else{
				$(".front-banner li").eq(i).fadeOut(800);
				$(".number i").eq(i).removeClass("number-now")
								.addClass("number-usual");
			}
		}
		clearInterval(timer);
	});
	 $(".number i").hover(function(){
		clearInterval(timer);
		},function(){
			timer=setInterval(function(){
	        $(".next-arrows").click();      
	      },2600);
	});

// 社团轮播
		var sma_page = 0;
		var $li = $(".flash-special li");
		var lis = $li.length;

		setInterval(function(){
			show(sma_page);
			sma_page ++;
			if (sma_page == lis) {sma_page =0;}
		},3000);

		function show(sma_page){
			$li.eq(sma_page).fadeIn(400).siblings("li").fadeOut(400);

		};


});