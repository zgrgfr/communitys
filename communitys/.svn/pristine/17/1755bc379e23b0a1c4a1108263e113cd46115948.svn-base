//验证码
	 var code ; //在全局 定义验证码  
     function createCode()  
     {   
        code = "";  
        var codeLength = 4;//验证码的长度  
        var checkCode = document.getElementById("checkCode");  
        var selectChar = new Array(0,1,2,3,4,5,6,7,8,9,'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');//所有候选组成验证码的字符，当然也可以用中文的  
          
        for(var i=0;i<codeLength;i++)  
        {  
         
           
        var charIndex = Math.floor(Math.random()*36);  
        code +=selectChar[charIndex];  
          
          
        }  
//        alert(code);  
        if(checkCode)  
        {  
          checkCode.className="code";  
          checkCode.value = code;  
        }  
           
     }  




$(function(){
	$("form :input").blur(function(){
		if($(this).attr('name')=="name"){
			str1=$(this).val();	
		};
		if($(this).attr('name')=="password"){
			str2=$(this).val();
		};
		if($(this).attr('name')=="phone"){
			str3=$(this).val();
		};
		if($(this).attr('name')=="account"){
			str4=$(this).val();
		};
		if($(this).attr('name')=="academy"){
			str5=$(this).val();
		};
		if($(this).attr('name')=="idNumber"){
			str6=$(this).val();
		};
    if($(this).attr('name')=="email"){
      str7=$(this).val();
    };
	});
      $("#input1").blur(function(){
      	var $parent = $(this).parent();
		$parent.find(".promtips").remove();
      		var inputCode = $("#input1").val();  
       if(inputCode.length <=0)  
       {  
          $parent.append("<span class='red promtips'>请输入验证码！</span>");
       }  
       else if(inputCode != code )  
       {  
          $parent.append("<span class='red promtips'>验证码输入错误！</span>");  
          createCode();//刷新验证码  
       }  
       else  
       {  
         $parent.append("<span class='green promtips'>输入正确！</span>");
       }  
      })  

   var emailaddress;
   var email = function(){
        var email = $("#email").val();
        emailaddress = email.indexOf('@nenu.edu.cn');
        if (emailaddress < 0) {
         alert("邮箱格式不正确");
        }
       
    }
  	$("#email").blur(function(){
        email(); 
    });
 
	//最后提交时验证，否则，阻止表单提交
	$("#registerButton").click(function(e){
        $("form :input").trigger('blur');
        $("#input1").trigger('blur');
        var numError = $(".red").length;
        if(str1==""||str2==""||str3==""||str4==""||str5==""||str6==""||str7==""){
        	alert("必填项为空！");
            return false;
        }
        if(numError){
        	alert("验证码输入错误！");
        	return false;
        }
        email();
        alert("注册成功");
	});



	$("#loginBtn").click(function(){
        $("form :input").trigger('blur');
        if(str2==""||str4==""){
        	alert("必填项不能为空！");
            return false;
        }
        alert("登录成功");

	});


})