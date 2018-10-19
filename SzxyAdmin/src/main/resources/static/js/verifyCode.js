function changeImg(){   
    var imgSrc = $("#imgObj");   
    var src = imgSrc.attr("src"); 
    imgSrc.attr("src",chgUrl(src));   
}   
//时间戳   
//为了使每次生成图片不一致，即不让浏览器读缓存，所以需要加上时间戳   
function chgUrl(url){   
    var timestamp = (new Date()).valueOf();   
    url = url.substring(0,20);  
    if((url.indexOf("&")>=0)){   
        url = url + "×tamp=" + timestamp;   
    }else{   
        url = url + "?timestamp=" + timestamp; 
    }   
    return url;   
}   
  
function isRightCode(){
    //var code = $("#veryCode").attr("value");   
    var code=yanZheng()+"";
    if(code==22){
    	$("#info").html("请正确填写验证码！");	
		return false;
	}
    return true;
}

function yanZheng(){
	var code = $("#veryCode").val();
    $.ajax({
    	async:false,
        type:"POST",
        url:"/resultServlet",   
        data:"c="+code,
        success:function(data){
        	code=data;
        }
    });
    return code;
}

 

