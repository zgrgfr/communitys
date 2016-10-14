$(document).ready(function(){
	var campus = '';
	campus = $("input[name='campus']:checked").val();
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
				$(".form-select").html('');
				var list = ' ';
				var data1 = JSON.parse(data);
				$.each(data1, function (index, item) {  
					list += "<option>"+item.name +"</option>";
				});
				$(list).appendTo(".form-select");

			}

		});
	};
	ajaxsite();

	$(".radio").click(function(){
		campus = $("input[name='campus']:checked").val();
		ajaxsite();
	});


	$("#submit").click(function(){
		var start;
		var end;
		var date = $("#date").val();
		var text = $("#text").val();

		start = $("#begintime").val();
		if (start.length == 4) {
			start = '0' + start;
		};

		end = $("#endtime").val();	
		if (end.length == 4) {
			end = '0' + end;
		};

		if (date == ''||text == '' ||end == '' ||start == '') {
			alert("不能为空");
			return false;
		}
		if (start >= end) {
			alert("开始时间不得晚于结束时间");
			return false;
		};

		$.ajax({
			type: "get",
			url: "/communitys/PlaceApplyController?method=newPlaceApply",
			data: $("#form").serialize(),
			dataType: "",
			success: function(data){
				alert("已提交");
				$("div.apply").hide();
			}

		});

	});
	
});