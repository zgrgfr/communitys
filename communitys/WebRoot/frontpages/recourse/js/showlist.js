$(function(){
	$("#demo").children("li").eq(0).children("img").addClass("on");
   $("#demo li").click(function(){
   		if ( !$(this).is(':animated') ) {
   			$(this).animate({width:'40%'},300).siblings()
   			.animate({width:'11.99%'},300);

   			$(this).children("img").addClass("on");
   			$(this).children("div").show();
   			$(this).siblings().find("img").removeClass("on");
   			$(this).siblings().find("div").hide();
   		}
   });
});